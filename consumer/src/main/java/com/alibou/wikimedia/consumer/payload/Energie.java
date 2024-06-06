package com.alibou.wikimedia.consumer.payload;

import lombok.Data;

@Data

public class Energie {
    private String power;
    private String courant;
    private String energie;

    public String getCourant() {
        return courant;
    }

    public String getEnergie() {
        return energie;
    }

    public void setEnergie(String energie) {
        this.energie = energie;
    }

    public void setCourant(String courant) {
        this.courant = courant;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
