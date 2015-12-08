package com.kickbox.java.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author szagriichuk.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtendedKickBoxResponse extends KickBoxResponse {
    public String message;
    public int code;
}
