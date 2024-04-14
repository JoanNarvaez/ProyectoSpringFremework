package com.microservice.productos.controller;

import com.microservice.productos.entity.Categoria;
import com.microservice.productos.services.ICategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categoria")
@RequiredArgsConstructor

public class CategoriaController {




        private final ICategoriaService categoriaService;

        @GetMapping
        public List<Categoria> listarCategoria() {
            return categoriaService.getAllCategorias();
        }

        @GetMapping("/{id}")
        public Optional<Categoria> obtenerCategoria(@PathVariable Long id) {
            return categoriaService.getCategoria(id);
            //   .orElseThrow(() -> new RuntimeException("Categoria no encontrado con id: " + id))
        }

        @PostMapping
        public Categoria crearProducto(@RequestBody Categoria categoria) {
            return categoriaService.saveCategoria(categoria);
        }


    }

