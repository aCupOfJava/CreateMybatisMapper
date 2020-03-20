package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRsvravR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal avrz;

    private BigDecimal avinq;

    private BigDecimal avotq;

    private BigDecimal avw;

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

    public BigDecimal getAvrz() {
        return avrz;
    }

    public void setAvrz(BigDecimal avrz) {
        this.avrz = avrz;
    }

    public BigDecimal getAvinq() {
        return avinq;
    }

    public void setAvinq(BigDecimal avinq) {
        this.avinq = avinq;
    }

    public BigDecimal getAvotq() {
        return avotq;
    }

    public void setAvotq(BigDecimal avotq) {
        this.avotq = avotq;
    }

    public BigDecimal getAvw() {
        return avw;
    }

    public void setAvw(BigDecimal avw) {
        this.avw = avw;
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
        sb.append(", avrz=").append(avrz);
        sb.append(", avinq=").append(avinq);
        sb.append(", avotq=").append(avotq);
        sb.append(", avw=").append(avw);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}