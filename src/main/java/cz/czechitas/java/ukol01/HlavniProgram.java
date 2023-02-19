package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu

        nakresliPrasatko(zofka);

        zofka.setLocation(80,80);
    }

    private static void nakresliPrasatko(Turtle zofka) {
        nakresliObdelnik(zofka);

        nakresliNozicky(zofka);

        zofka.turnLeft(135);
        zofka.move(200);
        zofka.turnRight(90);

        nakresliNozicky(zofka);

        nakresliTrojuhelnik(zofka);
    }

    private static void nakresliTrojuhelnik(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.move(71);
        zofka.turnRight(90);
        zofka.move(71);
    }

    private static void nakresliNozicky(Turtle zofka) {
        zofka.turnRight(135);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
    }

    private static void nakresliObdelnik(Turtle zofka) {
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka. turnLeft(90);
            zofka. move(200);
            zofka.turnLeft(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
