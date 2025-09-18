package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento63;
import com.example.webcontabilidad.Repository.Elemento63Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento63Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento63ServiceImp extends CrudGenericoServiceImp<Elemento63,Long> implements Elemento63Service {
    @Autowired
    private Elemento63Repository repo63;

    @Override
    protected ICrudGenericoRepository<Elemento63, Long> getRepo() {
        return repo63;
    }
}
