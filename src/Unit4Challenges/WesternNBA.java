package Unit4Challenges;
public enum WesternNBA {
    Warriors("Golden State", "Warriors", "GSW"),
    Clippers("Los Angeles", "Clippers", "LAC"),
    Lakers("Los Angeles", "Lakers", "LAL"),
    Suns("Phoenix", "Suns", "PHX"),
    Kings("Sacramento", "Kings", "SAC");

    private String teamName;
    private String city;
    private String mascot;

    WesternNBA(String teamName, String mascot, String city) {
        this.teamName = teamName;
        this.city = city;
        this.mascot = mascot;
    }

    public String getTeamName(){
        return teamName;
    }
    public String getCity(){
        return city;
    }
    public String getMascot(){
        return mascot;
    }
}
