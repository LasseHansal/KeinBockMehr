package com.accenture.kickstart.tag3;

public class Aufgabe3 {
    static void main() {

    }
}

class Plant{
    private String name;
    private float size;
    private boolean isToxic;

    public Plant(String name, float size, boolean isToxic) {
        this.name = name;
        this.size = size;
        this.isToxic = isToxic;
    }

    public void setAttributes(String newname, float newsize, boolean newisToxic) {
        this.name = newname;
        this.size = newsize;
        this.isToxic = newisToxic;
    }

    public String displayAttributes() {
        return "Name: " + this.name + ", Size: " + this.size + ", IsToxic: " + this.isToxic;
    }

    public void rise(){
        this.size *= 1.1F;
    }

    public String getType(){
        return this.name;
    }

    public float getSize(){
        return this.size;
    }

    public boolean isToxic(){
        return this.isToxic;
    }
}
