package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StStsmtaskB implements Serializable {
    private String stcd;

    private Short dfrtms;

    private String pfl;

    private String efl;

    private String zfl;

    private String qfl;

    private String wfl;

    private String inqfl;

    private String damfl;

    private String otqfl;

    private String wdwvfl;

    private String sedfl;

    private String icefl;

    private String ppfl;

    private String drnfl;

    private String soilfl;

    private String grwfl;

    private String statfl;

    private String officer;

    private String mphone;

    private String sphone;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Short getDfrtms() {
        return dfrtms;
    }

    public void setDfrtms(Short dfrtms) {
        this.dfrtms = dfrtms;
    }

    public String getPfl() {
        return pfl;
    }

    public void setPfl(String pfl) {
        this.pfl = pfl == null ? null : pfl.trim();
    }

    public String getEfl() {
        return efl;
    }

    public void setEfl(String efl) {
        this.efl = efl == null ? null : efl.trim();
    }

    public String getZfl() {
        return zfl;
    }

    public void setZfl(String zfl) {
        this.zfl = zfl == null ? null : zfl.trim();
    }

    public String getQfl() {
        return qfl;
    }

    public void setQfl(String qfl) {
        this.qfl = qfl == null ? null : qfl.trim();
    }

    public String getWfl() {
        return wfl;
    }

    public void setWfl(String wfl) {
        this.wfl = wfl == null ? null : wfl.trim();
    }

    public String getInqfl() {
        return inqfl;
    }

    public void setInqfl(String inqfl) {
        this.inqfl = inqfl == null ? null : inqfl.trim();
    }

    public String getDamfl() {
        return damfl;
    }

    public void setDamfl(String damfl) {
        this.damfl = damfl == null ? null : damfl.trim();
    }

    public String getOtqfl() {
        return otqfl;
    }

    public void setOtqfl(String otqfl) {
        this.otqfl = otqfl == null ? null : otqfl.trim();
    }

    public String getWdwvfl() {
        return wdwvfl;
    }

    public void setWdwvfl(String wdwvfl) {
        this.wdwvfl = wdwvfl == null ? null : wdwvfl.trim();
    }

    public String getSedfl() {
        return sedfl;
    }

    public void setSedfl(String sedfl) {
        this.sedfl = sedfl == null ? null : sedfl.trim();
    }

    public String getIcefl() {
        return icefl;
    }

    public void setIcefl(String icefl) {
        this.icefl = icefl == null ? null : icefl.trim();
    }

    public String getPpfl() {
        return ppfl;
    }

    public void setPpfl(String ppfl) {
        this.ppfl = ppfl == null ? null : ppfl.trim();
    }

    public String getDrnfl() {
        return drnfl;
    }

    public void setDrnfl(String drnfl) {
        this.drnfl = drnfl == null ? null : drnfl.trim();
    }

    public String getSoilfl() {
        return soilfl;
    }

    public void setSoilfl(String soilfl) {
        this.soilfl = soilfl == null ? null : soilfl.trim();
    }

    public String getGrwfl() {
        return grwfl;
    }

    public void setGrwfl(String grwfl) {
        this.grwfl = grwfl == null ? null : grwfl.trim();
    }

    public String getStatfl() {
        return statfl;
    }

    public void setStatfl(String statfl) {
        this.statfl = statfl == null ? null : statfl.trim();
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer == null ? null : officer.trim();
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
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
        sb.append(", dfrtms=").append(dfrtms);
        sb.append(", pfl=").append(pfl);
        sb.append(", efl=").append(efl);
        sb.append(", zfl=").append(zfl);
        sb.append(", qfl=").append(qfl);
        sb.append(", wfl=").append(wfl);
        sb.append(", inqfl=").append(inqfl);
        sb.append(", damfl=").append(damfl);
        sb.append(", otqfl=").append(otqfl);
        sb.append(", wdwvfl=").append(wdwvfl);
        sb.append(", sedfl=").append(sedfl);
        sb.append(", icefl=").append(icefl);
        sb.append(", ppfl=").append(ppfl);
        sb.append(", drnfl=").append(drnfl);
        sb.append(", soilfl=").append(soilfl);
        sb.append(", grwfl=").append(grwfl);
        sb.append(", statfl=").append(statfl);
        sb.append(", officer=").append(officer);
        sb.append(", mphone=").append(mphone);
        sb.append(", sphone=").append(sphone);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}