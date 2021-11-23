# QueryAnnotationWithUpdateDataSource
@Query with Declaring manipulating queries

DB - namedquery, table - persons_table

user, login = root;

5.3.8. Modifying Queries

 @Modifying(clearAutomatically=true)
    @Query(value="UPDATE Person set email=:newEmail WHERE id=:personId")
    void updatePersonEmailById(@Param("personId")int id,@Param("newEmail") String newEmail);
}

@Override
	public void run(String... args) throws Exception {
		int id = 3;
		String newEmail="AJ.Victory2018@gmail.com";
		peopleManagementService.updatePersonEmailById(id,newEmail);
	}

