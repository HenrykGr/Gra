package pl.henryk.grubkajtys.Zadanie2;

class Game {
        public static void main(String[] args) {
            Offender character1 = new Offender("Jan", 110,100,160,0.3);
            Offender character2 = new Offender("Martyna",100, 160, 100, 0.2);
            Deffender character3 = new Deffender("Kamil",100, 100, 190, 0.3);
            Offender character4 = new Offender("Iga", 120, 100, 100, 0.5);
            Offender character5 = new Offender("Marek", 150, 100, 100, 0.2);
            Deffender character6 = new Deffender("Monia", 100, 150, 100, 0.2);

            Team team1 = new Team("TeamOne", character2, character3, character1);
            Team team2 = new Team("TeamTwo", character5, character6, character4);
            BattleSimulation.fight(team1, team2);
        }
    }
