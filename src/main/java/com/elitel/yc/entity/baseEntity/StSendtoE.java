package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StSendtoE implements Serializable {
    private String instcd;

    private Long slsh;

    private Long sfnum;

    private Date tm;

    private String sendstatus;

    private String stat;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public Long getSlsh() {
        return slsh;
    }

    public void setSlsh(Long slsh) {
        this.slsh = slsh;
    }

    public Long getSfnum() {
        return sfnum;
    }

    public void setSfnum(Long sfnum) {
        this.sfnum = sfnum;
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public String getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus == null ? null : sendstatus.trim();
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
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
        sb.append(", slsh=").append(slsh);
        sb.append(", sfnum=").append(sfnum);
        sb.append(", tm=").append(tm);
        sb.append(", sendstatus=").append(sendstatus);
        sb.append(", stat=").append(stat);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}