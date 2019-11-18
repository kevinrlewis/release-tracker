package com.kevinrlewis.releasetracker.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = true)
public class ApplicationProperties {

    @Getter private final Spotify spotify = new Spotify();

    public static class Spotify {
        @Getter @Setter private String clientId;
        @Getter @Setter private String clientSecret;
        @Getter @Setter private Api api;

        public static class Api {
            @Getter @Setter private String uri;
            @Getter @Setter private String version;
        }
    }
}
