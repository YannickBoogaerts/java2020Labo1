package be.technifutur.java2020.gestionstage.exception;

public class ExceptionGestionStageDoublonActivity extends ExceptionGestionStage{
    public ExceptionGestionStageDoublonActivity() {
        super();
    }

    public ExceptionGestionStageDoublonActivity(String message) {
        super(message);
    }

    public ExceptionGestionStageDoublonActivity(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionGestionStageDoublonActivity(Throwable cause) {
        super(cause);
    }

    protected ExceptionGestionStageDoublonActivity(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
