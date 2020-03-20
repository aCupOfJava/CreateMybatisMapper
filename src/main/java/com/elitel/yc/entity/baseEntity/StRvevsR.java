package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRvevsR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal htz;

    private BigDecimal ltz;

    private BigDecimal mxq;

    private BigDecimal mnq;

    private Date htztm;

    private Date ltztm;

    private Date mxqtm;

    private Date mnqtm;

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

    public BigDecimal getHtz() {
        return htz;
    }

    public void setHtz(BigDecimal htz) {
        this.htz = htz;
    }

    public BigDecimal getLtz() {
        return ltz;
    }

    public void setLtz(BigDecimal ltz) {
        this.ltz = ltz;
    }

    public BigDecimal getMxq() {
        return mxq;
    }

    public void setMxq(BigDecimal mxq) {
        this.mxq = mxq;
    }

    public BigDecimal getMnq() {
        return mnq;
    }

    public void setMnq(BigDecimal mnq) {
        this.mnq = mnq;
    }

    public Date getHtztm() {
        return htztm;
    }

    public void setHtztm(Date htztm) {
        this.htztm = htztm;
    }

    public Date getLtztm() {
        return ltztm;
    }

    public void setLtztm(Date ltztm) {
        this.ltztm = ltztm;
    }

    public Date getMxqtm() {
        return mxqtm;
    }

    public void setMxqtm(Date mxqtm) {
        this.mxqtm = mxqtm;
    }

    public Date getMnqtm() {
        return mnqtm;
    }

    public void setMnqtm(Date mnqtm) {
        this.mnqtm = mnqtm;
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
        sb.append(", htz=").append(htz);
        sb.append(", ltz=").append(ltz);
        sb.append(", mxq=").append(mxq);
        sb.append(", mnq=").append(mnq);
        sb.append(", htztm=").append(htztm);
        sb.append(", ltztm=").append(ltztm);
        sb.append(", mxqtm=").append(mxqtm);
        sb.append(", mnqtm=").append(mnqtm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}