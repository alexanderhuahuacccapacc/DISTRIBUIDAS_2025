package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento61;
import com.example.webcontabilidad.Repository.Elemento61Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento61Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento61ServiceImp extends CrudGenericoServiceImp<Elemento61,Long> implements Elemento61Service {
    @Autowired
    private Elemento61Repository repo61;

    @Override
    protected ICrudGenericoRepository<Elemento61, Long> getRepo() {
        return repo61;
    }
}
