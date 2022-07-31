package com.portfolio.daianagodoyBACK.Service;

import com.portfolio.daianagodoyBACK.Entity.Acercade;
import com.portfolio.daianagodoyBACK.Repository.RAcercade;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Sacercade {
    @Autowired
    RAcercade rAcercade;

    public List<Acercade> list(){
        return rAcercade.findAll();
    }

    public Optional<Acercade> getOne(int id){
        return rAcercade.findById(id);
    }

    public Optional<Acercade> getByNmbreA(String nombreA){
        return rAcercade.findByNombreA(nombreA);
    }

    public void save(Acercade acercade){
        rAcercade.save(acercade);
    }

    public void delete(int id){
        rAcercade.deleteById(id);
    }

    public boolean existsById(int id){
        return rAcercade.existsById(id);
    }

    public boolean existsByNombreA(String nombreA){
        return rAcercade.existsByNombreA(nombreA);
    }
}