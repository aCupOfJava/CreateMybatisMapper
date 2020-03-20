package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StGrwR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal gwbd;

    private String gwbdrmk;

    private BigDecimal spq;

    private BigDecimal gwtmp;

    private String gwptn;

    private String spqmmt;

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

    public BigDecimal getGwbd() {
        return gwbd;
    }

    public void setGwbd(BigDecimal gwbd) {
        this.gwbd = gwbd;
    }

    public String getGwbdrmk() {
        return gwbdrmk;
    }

    public void setGwbdrmk(String gwbdrmk) {
        this.gwbdrmk = gwbdrmk == null ? null : gwbdrmk.trim();
    }

    public BigDecimal getSpq() {
        return spq;
    }

    public void setSpq(BigDecimal spq) {
        this.spq = spq;
    }

    public BigDecimal getGwtmp() {
        return gwtmp;
    }

    public void setGwtmp(BigDecimal gwtmp) {
        this.gwtmp = gwtmp;
    }

    public String getGwptn() {
        return gwptn;
    }

    public void setGwptn(String gwptn) {
        this.gwptn = gwptn == null ? null : gwptn.trim();
    }

    public String getSpqmmt() {
        return spqmmt;
    }

    public void setSpqmmt(String spqmmt) {
        this.spqmmt = spqmmt == null ? null : spqmmt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", gwbd=").append(gwbd);
        sb.append(", gwbdrmk=").append(gwbdrmk);
        sb.append(", spq=").append(spq);
        sb.append(", gwtmp=").append(gwtmp);
        sb.append(", gwptn=").append(gwptn);
        sb.append(", spqmmt=").append(spqmmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}