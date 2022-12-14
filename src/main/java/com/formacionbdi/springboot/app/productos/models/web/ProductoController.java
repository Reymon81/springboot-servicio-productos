package com.formacionbdi.springboot.app.productos.models.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Producto producto(@PathVariable Long id) {
		return productoService.findById(id);
	}

}
