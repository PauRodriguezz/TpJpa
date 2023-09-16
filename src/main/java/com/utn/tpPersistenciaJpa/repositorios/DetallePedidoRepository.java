package com.utn.tpPersistenciaJpa.repositorios;

import com.utn.tpPersistenciaJpa.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository <DetallePedido,Long> {

}
