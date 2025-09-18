package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento14;
import com.example.webcontabilidad.Repository.Elemento14Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento14Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento14ServiceImp extends CrudGenericoServiceImp<Elemento14,Long> implements Elemento14Service {
    @Autowired
    private Elemento14Repository repo14;

    @Override
    protected ICrudGenericoRepository<Elemento14, Long> getRepo() {
        return repo14;
    }
}
