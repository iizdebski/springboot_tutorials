# SpringDataNamedQuery
@NamedQueries in SpringData JPA

MySQL database - namedquery

table - persons_table

username = root, password = root;

@Entity
@Table(name="persons_table")
@DynamicUpdate
@NamedQueries(value = {
        @NamedQuery(name = "Person.getPeronInfoByLastName", query = "SELECT p FROM Person p WHERE p.lastName=?1"),
        @NamedQuery(name = "Person.findByFirstNameAndEmail", query = "SELECT p FROM Person p WHERE p.firstName=?1 AND email=?2")
