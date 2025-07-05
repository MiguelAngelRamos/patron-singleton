package db;

public class DatabaseConecction {
  private static DatabaseConecction instance;
  private String connectionString;

  private DatabaseConecction() {
   connectionString = "Conexion establecida a la base de datos";
  }

  // Método estático va ser responsable de crear instancia de la clase pero una unica vez
  // Y si esta instancia existe, entonces devuelve la instancia ya creada
  // Este método como pertenece a la clase puede crear una instancia con el contructor privado
  public static DatabaseConecction getInstance() {
    if(instance == null) {
      instance = new DatabaseConecction();
    }
    return instance;
  }

  public String getConnection() {
    return connectionString;
  }

}


// DatabaseConecction databaseConecction = new DatabaseConecction();
