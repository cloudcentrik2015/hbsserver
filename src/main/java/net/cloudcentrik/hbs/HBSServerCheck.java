package net.cloudcentrik.hbs;

import net.cloudcentrik.hbs.PersonDB;
import com.codahale.metrics.health.HealthCheck;

public class HBSServerCheck extends HealthCheck{
	
	private final String version;
	 
    public HBSServerCheck(String version) {
        this.version = version;
    }
 
    @Override
    protected Result check() throws Exception {
        if (PersonDB.getCount() == 0) {
            return Result.unhealthy("No persons in DB! Version: " +
                    this.version);
        }
        return Result.healthy("OK with version: " + this.version +
                ". Persons count: " + PersonDB.getCount());
    }

}
