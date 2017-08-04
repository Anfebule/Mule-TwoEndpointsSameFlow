package twoEndpointsSameFlow;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface IConsultaProductos {

	public List<Producto> consultarProductos();

}