public class GameMaster {
    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        return "You're a level " + character.getLevel() +" "+ character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod tm){
        if(tm==TravelMethod.WALKING){
            return "You're traveling to your destination by walking.";
        }
        else{
            return "You're traveling to your destination on horseback.";
        }
    }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod tm){
        return describe(character) +" "+ describe(tm) + " " +  describe(destination);
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination){
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
