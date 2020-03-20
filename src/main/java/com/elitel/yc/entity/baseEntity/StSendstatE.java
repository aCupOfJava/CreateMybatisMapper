package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StSendstatE implements Serializable {
    private String instcd;

    private Date countday;

    private String sttdrcd;

    private String frgrd;

    private String operation;

    private String inftype;

    private Integer stcdnum;

    private Integer infnum;

    private Integer countl30;

    private Integer countb60;

    private Integer countt60;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public Date getCountday() {
        return countday;
    }

    public void setCountday(Date countday) {
        this.countday = countday;
    }

    public String getSttdrcd() {
        return sttdrcd;
    }

    public void setSttdrcd(String sttdrcd) {
        this.sttdrcd = sttdrcd == null ? null : sttdrcd.trim();
    }

    public String getFrgrd() {
        return frgrd;
    }

    public void setFrgrd(String frgrd) {
        this.frgrd = frgrd == null ? null : frgrd.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getInftype() {
        return inftype;
    }

    public void setInftype(String inftype) {
        this.inftype = inftype == null ? null : inftype.trim();
    }

    public Integer getStcdnum() {
        return stcdnum;
    }

    public void setStcdnum(Integer stcdnum) {
        this.stcdnum = stcdnum;
    }

    public Integer getInfnum() {
        return infnum;
    }

    public void setInfnum(Integer infnum) {
        this.infnum = infnum;
    }

    public Integer getCountl30() {
        return countl30;
    }

    public void setCountl30(Integer countl30) {
        this.countl30 = countl30;
    }

    public Integer getCountb60() {
        return countb60;
    }

    public void setCountb60(Integer countb60) {
        this.countb60 = countb60;
    }

    public Integer getCountt60() {
        return countt60;
    }

    public void setCountt60(Integer countt60) {
        this.countt60 = countt60;
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
        sb.append(", countday=").append(countday);
        sb.append(", sttdrcd=").append(sttdrcd);
        sb.append(", frgrd=").append(frgrd);
        sb.append(", operation=").append(operation);
        sb.append(", inftype=").append(inftype);
        sb.append(", stcdnum=").append(stcdnum);
        sb.append(", infnum=").append(infnum);
        sb.append(", countl30=").append(countl30);
        sb.append(", countb60=").append(countb60);
        sb.append(", countt60=").append(countt60);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}