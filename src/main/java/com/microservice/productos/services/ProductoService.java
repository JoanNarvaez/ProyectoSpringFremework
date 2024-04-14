package com.microservice.productos.services;

import com.microservice.productos.entity.Producto;
import com.microservice.productos.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ProductoService implements IProductoService {

   private final ProductoRepository productoRepository;
    @Override
    public Optional<Producto> getProducto(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto updateProducto(Producto producto) {
        Producto p = productoRepository.getReferenceById(producto.getId());
        p.setNombre(producto.getNombre());
        p.setPrecio(producto.getPrecio());

        if (p == null) {
            return null;
        } else {
            return productoRepository.save(producto);
        }

    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
