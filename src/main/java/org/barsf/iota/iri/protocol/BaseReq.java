package org.barsf.iota.iri.protocol;

import com.google.api.client.util.Key;

public class BaseReq {

    @Key("duration")
    private Long duration;

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

}