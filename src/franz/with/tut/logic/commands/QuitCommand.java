package franz.with.tut.logic.commands;

import franz.with.tut.ui.CommandHandler;

public class QuitCommand extends Command {
    private final CommandHandler commandHandler;

    public QuitCommand(CommandHandler commandHandler) {
        super("\\bquit\\b");
        this.commandHandler = commandHandler;
    }

    @Override
    public void performAction(String consoleInput) {
        commandHandler.stop();
    }
}
