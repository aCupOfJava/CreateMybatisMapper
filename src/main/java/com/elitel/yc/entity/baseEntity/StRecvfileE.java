package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StRecvfileE implements Serializable {
    private Long rfnum;

    private String instcd;

    private String recvtype;

    private String recvstatus;

    private String rfilename;

    private Date recvtm;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public Long getRfnum() {
        return rfnum;
    }

    public void setRfnum(Long rfnum) {
        this.rfnum = rfnum;
    }

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public String getRecvtype() {
        return recvtype;
    }

    public void setRecvtype(String recvtype) {
        this.recvtype = recvtype == null ? null : recvtype.trim();
    }

    public String getRecvstatus() {
        return recvstatus;
    }

    public void setRecvstatus(String recvstatus) {
        this.recvstatus = recvstatus == null ? null : recvstatus.trim();
    }

    public String getRfilename() {
        return rfilename;
    }

    public void setRfilename(String rfilename) {
        this.rfilename = rfilename == null ? null : rfilename.trim();
    }

    public Date getRecvtm() {
        return recvtm;
    }

    public void setRecvtm(Date recvtm) {
        this.recvtm = recvtm;
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
        sb.append(", rfnum=").append(rfnum);
        sb.append(", instcd=").append(instcd);
        sb.append(", recvtype=").append(recvtype);
        sb.append(", recvstatus=").append(recvstatus);
        sb.append(", rfilename=").append(rfilename);
        sb.append(", recvtm=").append(recvtm);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}