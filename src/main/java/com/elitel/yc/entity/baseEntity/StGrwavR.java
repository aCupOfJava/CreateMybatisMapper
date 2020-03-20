package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StGrwavR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal avgwbd;

    private BigDecimal avspq;

    private BigDecimal avgwtmp;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getIdtm() {
        return idtm;
    }

    public void setIdtm(Date idtm) {
        this.idtm = idtm;
    }

    public String getSttdrcd() {
        return sttdrcd;
    }

    public void setSttdrcd(String sttdrcd) {
        this.sttdrcd = sttdrcd == null ? null : sttdrcd.trim();
    }

    public BigDecimal getAvgwbd() {
        return avgwbd;
    }

    public void setAvgwbd(BigDecimal avgwbd) {
        this.avgwbd = avgwbd;
    }

    public BigDecimal getAvspq() {
        return avspq;
    }

    public void setAvspq(BigDecimal avspq) {
        this.avspq = avspq;
    }

    public BigDecimal getAvgwtmp() {
        return avgwtmp;
    }

    public void setAvgwtmp(BigDecimal avgwtmp) {
        this.avgwtmp = avgwtmp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", idtm=").append(idtm);
        sb.append(", sttdrcd=").append(sttdrcd);
        sb.append(", avgwbd=").append(avgwbd);
        sb.append(", avspq=").append(avspq);
        sb.append(", avgwtmp=").append(avgwtmp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}