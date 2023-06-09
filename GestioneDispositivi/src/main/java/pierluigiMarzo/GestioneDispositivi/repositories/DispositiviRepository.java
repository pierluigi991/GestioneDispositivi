package pierluigiMarzo.GestioneDispositivi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pierluigiMarzo.GestioneDispositivi.entities.Dispositivo;



@Repository
public interface DispositiviRepository extends JpaRepository<Dispositivo, UUID> {

}
