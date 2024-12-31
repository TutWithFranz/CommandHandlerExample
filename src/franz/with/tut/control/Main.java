package franz.with.tut.control;

import franz.with.tut.logic.commands.*;
import franz.with.tut.ui.CommandHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CommandHandler commandHandler = new CommandHandler(scanner);
        Command[] commands = new Command[]{
                new QuitCommand(commandHandler),
                new WelcomeCommand(),
                new RepeatCommand(scanner),
                new DoubleCommand()
        };
        commandHandler.addCommands(commands);

        commandHandler.handleCommands();
    }
}