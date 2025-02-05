class Player {
    protected String name;
    protected int age;
    protected String position;
    // Constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    public void play() { //-> This is the common method for playing
        System.out.println(name + " is playing.");
    }
    public void train() { // -> This is a common method for training
        System.out.println(name + " is training.");
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}
//-> This is a subclass of player
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is batting or bowling in a cricket match.");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing in the nets.");
    }
}
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing football as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing dribbling and shooting.");
    }
}
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing hockey as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is working on stick handling and speed.");
    }
}
public class PlayerDemo {
    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player footballer = new Football_Player("Lionel Messi", 37, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 32, "Midfielder");
        
        System.out.println("Cricket Player Details:");
        cricketer.displayInfo();
        cricketer.play();
        cricketer.train();
        System.out.println();

        System.out.println("Football Player Details:");
        footballer.displayInfo();
        footballer.play();
        footballer.train();
        System.out.println();

        System.out.println("Hockey Player Details:");
        hockeyPlayer.displayInfo();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
