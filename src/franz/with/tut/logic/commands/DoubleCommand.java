package franz.with.tut.logic.commands;

import franz.with.tut.logic.commands.exceptions.NumberOverAHundredException;

public class DoubleCommand extends Command {
    public DoubleCommand() {
        super("\\bdouble\\s\\d+\\b");
    }

    @Override
    public void performAction(String consoleInput) throws NumberOverAHundredException {
        String[] arguments = consoleInput.split("\\s");
        int value = Integer.parseInt(arguments[1]) * 2;
        if(value > 100) {
            throw new NumberOverAHundredException();
        }
        System.out.println(value);
    }
}
