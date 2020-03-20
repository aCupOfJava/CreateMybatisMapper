package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StTmpR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal atmp;

    private BigDecimal wtmp;

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

    public BigDecimal getAtmp() {
        return atmp;
    }

    public void setAtmp(BigDecimal atmp) {
        this.atmp = atmp;
    }

    public BigDecimal getWtmp() {
        return wtmp;
    }

    public void setWtmp(BigDecimal wtmp) {
        this.wtmp = wtmp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", atmp=").append(atmp);
        sb.append(", wtmp=").append(wtmp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}