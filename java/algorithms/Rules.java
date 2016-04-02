package algorithms;

import models.Cell;
import models.Game;
import models.Unit;
import models.UnitType;

public class Rules {

    public static boolean checkAttack(){
        return false;
    }

    public static boolean checkBuild(Game game){
        return false;
    }

    public static boolean checkCreate(Game game, UnitType unitType) {
        Cell city = game.getCurrentPlayer().getCity();
        if (city == null) {
            System.err.println("Cannot create: city not found");
            return false;
        }
        Unit unit = game.getWorld().getCell(city.getX(), city.getY()).getUnit();
        if (unit != null) {
            System.err.println("Cannot create: city is full");
            return false;
        }

        if(game.getCurrentPlayer().getGold() < unitType.cost) {
            System.err.println("Cannot create: unit is too expensive");
            return false;
        }

        return true;
    }

    public static boolean checkDestroy(){
        return false;
    }

    public static boolean checkMove(){
        return false;
    }
}
