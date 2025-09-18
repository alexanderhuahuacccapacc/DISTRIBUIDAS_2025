package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento41;
import com.example.webcontabilidad.Repository.Elemento41Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento41Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento41ServiceImp extends CrudGenericoServiceImp<Elemento41,Long> implements Elemento41Service {
    @Autowired
    private Elemento41Repository repo41;

    @Override
    protected ICrudGenericoRepository<Elemento41, Long> getRepo() {
        return repo41;
    }
}
