package pierluigiMarzo.GestioneDispositivi.entities.payloads;


import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import pierluigiMarzo.GestioneDispositivi.entities.Stato;
import pierluigiMarzo.GestioneDispositivi.entities.TipoDispositivo;

@Getter
public class ModificaDispositivoPayload {
	@NotNull(message = "Il tipo del dispositivo è obbligatorio")
	TipoDispositivo tipoDispositivo;
	@NotNull(message = "Lo stato del dispositivo è obbligatorio")
	Stato statoDispositivo;
	public UUID getIdUtente() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
