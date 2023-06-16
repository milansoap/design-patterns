package org.example;

public class Main {
    public static void main(String[] args) {

//        PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();

        AssigmentWork aw = new AssigmentWork();
        aw.setP(p);
        aw.writeAssigment("I am a bit tired to write an assigmnet");

    }
}