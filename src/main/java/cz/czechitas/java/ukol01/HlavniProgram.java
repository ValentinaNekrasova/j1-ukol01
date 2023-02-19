package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu


        zofka.setLocation(80,90);

        nakresliSlunicko(zofka);

        zofka.setLocation(30,210);

        for (int i = 0; i < 6; i++) {
            zofka.penDown();
            nakresliDomecek(zofka);
            zofka.penUp();
            zofka.turnLeft(45);
            zofka.move(80);
            zofka.turnLeft(90);
        }

        zofka.setLocation(600,470);
        zofka.penDown();

        nakresliPrasatko(zofka);

        zofka.setLocation(800,430);

        zofka.turnRight(115);
        zofka.move(80);
        zofka.turnLeft(140);
        zofka.move(80);

        zofka.penUp();
        zofka.setLocation(zofka.getX()+30, zofka.getY()+75);
        zofka.turnLeft(20);
        zofka.penDown();
        zofka.move(75);
        zofka.turnRight(145);
        zofka.move(90);
        zofka.turnLeft(145);
        zofka.move(73);

        zofka.setLocation(zofka.getX()+40, zofka.getY()+40);

        nakresliKyticku(zofka);
    }

    private static void nakresliKyticku(Turtle zofka) {
        for (int i = 0; i < 11; i++) {
            zofka.move(5);
            zofka.turnLeft(90);
            zofka.move(25);
            zofka.turnRight(180);
            zofka.move(25);
            zofka.turnRight(8);
        }
    }

    private static void nakresliDomecek(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(100);
        }
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    private static void nakresliSlunicko(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.move(15);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.move(-30);
            zofka.turnRight(90+20);
        }
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
