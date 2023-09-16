package com.utn.tpPersistenciaJpa.repositorios;

import com.utn.tpPersistenciaJpa.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository <Rubro,Long> {

}
