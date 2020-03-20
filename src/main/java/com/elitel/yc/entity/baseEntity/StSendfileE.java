package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StSendfileE implements Serializable {
    private Long sfnum;

    private String instcd;

    private String sendtype;

    private String sendstatus;

    private String sfilename;

    private Date sendtm;

    private Long sendcount;

    private Long errline;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public Long getSfnum() {
        return sfnum;
    }

    public void setSfnum(Long sfnum) {
        this.sfnum = sfnum;
    }

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public String getSendtype() {
        return sendtype;
    }

    public void setSendtype(String sendtype) {
        this.sendtype = sendtype == null ? null : sendtype.trim();
    }

    public String getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus == null ? null : sendstatus.trim();
    }

    public String getSfilename() {
        return sfilename;
    }

    public void setSfilename(String sfilename) {
        this.sfilename = sfilename == null ? null : sfilename.trim();
    }

    public Date getSendtm() {
        return sendtm;
    }

    public void setSendtm(Date sendtm) {
        this.sendtm = sendtm;
    }

    public Long getSendcount() {
        return sendcount;
    }

    public void setSendcount(Long sendcount) {
        this.sendcount = sendcount;
    }

    public Long getErrline() {
        return errline;
    }

    public void setErrline(Long errline) {
        this.errline = errline;
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
        sb.append(", sfnum=").append(sfnum);
        sb.append(", instcd=").append(instcd);
        sb.append(", sendtype=").append(sendtype);
        sb.append(", sendstatus=").append(sendstatus);
        sb.append(", sfilename=").append(sfilename);
        sb.append(", sendtm=").append(sendtm);
        sb.append(", sendcount=").append(sendcount);
        sb.append(", errline=").append(errline);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}