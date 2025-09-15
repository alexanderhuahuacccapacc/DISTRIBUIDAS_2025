package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento01;
import com.example.webcontabilidad.Repository.Elemento01Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.ElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento01ServiceImp extends CrudGenericoServiceImp<Elemento01,Long>implements ElementoService {

    @Autowired
    private Elemento01Repository repo;
    @Override
    protected ICrudGenericoRepository<Elemento01, Long> getRepo() {
        return repo;
    }
}
