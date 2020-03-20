package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StZqrlB implements Serializable {
    private String stcd;

    private String lnnm;

    private Date bgtm;

    private Short ptno;

    private BigDecimal z;

    private BigDecimal q;

    private String comments;

    private Date moditime;

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

    public Date getBgtm() {
        return bgtm;
    }

    public void setBgtm(Date bgtm) {
        this.bgtm = bgtm;
    }

    public Short getPtno() {
        return ptno;
    }

    public void setPtno(Short ptno) {
        this.ptno = ptno;
    }

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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
        sb.append(", lnnm=").append(lnnm);
        sb.append(", bgtm=").append(bgtm);
        sb.append(", ptno=").append(ptno);
        sb.append(", z=").append(z);
        sb.append(", q=").append(q);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}