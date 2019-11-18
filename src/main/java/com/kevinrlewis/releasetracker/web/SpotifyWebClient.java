package com.kevinrlewis.releasetracker.web;

import com.kevinrlewis.releasetracker.config.ApplicationProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@Data
@Slf4j
public class SpotifyWebClient {

    private final ApplicationProperties applicationProperties;
    private String spotifyUri;
    private String apiVersion;
    private WebClient client;

    @Autowired
    public SpotifyWebClient(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
        this.spotifyUri = applicationProperties.getSpotify().getApi().getUri();
        this.apiVersion = applicationProperties.getSpotify().getApi().getVersion();
        this.client = WebClient.create(this.spotifyUri);
        log.info("Initialized Spotify Web Client {}", this.spotifyUri);
    }

}
