package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StRecvinfE implements Serializable {
    private Long rlsh;

    private Long rfnum;

    private String instcd;

    private Long slsh;

    private String stcd;

    private String tabid;

    private Date tm;

    private String exckey;

    private String operation;

    private String excinf;

    private String instostatus;

    private Date instotm;

    private String errinf;

    private Date manualtm;

    private String stat;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public Long getRlsh() {
        return rlsh;
    }

    public void setRlsh(Long rlsh) {
        this.rlsh = rlsh;
    }

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

    public Long getSlsh() {
        return slsh;
    }

    public void setSlsh(Long slsh) {
        this.slsh = slsh;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getTabid() {
        return tabid;
    }

    public void setTabid(String tabid) {
        this.tabid = tabid == null ? null : tabid.trim();
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public String getExckey() {
        return exckey;
    }

    public void setExckey(String exckey) {
        this.exckey = exckey == null ? null : exckey.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getExcinf() {
        return excinf;
    }

    public void setExcinf(String excinf) {
        this.excinf = excinf == null ? null : excinf.trim();
    }

    public String getInstostatus() {
        return instostatus;
    }

    public void setInstostatus(String instostatus) {
        this.instostatus = instostatus == null ? null : instostatus.trim();
    }

    public Date getInstotm() {
        return instotm;
    }

    public void setInstotm(Date instotm) {
        this.instotm = instotm;
    }

    public String getErrinf() {
        return errinf;
    }

    public void setErrinf(String errinf) {
        this.errinf = errinf == null ? null : errinf.trim();
    }

    public Date getManualtm() {
        return manualtm;
    }

    public void setManualtm(Date manualtm) {
        this.manualtm = manualtm;
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
        sb.append(", rlsh=").append(rlsh);
        sb.append(", rfnum=").append(rfnum);
        sb.append(", instcd=").append(instcd);
        sb.append(", slsh=").append(slsh);
        sb.append(", stcd=").append(stcd);
        sb.append(", tabid=").append(tabid);
        sb.append(", tm=").append(tm);
        sb.append(", exckey=").append(exckey);
        sb.append(", operation=").append(operation);
        sb.append(", excinf=").append(excinf);
        sb.append(", instostatus=").append(instostatus);
        sb.append(", instotm=").append(instotm);
        sb.append(", errinf=").append(errinf);
        sb.append(", manualtm=").append(manualtm);
        sb.append(", stat=").append(stat);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}