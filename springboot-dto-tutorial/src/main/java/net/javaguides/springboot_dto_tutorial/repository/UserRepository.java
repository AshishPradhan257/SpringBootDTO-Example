package net.javaguides.springboot_dto_tutorial.repository;

import net.javaguides.springboot_dto_tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
