package pil.model.body;

import pil.ui.IBody;

public abstract class Body implements IBody {

    @Override
    public void walk(){
        System.out.println("Walking...");
    }

    @Override
    public void jump(){
        System.out.println("Jumping...");
    }

    @Override
    public void eat(){
        System.out.println("Eating...");
    }
}
