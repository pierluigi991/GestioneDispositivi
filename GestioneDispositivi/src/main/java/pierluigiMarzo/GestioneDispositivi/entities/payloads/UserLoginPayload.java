package pierluigiMarzo.GestioneDispositivi.entities.payloads;

import lombok.Getter;

@Getter
public class UserLoginPayload {
	String username;
	String password;
}