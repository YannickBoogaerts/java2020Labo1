package be.technifutur.java2020.gestionstage.exception;

public class ExceptionGestionStageNomInvalide  extends  ExceptionGestionStage{
    public ExceptionGestionStageNomInvalide() {
        super();
    }

    public ExceptionGestionStageNomInvalide(String message) {
        super(message);
    }

    public ExceptionGestionStageNomInvalide(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionGestionStageNomInvalide(Throwable cause) {
        super(cause);
    }

    protected ExceptionGestionStageNomInvalide(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
