package com.moz.ates.traffic.common.entity.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MojApiAccessToken {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private int expiresIn;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty(".issued")
    private String issued;

    @JsonProperty(".expires")
    private String expires;
}
