package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento52;
import com.example.webcontabilidad.Repository.Elemento52Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento52Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento52ServiceImp extends CrudGenericoServiceImp<Elemento52,Long> implements Elemento52Service {
    @Autowired
    private Elemento52Repository repo52;

    @Override
    protected ICrudGenericoRepository<Elemento52, Long> getRepo() {
        return repo52;
    }
}
