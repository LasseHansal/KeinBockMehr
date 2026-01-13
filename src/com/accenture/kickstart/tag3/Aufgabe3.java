package com.accenture.kickstart.tag3;

public class Aufgabe3 {
    static void main() {
        Plant p1 = new Plant("Eiche", 3.5F, false);
        Plant p2 = new Plant("Sonnenblume", 1F, false);
        Plant p3 = new Plant("Roter Fingerhut", 0.1F, true);

        System.out.println(p1.displayAttributes());
        System.out.println(p2.displayAttributes());;
        System.out.println(p3.displayAttributes());
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

    private void setAttributes(String name, float size, boolean isToxic) {
        this.name = name;
        this.size = size;
        this.isToxic = isToxic;
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
