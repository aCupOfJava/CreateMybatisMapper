package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StRsvrstrlB implements Serializable {
    private String stcd;

    private String rlstcd;

    private String iomrk;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getRlstcd() {
        return rlstcd;
    }

    public void setRlstcd(String rlstcd) {
        this.rlstcd = rlstcd == null ? null : rlstcd.trim();
    }

    public String getIomrk() {
        return iomrk;
    }

    public void setIomrk(String iomrk) {
        this.iomrk = iomrk == null ? null : iomrk.trim();
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
        sb.append(", stcd=").append(stcd);
        sb.append(", rlstcd=").append(rlstcd);
        sb.append(", iomrk=").append(iomrk);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}