package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StWdwvR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal wndv;

    private Short wndpwr;

    private String wnddir;

    private Short wvhgt;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public BigDecimal getWndv() {
        return wndv;
    }

    public void setWndv(BigDecimal wndv) {
        this.wndv = wndv;
    }

    public Short getWndpwr() {
        return wndpwr;
    }

    public void setWndpwr(Short wndpwr) {
        this.wndpwr = wndpwr;
    }

    public String getWnddir() {
        return wnddir;
    }

    public void setWnddir(String wnddir) {
        this.wnddir = wnddir == null ? null : wnddir.trim();
    }

    public Short getWvhgt() {
        return wvhgt;
    }

    public void setWvhgt(Short wvhgt) {
        this.wvhgt = wvhgt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", wndv=").append(wndv);
        sb.append(", wndpwr=").append(wndpwr);
        sb.append(", wnddir=").append(wnddir);
        sb.append(", wvhgt=").append(wvhgt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}