# SpringDataNamedNativeQuery
@NamedNativeQueries in Spring Data JPA

Database - namedquery

username = root, password = root;

the JPA will directly convert our method api like findByLastName to SQL query right,  
that's correct but only when you are following method name as based on defined rules 
but what if you want to change your method name as custom defined ? that's the benefit of NamedNativeQueries and NamedQueries.

@NamedNativeQuery is for writing SQL query, while @NamedQuery is for writing HQL query.
So in your case, for writing native SQL query you would be needing @NamedNativeQuery.
However, be aware that writing native SQL will make your application less flexible and a portability nightmare 
because you are tying your application to work only for a particular database. 
If you are absolutely sure that you won't be needing to migrate to a different database, then this might not be a big concern for you. 
Otherwise prefer native HQL over native SQL.

@NamedQueryis for writing your queries in JPQL, the standard query language of the JPA standard. 
This is the default and you should stick to these queries whenever possible, because they are independent of the exact DBMS which you use.
@NamedNativeQuery on the other hand is for writing native queries (in SQL) which potentially can be DBMS specific.
It is a tradeoff. @NamedQuery gives you portability because you stick to the standard. 
@NamedNativeQuery gives you flexibility but you leave the standard and potentially lose portability. 
In case you switch to another DBMS, it is likely you would need to rewrite some of your @NamedNativeQuery definitions.
So we should only use @NamedNativeQuery if it is really necessary.

@NamedNativeQueries(value = {
        @NamedNativeQuery(name = "Person.getPeronInfoByLastName", query = "SELECT *FROM persons_table WHERE last_name=?1",resultClass=Person.class),
        @NamedNativeQuery(name = "Person.findByFirstNameAndEmail", query = "SELECT *FROM persons_table WHERE first_name=?1 AND email=?2",resultClass=Person.class)
})
