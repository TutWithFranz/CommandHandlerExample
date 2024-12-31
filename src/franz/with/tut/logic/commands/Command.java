package franz.with.tut.logic.commands;

import franz.with.tut.logic.commands.exceptions.CommandException;

import java.util.regex.Pattern;

public abstract class Command {
    private final String regexPattern;

    protected Command(String regexPattern) {
        this.regexPattern = regexPattern;
    }

    public final boolean isMatchingPattern(String consoleInput) {
        return Pattern.matches(regexPattern, consoleInput);
    }

    public abstract void performAction(String consoleInput) throws CommandException;
}