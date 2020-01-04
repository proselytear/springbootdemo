package net.proselyte.springbootdemo.repository;

import net.proselyte.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
