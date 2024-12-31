package franz.with.tut.logic.commands;

public class WelcomeCommand extends Command {

    public WelcomeCommand() {
        super("\\bwelcome\\b");
    }

    @Override
    public void performAction(String consoleInput) {
        System.out.println("Hey!");
    }
}
