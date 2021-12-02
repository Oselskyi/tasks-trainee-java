package rolling;

public class Game {
    public static void main(String[] args) {

        Player vadim = new Player(" Vadim ");
        Player bohdan = new Player(" Bohdan");

        vadim.play();
        bohdan.play();
        System.out.println(Roller.roll("/roll 12d6"));
    }


}
