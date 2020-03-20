package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StAddvcdD implements Serializable {
    private String addvcd;

    private String addvnm;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getAddvcd() {
        return addvcd;
    }

    public void setAddvcd(String addvcd) {
        this.addvcd = addvcd == null ? null : addvcd.trim();
    }

    public String getAddvnm() {
        return addvnm;
    }

    public void setAddvnm(String addvnm) {
        this.addvnm = addvnm == null ? null : addvnm.trim();
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
        sb.append(", addvcd=").append(addvcd);
        sb.append(", addvnm=").append(addvnm);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}