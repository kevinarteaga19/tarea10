package tarea10;

public class Main {

    public static void main(String[] args) {

        ProductoControlador productoControlador = new ProductoControlador(3);

        productoControlador.agregar("Laptop", 10001,2780 );
        productoControlador.agregar("Mouse", 10111, 780);
        productoControlador.agregar("Ventilador",10222, 340);

        productoControlador.listar();

        System.out.println("<<<<<<Buscar producto por codigo>>>>>>");

        int codigo = 10001;

        Producto encontrado;

        encontrado = productoControlador.buscar(codigo);

        if(encontrado != null)
        {
            System.out.println("Producto encontrado con el codigo: "+encontrado.getCodigo());
        } else {
            System.out.println("No se encontro el Producto del codigo: "+codigo);
        }
    }
}
