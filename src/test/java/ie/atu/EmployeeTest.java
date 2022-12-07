package ie.atu;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
       myEmployee.setName("A");
       Exception ex = assertThrows(IllegalArgumentException.class,  ()  -> myEmployee.getName(), "invalid name length");
       assertTrue(ex.getMessage().contains("invalid name length"));
   }

    @Test
    void testIdSuccess() {
        myEmployee.setId("123456789123");
        assertEquals("123456789123", myEmployee.getId());
    }

    @Test
    void testIdFailure() {
        myEmployee.setId("12223434");
        Exception ex = assertThrows(IllegalArgumentException.class,  ()  -> myEmployee.getName(), "employee number should be 12 digits");
        assertTrue(ex.getMessage().contains("employee number should be 12 digits"));
    }

    @AfterEach
    void tearDown() {
    }
}