package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento10;
import com.example.webcontabilidad.Repository.Elemento10Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento10ServiceImp extends CrudGenericoServiceImp<Elemento10,Long> implements Elemento10Service {
    @Autowired
    private Elemento10Repository repo10;

    @Override
    protected ICrudGenericoRepository<Elemento10, Long> getRepo() {
        return repo10;
    }
}
