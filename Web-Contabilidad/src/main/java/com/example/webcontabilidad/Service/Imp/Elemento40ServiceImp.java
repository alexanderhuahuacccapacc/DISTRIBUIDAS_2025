package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento40;
import com.example.webcontabilidad.Repository.Elemento40Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento40Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento40ServiceImp extends CrudGenericoServiceImp<Elemento40,Long> implements Elemento40Service {
    @Autowired
    private Elemento40Repository repo40;

    @Override
    protected ICrudGenericoRepository<Elemento40, Long> getRepo() {
        return repo40;
    }
}
