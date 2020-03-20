package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StPmevsR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal ppuphtz;

    private BigDecimal ppupltz;

    private BigDecimal ppdwhtz;

    private BigDecimal ppdwltz;

    private BigDecimal mxppq;

    private BigDecimal mnppq;

    private BigDecimal mxdnq;

    private BigDecimal mndnq;

    private Date ppuphtztm;

    private Date ppupltztm;

    private Date ppdwhtztm;

    private Date ppdwltztm;

    private Date mxppqtm;

    private Date mnppqtm;

    private Date mxdnqtm;

    private Date mndnqtm;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getIdtm() {
        return idtm;
    }

    public void setIdtm(Date idtm) {
        this.idtm = idtm;
    }

    public String getSttdrcd() {
        return sttdrcd;
    }

    public void setSttdrcd(String sttdrcd) {
        this.sttdrcd = sttdrcd == null ? null : sttdrcd.trim();
    }

    public BigDecimal getPpuphtz() {
        return ppuphtz;
    }

    public void setPpuphtz(BigDecimal ppuphtz) {
        this.ppuphtz = ppuphtz;
    }

    public BigDecimal getPpupltz() {
        return ppupltz;
    }

    public void setPpupltz(BigDecimal ppupltz) {
        this.ppupltz = ppupltz;
    }

    public BigDecimal getPpdwhtz() {
        return ppdwhtz;
    }

    public void setPpdwhtz(BigDecimal ppdwhtz) {
        this.ppdwhtz = ppdwhtz;
    }

    public BigDecimal getPpdwltz() {
        return ppdwltz;
    }

    public void setPpdwltz(BigDecimal ppdwltz) {
        this.ppdwltz = ppdwltz;
    }

    public BigDecimal getMxppq() {
        return mxppq;
    }

    public void setMxppq(BigDecimal mxppq) {
        this.mxppq = mxppq;
    }

    public BigDecimal getMnppq() {
        return mnppq;
    }

    public void setMnppq(BigDecimal mnppq) {
        this.mnppq = mnppq;
    }

    public BigDecimal getMxdnq() {
        return mxdnq;
    }

    public void setMxdnq(BigDecimal mxdnq) {
        this.mxdnq = mxdnq;
    }

    public BigDecimal getMndnq() {
        return mndnq;
    }

    public void setMndnq(BigDecimal mndnq) {
        this.mndnq = mndnq;
    }

    public Date getPpuphtztm() {
        return ppuphtztm;
    }

    public void setPpuphtztm(Date ppuphtztm) {
        this.ppuphtztm = ppuphtztm;
    }

    public Date getPpupltztm() {
        return ppupltztm;
    }

    public void setPpupltztm(Date ppupltztm) {
        this.ppupltztm = ppupltztm;
    }

    public Date getPpdwhtztm() {
        return ppdwhtztm;
    }

    public void setPpdwhtztm(Date ppdwhtztm) {
        this.ppdwhtztm = ppdwhtztm;
    }

    public Date getPpdwltztm() {
        return ppdwltztm;
    }

    public void setPpdwltztm(Date ppdwltztm) {
        this.ppdwltztm = ppdwltztm;
    }

    public Date getMxppqtm() {
        return mxppqtm;
    }

    public void setMxppqtm(Date mxppqtm) {
        this.mxppqtm = mxppqtm;
    }

    public Date getMnppqtm() {
        return mnppqtm;
    }

    public void setMnppqtm(Date mnppqtm) {
        this.mnppqtm = mnppqtm;
    }

    public Date getMxdnqtm() {
        return mxdnqtm;
    }

    public void setMxdnqtm(Date mxdnqtm) {
        this.mxdnqtm = mxdnqtm;
    }

    public Date getMndnqtm() {
        return mndnqtm;
    }

    public void setMndnqtm(Date mndnqtm) {
        this.mndnqtm = mndnqtm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", idtm=").append(idtm);
        sb.append(", sttdrcd=").append(sttdrcd);
        sb.append(", ppuphtz=").append(ppuphtz);
        sb.append(", ppupltz=").append(ppupltz);
        sb.append(", ppdwhtz=").append(ppdwhtz);
        sb.append(", ppdwltz=").append(ppdwltz);
        sb.append(", mxppq=").append(mxppq);
        sb.append(", mnppq=").append(mnppq);
        sb.append(", mxdnq=").append(mxdnq);
        sb.append(", mndnq=").append(mndnq);
        sb.append(", ppuphtztm=").append(ppuphtztm);
        sb.append(", ppupltztm=").append(ppupltztm);
        sb.append(", ppdwhtztm=").append(ppdwhtztm);
        sb.append(", ppdwltztm=").append(ppdwltztm);
        sb.append(", mxppqtm=").append(mxppqtm);
        sb.append(", mnppqtm=").append(mnppqtm);
        sb.append(", mxdnqtm=").append(mxdnqtm);
        sb.append(", mndnqtm=").append(mndnqtm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}