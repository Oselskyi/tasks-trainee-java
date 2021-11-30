package rolling;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void play() {

        System.out.println(Roller.roll(Input.enterCommand()));

    }

    public String getName() {
        return name;
    }


}
