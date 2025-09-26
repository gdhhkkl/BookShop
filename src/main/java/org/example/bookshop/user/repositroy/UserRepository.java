package org.example.bookshop.user.repositroy;

import org.example.bookshop.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByIdentification(String identification);

    User findByPassword(String password);
}
