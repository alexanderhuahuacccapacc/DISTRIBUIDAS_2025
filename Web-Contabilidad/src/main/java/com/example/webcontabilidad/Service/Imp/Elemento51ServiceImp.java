package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento51;
import com.example.webcontabilidad.Repository.Elemento51Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento51Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento51ServiceImp extends CrudGenericoServiceImp<Elemento51,Long> implements Elemento51Service {
    @Autowired
    private Elemento51Repository repo51;

    @Override
    protected ICrudGenericoRepository<Elemento51, Long> getRepo() {
        return repo51;
    }
}
