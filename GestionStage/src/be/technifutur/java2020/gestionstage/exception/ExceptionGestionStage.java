package be.technifutur.java2020.gestionstage.exception;

public class ExceptionGestionStage extends Exception {
    public ExceptionGestionStage() {
        super();
    }

    public ExceptionGestionStage(String message) {
        super(message);
    }

    public ExceptionGestionStage(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionGestionStage(Throwable cause) {
        super(cause);
    }

    protected ExceptionGestionStage(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
