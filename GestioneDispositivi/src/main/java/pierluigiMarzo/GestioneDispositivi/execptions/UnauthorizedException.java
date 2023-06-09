package pierluigiMarzo.GestioneDispositivi.execptions;

public class UnauthorizedException extends RuntimeException {
	public UnauthorizedException(String message) {
		super(message);
	}

}