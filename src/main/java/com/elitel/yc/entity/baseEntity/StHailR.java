package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StHailR implements Serializable {
    private String stcd;

    private Date tm;

    private Short hpd;

    private BigDecimal hldr;

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

    public Short getHpd() {
        return hpd;
    }

    public void setHpd(Short hpd) {
        this.hpd = hpd;
    }

    public BigDecimal getHldr() {
        return hldr;
    }

    public void setHldr(BigDecimal hldr) {
        this.hldr = hldr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", hpd=").append(hpd);
        sb.append(", hldr=").append(hldr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}