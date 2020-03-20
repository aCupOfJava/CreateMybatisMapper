package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StWspavsdR implements Serializable {
    private String stcd;

    private Date idtm;

    private BigDecimal sttdr;

    private BigDecimal dravz;

    private BigDecimal dravq;

    private BigDecimal drpw;

    private BigDecimal drdw;

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

    public BigDecimal getSttdr() {
        return sttdr;
    }

    public void setSttdr(BigDecimal sttdr) {
        this.sttdr = sttdr;
    }

    public BigDecimal getDravz() {
        return dravz;
    }

    public void setDravz(BigDecimal dravz) {
        this.dravz = dravz;
    }

    public BigDecimal getDravq() {
        return dravq;
    }

    public void setDravq(BigDecimal dravq) {
        this.dravq = dravq;
    }

    public BigDecimal getDrpw() {
        return drpw;
    }

    public void setDrpw(BigDecimal drpw) {
        this.drpw = drpw;
    }

    public BigDecimal getDrdw() {
        return drdw;
    }

    public void setDrdw(BigDecimal drdw) {
        this.drdw = drdw;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", idtm=").append(idtm);
        sb.append(", sttdr=").append(sttdr);
        sb.append(", dravz=").append(dravz);
        sb.append(", dravq=").append(dravq);
        sb.append(", drpw=").append(drpw);
        sb.append(", drdw=").append(drdw);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}