package com.portfolio.daianagodoyBACK.Security.Repository;

import com.portfolio.daianagodoyBACK.Security.Entity.Rol;
import com.portfolio.daianagodoyBACK.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}