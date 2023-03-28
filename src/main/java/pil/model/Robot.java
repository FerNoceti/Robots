package pil.model;

import pil.model.body.Body;
import pil.model.head.Head;

public class Robot {

    private final Head head;
    private Body body;

    public Robot(Head head) {
        this.head = head;
    }

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }

    public void changeBody(Body body) {
        this.body = body;
    }
}
