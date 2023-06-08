package com.tienda.proyecto.modelos;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tienda {

	private List<Producto> productos;

	public Tienda(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}
	
	public void addProducto (Producto p) {
		productos.add(p);
	}
	
	public void delProducto (Producto p) {
		productos.remove(p);
	}
	
	public void buscar(Predicate<Producto> criterio) {
		productos.stream()
				.filter(criterio)
				.collect(Collectors.toList());
	}
	
	public Producto getProducto(String sku) {
		Optional <Producto> prod = productos.stream()
											.filter(producto -> producto.getSku().equals(sku))
											.findFirst();
		return prod.orElse(null);
	}
	
	public List<Producto> getProductosVirtuales() {
		List <Producto> prodVirtuales = productos.stream()
												.filter(producto -> producto instanceof ProductoVirtual)
												.collect(Collectors.toList());
		return prodVirtuales;
	}
	
	public Set<Producto> getProductosPrecio(){
		Set<Producto> prodOrdenados = productos.stream()
												.sorted(Comparator.comparingDouble(Producto::getPrecio))
												.collect(Collectors.toCollection(HashSet::new));
		return prodOrdenados;
	}
	
	//public HashMap<String, List<Producto>> getProductosPorCategoria(){
		
		//HashMap<String, List<Producto>> prodPorCategoria = new HashMap<>();
		//prodPorCategoria = productos.stream()
		//.collect(Collectors.groupingBy(Producto::getCategoria, Collectors.toList()));
		
	//}
	
	//public List<Producto> getProductosPorAnio(int anio) {
		//List<Producto> prodPorAnio = productos.stream()
			//								.filter(producto -> producto.getIva().getYear)
	//}
	
	
	
	
}
