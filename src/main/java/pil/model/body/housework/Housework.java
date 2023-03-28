package pil.model.body.housework;

import pil.model.body.Body;
import pil.ui.IHouseWork;

public class Housework extends Body implements IHouseWork {

    @Override
    public void showType() {
        System.out.println("I am Housework type");
    }

    @Override
    public void sweep() {
        System.out.println("Sweeping...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }
}
