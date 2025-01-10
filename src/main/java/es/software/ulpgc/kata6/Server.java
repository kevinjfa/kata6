package es.software.ulpgc.kata6;

import es.software.ulpgc.kata6.adapters.HttpAdapter;

import static spark.Spark.*;

public class Server {
    public static void start() {
        port(8080);
        get("/:command", (req, res) -> {
            String command = req.params("command");
            String w1 = req.queryParams("w1");
            String w2 = req.queryParams("w2");
            return HttpAdapter.adapt(command, w1, w2);
        });
    }
}
