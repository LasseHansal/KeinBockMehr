package com.accenture.kickstart.tag3;

public class StarPainting {
    private static void paintStar(){
        System.out.print("*");
    }

    private static void paintSpace(){
        System.out.print(" ");
    }

    private static void paintLineBreak(){
        System.out.print("\n");
    }

    public static void paintFullQuader(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                paintStar();
            }
            paintLineBreak();
        }
    }

    public static void paintEmptyQuader(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(0<i && i < 4 && 0<j && j < 4){
                    paintSpace();
                    continue;
                }
                paintStar();
            }
            paintLineBreak();
        }
    }

    public static void paintRightTriangle(){
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                paintStar();
            }
            paintLineBreak();
        }
    }

    public static void paintTriangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                paintSpace();
            }
            for(int j = 0; j < (1 + 2*i); j++) {
                paintStar();
            }
            paintLineBreak();
        }
    }

    public static void main(String[] args) {
        paintFullQuader();
        paintEmptyQuader();
        paintRightTriangle();
        paintTriangle();
    }
}
