import db.DatabaseConecction;

public class App {
  
  public static void main(String[] args) {
    DatabaseConecction databaseConecctionUno = DatabaseConecction.getInstance();
    DatabaseConecction databaseConecctionDos = DatabaseConecction.getInstance();

    System.out.println("databaseConnectionUno" + databaseConecctionUno.getConnection());
    System.out.println("databaseConnectionDos" + databaseConecctionDos.getConnection());

  // = asignacion
  // == comparación
    if(databaseConecctionUno == databaseConecctionDos) {
      System.out.println("Ambas instancias son iguales (Sigleton Funciona)");
    } else {
       System.out.println("Las instancias son diferentes (Sigleton No Funciona)");
    }
  }
}
