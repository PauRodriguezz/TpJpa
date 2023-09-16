package com.utn.tpPersistenciaJpa.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetallePedido extends BaseEntidad {

    private int cantidad;
    private double subtotal;

    //Relacion N a 1 con Producto --  Al detalle le seteamos los productos

      @ManyToOne()
      @JoinColumn(name = "producto_id")
      private Producto producto;
}
