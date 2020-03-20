package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StSedfrF implements Serializable {
    private String stcd;

    private String unitname;

    private String plcd;

    private Date fymdh;

    private Date iymdh;

    private Date ymdh;

    private BigDecimal fs;

    private String schrcd;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getPlcd() {
        return plcd;
    }

    public void setPlcd(String plcd) {
        this.plcd = plcd == null ? null : plcd.trim();
    }

    public Date getFymdh() {
        return fymdh;
    }

    public void setFymdh(Date fymdh) {
        this.fymdh = fymdh;
    }

    public Date getIymdh() {
        return iymdh;
    }

    public void setIymdh(Date iymdh) {
        this.iymdh = iymdh;
    }

    public Date getYmdh() {
        return ymdh;
    }

    public void setYmdh(Date ymdh) {
        this.ymdh = ymdh;
    }

    public BigDecimal getFs() {
        return fs;
    }

    public void setFs(BigDecimal fs) {
        this.fs = fs;
    }

    public String getSchrcd() {
        return schrcd;
    }

    public void setSchrcd(String schrcd) {
        this.schrcd = schrcd == null ? null : schrcd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", unitname=").append(unitname);
        sb.append(", plcd=").append(plcd);
        sb.append(", fymdh=").append(fymdh);
        sb.append(", iymdh=").append(iymdh);
        sb.append(", ymdh=").append(ymdh);
        sb.append(", fs=").append(fs);
        sb.append(", schrcd=").append(schrcd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}