package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento70;
import com.example.webcontabilidad.Repository.Elemento70Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento70Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento70ServiceImp extends CrudGenericoServiceImp<Elemento70,Long> implements Elemento70Service {
    @Autowired
    private Elemento70Repository repo70;

    @Override
    protected ICrudGenericoRepository<Elemento70, Long> getRepo() {
        return repo70;
    }
}
