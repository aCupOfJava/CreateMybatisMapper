package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StFfrarB implements Serializable {
    private String stcd;

    private Short tpcyr;

    private Integer rcint;

    private BigDecimal q;

    private BigDecimal z;

    private BigDecimal w1;

    private BigDecimal w3;

    private BigDecimal w5;

    private BigDecimal w7;

    private BigDecimal w10;

    private BigDecimal w15;

    private BigDecimal w30;

    private BigDecimal w60;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Short getTpcyr() {
        return tpcyr;
    }

    public void setTpcyr(Short tpcyr) {
        this.tpcyr = tpcyr;
    }

    public Integer getRcint() {
        return rcint;
    }

    public void setRcint(Integer rcint) {
        this.rcint = rcint;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public BigDecimal getW1() {
        return w1;
    }

    public void setW1(BigDecimal w1) {
        this.w1 = w1;
    }

    public BigDecimal getW3() {
        return w3;
    }

    public void setW3(BigDecimal w3) {
        this.w3 = w3;
    }

    public BigDecimal getW5() {
        return w5;
    }

    public void setW5(BigDecimal w5) {
        this.w5 = w5;
    }

    public BigDecimal getW7() {
        return w7;
    }

    public void setW7(BigDecimal w7) {
        this.w7 = w7;
    }

    public BigDecimal getW10() {
        return w10;
    }

    public void setW10(BigDecimal w10) {
        this.w10 = w10;
    }

    public BigDecimal getW15() {
        return w15;
    }

    public void setW15(BigDecimal w15) {
        this.w15 = w15;
    }

    public BigDecimal getW30() {
        return w30;
    }

    public void setW30(BigDecimal w30) {
        this.w30 = w30;
    }

    public BigDecimal getW60() {
        return w60;
    }

    public void setW60(BigDecimal w60) {
        this.w60 = w60;
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
        sb.append(", tpcyr=").append(tpcyr);
        sb.append(", rcint=").append(rcint);
        sb.append(", q=").append(q);
        sb.append(", z=").append(z);
        sb.append(", w1=").append(w1);
        sb.append(", w3=").append(w3);
        sb.append(", w5=").append(w5);
        sb.append(", w7=").append(w7);
        sb.append(", w10=").append(w10);
        sb.append(", w15=").append(w15);
        sb.append(", w30=").append(w30);
        sb.append(", w60=").append(w60);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}