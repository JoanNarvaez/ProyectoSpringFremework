package com.microservice.productos.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "producto")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="categoria_id")
    private Categoria categoria;


}




