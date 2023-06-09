package pierluigiMarzo.GestioneDispositivi.entities.payloads;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UserRegistrationPayload {
	@NotNull(message = "L'username è obbligatorio")
	@Size(min = 3, max = 30, message = "Nome min 3 caratteri, massimo 30")
	String username;
	@NotNull(message = "Il nome è obbligatorio")
	String nome;
	@NotNull(message = "Il nome è obbligatorio")
	String cognome;
	@NotNull(message = "La mail è obbligatoria")
	@Email(message = "Non hai inserito un indirizzo email valido")
	String email;
	@NotNull(message = "La password è obbligatoria")
	String password;
}