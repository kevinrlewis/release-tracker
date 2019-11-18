package com.kevinrlewis.releasetracker;

import com.kevinrlewis.releasetracker.config.ApplicationProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"com.kevinrlewis.releasetracker"})
@EnableConfigurationProperties({ApplicationProperties.class})
@EnableCaching
@EnableEncryptableProperties
public class ReleaseTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseTrackerApplication.class, args);
    }
}
