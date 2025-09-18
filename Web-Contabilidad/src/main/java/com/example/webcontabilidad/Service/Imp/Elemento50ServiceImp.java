package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento50;
import com.example.webcontabilidad.Repository.Elemento50Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento50Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento50ServiceImp extends CrudGenericoServiceImp<Elemento50,Long> implements Elemento50Service {
    @Autowired
    private Elemento50Repository repo50;

    @Override
    protected ICrudGenericoRepository<Elemento50, Long> getRepo() {
        return repo50;
    }
}
