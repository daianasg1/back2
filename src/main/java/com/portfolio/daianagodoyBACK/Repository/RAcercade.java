package com.portfolio.daianagodoyBACK.Repository;


import com.portfolio.daianagodoyBACK.Entity.Acercade;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAcercade extends JpaRepository<Acercade, Integer>{
    public Optional<Acercade> findByNombreA(String nombreA);
    public boolean existsByNombreA(String nombreA);
}
