package com.kevinrlewis.releasetracker.controller;

import com.kevinrlewis.releasetracker.model.album.Album;
import com.kevinrlewis.releasetracker.model.album.Artist;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import com.kevinrlewis.releasetracker.web.SpotifyWebClient;

import java.util.List;

@RestController
@Slf4j
public class ReleaseController {

    private SpotifyWebClient spotifyWebClient;

    @Autowired
    public ReleaseController(SpotifyWebClient spotifyWebClient) {
        this.spotifyWebClient = spotifyWebClient;
    }

    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/albums")
    public List<Album> getArtistAlbums(@RequestParam(value="artist_id") String artistId) {
        Flux<Album> albums = spotifyWebClient
                .getClient()
                .get()
                .uri("/" + spotifyWebClient.getApiVersion() + "/artists/" + artistId)
                .retrieve()
                .bodyToFlux(Album.class);

        albums.subscribe(album -> log.info(album.toString()));
        return null;
    }

    @GetMapping("/search")
    public List<Artist> searchArtists(@RequestParam(value="search_value") String searchValue) {
        return null;
    }
}
