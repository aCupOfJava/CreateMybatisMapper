package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StSenddoE implements Serializable {
    private Long slsh;

    private String stcd;

    private String tabid;

    private Date tm;

    private String exckey;

    private String operation;

    private String excinf;

    private Date moditime;

    private static final long serialVersionUID = 1L;

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
        sb.append(", slsh=").append(slsh);
        sb.append(", stcd=").append(stcd);
        sb.append(", tabid=").append(tabid);
        sb.append(", tm=").append(tm);
        sb.append(", exckey=").append(exckey);
        sb.append(", operation=").append(operation);
        sb.append(", excinf=").append(excinf);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}