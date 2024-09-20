public class MySQLBuilder implements QueryBuilder {

    private StringBuilder query;

    public MySQLBuilder() {
        this.query = new StringBuilder();
    }

    @Override
    public QueryBuilder select(String columns) {
        query.append("SELECT ")
                .append(String.join(", ", columns))
                .append(" FROM ");

        return this;
    }

    @Override
    public QueryBuilder where(String conditions) {
        query.append(" WHERE ").append(conditions);
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        query.append(" LIMIT ").append(limit);
        return this;
    }

    @Override
    public String getSQL() {
        return query.append(";").toString();
    }
}
