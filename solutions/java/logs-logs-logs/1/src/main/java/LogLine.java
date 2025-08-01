public class LogLine {
    String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        switch(((logLine.split(":"))[0]).substring(1, ((logLine.split(":"))[0]).length()-1)){
            case "INF":
                return LogLevel.INFO;
            case "DBG":
                return LogLevel.DEBUG;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            case "TRC":
                return LogLevel.TRACE;
            default:
                return LogLevel.UNKNOWN;
        }

    }

    public String getOutputForShortLog() {
        String text = this.logLine.split(" ", 2)[1];
        switch(this.getLogLevel()){
            case INFO:
                return "4:" + text;
            case DEBUG:
                return "2:" + text;
            case WARNING:
                return "5:" + text;
            case ERROR:
                return "6:" + text;
            case FATAL:
                return "42:" + text;
            case TRACE:
                return "1:" + text;
            case UNKNOWN:
                return "0:" + text;
            default:
                return "0:" + text;
        }
    }
}
