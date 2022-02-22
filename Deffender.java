package pl.henryk.grubkajtys.Zadanie2;

public class Deffender extends GameCharacter {
    private double bonusDefense;

    public Deffender(String name, int power, int defense, int energy, double bonusDefense) {
        super(name, power, defense, energy);
        this.bonusDefense = bonusDefense;
    }

    public double getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(double bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    @Override
    double totalDefense() {
        double result;
        result = super.totalDefense() * bonusDefense;
        return getDefense() + result;
    }
}
