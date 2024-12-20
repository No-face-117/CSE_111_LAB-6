// CSE-111 LAB - 5 TASK - 8     []
// T-8 A Player class !

public class Player {
    public static int total = 0;
    public static String players = "";
    private String name;
    private String country;
    private int jersey;
    public static int player_count = 0;
    
    public Player(String name, String country, int jersey){
        this.name = name;
        this.country = country;
        this.jersey = jersey;
        total ++;
        players += name + ", ";
    }
    
    public String player_detail(){
        return "Player Name : " + name + "\nJersey Number : " + jersey + "\nCountry : " + country;
    }
    
    public static void info(){
        System.out.println("Total number of players : " + total);
        System.out.println("Players enlisted so far : " + players);
    }

}