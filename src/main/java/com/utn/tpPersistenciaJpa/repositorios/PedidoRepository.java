package com.utn.tpPersistenciaJpa.repositorios;

import com.utn.tpPersistenciaJpa.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido,Long> {

}
