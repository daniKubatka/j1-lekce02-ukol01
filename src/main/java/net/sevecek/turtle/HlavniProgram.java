package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.sql.SQLOutput;

public class HlavniProgram {
    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        //nakresliDomecek(zofka);
        //nakresliUlici(zofka);
        //nakresliPrasatko(zofka);
        //nakresliSlunicko(zofka);
        //napisJmeno(zofka);
        nakresliCelyObrazek(zofka);
    }

    public void nakresliCtverec(Turtle zelva){
        for (int i = 0; i < 4; i++) {
            zelva.turnRight(90);
            zelva.move(100);
        }
    }

    public void nakresliObdelnik(Turtle zelva){
        for (int i = 0; i < 2; i++) {
            zelva.move(100);
            zelva.turnRight(90);
            zelva.move(150);
            zelva.turnRight(90);
        }
    }

    public void nakresliTrojuhelnik(Turtle zelva){
        zelva.turnRight(45);
        zelva.move(72);
        zelva.turnRight(90);
        zelva.move(72);
        zelva.turnRight(135);
        zelva.move(100);
    }

    private void nakresliDomecek(Turtle zelva){
        nakresliCtverec(zelva);
        nakresliTrojuhelnik(zelva);
    }

    private void nakresliPrasatko(Turtle zelva){
        zelva.turnLeft(90);
        nakresliTrojuhelnik(zelva);
        zelva.turnLeft(180);
        nakresliTelo(zelva);
    }

    private void nakresliTelo(Turtle zelva){
        nakresliObdelnik(zelva);
        zelva.turnRight(180);
        nohy(zelva);
        zelva.penUp();
        zelva.turnRight(135);
        zelva.move(150);
        zelva.penDown();
        zelva.turnRight(90);
        nohy(zelva);
    }

    private void nohy (Turtle zelva){
        zelva.turnRight(45);
        zelva.move(30);
        zelva.turnRight(180);
        zelva.move(30);
        zelva.turnRight(90);
        zelva.move(30);
        zelva.turnRight(180);
        zelva.move(30);
    }

    private void nakresliUlici(Turtle zelva){
        zelva.setLocation(200,200);
        for (int i = 0; i < 5; i++){
            zelva.penDown();
            nakresliDomecek(zelva);
            zelva.turnRight(180);
            zelva.penUp();
            zelva.move(150);
            zelva.turnLeft(90);
        }
    }

    private void nakresliSlunicko(Turtle zelva) {

        for (int i = 0; i < 9; i++) {

            for (int louc = 0; louc < 2; louc++) {
                zelva.move(10);
                zelva.turnRight(20);
            }

            zelva.turnLeft(90);
            zelva.move(20);
            zelva.turnLeft(180);
            zelva.move(20);
            zelva.turnLeft(90);
        }
    }

    private void nakresliCelyObrazek(Turtle zelva) {
        zelva.setLocation(300,75);
        nakresliSlunicko(zelva);
        nakresliUlici(zelva);
        zelva.setLocation(200,400);
        zelva.penDown();
        nakresliDomecek(zelva);
        zelva.turnRight(90);
        zelva.setLocation(500,475);
        nakresliPrasatko(zelva);
        zelva.setLocation(800,400);
        zelva.turnRight(45);
        nakresliDomecek(zelva);
        zelva.turnRight(90);
        napisJmeno(zelva);
    }

    public void napisJmeno(Turtle zelva){
        zelva.setLocation(200, 650);
        pismenoD(zelva);
        zelva.setLocation(265, 650);
        pismenoA(zelva);
        zelva.setLocation(350, 650);
        pismenoN(zelva);
        zelva.setLocation(450, 650);
        pismenoI(zelva);
        zelva.setLocation(475, 650);
        pismenoE(zelva);
        zelva.setLocation(530, 650);
        pismenoL(zelva);
        zelva.setLocation(590, 650);
        pismenoA(zelva);
        zelva.turnLeft(20);

    }

    public void pismenoD(Turtle zelva) {
        zelva.move(100);
        zelva.turnRight(90);
        zelva.move(18);
        for (int i = 0; i < 9; i++) {
            zelva.turnRight(20);
            zelva.move(18);
        }
        zelva.turnRight(90);
    }

    public void pismenoA(Turtle zelva){
        zelva.turnRight(17);
        zelva.move(105);
        zelva.turnRight(145);
        zelva.move(105);
        zelva.turnLeft(180);
        zelva.move(50);
        zelva.turnLeft(70);
        zelva.move(32);
        zelva.turnRight(88);
        }

    public void pismenoN(Turtle zelva){
      zelva.move(100);
      zelva.turnRight(145);
      zelva.move(125);
      zelva.turnLeft(145);
      zelva.move(100);
    }

    public void pismenoI(Turtle zelva){
      zelva.move(100);
    }

    public void pismenoE(Turtle zelva){
        for (int i = 0; i < 2; i++){
            zelva.turnRight(90);
            zelva.move(40);
            zelva.turnRight(180);
            zelva.move(40);
            zelva.turnRight(90);
            zelva.move(50);
        }
        zelva.turnRight(90);
        zelva.move(40);
        zelva.turnLeft(90);
    }

    public void pismenoL(Turtle zelva){
        zelva.turnRight(90);
        zelva.move(40);
        zelva.turnRight(180);
        zelva.move(40);
        zelva.turnRight(90);
        zelva.move(100);
    }










}
