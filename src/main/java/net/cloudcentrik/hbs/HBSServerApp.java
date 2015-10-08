package net.cloudcentrik.hbs;

import net.cloudcentrik.hbs.PersonService;

import org.skife.jdbi.v2.DBI;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;

public class HBSServerApp extends Application<HBSServerConfig> {
	
	public static void main(String[] args) throws Exception {
        new HBSServerApp().run(args);
    }
 
    @Override
    public void run(HBSServerConfig config, Environment env)throws ClassNotFoundException {
        final PersonService personService = new PersonService();
        env.jersey().register(personService);
        
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(env, config.getDataSourceFactory(), "mysql");
        final UserDAO dao = jdbi.onDemand(UserDAO.class);
        env.jersey().register(new UserResource(dao));
        
        final HBSService hbsService=new HBSService();
        env.jersey().register(hbsService);
 
        final HBSServerCheck healthCheck = new HBSServerCheck(config.getVersion());
        env.healthChecks().register("template", healthCheck);
        env.jersey().register(healthCheck);
    }

}
