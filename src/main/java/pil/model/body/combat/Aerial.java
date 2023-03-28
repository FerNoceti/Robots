package pil.model.body.combat;

import pil.model.body.combat.Combat;

public class Aerial extends Combat {
    @Override
    public void fight() {
        System.out.println("Fighting on air...");
    }

    @Override
    public void showType(){
        super.showType();
        System.out.println("Specifically air type");
    }
}
