package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento16;
import com.example.webcontabilidad.Repository.Elemento16Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento16Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento16ServiceImp extends CrudGenericoServiceImp<Elemento16,Long> implements Elemento16Service {
    @Autowired
    private Elemento16Repository repo16;

    @Override
    protected ICrudGenericoRepository<Elemento16, Long> getRepo() {
        return repo16;
    }
}
