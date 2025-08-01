class Fighter {
    protected String name;
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }   
}

class Warrior extends Fighter{
    public Warrior(){
        this.name = "Warrior";
    }
    @Override
    boolean isVulnerable(){
        return false;
    }
    @Override
    int getDamagePoints(Fighter fighter){
        return (fighter.isVulnerable()) ? 10 : 6;
    }
    public String toString(){
        return "Fighter is a " + name;
    }

}

class Wizard extends Fighter{
    private boolean spell;

    public Wizard(){
        this.name = "Wizard";
        this.spell = false;
    }
    
    public void prepareSpell(){
        spell = true;
    }

    boolean isVulnerable(){
        return !spell;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return (spell) ? 12 : 3;
    }
    public String toString(){
        return "Fighter is a " + name;
    }

}

