package franz.with.tut.logic.commands.exceptions;

public abstract class CommandException extends Exception {
    public CommandException(String message) {
        super(message);
    }
}
