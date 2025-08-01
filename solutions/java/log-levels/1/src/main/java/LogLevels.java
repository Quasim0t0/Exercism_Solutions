public class LogLevels {
    
    public static String message(String logLine) {
        String[] arreglo = logLine.split(":", 2);
        return arreglo[1].trim();
    }

    public static String logLevel(String logLine) {    
        String[] arreglo = logLine.split("[\\[\\]]");
        return arreglo[1].toLowerCase();
       
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")" ;
    }
}
