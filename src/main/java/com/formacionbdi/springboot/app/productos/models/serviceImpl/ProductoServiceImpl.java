package com.formacionbdi.springboot.app.productos.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.repository.ProductoRepository;
import com.formacionbdi.springboot.app.productos.models.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {

		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		//Si no encuentra el producto devuelve un null
		return productoRepository.findById(id).orElse(null);
	}

}
