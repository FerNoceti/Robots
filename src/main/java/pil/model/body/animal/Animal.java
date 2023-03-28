package pil.model.body.animal;

import pil.model.body.Body;
import pil.ui.IAnimal;
import pil.ui.IBody;

public class Animal  extends Body implements IAnimal{

    @Override
    public void showType() {
        System.out.println("My body is animal type");
    }

    @Override
    public void hunt() {
        System.out.println("Hunting...");
    }

}
