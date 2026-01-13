package com.accenture.kickstart.tag1;


public class Aufgabe11 {
    void main() {
        Point p1 = new Point(123,135);
        Point p2 = new Point(4664,4543);

        System.out.println(p1.calculateDistance(p1, p2));
    }
}

class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public String toString(){
        return x+","+y;
    }

    public double calculateDistance(Point p1, Point p2){
        return Math.sqrt((p2.x-p1.x)^2+(p2.y-p1.y)^2);
    }
}
