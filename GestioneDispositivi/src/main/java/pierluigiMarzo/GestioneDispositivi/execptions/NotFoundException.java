package pierluigiMarzo.GestioneDispositivi.execptions;

@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException {

	public NotFoundException(String message) {
		super(message);
	}

}