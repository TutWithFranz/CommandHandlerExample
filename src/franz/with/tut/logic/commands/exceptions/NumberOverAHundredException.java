package franz.with.tut.logic.commands.exceptions;

public class NumberOverAHundredException extends CommandException {
    public NumberOverAHundredException() {
        super("The number is to big (over 100)!");
    }
}
