package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento34;
import com.example.webcontabilidad.Repository.Elemento34Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento34Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento34ServiceImp extends CrudGenericoServiceImp<Elemento34,Long> implements Elemento34Service {
    @Autowired
    private Elemento34Repository repo34;

    @Override
    protected ICrudGenericoRepository<Elemento34, Long> getRepo() {
        return repo34;
    }
}
