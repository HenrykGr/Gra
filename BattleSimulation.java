package pl.henryk.grubkajtys.Zadanie2;

class BattleSimulation {

    private static double battle(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double energy = defender.energy();
        if (attackPower > 0){
            return energy - attackPower;
        } else {
            return energy;
        }
    }

    static void fight(Team team1, Team team2) {
        double team2Energy = battle(team1, team2);
        double team1Energy = battle(team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Wygrywa drużyna " + team1.getNameTeam() + " z przewagą " + energyDiff + " energii");
        } else if (energyDiff < 0) {
            System.out.println("Wygrywa drużyna " + team2.getNameTeam() + " z przewagą " + (-energyDiff) + " energii");
        } else {
            System.out.println("Remis, obie drużyny zachowały " + team1Energy + " energii");
        }
    }
}
