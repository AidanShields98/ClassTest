package ie.atu;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee myEmployee;

    @BeforeEach
    void setUp() {
        myEmployee = new Employee("Aidan", "123456789123");
    }

    @Test
    void testEmployee() {
        //assertEquals();
    }

    @Test
    public void testNameSuccess() {
        myEmployee.setName("Aidan");
        assertEquals("Aidan", myEmployee.getName());
    }

   @Test
   void testNameFailure() {
       Exception ex = assertThrows(IllegalArgumentException.class,  ()  -> myEmployee.getName());
   }

    @Test
    void testIdSuccess() {
        myEmployee.setId("123456789123");
        assertEquals("123456789123", myEmployee.getId());
    }

    @Test
    void testIdFailure() {

    }

    @AfterEach
    void tearDown() {
    }
}