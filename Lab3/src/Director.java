public class Director {
    private QueryBuilder builder;

    public Director(QueryBuilder builder) {
        this.builder = builder;
    }

    public String constructQuery(String columns, String conditions, int limit) {
        return builder.select(columns).where(conditions).limit(limit).getSQL();
    }
}
