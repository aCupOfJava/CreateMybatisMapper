package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StSedR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal s;

    private String schrcd;

    private String smt;

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

    public BigDecimal getS() {
        return s;
    }

    public void setS(BigDecimal s) {
        this.s = s;
    }

    public String getSchrcd() {
        return schrcd;
    }

    public void setSchrcd(String schrcd) {
        this.schrcd = schrcd == null ? null : schrcd.trim();
    }

    public String getSmt() {
        return smt;
    }

    public void setSmt(String smt) {
        this.smt = smt == null ? null : smt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", s=").append(s);
        sb.append(", schrcd=").append(schrcd);
        sb.append(", smt=").append(smt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}