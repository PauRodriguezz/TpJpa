package com.utn.tpPersistenciaJpa.entidades;

import com.utn.tpPersistenciaJpa.enumeraciones.Estado;
import com.utn.tpPersistenciaJpa.enumeraciones.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido extends BaseEntidad {

    private String fecha;
    private Estado estado;
    private double total;
    private TipoEnvio tipoEnvio;

    // Relacion 1 a N con DetallePedido
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "pedido_id")
    @Builder.Default
    private List<DetallePedido> detalles = new ArrayList<>();
    public void agregarDetalle(DetallePedido detail) {

        detalles.add(detail);
    }

    //Relacion 1 a 1 con Factura
      @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
      @JoinColumn(name = "factura_id")
      private Factura factura;

}




