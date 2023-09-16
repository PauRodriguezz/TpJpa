package com.utn.tpPersistenciaJpa.repositorios;

import com.utn.tpPersistenciaJpa.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository  extends JpaRepository <Domicilio,Long> {

}
