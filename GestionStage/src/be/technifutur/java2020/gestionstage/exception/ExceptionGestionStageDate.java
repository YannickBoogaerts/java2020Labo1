package be.technifutur.java2020.gestionstage.exception;

public class ExceptionGestionStageDate extends ExceptionGestionStage {
    public ExceptionGestionStageDate() {
        super();
    }

    public ExceptionGestionStageDate(String message) {
        super(message);
    }

    public ExceptionGestionStageDate(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionGestionStageDate(Throwable cause) {
        super(cause);
    }

    protected ExceptionGestionStageDate(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
