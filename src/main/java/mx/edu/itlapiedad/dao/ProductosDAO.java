package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.productos;

public interface ProductosDAO {

	productos insertar(productos product);
	List<productos> consultarProductos();
}
