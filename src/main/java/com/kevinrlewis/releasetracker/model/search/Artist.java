package com.kevinrlewis.releasetracker.model.search;

import com.kevinrlewis.releasetracker.model.Image;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class Artist {
    private HashMap<String, String> externalUrls;
    private Followers followers;
    private List<String> genres;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private Integer popularity;
    private String type;
    private String uri;
}
