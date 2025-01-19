import java.util.Scanner;

public class Act1 {
    public boolean actOver;
    DevSpec d = new DevSpec();
    Protagonist p = new Protagonist();
    Mechanics m = new Mechanics();
    Bear b = new Bear();

    public void startGame() throws InterruptedException {
        p.playerDead = false;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Welcome to the Overworld RPG. This game is still in the works and may contain bugs.");
        try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
        Scanner info = new Scanner(System.in);
        System.out.println("What is your character's name?");
        p.playerName = info.nextLine();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("This is the tale of " + p.playerName);
        try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
        //------------------------------------------------------------------------------------------------------------------------------
        Scanner attunement = new Scanner(System.in);
        System.out.println("What is your starting attunement: fire | water | plant");
        String playerAttunement = attunement.nextLine().toLowerCase();
        while (!playerAttunement.equals("fire") && !playerAttunement.equals("water") && !playerAttunement.equals("plant") && !playerAttunement.equals("dev")) {
            System.out.println("Please select a valid attunement: fire | water | plant");
            playerAttunement = attunement.nextLine().toLowerCase();
        }
        if (playerAttunement.equals("fire")) {
            System.out.println("You have selected Fire");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
        } else if (playerAttunement.equals("water")) {
            System.out.println("You have selected Water");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
        } else if (playerAttunement.equals("dev")) {
            System.out.println("You have selected Developer");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
        } else {
            System.out.println("You have selected Plant");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
        }
        //------------------------------------------------------------------------------------------------------------------------------
        Scanner cont = new Scanner(System.in);
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        //------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Overworld contains stats similar to many other games. Here’s what they do!");
        try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Agility increases your chance of dodging an attack!");
        try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Spell damage increases how much damage you do to enemies!");
        try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Health increases your max health!");
        try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Your character starts off with a base of 100 hp, 20 agility, and 25 spell Damage");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Your character also has 2 bonus stats: critical chance and critical damage!");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Critical damage multiplies an attack’s damage by 2, making it deal double damage against all enemies!");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Critical chance increases the chances of that critical hit occurring");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println(p.playerName + " has a base critical chance of 50, meaning you have a 50% chance to deal double damage to enemies who cross your path!");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        Scanner race = new Scanner(System.in);
        System.out.println("Races grant additional stats on top of base stats!");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("If you pick Ganymede, you will be granted 100 health, 10 agility, and 5 spell damage!");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("If you pick Klarian, you will be granted 15 agility, 15 spell damage, and lose 20 hp!");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("If you pick Vorgis, you will be granted 20 spell damage, 15 health, and 10 critical chance!");
        try {Thread.sleep(3000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("What would you like your race to be: Ganymede | Klarian | Vorgis");
        String playerRace = race.nextLine().toLowerCase();
        while (!playerRace.equals("ganymede") && !playerRace.equals("klarian") && !playerRace.equals("vorgis") && !playerRace.equals("dev")) {
            System.out.println("Please select one of the following races: Ganymede | Klarian | Vorgis");
            playerRace = race.nextLine().toLowerCase();
        }
        if (playerRace.equals("ganymede")) {
            System.out.println("You have selected Ganymede!");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
            this.d.devHealth = 1;
            this.d.maxDevHealth = 1;
            this.p.maxPlayerHealth = 200;
            this.p.playerHealth = 200;
            this.p.playerAgility = 30;
            this.p.playerDamage = 30;
            this.p.playerCritChance = 50;
            this.p.playerCritDamage = p.playerDamage * 2;
        } else if (playerRace.equals("klarian")) {
            System.out.println("You have selected Klarian");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
            this.d.devHealth = 1;
            this.d.maxDevHealth = 1;
            this.p.maxPlayerHealth = 80;
            this.p.playerHealth = 80;
            this.p.playerAgility = 35;
            this.p.playerDamage = 40;
            this.p.playerCritChance = 50;
            this.p.playerCritDamage = (p.playerDamage + 10) * 2;
        } else if (playerRace.equals("dev")) {
            System.out.println("You have selected secret dev");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
            this.p.playerHealth = 1;
            this.d.maxDevHealth = 10000;
            this.d.devHealth = 10000;
            this.d.devAgility = 100;
            this.d.devDamage = 1000;
            this.d.devCritChance = 100;
            this.d.devCritDamage = (d.devDamage + 10) * 2;
        } else if (playerRace.equals("vorgis")) {
            System.out.println("You have selected Vorgis");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
            this.d.devHealth = 1;
            this.d.maxDevHealth = 1;
            this.p.maxPlayerHealth = 115;
            this.p.playerHealth = 115;
            this.p.playerAgility = 20;
            this.p.playerDamage = 45;
            this.p.playerCritChance = 60;
            this.p.playerCritDamage = p.playerDamage * 2;
        }
        //------------------------------------------------------------------------------------------------------------------------------
        System.out.println("The game will now begin " + p.playerName);
        try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        p.fireMoves.add("Fire Blade");
        p.waterMoves.add("Cyclone");
        p.plantMoves.add("Flower Whip");
        d.Divinity.add("Holy Beam");
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        Scanner ID = new Scanner(System.in);
        System.out.println("You wake up in a room quite unfamiliar.");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("The walls are wooden, thin, you can hear the neighbors in the next room.");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("This dimly lit room annoys you, you want to leave. You grab your trusty pack of peanuts.");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("On the table you see your dungeon exploring id card, pick it up? (yes or no)");
        String playerID = ID.nextLine().toLowerCase();
        while (!playerID.equals("yes") && !playerID.equals("no")) {
            System.out.println("Please say either yes or no");
            playerID = ID.nextLine().toLowerCase();
        }
        if (playerID.equals("yes")) {
            System.out.println();
            System.out.println("You have obtained your ID!");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
            p.iditem = true;
        } else {
            System.out.println();
            System.out.println("You decide not to take your ID. Maybe you won't need it.");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.exit(0);}
            p.iditem = false;
        }
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("You step outside, it is a beautiful day on the city outskirts.");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Your stomach grumbles, a measly adventurer such as yourself doesn’t make enough money for food.");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("You walk towards Klaria, ready for an action-filled day.");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("While you’re walking...");
        try {Thread.sleep(2500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\nYOU ENCOUNTER A BEAR.");
        try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
        //BEAR FIGHT
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //BEAR FIGHT
        this.b.bearHealth = 200;
        this.b.bearDamage = 30;
        Scanner bear = new Scanner(System.in);
        System.out.println("What will you do " + p.playerName);
        System.out.println("Fight\nFeed\nRun");
        String playerBear = bear.nextLine().toLowerCase();
        while (!playerBear.equals("fight") && !playerBear.equals("run") && !playerBear.equals("feed")) {
            System.out.println("Please select a valid option:\nFight\nRun\nFeed");
            playerBear = bear.nextLine().toLowerCase();
        }
        //------------------------------------------------------------------------------------------------------------------------------
        while (!p.playerDead && !b.bearDead) {
            m.randoCrit = Math.min(100, (int) (Math.random() * 90 + 10));
            m.randoDodge = Math.min(100, (int) (Math.random() * 90 + 10));
            if (playerBear.equals("feed")) {
                System.out.println("You stick your hand out, holding the peanuts that you pocketed before you left,\npraying that the bear will let you live.\nThe bear licks them off you hand, then licks your face.\nIt leaves.");
                break;
                //------------------------------------------------------------------------------------------------------------------------------
            }
            else if (playerBear.equals("run")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("You try to outrun the bear. That might not’ve been the best idea.\nThe bear slashes at your back dealing 50 damage");
                this.p.playerHealth = (Math.max(0, this.p.playerHealth - 50));
                System.out.println("You have " + p.playerHealth + " health remaining!\n\nWhat will you do:\nFight\nRun\nFeed");
                playerBear = bear.nextLine().toLowerCase();
            }
            /*
              this is where the fight takes place, player and bear should be able to actively hurt each other
              player has a chance to dodge bear attacks, bear is always hit. Player rolls a chance to critical the
              bear dealing double damage. Also, the player can be hit by bear when they attack, rolls a chance based
              on how much agility they have.
             */
            //------------------------------------------------------------------------------------------------------------------------------
            else if (playerBear.equals("fight")) {
                if (playerAttunement.equals("fire")) {
                    Scanner playerFight1 = new Scanner(System.in);
                    System.out.println("Available moves: " + p.fireMoves);
                    System.out.println("Please select what move to use!");
                    String pFight1 = playerFight1.nextLine();
                    while (!p.fireMoves.contains(pFight1)) {
                        System.out.println("Please select a valid move: " + p.fireMoves);
                        pFight1 = playerFight1.nextLine();
                    }
                    if (pFight1.equals("Fire Blade")) {

                        if (m.randoCrit > this.p.playerCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("You hit the bear with Fire Blade dealing " + p.playerDamage + " damage");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - p.playerDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            } else {
                                System.out.println("\nThe bear has " + b.bearHealth + " health remaining!");
                                System.out.println("As you move back from attacking, the bear...");
                                try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}

                                if (m.randoDodge < this.p.playerAgility) {
                                    System.out.println("MISSES you with SWIPE!");
                                    System.out.println("\nYou have " + p.playerHealth + " health remaining!");
                                } else if (m.randoDodge > this.p.playerAgility) {
                                    System.out.println("HITS you with SWIPE dealing 30 DAMAGE!");
                                    this.p.playerHealth = (Math.max(0, this.p.playerHealth - b.bearDamage));
                                    System.out.println("\nYou have " + p.playerHealth + " health remaining!");
                                }
                                System.out.println("\nWhat will you do next:\nFight\nRun\nFeed");
                                playerBear = bear.nextLine().toLowerCase();
                            }
                        } else if (m.randoCrit < this.p.playerCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("WHAT A HIT! You dealt DOUBLE damage!");
                            System.out.println("The bear is too STUNNED to attack you!");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - p.playerCritDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            } else {
                                System.out.println("\nThe bear has " + b.bearHealth + " health remaining!");
                                System.out.println("What will you do:\nFight\nRun\nFeed");
                                playerBear = bear.nextLine().toLowerCase();
                            }
                        }
                    }
                }
                else if (playerAttunement.equals("water")) {
                    Scanner playerFight1 = new Scanner(System.in);
                    System.out.println("Available moves: " + p.waterMoves);
                    System.out.println("Please select what move to use!");
                    String pFight1 = playerFight1.nextLine();
                    while (!p.waterMoves.contains(pFight1)) {
                        System.out.println("Please select a valid move: " + p.waterMoves);
                        pFight1 = playerFight1.nextLine();
                    }
                    if (pFight1.equals("Cyclone")) {
                        if (m.randoCrit > this.p.playerCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("You hit the bear with Cyclone dealing " + p.playerDamage + " damage");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - p.playerDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            } else {
                                System.out.println("\nThe bear has " + b.bearHealth + " health remaining!");
                                try {Thread.sleep(2000);} catch (InterruptedException e) {System.exit(0);}
                                System.out.println("As you move back from attacking, the bear...");
                                try {Thread.sleep(1750);} catch (InterruptedException e) {System.exit(0);}
                                if (m.randoDodge < this.p.playerAgility) {
                                    System.out.println("MISSES you with SWIPE!");
                                    try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                                    System.out.println("\nYou have " + p.playerHealth + " health remaining!");
                                } else if (m.randoDodge > this.p.playerAgility) {
                                    System.out.println("HITS you with SWIPE dealing 30 DAMAGE!");
                                    try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                                    this.p.playerHealth = (Math.max(0, this.p.playerHealth - b.bearDamage));
                                    System.out.println("You have " + p.playerHealth + " health remaining!");
                                }
                                System.out.println("\nWhat will you do next:\nFight\nRun\nFeed");
                                playerBear = bear.nextLine().toLowerCase();
                            }
                        } else if (m.randoCrit < this.p.playerCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("HOLY MOLY! Your damage was DOUBLED!");
                            try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                            System.out.println("The bear is too STUNNED to attack you!");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - p.playerCritDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            } else {
                                System.out.println("\nThe bear has " + b.bearHealth + " health remaining!");
                                try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                                System.out.println("What will you do:\nFight\nRun\nFeed");
                                playerBear = bear.nextLine().toLowerCase();
                            }
                        }
                    }
                }
                //DevSpec
                if (playerAttunement.equals("dev")) {
                    Scanner playerFight1 = new Scanner(System.in);
                    System.out.println("Available moves: " + d.Divinity);
                    System.out.println("Please select what move to use!");
                    String pFight1 = playerFight1.nextLine();
                    while (!d.Divinity.contains(pFight1)) {
                        System.out.println("Please select a valid move: " + d.Divinity);
                        pFight1 = playerFight1.nextLine();
                    }
                    if (pFight1.equals("Holy Beam")) {

                        if (m.randoCrit > this.d.devCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("You hit the bear with Holy Beam dealing " + d.devDamage + " damage");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - d.devDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            } else {continue;}
                            System.out.println("\nThe bear has " + b.bearHealth + " health remaining!");
                            System.out.println("As you move back from attacking, the bear...");
                            try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                            if (m.randoDodge < this.d.devAgility) {
                                System.out.println("MISSES you with SWIPE!");
                                System.out.println("\nYou have " + d.devHealth + " health remaining!");
                            } else if (m.randoDodge > this.d.devAgility) {
                                System.out.println("HITS you with SWIPE dealing 30 DAMAGE!");
                                this.d.devHealth = (Math.max(0, this.d.devHealth - b.bearDamage));
                                System.out.println("\nYou have " + d.devHealth + " health remaining!");
                            }
                            System.out.println("What will you do:\nFight\nRun\nFeed");
                            playerBear = bear.nextLine().toLowerCase();
                        } else if (m.randoCrit < this.d.devCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("WHAT A HIT! You dealt DOUBLE damage!");
                            System.out.println("The bear is too STUNNED to attack you!");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - d.devCritDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            }
                            System.out.println("\nThe bear has " + b.bearHealth + " health remaining!\nWhat will you do: Fight | Run | Feed ");
                            playerBear = bear.nextLine().toLowerCase();
                        }
                    }
                }
                else if (playerAttunement.equals("plant")) {
                    Scanner playerFight1 = new Scanner(System.in);
                    System.out.println("Available moves: " + p.plantMoves);
                    System.out.println("Please select what move to use!");
                    String pFight1 = playerFight1.nextLine();
                    while (!p.plantMoves.contains(pFight1)) {
                        System.out.println("Please select a valid move: " + p.plantMoves);
                        pFight1 = playerFight1.nextLine();
                    }
                    if (pFight1.equals("Flower Whip")) {
                        if (m.randoCrit < this.p.playerCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("You hit the bear with Flower Whip dealing " + p.playerDamage + " damage");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - p.playerDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            } else {
                                System.out.println("The bear has " + b.bearHealth + " health remaining!");
                                try {Thread.sleep(1750);} catch (InterruptedException e) {System.exit(0);}
                                System.out.println("As you move back from attacking, the bear...");
                                try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                                if (m.randoDodge < this.p.playerAgility) {
                                    System.out.println("MISSES you with SWIPE!");
                                    try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                                    System.out.println("\nYou have " + p.playerHealth + " health remaining!");
                                } else if (m.randoDodge > this.p.playerAgility) {
                                    System.out.println("HITS you with SWIPE dealing 30 DAMAGE!");
                                    try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                                    this.p.playerHealth = (Math.max(0, this.p.playerHealth - b.bearDamage));
                                    System.out.println("\nYou have " + p.playerHealth + " health remaining!");
                                }
                                System.out.println("What will you do:\nFight\nRun\nFeed");
                                playerBear = bear.nextLine().toLowerCase();
                            }
                        } else if (m.randoCrit > this.p.playerCritChance) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("WOWZERS! That bear just took TWICE the amount of DAMAGE!");
                            try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                            System.out.println("The bear is too STUNNED to attack you!");
                            this.b.bearHealth = (Math.max(0, this.b.bearHealth - p.playerCritDamage));
                            if (b.bearHealth == 0) {
                                b.bearDead = true;
                            } else {
                                System.out.println("\nThe bear has " + b.bearHealth + " health remaining!");
                                System.out.println("What will you do:\nFight\nRun\nFeed");
                                playerBear = bear.nextLine().toLowerCase();
                            }
                        }
                    }
                }
            }
            //THIS IS IF THE PLAYER DIES
            //------------------------------------------------------------------------------------------------------------------------------
            //------------------------------------------------------------------------------------------------------------------------------
            //------------------------------------------------------------------------------------------------------------------------------
            //------------------------------------------------------------------------------------------------------------------------------
            if (p.playerHealth == 0 || p.playerHealth <= 0 || d.devHealth == 0 || d.devHealth <= 0) {
                p.playerDead = true;
                System.out.println("The bear got the best of you.");
                try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                System.out.println("This is where your story ends, " + p.playerName + ".");
                try {System.exit(0);} catch (Exception e) {System.out.println("GAME OVER");}

                //THIS IS IF THE BEAR DIES
                //------------------------------------------------------------------------------------------------------------------------------
                //------------------------------------------------------------------------------------------------------------------------------
                //------------------------------------------------------------------------------------------------------------------------------
                //------------------------------------------------------------------------------------------------------------------------------
            } else if (b.bearHealth == 0 || b.bearHealth < 0 || b.bearDead) {
                System.out.println(p.playerName + " has slain the bear!");
                try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                System.out.println("You have gained 1 investment point from defeating the bear!");
                try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                System.out.println("⭐️You have received an item: Large Health Potion");
                try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                p.inventory.add("Large Health Potion");
                System.out.println("Your current health is " + p.playerHealth);
                Scanner hPot = new Scanner(System.in);
                System.out.println("Would you like to use the potion? (yes or no)");
                String useHPot = hPot.nextLine().toLowerCase();
                while (!useHPot.equals("yes") && !useHPot.equals("no")) {
                    System.out.println("Please select an option: yes or no");
                    useHPot = hPot.nextLine().toLowerCase();
                }
                if (useHPot.equals("no")) {
                    System.out.println("You decide to save your health potion. Perhaps this is for the best.");
                    try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                } else {
                    p.playerHealth = p.maxPlayerHealth;
                    System.out.println("Your health has been restored. You have " + p.playerHealth + " health!");
                    try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                    System.out.println("Press any key to continue");
                    cont.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                }
                //------------------------------------------------------------------------------------------------------------------------------
                this.m.investmentPoint += 1;
                Scanner Invest = new Scanner(System.in);
                System.out.println("Would you like to use your investment point right now? (yes or no)");
                String pInvest = Invest.nextLine().toLowerCase();
                while (!pInvest.equals("yes") && !pInvest.equals("no")) {
                    System.out.println("Please choose either yes or no!");
                    pInvest = Invest.nextLine().toLowerCase();
                }
                if (pInvest.equals("no")) {
                    System.out.println("You can use it later!");
                    try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                    break;
                } else {
                    Scanner usePoint = new Scanner(System.in);
                    System.out.println("What would you like to invest in: Damage | Agility | Health");
                    String pUsePoint = usePoint.nextLine().toLowerCase();
                    while (!pUsePoint.equals("health") && !pUsePoint.equals("damage") && !pUsePoint.equals("agility")) {
                        System.out.println("Please choose one of these options: Damage | Agility | Health");
                        pUsePoint = usePoint.nextLine().toLowerCase();
                    }
                    if (pUsePoint.equals("health")) {
                        p.maxPlayerHealth += 5;
                        System.out.println("Your max health has been increased to " + p.maxPlayerHealth);
                        try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                        break;
                    } else if (pUsePoint.equals("damage")) {
                        p.playerDamage += 3;
                        System.out.println("Your damage has been increased to " + p.playerDamage);
                        try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                        break;
                    } else {
                        p.playerAgility += 3;
                        System.out.println("Your agility has been increased to " + p.playerAgility);
                        try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
                        break;
                    }
                }
            }
        }
        actOver = true;
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        //---------------------------------------------------------------
        System.out.println("What a terrifying situation. You continue your journey towards Klaria.");
        try {Thread.sleep(1500);} catch (InterruptedException e) {System.exit(0);}
        System.out.println("Press any key to continue");
        cont.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        //---------------------------------------------------------------
        System.out.println("That is where the game ends. As stated in the beginning\nthis is just a demo. Thank you for playing! ");
    }
}
