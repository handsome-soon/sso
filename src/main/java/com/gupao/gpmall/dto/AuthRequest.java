package com.gupao.gpmall.dto;

import java.io.Serializable;

/**
 * Created by 15995 on 2018/7/5.
 */
public class AuthRequest implements Serializable {

    private static final long serialVersionUID = 2419559926071703072L;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
