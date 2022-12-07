package ie.atu;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee myEmployee;

    @BeforeEach
    void setUp() {
        myEmployee = new Employee();
    }

    @Test
    void testEmployee() {
        //assertEquals();
    }

    @Test
    public void testNameSuccesss() {
        assertEquals("Aidan", myEmployee.getName("Aidan"));
    }

//    @Test
//    void testNameFailure() {
//        Exception ex = assertThrows(IllegalArgumentException.class,  ()  -> myEmployee.getName("a"));
//    }

    @Test
    void testIdSuccess() {
        assertEquals("123456789123", myEmployee.getId("123456789123"));
    }

    @Test
    void testIdFailure() {

    }

    @AfterEach
    void tearDown() {
    }
}