package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StWasavR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal avupz;

    private BigDecimal avdwz;

    private BigDecimal avgtq;

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

    public BigDecimal getAvupz() {
        return avupz;
    }

    public void setAvupz(BigDecimal avupz) {
        this.avupz = avupz;
    }

    public BigDecimal getAvdwz() {
        return avdwz;
    }

    public void setAvdwz(BigDecimal avdwz) {
        this.avdwz = avdwz;
    }

    public BigDecimal getAvgtq() {
        return avgtq;
    }

    public void setAvgtq(BigDecimal avgtq) {
        this.avgtq = avgtq;
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
        sb.append(", avupz=").append(avupz);
        sb.append(", avdwz=").append(avdwz);
        sb.append(", avgtq=").append(avgtq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}