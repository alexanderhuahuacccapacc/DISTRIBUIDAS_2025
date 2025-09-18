package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento95;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento95Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento95ServiceImp extends CrudGenericoServiceImp<Elemento95,Long> implements Elemento95Service {
    @Override
    protected ICrudGenericoRepository<Elemento95, Long> getRepo() {
        return null;
    }
}
