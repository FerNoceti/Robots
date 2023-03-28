package pil.model.body.combat;

public class Ground extends Combat {
    @Override
    public void fight() {
        System.out.println("Fighting on land...");
    }

    @Override
    public void showType() {
        super.showType();
        System.out.println("specifically ground type");
    }
}
