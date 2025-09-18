package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento09;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento09Service;
import org.springframework.stereotype.Service;
import com.example.webcontabilidad.Repository.Elemento09Repository;

@Service
public class Elemento09ServiceImp extends CrudGenericoServiceImp<Elemento09,Long> implements Elemento09Service {
    @Override
    protected ICrudGenericoRepository<Elemento09, Long> getRepo() {
        return null;
    }
}
