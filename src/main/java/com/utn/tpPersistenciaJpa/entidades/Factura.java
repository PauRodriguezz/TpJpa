package com.utn.tpPersistenciaJpa.entidades;

import com.utn.tpPersistenciaJpa.enumeraciones.FormaPago;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura extends BaseEntidad{
    private int numero;
    private String fecha;
    private double descuento;
    private int totalFactura;
    private FormaPago formaPago;

}

