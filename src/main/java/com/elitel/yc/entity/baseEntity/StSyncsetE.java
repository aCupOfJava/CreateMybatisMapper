package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;

public class StSyncsetE implements Serializable {
    private String sysname;

    private String sysvalue;

    private static final long serialVersionUID = 1L;

    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname == null ? null : sysname.trim();
    }

    public String getSysvalue() {
        return sysvalue;
    }

    public void setSysvalue(String sysvalue) {
        this.sysvalue = sysvalue == null ? null : sysvalue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysname=").append(sysname);
        sb.append(", sysvalue=").append(sysvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}