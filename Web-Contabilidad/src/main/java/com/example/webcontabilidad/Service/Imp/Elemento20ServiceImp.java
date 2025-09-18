package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento20;
import com.example.webcontabilidad.Repository.Elemento20Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento20Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento20ServiceImp extends CrudGenericoServiceImp<Elemento20,Long> implements Elemento20Service {
    @Autowired
    private Elemento20Repository repo20;

    @Override
    protected ICrudGenericoRepository<Elemento20, Long> getRepo() {
        return repo20;
    }
}
