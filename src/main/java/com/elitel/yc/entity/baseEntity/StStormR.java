package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StStormR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal strmdr;

    private BigDecimal strmp;

    private String wth;

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

    public BigDecimal getStrmdr() {
        return strmdr;
    }

    public void setStrmdr(BigDecimal strmdr) {
        this.strmdr = strmdr;
    }

    public BigDecimal getStrmp() {
        return strmp;
    }

    public void setStrmp(BigDecimal strmp) {
        this.strmp = strmp;
    }

    public String getWth() {
        return wth;
    }

    public void setWth(String wth) {
        this.wth = wth == null ? null : wth.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", strmdr=").append(strmdr);
        sb.append(", strmp=").append(strmp);
        sb.append(", wth=").append(wth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}