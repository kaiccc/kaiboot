package top.kaiccc.kai4boot.repository;

import org.springframework.data.repository.CrudRepository;
import top.kaiccc.kai4boot.entity.User;

/**
 * @author kaiccc
 * @date 2018-11-02 12:29
 */
public interface UserRepository extends CrudRepository<User, String> {

    User findUserById(String id);

    User findUserByName(String name);

}
