package pl.henryk.grubkajtys.Zadanie2;

class Offender extends GameCharacter {
        private double bonusPower;

    public Offender(String name, int power, int defense, int energy, double bonusPower) {
        super(name, power, defense, energy);
        this.bonusPower = bonusPower;
    }

    public double getBonusPower() {
        return bonusPower;
    }

    public void setBonusPower(double bonusPower) {
        this.bonusPower = bonusPower;
    }

    @Override
    double totalPower() {
        double result;
        result = super.totalPower() * bonusPower;
        return getPower() + result;
    }
}
