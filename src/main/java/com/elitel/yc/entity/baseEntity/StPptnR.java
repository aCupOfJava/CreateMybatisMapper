package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StPptnR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal drp;

    private BigDecimal intv;

    private BigDecimal pdr;

    private BigDecimal dyp;

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

    public BigDecimal getDrp() {
        return drp;
    }

    public void setDrp(BigDecimal drp) {
        this.drp = drp;
    }

    public BigDecimal getIntv() {
        return intv;
    }

    public void setIntv(BigDecimal intv) {
        this.intv = intv;
    }

    public BigDecimal getPdr() {
        return pdr;
    }

    public void setPdr(BigDecimal pdr) {
        this.pdr = pdr;
    }

    public BigDecimal getDyp() {
        return dyp;
    }

    public void setDyp(BigDecimal dyp) {
        this.dyp = dyp;
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
        sb.append(", drp=").append(drp);
        sb.append(", intv=").append(intv);
        sb.append(", pdr=").append(pdr);
        sb.append(", dyp=").append(dyp);
        sb.append(", wth=").append(wth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}