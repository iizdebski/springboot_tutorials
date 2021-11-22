# SpringBootQueryAnnotation_2

@Query SpringBoot Native Query(SQL query)

Mysql DB namedquery persons_table user:root, password:root;

public interface PeopleManangementDao extends CrudRepository<Person, Integer>{

    @Query(value = "SELECT*FROM persons_table WHERE last_name=?1",nativeQuery = true)
    List<Person> getPeronInfoByLastName(String lastName);

    @Query(value="SELECT*FROM persons_table WHERE first_name=?1 AND email=?2", nativeQuery = true)
    List<Person> findByFirstNameAndEmail(String firstName,String email);
}
