package com.AOA.handler;

import java.util.Date;
import lombok.Generated;

public class Exception<E> {
    private String hostName;
    private String path;
    private Date createTime;
    private E message;

    @Generated
    public String getHostName() {
        return this.hostName;
    }

    @Generated
    public String getPath() {
        return this.path;
    }

    @Generated
    public Date getCreateTime() {
        return this.createTime;
    }

    @Generated
    public E getMessage() {
        return this.message;
    }

    @Generated
    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }

    @Generated
    public void setPath(final String path) {
        this.path = path;
    }

    @Generated
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @Generated
    public void setMessage(final E message) {
        this.message = message;
    }
}
