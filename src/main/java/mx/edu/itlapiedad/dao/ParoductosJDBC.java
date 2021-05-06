package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.productos;

@Repository

public class ParoductosJDBC implements ProductosDAO {
	@Autowired
	JdbcTemplate conexion;

	@Override
	public productos insertar(productos product) {
		
		return null;
	}
	

	@Override
	public List<productos> consultarProductos(){
	String sql_query="SELECT * FROM productos";
	 return conexion.query(sql_query,new RowMapper<productos>(){
	public productos mapRow(ResultSet rs,int rowNum) throws SQLException{
	productos productos=new productos();
	productos.setId(rs.getInt("id"));
	productos.setDescripcion(rs.getString("descripcion"));
	productos.setPrecio(rs.getFloat("precio"));
	productos.setCodigo_barras(rs.getInt("codigo_barras"));
	productos.setExistencia(rs.getInt("exixtencia"));
	return productos;
	}
	
	 }
	}
}



