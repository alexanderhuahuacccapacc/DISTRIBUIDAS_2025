package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento42;
import com.example.webcontabilidad.Repository.Elemento42Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento42Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento42ServiceImp extends CrudGenericoServiceImp<Elemento42,Long> implements Elemento42Service {
    @Autowired
    private Elemento42Repository repo42;

    @Override
    protected ICrudGenericoRepository<Elemento42, Long> getRepo() {
        return repo42;
    }
}
