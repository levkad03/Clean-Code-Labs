public class Main {
    public static void main(String[] args) {
        QueryBuilder postgresBuilder = new PostgreSQLBuilder();
        Director postgresDirector = new Director(postgresBuilder);
        String query = postgresDirector.constructQuery("name, age", "age > 25", 10);
        System.out.println("PostgreSQL query: " + query);

        QueryBuilder mysqlBuilder = new MySQLBuilder();
        Director mySQLDirector = new Director(mysqlBuilder);
        String mysqlQuery = mySQLDirector.constructQuery("name, age", "age > 25", 10);
        System.out.println("MySQL query: " + mysqlQuery);
    }
}
