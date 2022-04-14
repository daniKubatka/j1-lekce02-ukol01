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
            zelva.turnRight(90.00);
            zelva.move(100.00);
        }
    }

    public void nakresliObdelnik(Turtle zelva){
        for (int i = 0; i < 2; i++) {
            zelva.move(100.00);
            zelva.turnRight(90.00);
            zelva.move(150.00);
            zelva.turnRight(90.00);
        }
    }

    public void nakresliTrojuhelnik(Turtle zelva){
        zelva.turnRight(45.00);
        zelva.move(72.00);
        zelva.turnRight(90.00);
        zelva.move(72.00);
        zelva.turnRight(135.00);
        zelva.move(100.00);
    }

    private void nakresliDomecek(Turtle zelva){
        nakresliCtverec(zelva);
        nakresliTrojuhelnik(zelva);
    }

    private void nakresliPrasatko(Turtle zelva){
        zelva.turnLeft(90.00);
        nakresliTrojuhelnik(zelva);
        zelva.turnLeft(180.00);
        nakresliTelo(zelva);
    }

    private void nakresliTelo(Turtle zelva){
        nakresliObdelnik(zelva);
        zelva.turnRight(180.00);
        nohy(zelva);
        zelva.penUp();
        zelva.turnRight(135.00);
        zelva.move(150.00);
        zelva.penDown();
        zelva.turnRight(90.00);
        nohy(zelva);
    }

    private void nohy (Turtle zelva){
        zelva.turnRight(45.00);
        zelva.move(30.00);
        zelva.turnRight(180.00);
        zelva.move(30.00);
        zelva.turnRight(90.00);
        zelva.move(30.00);
        zelva.turnRight(180.00);
        zelva.move(30.00);
    }

    private void nakresliUlici(Turtle zelva){
        zelva.setLocation(200,200);
        for (int i = 0; i < 5; i++){
            zelva.penDown();
            nakresliDomecek(zelva);
            zelva.turnRight(180.00);
            zelva.penUp();
            zelva.move(150.00);
            zelva.turnLeft(90.00);
        }
    }

    private void nakresliSlunicko(Turtle zelva) {

        for (int i = 0; i < 9; i++) {

            for (int louc = 0; louc < 2; louc++) {
                zelva.move(10.00);
                zelva.turnRight(20.00);
            }

            zelva.turnLeft(90.00);
            zelva.move(20.00);
            zelva.turnLeft(180.00);
            zelva.move(20.00);
            zelva.turnLeft(90.00);
        }
    }

    private void nakresliCelyObrazek(Turtle zelva) {
        zelva.setLocation(300,75);
        nakresliSlunicko(zelva);
        nakresliUlici(zelva);
        zelva.setLocation(200.00,400.00);
        zelva.penDown();
        nakresliDomecek(zelva);
        zelva.turnRight(90.00);
        zelva.setLocation(500.00,475.00);
        nakresliPrasatko(zelva);
        zelva.setLocation(800.00,400.00);
        zelva.turnRight(45.00);
        nakresliDomecek(zelva);
        zelva.turnRight(90.00);
        napisJmeno(zelva);
    }

    public void napisJmeno(Turtle zelva){
        zelva.setLocation(200.00, 650.00);
        pismenoD(zelva);
        zelva.setLocation(265.00, 650.00);
        pismenoA(zelva);
        zelva.setLocation(350.00, 650.00);
        pismenoN(zelva);
        zelva.setLocation(450.00, 650.00);
        pismenoI(zelva);
        zelva.setLocation(475.00, 650.00);
        pismenoE(zelva);
        zelva.setLocation(530.00, 650.00);
        pismenoL(zelva);
        zelva.setLocation(590.00, 650.00);
        pismenoA(zelva);
        zelva.turnLeft(20.00);

    }

    public void pismenoD(Turtle zelva) {
        zelva.move(100.00);
        zelva.turnRight(90.00);
        zelva.move(18.00);
        for (int i = 0; i < 9; i++) {
            zelva.turnRight(20.00);
            zelva.move(18.00);
        }
        zelva.turnRight(90.00);
    }

    public void pismenoA(Turtle zelva){
        zelva.turnRight(17.00);
        zelva.move(105.00);
        zelva.turnRight(145.00);
        zelva.move(105.00);
        zelva.turnLeft(180.00);
        zelva.move(50.00);
        zelva.turnLeft(70.00);
        zelva.move(32.00);
        zelva.turnRight(88.00);
        }

    public void pismenoN(Turtle zelva){
      zelva.move(100.00);
      zelva.turnRight(145.00);
      zelva.move(125.00);
      zelva.turnLeft(145.00);
      zelva.move(100.00);
    }

    public void pismenoI(Turtle zelva){
      zelva.move(100.00);
    }

    public void pismenoE(Turtle zelva){
        for (int i = 0; i < 2; i++){
            zelva.turnRight(90.00);
            zelva.move(40.00);
            zelva.turnRight(180.00);
            zelva.move(40.00);
            zelva.turnRight(90.00);
            zelva.move(50.00);
        }
        zelva.turnRight(90.00);
        zelva.move(40.00);
        zelva.turnLeft(90.00);
    }

    public void pismenoL(Turtle zelva){
        zelva.turnRight(90.00);
        zelva.move(40.00);
        zelva.turnRight(180.00);
        zelva.move(40.00);
        zelva.turnRight(90.00);
        zelva.move(100.00);
    }










}
