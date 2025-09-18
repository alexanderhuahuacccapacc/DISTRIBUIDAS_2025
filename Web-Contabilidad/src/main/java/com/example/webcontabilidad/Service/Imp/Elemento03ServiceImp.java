package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento03;
import com.example.webcontabilidad.Repository.Elemento03Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento03ServiceImp extends CrudGenericoServiceImp<Elemento03,Long> implements Elemento03Service {

    @Autowired
    private Elemento03Repository repo;
    @Override
    protected ICrudGenericoRepository<Elemento03, Long> getRepo() {
        return repo;
    }
}
