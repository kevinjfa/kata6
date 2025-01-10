package es.software.ulpgc.kata6.adapters;

import es.software.ulpgc.kata6.commands.Command;
import es.software.ulpgc.kata6.commands.StringsCommand;

public class HttpAdapter {
    public static String adapt(String command, String w1, String w2) {
        Command str = new StringsCommand();
        return str.execute(command, w1, w2);
    }
}
