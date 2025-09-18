package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento60;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento60Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento60ServiceImp extends CrudGenericoServiceImp<Elemento60,Long> implements Elemento60Service {
    @Override
    protected ICrudGenericoRepository<Elemento60, Long> getRepo() {
        return null;
    }
}
