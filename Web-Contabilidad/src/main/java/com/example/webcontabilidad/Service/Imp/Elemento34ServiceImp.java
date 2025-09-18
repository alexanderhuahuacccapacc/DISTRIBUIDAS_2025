package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento34;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento34Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento34ServiceImp extends CrudGenericoServiceImp<Elemento34,Long> implements Elemento34Service {
    @Override
    protected ICrudGenericoRepository<Elemento34, Long> getRepo() {
        return null;
    }
}
