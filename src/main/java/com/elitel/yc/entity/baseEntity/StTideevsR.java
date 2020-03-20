package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StTideevsR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal httdz;

    private BigDecimal lttdz;

    private BigDecimal mxwndv;

    private Date httdztm;

    private Date lttdztm;

    private Date mxwndvtm;

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

    public BigDecimal getHttdz() {
        return httdz;
    }

    public void setHttdz(BigDecimal httdz) {
        this.httdz = httdz;
    }

    public BigDecimal getLttdz() {
        return lttdz;
    }

    public void setLttdz(BigDecimal lttdz) {
        this.lttdz = lttdz;
    }

    public BigDecimal getMxwndv() {
        return mxwndv;
    }

    public void setMxwndv(BigDecimal mxwndv) {
        this.mxwndv = mxwndv;
    }

    public Date getHttdztm() {
        return httdztm;
    }

    public void setHttdztm(Date httdztm) {
        this.httdztm = httdztm;
    }

    public Date getLttdztm() {
        return lttdztm;
    }

    public void setLttdztm(Date lttdztm) {
        this.lttdztm = lttdztm;
    }

    public Date getMxwndvtm() {
        return mxwndvtm;
    }

    public void setMxwndvtm(Date mxwndvtm) {
        this.mxwndvtm = mxwndvtm;
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
        sb.append(", httdz=").append(httdz);
        sb.append(", lttdz=").append(lttdz);
        sb.append(", mxwndv=").append(mxwndv);
        sb.append(", httdztm=").append(httdztm);
        sb.append(", lttdztm=").append(lttdztm);
        sb.append(", mxwndvtm=").append(mxwndvtm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}