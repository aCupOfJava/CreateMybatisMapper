package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StStworkR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal v;

    private BigDecimal t;

    private BigDecimal csq;

    private String comments;

    private String fm;

    private String fr;

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

    public BigDecimal getV() {
        return v;
    }

    public void setV(BigDecimal v) {
        this.v = v;
    }

    public BigDecimal getT() {
        return t;
    }

    public void setT(BigDecimal t) {
        this.t = t;
    }

    public BigDecimal getCsq() {
        return csq;
    }

    public void setCsq(BigDecimal csq) {
        this.csq = csq;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm == null ? null : fm.trim();
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr == null ? null : fr.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", v=").append(v);
        sb.append(", t=").append(t);
        sb.append(", csq=").append(csq);
        sb.append(", comments=").append(comments);
        sb.append(", fm=").append(fm);
        sb.append(", fr=").append(fr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}