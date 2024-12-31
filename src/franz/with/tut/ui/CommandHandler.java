package franz.with.tut.ui;

import franz.with.tut.logic.commands.Command;
import franz.with.tut.logic.commands.exceptions.CommandException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CommandHandler {
    private final HashSet<Command> knownCommands;
    private final Scanner scanner;
    private boolean isHandling;


    public CommandHandler(Scanner scanner) {
        this.knownCommands = new HashSet<>();
        this.scanner = scanner;
    }

    public void addCommands(Command[] commands) {
        this.knownCommands.addAll(Arrays.asList(commands));
    }

    public void handleCommands() {
        isHandling = true;

        // handle commands
        while (isHandling) {
            String argument = scanner.nextLine();

            // check for known command
            for (Command command : knownCommands) {
                if (command.isMatchingPattern(argument)) {
                    try {
                        command.performAction(argument);
                    } catch (CommandException e) {
                        System.out.println(e.getLocalizedMessage());
                    }
                    break;
                }
            }
        }
    }

    public void stop() {
        isHandling = false;
    }
}
