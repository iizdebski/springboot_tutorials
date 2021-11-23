# QuerySpringDataUsingNamedParameters

@Query with Named Parameters JPQL

DB – demojpaquery

user, password – root;

5.3.6. Using Named Parameters
By default, Spring Data JPA uses position-based parameter binding. This makes query methods a little error-prone when refactoring regarding the parameter position. To solve this issue, you can use @Paramannotation to give a method parameter a concrete name and bind the name in the query.

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
  User findByLastnameOrFirstname(@Param("lastname") String lastname,
                                 @Param("firstname") String firstname);
}
