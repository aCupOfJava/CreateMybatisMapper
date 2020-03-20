package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StNetstatE implements Serializable {
    private String instcd;

    private Date changetime;

    private String nettype;

    private String netstatus;

    private static final long serialVersionUID = 1L;

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public String getNettype() {
        return nettype;
    }

    public void setNettype(String nettype) {
        this.nettype = nettype == null ? null : nettype.trim();
    }

    public String getNetstatus() {
        return netstatus;
    }

    public void setNetstatus(String netstatus) {
        this.netstatus = netstatus == null ? null : netstatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instcd=").append(instcd);
        sb.append(", changetime=").append(changetime);
        sb.append(", nettype=").append(nettype);
        sb.append(", netstatus=").append(netstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}