package com.kevinrlewis.releasetracker.model.album;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinrlewis.releasetracker.model.Image;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Data
public class Album {

    @JsonProperty("album_group")
    private String albumGroup;

    @JsonProperty("album_type")
    private String albumType;

    private List<Artist> artists;

    @JsonProperty("available_markets")
    private List<String> availableMarkets;

    @JsonProperty("external_urls")
    private HashMap<String, String> externalUrls;

    private String href;

    private String id;

    private List<Image> images;

    private String name;

    @JsonProperty("release_date")
    private Date releaseDate;

    @JsonProperty("release_date_precision")
    private String releaseDatePrecision;

    @JsonProperty("total_tracks")
    private Integer totalTracks;

    private String type;

    private String uri;
}
