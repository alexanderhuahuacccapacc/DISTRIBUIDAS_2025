package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento12;
import com.example.webcontabilidad.Repository.Elemento12Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento12Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento12ServiceImp extends CrudGenericoServiceImp<Elemento12,Long> implements Elemento12Service {
    @Autowired
    private Elemento12Repository repo12;
    @Override
    protected ICrudGenericoRepository<Elemento12, Long> getRepo() {
        return repo12;
    }
}
