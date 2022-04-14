package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        nakresliPrasatko(zofka);

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

}
