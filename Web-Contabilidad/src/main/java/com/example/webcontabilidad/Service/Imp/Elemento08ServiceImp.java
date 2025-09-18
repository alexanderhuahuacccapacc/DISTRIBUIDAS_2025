package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento08;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Repository.Elemento08Repository;
import com.example.webcontabilidad.Service.Elemento08Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento08ServiceImp extends CrudGenericoServiceImp<Elemento08,Long> implements Elemento08Service {
    @Override
    protected ICrudGenericoRepository<Elemento08, Long> getRepo() {
        return null;
    }
}
