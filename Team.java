package pl.henryk.grubkajtys.Zadanie2;

class Team {
    private static final int MAX_CHARACTER = 3;
    private GameCharacter[] gameCharacters = new GameCharacter[MAX_CHARACTER];
    private String nameTeam;

    public Team(String nameTeam, GameCharacter character1, GameCharacter character2, GameCharacter character3) {
        this.gameCharacters[0] = character1;
        this.gameCharacters[1] = character2;
        this.gameCharacters[2] = character3;
        this.nameTeam = nameTeam;
    }

    public GameCharacter[] getGameCharacters() {
        return gameCharacters;
    }

    public void setGameCharacters(GameCharacter[] gameCharacters) {
        this.gameCharacters = gameCharacters;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    double attack() {
        double attack = 0;
        for (GameCharacter character : gameCharacters) {
            attack += character.totalPower();
        }
        return attack;
    }

    double defense() {
        double defense = 0;
        for (GameCharacter character : gameCharacters) {
            defense += character.totalDefense();
        }
        return defense;
    }

    double energy() {
        double energy = 0;
        for (GameCharacter character : gameCharacters) {
            energy += character.getEnergy();
        }
        return energy;
    }
}
