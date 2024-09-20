public interface QueryBuilder {
    QueryBuilder select(String columns);
    QueryBuilder where(String conditions);
    QueryBuilder limit(int limit);
    String getSQL();
}
