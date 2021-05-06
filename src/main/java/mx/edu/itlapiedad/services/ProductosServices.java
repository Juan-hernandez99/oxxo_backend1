package mx.edu.itlapiedad.services;

import java.util.List;

import mx.edu.itlapiedad.models.productos;

public interface ProductosServices {

	productos insertar(productos product);

	List<productos> consultarProductos();

	
	
}
