package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StDayevR implements Serializable {
    private String stcd;

    private Date tm;

    private String eptp;

    private BigDecimal dye;

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

    public String getEptp() {
        return eptp;
    }

    public void setEptp(String eptp) {
        this.eptp = eptp == null ? null : eptp.trim();
    }

    public BigDecimal getDye() {
        return dye;
    }

    public void setDye(BigDecimal dye) {
        this.dye = dye;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", eptp=").append(eptp);
        sb.append(", dye=").append(dye);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}