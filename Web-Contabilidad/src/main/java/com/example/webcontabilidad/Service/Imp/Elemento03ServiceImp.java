package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento03;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento03Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento03ServiceImp extends CrudGenericoServiceImp<Elemento03,Long> implements Elemento03Service {
    @Override
    protected ICrudGenericoRepository<Elemento03, Long> getRepo() {
        return null;
    }
}
