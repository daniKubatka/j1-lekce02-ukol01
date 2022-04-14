package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        nakresliDomecek(zofka);

    }


    public void nakresliCtverec(Turtle zelva){
        for (int i = 0; i < 4; i++) {
            zelva.turnRight(90);
            zelva.move(100);
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

}
