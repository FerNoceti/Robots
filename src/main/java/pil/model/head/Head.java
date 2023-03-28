package pil.model.head;

import pil.ui.IHead;

public class Head implements IHead {
    private final String face;

    public Head(String face) {
        this.face = face;
    }

    @Override
    public void smile() {
        System.out.println(":)");
    }

    @Override
    public void showFace() {
        System.out.println(face);
    }
}
