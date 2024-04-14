package com.microservice.productos.services;

import com.microservice.productos.entity.Categoria;

import com.microservice.productos.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoriaService implements ICategoriaService {



        private final CategoriaRepository categoriaRepository;

        @Override
        public Optional<Categoria> getCategoria(Long id) {
            return categoriaRepository.findById(id);
        }

    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }



        @Override
        public Categoria saveCategoria(Categoria categoria) {
            return categoriaRepository.save(categoria);
        }

        @Override
        public Categoria updateCategoria(Categoria categoria) {
            Categoria p = categoriaRepository.getReferenceById(categoria.getId());
            p.setNombre(categoria.getNombre());


            if (p == null) {
                return null;
            } else {
                return categoriaRepository.save(categoria);
            }

        }

        @Override
        public void deleteCategoria(Long id) {
            categoriaRepository.deleteById(id);
        }
    }














