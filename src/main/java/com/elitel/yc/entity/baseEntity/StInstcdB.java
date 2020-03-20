package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StInstcdB implements Serializable {
    private String instcd;

    private String instnm;

    private String locality;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public String getInstnm() {
        return instnm;
    }

    public void setInstnm(String instnm) {
        this.instnm = instnm == null ? null : instnm.trim();
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality == null ? null : locality.trim();
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
        sb.append(", instcd=").append(instcd);
        sb.append(", instnm=").append(instnm);
        sb.append(", locality=").append(locality);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}