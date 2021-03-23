package com.SPS;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class SpyGirl {

    public String sayIt(){
        return "Spygirl vagyok";
    }
}