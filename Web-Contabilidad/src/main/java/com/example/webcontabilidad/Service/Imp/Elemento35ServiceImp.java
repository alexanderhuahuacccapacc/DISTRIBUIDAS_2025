package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento35;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento35Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento35ServiceImp extends CrudGenericoServiceImp<Elemento35,Long> implements Elemento35Service {
    @Override
    protected ICrudGenericoRepository<Elemento35, Long> getRepo() {
        return null;
    }
}
