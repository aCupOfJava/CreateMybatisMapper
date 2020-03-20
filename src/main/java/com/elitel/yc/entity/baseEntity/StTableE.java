package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StTableE implements Serializable {
    private String instcd;

    private String tabid;

    private String isstarts;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public String getTabid() {
        return tabid;
    }

    public void setTabid(String tabid) {
        this.tabid = tabid == null ? null : tabid.trim();
    }

    public String getIsstarts() {
        return isstarts;
    }

    public void setIsstarts(String isstarts) {
        this.isstarts = isstarts == null ? null : isstarts.trim();
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
        sb.append(", tabid=").append(tabid);
        sb.append(", isstarts=").append(isstarts);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}