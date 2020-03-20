package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StSoilR implements Serializable {
    private String stcd;

    private Date tm;

    private String exkey;

    private BigDecimal vtavslm;

    private BigDecimal srlslm;

    private BigDecimal slm10;

    private BigDecimal slm20;

    private BigDecimal slm30;

    private BigDecimal slm40;

    private BigDecimal slm60;

    private BigDecimal slm80;

    private BigDecimal slm100;

    private String crpty;

    private String crpgrwprd;

    private String hitrsn;

    private String slmmmt;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public String getExkey() {
        return exkey;
    }

    public void setExkey(String exkey) {
        this.exkey = exkey == null ? null : exkey.trim();
    }

    public BigDecimal getVtavslm() {
        return vtavslm;
    }

    public void setVtavslm(BigDecimal vtavslm) {
        this.vtavslm = vtavslm;
    }

    public BigDecimal getSrlslm() {
        return srlslm;
    }

    public void setSrlslm(BigDecimal srlslm) {
        this.srlslm = srlslm;
    }

    public BigDecimal getSlm10() {
        return slm10;
    }

    public void setSlm10(BigDecimal slm10) {
        this.slm10 = slm10;
    }

    public BigDecimal getSlm20() {
        return slm20;
    }

    public void setSlm20(BigDecimal slm20) {
        this.slm20 = slm20;
    }

    public BigDecimal getSlm30() {
        return slm30;
    }

    public void setSlm30(BigDecimal slm30) {
        this.slm30 = slm30;
    }

    public BigDecimal getSlm40() {
        return slm40;
    }

    public void setSlm40(BigDecimal slm40) {
        this.slm40 = slm40;
    }

    public BigDecimal getSlm60() {
        return slm60;
    }

    public void setSlm60(BigDecimal slm60) {
        this.slm60 = slm60;
    }

    public BigDecimal getSlm80() {
        return slm80;
    }

    public void setSlm80(BigDecimal slm80) {
        this.slm80 = slm80;
    }

    public BigDecimal getSlm100() {
        return slm100;
    }

    public void setSlm100(BigDecimal slm100) {
        this.slm100 = slm100;
    }

    public String getCrpty() {
        return crpty;
    }

    public void setCrpty(String crpty) {
        this.crpty = crpty == null ? null : crpty.trim();
    }

    public String getCrpgrwprd() {
        return crpgrwprd;
    }

    public void setCrpgrwprd(String crpgrwprd) {
        this.crpgrwprd = crpgrwprd == null ? null : crpgrwprd.trim();
    }

    public String getHitrsn() {
        return hitrsn;
    }

    public void setHitrsn(String hitrsn) {
        this.hitrsn = hitrsn == null ? null : hitrsn.trim();
    }

    public String getSlmmmt() {
        return slmmmt;
    }

    public void setSlmmmt(String slmmmt) {
        this.slmmmt = slmmmt == null ? null : slmmmt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", exkey=").append(exkey);
        sb.append(", vtavslm=").append(vtavslm);
        sb.append(", srlslm=").append(srlslm);
        sb.append(", slm10=").append(slm10);
        sb.append(", slm20=").append(slm20);
        sb.append(", slm30=").append(slm30);
        sb.append(", slm40=").append(slm40);
        sb.append(", slm60=").append(slm60);
        sb.append(", slm80=").append(slm80);
        sb.append(", slm100=").append(slm100);
        sb.append(", crpty=").append(crpty);
        sb.append(", crpgrwprd=").append(crpgrwprd);
        sb.append(", hitrsn=").append(hitrsn);
        sb.append(", slmmmt=").append(slmmmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}