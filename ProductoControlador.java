package tarea10;

public class ProductoControlador {

    private Producto producto[];

    private int contador;

    public ProductoControlador(int saze)
    {
        this.producto = new Producto[saze];

        this.contador = 0;
    }

    public void agregar(String nombres, int codigo, int precio)
    {
        this.producto[this.contador] = new Producto(nombres,codigo,precio);

        this.contador ++;
    }

    public Producto buscar(int codigo)
    {
        int i;

        for (i=0; i<this.contador; i++)
        {
            if(this.producto[i].getCodigo()== codigo)
            {
                break;
            }
        }
        if (i == this.contador)
        {
            return null;
        } else {
            return this.producto[i];
        }
    }

    public void listar()
    {
        for (Producto i: this.producto) {
            System.out.println("Nombre: "+i.getNombre());
            System.out.println("Codigo: "+i.getCodigo());
            System.out.println("Precio: "+i.getPrecio());
        }
    }
}
