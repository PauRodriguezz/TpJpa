package com.utn.tpPersistenciaJpa.entidades;
import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente extends BaseEntidad {

    private String nombre;
    private String apellido;
    private int telefono;
    private String email;

    // Relacion 1 a N con Domicilio

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<>();

    public void agregarDomicilio(Domicilio domi) {

        domicilios.add(domi);
    }
    public void mostrarDomicilios() {
        System.out.println(" El domicilio de " + nombre + " " + apellido + ":");
        for (Domicilio domicilio : domicilios) {
            System.out.println("Calle: " + domicilio.getCalle() + ", Número: " + domicilio.getNumero());
        }

    }

    // Relacion 1 a N con Pedidos

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();
    public void agregarPedido(Pedido pedi) {

        pedidos.add(pedi);
    }
    public void mostrarPedido() {
        System.out.println("El pedido de " + nombre + " " + apellido + ":");
        for (Pedido pedido : pedidos) {
            System.out.println("Estado: " + pedido.getEstado() + ", subtotal: " + pedido.getFecha() + ", Tipo de envio: " + pedido.getTipoEnvio() + ", Total: " + pedido.getTotal());
        }
    }
}
