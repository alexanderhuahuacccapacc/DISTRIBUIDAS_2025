package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento62;
import com.example.webcontabilidad.Repository.Elemento62Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento62Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento62ServiceImp extends CrudGenericoServiceImp<Elemento62,Long> implements Elemento62Service {
    @Autowired
    private Elemento62Repository repo62;

    @Override
    protected ICrudGenericoRepository<Elemento62, Long> getRepo() {
        return repo62;
    }
}
