import java.util.Scanner;

class Game{
    String swordName;
    int piercingDamage,slashingDamage,playerXp;

    public Game(String s_name){ 
        swordName = s_name;
    }
    static void startTheGame(){
        System.out.println("START");
    }

    public void setWeaponFeatures(){
        Scanner in = new Scanner(System.in);
        piercingDamage = in.nextInt();
        slashingDamage = in.nextInt();
        playerXp = in.nextInt();
        
    }

    public void attack(Game opponent){ //instance attacks opponent
        System.out.println("Player Attacked Using: "+swordName);
        opponent.playerXp -= piercingDamage;
    }
    public void parry(Game opponent){ //instance defends from opponent
        System.out.println("Enemy Parried Using: "+swordName);
        opponent.playerXp -= slashingDamage;
    }
    static void endTheGame(){ 
        System.out.println("GAME OVER");
    }
    public void gameSummary(){ //print info of instance attributes
        System.out.println("Sword Name : "+swordName);
        System.out.println("Piercing Damage : "+piercingDamage);
        System.out.println("Slashing Damage : "+slashingDamage);
        System.out.println("Player XP : "+playerXp);
    }       
}

class PAT1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String player_name = input.nextLine();
        Game player1 = new Game(player_name);
        
        player_name = input.nextLine();
        Game player2 = new Game(player_name);

        Game.startTheGame();

        player1.setWeaponFeatures();
        player2.setWeaponFeatures();

        player1.attack(player2);
        
        player2.parry(player1);

        Game.endTheGame();

        System.out.println("***SUMMARY***");
        player1.gameSummary();
        player2.gameSummary();

        System.out.print("WINNER : ");
        if(player1.playerXp>player2.playerXp){
            System.out.println(player1.swordName);
        }
        else{
            System.out.println(player2.swordName);
        }

    }
}