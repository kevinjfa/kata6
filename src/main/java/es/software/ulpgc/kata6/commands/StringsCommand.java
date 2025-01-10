package es.software.ulpgc.kata6.commands;

public class StringsCommand implements Command {
    public String execute(String operation, String w1, String w2) {
        switch (operation) {
            case "concat":
                return w1 + w2;
            case "compare":
                if (w1.equals(w2)) {
                    return "Las palabras son iguales";
                } else {
                    return "Las palabras son diferentes";
                }
            case "index":
                if (!w1.contains(w2)) {
                    return "No se encuentra ese caracter.";
                } else if (w2.length() > 1) {
                    return "Una palabra no es un caracter.";
                } else {
                    return "El caracter está en la posición " + String.valueOf(w1.indexOf(w2));
                }
            default:
                return "Comando inválido o formato incorrecto";
        }
    }
}
