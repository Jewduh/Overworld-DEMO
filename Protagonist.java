import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Protagonist {
    public String playerName;
    public int maxPlayerHealth;
    public int playerHealth;
    public int playerAgility;
    public int playerDamage;
    public int playerCritChance;
    public int playerCritDamage;
    public boolean playerDead;
    public String playerAttunement;
    public boolean iditem;

    ArrayList <String> fireMoves = new ArrayList<>(); 
    ArrayList <String> waterMoves = new ArrayList<>();
    ArrayList <String> plantMoves = new ArrayList<>();
    ArrayList <String> inventory = new ArrayList<>();
}
