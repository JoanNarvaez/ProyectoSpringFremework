package com.microservice.productos.services;


import com.microservice.productos.entity.Categoria;


import java.util.List;
import java.util.Optional;

public interface ICategoriaService {


    public Optional<Categoria> getCategoria(Long id);
    public List<Categoria> getAllCategorias();
    public Categoria saveCategoria(Categoria categoria);
    public Categoria updateCategoria(Categoria categoria);
    public void deleteCategoria(Long id);




}
