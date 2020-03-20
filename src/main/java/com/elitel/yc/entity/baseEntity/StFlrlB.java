package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StFlrlB implements Serializable {
    private String stcd;

    private String lnnm;

    private String maxvalue;

    private Date moditm;

    private String curlinenm;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getLnnm() {
        return lnnm;
    }

    public void setLnnm(String lnnm) {
        this.lnnm = lnnm == null ? null : lnnm.trim();
    }

    public String getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(String maxvalue) {
        this.maxvalue = maxvalue == null ? null : maxvalue.trim();
    }

    public Date getModitm() {
        return moditm;
    }

    public void setModitm(Date moditm) {
        this.moditm = moditm;
    }

    public String getCurlinenm() {
        return curlinenm;
    }

    public void setCurlinenm(String curlinenm) {
        this.curlinenm = curlinenm == null ? null : curlinenm.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", lnnm=").append(lnnm);
        sb.append(", maxvalue=").append(maxvalue);
        sb.append(", moditm=").append(moditm);
        sb.append(", curlinenm=").append(curlinenm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}