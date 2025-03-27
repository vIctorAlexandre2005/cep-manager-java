package api.cepmanager.repository;

import aj.org.objectweb.asm.commons.Remapper;
import api.cepmanager.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Page<Users> findAllByActiveTrue(Pageable pagination);
}
