package pl.henryk.grubkajtys.Zadanie2;

class GameCharacter {
    private String name;
    private int power;
    private int defense;
    private int energy;

    public GameCharacter(String name, int power, int defense, int energy) {
        this.name = name;
        this.power = power;
        this.defense = defense;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
