import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import proj.a2.model.entity.User;
import proj.a2.model.repository.UserDAO;

@RestController
@RequestMapping("api/v1/")
public class HomeController {

    @Autowired
    private UserDAO userRepository;

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public Optional<User> get(@PathVariable Integer id) {
        return userRepository.findById(id);
    }
}