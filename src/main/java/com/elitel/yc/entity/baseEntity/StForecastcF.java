package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StForecastcF implements Serializable {
    private String stcd;

    private String unitname;

    private String plcd;

    private Date fymdh;

    private Date iymdh;

    private String wnstatus;

    private String comments;

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

    public String getWnstatus() {
        return wnstatus;
    }

    public void setWnstatus(String wnstatus) {
        this.wnstatus = wnstatus == null ? null : wnstatus.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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
        sb.append(", wnstatus=").append(wnstatus);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}