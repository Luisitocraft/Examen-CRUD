/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.service;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Producto;

@Service
public class ProductoService {
    List<Producto> listaProductos = new ArrayList<>();

    public boolean saveEntidad(Producto producto) {
        return this.listaProductos.add(producto);
    }

    public List<Producto> listarEntidad() {
        return listaProductos;
    }

    public Producto buscarProducto(String codigo) {
        return listaProductos.stream()
                .filter(producto -> producto.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null); 
    }

    public Producto updateEntidad(Producto producto) {
        listaProductos.stream()
                .filter(p -> p.getCodigo().equals(producto.getCodigo())) 
                .findFirst() 
                .ifPresent(p -> {
                    p.setNombre(producto.getNombre());
                    p.setPrecio(producto.getPrecio());
                });
        return buscarProducto(producto.getCodigo());
    }

    public void deleteRegistEntdad(String codigo) {
        this.listaProductos.remove(listaProductos.stream()
                .filter(producto -> producto.getCodigo().equals(codigo))
                .findFirst().orElse(null));
    }
}

