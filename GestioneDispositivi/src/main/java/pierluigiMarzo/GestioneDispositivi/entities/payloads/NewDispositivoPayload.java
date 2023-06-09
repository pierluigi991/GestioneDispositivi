package pierluigiMarzo.GestioneDispositivi.entities.payloads;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import pierluigiMarzo.GestioneDispositivi.entities.TipoDispositivo;

@Getter
public class NewDispositivoPayload {
	@NotNull(message = "Il tipo del dispositivo è obbligatorio")

	TipoDispositivo tipoDispositivo;

}
