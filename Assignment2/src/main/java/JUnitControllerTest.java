import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;

import proj.a2.model.entity.User;

public class JUnitControllerTest {

    @Test
    public void testGetUserById() {
    	HomeController userController = new HomeController();
        Optional<User> user = userController.get(1);
        assertEquals(1l, user.get());
    }
}