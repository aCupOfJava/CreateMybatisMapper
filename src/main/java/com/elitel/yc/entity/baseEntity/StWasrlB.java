package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StWasrlB implements Serializable {
    private String stcd;

    private String rlstcd;

    private String rlmrk;

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

    public String getRlmrk() {
        return rlmrk;
    }

    public void setRlmrk(String rlmrk) {
        this.rlmrk = rlmrk == null ? null : rlmrk.trim();
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
        sb.append(", rlmrk=").append(rlmrk);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}