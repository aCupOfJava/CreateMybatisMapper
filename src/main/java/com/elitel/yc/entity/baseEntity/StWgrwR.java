package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StWgrwR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal wlmin;

    private String wlminmt;

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

    public BigDecimal getWlmin() {
        return wlmin;
    }

    public void setWlmin(BigDecimal wlmin) {
        this.wlmin = wlmin;
    }

    public String getWlminmt() {
        return wlminmt;
    }

    public void setWlminmt(String wlminmt) {
        this.wlminmt = wlminmt == null ? null : wlminmt.trim();
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
        sb.append(", wlmin=").append(wlmin);
        sb.append(", wlminmt=").append(wlminmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}