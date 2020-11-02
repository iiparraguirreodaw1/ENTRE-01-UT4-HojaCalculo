
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - 
 *  
 */
public class TestHojaCalculo
{
    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
        
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el constructor por defecto
     * de fila (el que no tiene parámetros)
     */
    public void test1() {
        Fecha fechaFila1 = new Fecha(4, 10, 2020);
        Fecha fechaFila2 = new Fecha(5, 10, 2020);
        Fecha fechaFila3 = new Fecha(1, 1, 2020);
        Fila nuevaFila1 = new Fila("Fila1", fechaFila1, 25, 132);
        Fila nuevaFila2 = new Fila("Fila2", fechaFila2, 300, 350);
        Fila nuevaFila3 = new Fila("Fila3", fechaFila3, 0, 0);
        double ingresosTotales = 325.50;
        int gastosTotales = 482;
        double beneficiosTotales = -156.50;
        System.out.println("HOJA1");
        System.out.println("               " + "Fecha" + "                " + "Ingresos" + "            " + "Gastos" + "              " + "Beneficio");
        System.out.println(nuevaFila1 + " **");
        System.out.println(nuevaFila2 + " **");
        System.out.println(nuevaFila3);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                     " + ingresosTotales + "€" + "               " + gastosTotales + "€" + "                 " + beneficiosTotales + "€");
        System.out.println();
        System.out.println("Duplicada HOJA1");
        System.out.println("               " + "Fecha" + "                " + "Ingresos" + "            " + "Gastos" + "              " + "Beneficio");
        System.out.println(nuevaFila1 + " **");
        System.out.println(nuevaFila2 + " **");
        System.out.println(nuevaFila3);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                     " + ingresosTotales + "€" + "               " + gastosTotales + "€" + "                 " + beneficiosTotales + "€");
    }      

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
        Fecha fechaNueva1 = new Fecha(7, 10, 2020);
        Fecha fechaNueva2 = new Fecha(8, 10, 2020);
        Fila nuevaFila1 = new Fila("Fila1", fechaNueva1, 260, 125);
        Fila nuevaFila2 = new Fila("Fila2", fechaNueva2, 125, 245);
        double ingresosTotales = 385;
        double gastosTotales = 370;
        double beneficiosTotales = 15;
        System.out.println("HOJA2");
        System.out.println("               " + "Fecha" + "                " + "Ingresos" + "            " + "Gastos" + "              " + "Beneficio");
        System.out.println(nuevaFila1);
        System.out.println(nuevaFila2 + " **");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                     " + ingresosTotales + "€" + "               " + gastosTotales + "€" + "                 " + beneficiosTotales + "€");
        System.out.println();
        System.out.println("Duplicada HOJA2");
        System.out.println("               " + "Fecha" + "                " + "Ingresos" + "            " + "Gastos" + "              " + "Beneficio");
        System.out.println(nuevaFila1);
        System.out.println(nuevaFila2 + " **");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                     " + ingresosTotales + "€" + "               " + gastosTotales + "€" + "                 " + beneficiosTotales + "€");
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        Fecha fechaNueva = new Fecha(8, 10, 2020);
        Fila nuevaFila = new Fila("Fila1", fechaNueva, 670, 234);
        double ingresosTotales = 670;
        double gastosTotales = 234;
        double beneficiosTotales = 436;
        System.out.println("HOJA3");
        System.out.println("               " + "Fecha" + "                " + "Ingresos" + "            " + "Gastos" + "              " + "Beneficio");
        System.out.println(nuevaFila);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                     " + ingresosTotales + "€" + "               " + gastosTotales + "€" + "                 " + beneficiosTotales + "€");
        System.out.println();
        System.out.println("Duplicada HOJA3");
        System.out.println("               " + "Fecha" + "                " + "Ingresos" + "            " + "Gastos" + "              " + "Beneficio");
        System.out.println(nuevaFila);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                     " + ingresosTotales + "€" + "               " + gastosTotales + "€" + "                 " + beneficiosTotales + "€");
    }
    
}
