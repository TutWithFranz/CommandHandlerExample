package franz.with.tut.logic.commands;

import java.util.Scanner;

public class RepeatCommand extends Command {
    private final Scanner scanner;

    public RepeatCommand(Scanner scanner) {
        super("\\brepeat\\b");
        this.scanner = scanner;
    }

    @Override
    public void performAction(String consoleInput) {
        String next = scanner.next();
        System.out.println(next);
    }
}