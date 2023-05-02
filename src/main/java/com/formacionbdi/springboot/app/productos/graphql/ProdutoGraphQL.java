package com.formacionbdi.springboot.app.productos.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.formacionbdi.springboot.app.productos.entities.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProdutoGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
	private Environment env;
    
    @Autowired(required=true)
	private IProductoService productoService;

    public Producto producto(Long id) {
        Producto producto = productoService.findById(id);	
		return producto;
    }

    public List<Producto> getProductos() {
        return productoService.findAll().stream().map(producto ->{
			return producto;
		}).collect(Collectors.toList());
    }

    public Producto saveProducto(Producto input) {
        return productoService.save(input);
    }

    public Boolean deleteProducto(Long id) {
        try{
            productoService.deleteById(id);
            return true;
        }catch(Exception ex){

        }
        return false;
    }
}