package com.kevinrlewis.releasetracker.model.album;

import lombok.Data;

import java.util.HashMap;

@Data
public class Artist {
    private HashMap<String, String> externalUrls;
    private String href;
    private String id;
    private String name;
    private String uri;
}
