package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StTableD implements Serializable {
    private String tabid;

    private String tabno;

    private String tabcn;

    private String taben;

    private String exchfl;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getTabid() {
        return tabid;
    }

    public void setTabid(String tabid) {
        this.tabid = tabid == null ? null : tabid.trim();
    }

    public String getTabno() {
        return tabno;
    }

    public void setTabno(String tabno) {
        this.tabno = tabno == null ? null : tabno.trim();
    }

    public String getTabcn() {
        return tabcn;
    }

    public void setTabcn(String tabcn) {
        this.tabcn = tabcn == null ? null : tabcn.trim();
    }

    public String getTaben() {
        return taben;
    }

    public void setTaben(String taben) {
        this.taben = taben == null ? null : taben.trim();
    }

    public String getExchfl() {
        return exchfl;
    }

    public void setExchfl(String exchfl) {
        this.exchfl = exchfl == null ? null : exchfl.trim();
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
        sb.append(", tabid=").append(tabid);
        sb.append(", tabno=").append(tabno);
        sb.append(", tabcn=").append(tabcn);
        sb.append(", taben=").append(taben);
        sb.append(", exchfl=").append(exchfl);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}