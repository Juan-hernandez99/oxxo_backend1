package mx.edu.itlapiedad.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import mx.edu.itlapiedad.models.productos;

import mx.edu.itlapiedad.services.ProductosServices;

@RestController
@RequestMapping("/Productos")

public class ProductosWS {
	@Autowired
	ProductosServices servicio;
	
	
		@GetMapping()
		public ResponseEntity<?> consultarProductos(){
		List<productos> resultado;
		try{
		resultado=servicio.consultarProductos();
		} catch (DataAccessException e){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<productos>>(resultado,HttpStatus.OK);
		}
		

		
	
	@PostMapping("/ingresar")
	public ResponseEntity<?> insertarUsuarios(@RequestBody productos product) {
		productos resultado=null;
		resultado=servicio.insertar(product);
		
		
		
		return new ResponseEntity<productos>(resultado, HttpStatus.CREATED);
	}
	


}
