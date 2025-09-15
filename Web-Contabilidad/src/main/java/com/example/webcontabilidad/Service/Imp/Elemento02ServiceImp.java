package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento02;
import com.example.webcontabilidad.Repository.Elemento02Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento02ServiceImp extends CrudGenericoServiceImp<Elemento02,Long> implements Elemento02Service {

    @Autowired
    private Elemento02Repository repo2;
    @Override
    protected ICrudGenericoRepository<Elemento02, Long> getRepo() {
        return repo2;
    }
}
