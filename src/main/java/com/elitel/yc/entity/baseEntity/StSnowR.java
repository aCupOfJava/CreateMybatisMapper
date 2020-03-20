package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StSnowR implements Serializable {
    private String stcd;

    private Date tm;

    private Short snowdep;

    private BigDecimal snowden;

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

    public Short getSnowdep() {
        return snowdep;
    }

    public void setSnowdep(Short snowdep) {
        this.snowdep = snowdep;
    }

    public BigDecimal getSnowden() {
        return snowden;
    }

    public void setSnowden(BigDecimal snowden) {
        this.snowden = snowden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", snowdep=").append(snowdep);
        sb.append(", snowden=").append(snowden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}