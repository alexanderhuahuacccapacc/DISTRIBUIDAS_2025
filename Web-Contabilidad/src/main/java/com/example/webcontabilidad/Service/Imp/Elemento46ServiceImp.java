package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento46;
import com.example.webcontabilidad.Repository.Elemento46Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento46Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento46ServiceImp extends CrudGenericoServiceImp<Elemento46,Long> implements Elemento46Service {
    @Autowired
    private Elemento46Repository repo46;

    @Override
    protected ICrudGenericoRepository<Elemento46, Long> getRepo() {
        return repo46;
    }
}
