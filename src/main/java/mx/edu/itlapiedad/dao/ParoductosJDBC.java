package mx.edu.itlapiedad.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import mx.edu.itlapiedad.models.productos;

public class ParoductosJDBC implements ProductosDAO {
	@Autowired
	JdbcTemplate conexion;

	@Override
	public productos insertar(productos product) {
		
		return null;
	}

}
