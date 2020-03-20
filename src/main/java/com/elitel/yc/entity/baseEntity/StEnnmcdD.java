package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StEnnmcdD implements Serializable {
    private String ennmcd;

    private String bsnm;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getEnnmcd() {
        return ennmcd;
    }

    public void setEnnmcd(String ennmcd) {
        this.ennmcd = ennmcd == null ? null : ennmcd.trim();
    }

    public String getBsnm() {
        return bsnm;
    }

    public void setBsnm(String bsnm) {
        this.bsnm = bsnm == null ? null : bsnm.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ennmcd=").append(ennmcd);
        sb.append(", bsnm=").append(bsnm);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}