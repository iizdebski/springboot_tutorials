# SpringBootDataJPAJunitTesting

@RunWith(SpringRunner.class)

@DataJpaTest

@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)

public class TicketBookingDaoTest {

project directory

cmd

mvn clean package - (in project direcrtory must be opened package target with created jar files)

escape general test cases. It will package the jar, bit it will nont run the general test cases.

-DskipTest
