package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento25;
import com.example.webcontabilidad.Repository.Elemento25Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento25Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento25ServiceImp extends CrudGenericoServiceImp<Elemento25,Long> implements Elemento25Service {
    @Autowired
    private Elemento25Repository repo25;

    @Override
    protected ICrudGenericoRepository<Elemento25, Long> getRepo() {
        return repo25;
    }
}
