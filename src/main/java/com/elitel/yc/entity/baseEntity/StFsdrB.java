package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StFsdrB implements Serializable {
    private String upstcd;

    private String dwstcd;

    private Integer qmgn;

    private Short rchlen;

    private BigDecimal sftq;

    private BigDecimal mntrtm;

    private BigDecimal mxtrtm;

    private BigDecimal avtrtm;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getUpstcd() {
        return upstcd;
    }

    public void setUpstcd(String upstcd) {
        this.upstcd = upstcd == null ? null : upstcd.trim();
    }

    public String getDwstcd() {
        return dwstcd;
    }

    public void setDwstcd(String dwstcd) {
        this.dwstcd = dwstcd == null ? null : dwstcd.trim();
    }

    public Integer getQmgn() {
        return qmgn;
    }

    public void setQmgn(Integer qmgn) {
        this.qmgn = qmgn;
    }

    public Short getRchlen() {
        return rchlen;
    }

    public void setRchlen(Short rchlen) {
        this.rchlen = rchlen;
    }

    public BigDecimal getSftq() {
        return sftq;
    }

    public void setSftq(BigDecimal sftq) {
        this.sftq = sftq;
    }

    public BigDecimal getMntrtm() {
        return mntrtm;
    }

    public void setMntrtm(BigDecimal mntrtm) {
        this.mntrtm = mntrtm;
    }

    public BigDecimal getMxtrtm() {
        return mxtrtm;
    }

    public void setMxtrtm(BigDecimal mxtrtm) {
        this.mxtrtm = mxtrtm;
    }

    public BigDecimal getAvtrtm() {
        return avtrtm;
    }

    public void setAvtrtm(BigDecimal avtrtm) {
        this.avtrtm = avtrtm;
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
        sb.append(", upstcd=").append(upstcd);
        sb.append(", dwstcd=").append(dwstcd);
        sb.append(", qmgn=").append(qmgn);
        sb.append(", rchlen=").append(rchlen);
        sb.append(", sftq=").append(sftq);
        sb.append(", mntrtm=").append(mntrtm);
        sb.append(", mxtrtm=").append(mxtrtm);
        sb.append(", avtrtm=").append(avtrtm);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}