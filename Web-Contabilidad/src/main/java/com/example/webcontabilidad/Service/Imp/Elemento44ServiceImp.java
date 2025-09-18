package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento44;
import com.example.webcontabilidad.Repository.Elemento44Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento44Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento44ServiceImp extends CrudGenericoServiceImp<Elemento44,Long> implements Elemento44Service {
    @Autowired
    private Elemento44Repository repo44;

    @Override
    protected ICrudGenericoRepository<Elemento44, Long> getRepo() {
        return repo44;
    }
}
