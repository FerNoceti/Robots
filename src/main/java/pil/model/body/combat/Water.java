package pil.model.body.combat;

import pil.model.body.combat.Combat;

public class Water extends Combat {
    @Override
    public void fight() {
        System.out.println("Fighting on water...");
    }

    @Override
    public void showType() {
        super.showType();
        System.out.println("Specifically water type");
    }
}
