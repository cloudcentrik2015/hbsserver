package net.cloudcentrik.hbs;

import net.cloudcentrik.hbs.PersonService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HBSServerApp extends Application<HBSServerConfig> {
	
	public static void main(String[] args) throws Exception {
        new HBSServerApp().run(args);
    }
 
    @Override
    public void run(HBSServerConfig config, Environment env) {
        final PersonService personService = new PersonService();
        env.jersey().register(personService);
 
        final HBSServerCheck healthCheck = new HBSServerCheck(config.getVersion());
        env.healthChecks().register("template", healthCheck);
        env.jersey().register(healthCheck);
    }

}
