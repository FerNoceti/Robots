package pil;

import pil.model.Robot;
import pil.model.body.Body;
import pil.model.body.animal.Animal;
import pil.model.body.combat.Aerial;
import pil.model.body.combat.Combat;
import pil.model.body.combat.Ground;
import pil.model.body.combat.Water;
import pil.model.body.housework.Housework;
import pil.model.head.Head;

public class Main {
    public static void main(String[] args) {
        //Create a robot
        Robot robot = new Robot(new Head("|°-°|"));
        robot.getHead().showFace();

        //Create bodies
        Animal animalBody = new Animal();
        Body houseworkBody = new Housework();
        Body aerialCombatBody = new Aerial();
        Body groundCombatBody = new Ground();
        Body waterCombatBody = new Water();

        //Use the bodies
        robot.changeBody(animalBody);
        robot.getBody().walk();
        robot.getBody().showType();
        Animal animalBodyAux = (Animal) robot.getBody();
        animalBodyAux.hunt();

        robot.changeBody(houseworkBody);
        robot.getBody().showType();
        robot.getBody().eat();
        Housework houseworkBodyAux = (Housework) robot.getBody();
        houseworkBodyAux.cook();
        houseworkBodyAux.sweep();

        robot.changeBody(aerialCombatBody);
        robot.getBody().showType();
        Combat combatBodyAux = (Combat) robot.getBody();
        combatBodyAux.fight();

        robot.changeBody(groundCombatBody);
        robot.getBody().showType();
        combatBodyAux = (Combat) robot.getBody();
        combatBodyAux.showType();
        combatBodyAux.fight();

        robot.changeBody(waterCombatBody);
        robot.getBody().showType();
        robot.getHead().smile();
        combatBodyAux = (Combat) robot.getBody();
        combatBodyAux.fight();
        combatBodyAux.surrender();
    }
}
