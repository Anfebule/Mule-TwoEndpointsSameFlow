package twoEndpointsSameFlow;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@WebService(endpointInterface="ejercicio8.IConsultaProductos")
@Path("/productos")
public class ConsultaProductos implements IConsultaProductos {
	
	/* (non-Javadoc)
	 * @see ejercicio8.IConsultaProductos#consultarProductos()
	 */
	@Override
	@Path("/consultarproductos")
	@POST
	@Produces("application/json")
	public List<Producto> consultarProductos(){
		
		List<Producto> productosconsultados = new ArrayList<Producto>();
		
		Producto p = new Producto();
		p.setReferencia("0001");
		p.setProducto("Producto 1");
		productosconsultados.add(p);
		
		p = new Producto();
		p.setReferencia("0002");
		p.setProducto("Producto 2");
		productosconsultados.add(p);
		
		p = new Producto();
		p.setReferencia("0003");
		p.setProducto("Producto 3");
		productosconsultados.add(p);
		
		p = new Producto();
		p.setReferencia("0004");
		p.setProducto("Producto 4");
		productosconsultados.add(p);
		
		p = new Producto();
		p.setReferencia("0005");
		p.setProducto("Producto 5");
		productosconsultados.add(p);
		
		return productosconsultados;
	}

}
