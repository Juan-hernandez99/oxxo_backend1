package mx.edu.itlapiedad.services;

import org.springframework.stereotype.Service;

import mx.edu.itlapiedad.dao.ProductosDAO;
import mx.edu.itlapiedad.models.productos;

@Service
public class ProductosLogic implements ProductosServices{
	ProductosDAO repositorio;

	@Override
	public productos insertar(productos product) {
		// TODO Auto-generated method stub
		return repositorio.insertar(product);
	}

	
}
