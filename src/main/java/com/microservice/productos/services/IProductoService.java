package com.microservice.productos.services;

import com.microservice.productos.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {



    public Optional<Producto> getProducto(Long id);
    public List<Producto> getAllProductos();
    public Producto saveProducto(Producto producto);
    public Producto updateProducto(Producto producto);
    public void deleteProducto(Long id);

}
