package com.utn.tpPersistenciaJpa.repositorios;

import com.utn.tpPersistenciaJpa.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository  extends JpaRepository <Factura,Long> {

}
