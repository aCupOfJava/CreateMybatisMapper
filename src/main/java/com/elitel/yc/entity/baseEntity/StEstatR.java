package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StEstatR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal acce;

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

    public BigDecimal getAcce() {
        return acce;
    }

    public void setAcce(BigDecimal acce) {
        this.acce = acce;
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
        sb.append(", acce=").append(acce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}