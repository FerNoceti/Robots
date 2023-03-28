package pil.model.body.combat;

import pil.model.body.Body;
import pil.ui.IBody;
import pil.ui.ICombat;

public abstract class Combat extends Body implements ICombat, IBody {

    @Override
    public void showType(){
        System.out.println("Im a combat robot");
    }

    @Override
    public void surrender() {
        System.out.println("Can´t continue fighting, I surrender...");
    }

}
