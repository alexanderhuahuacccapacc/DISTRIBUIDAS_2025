package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento51;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento51Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento51ServiceImp extends CrudGenericoServiceImp<Elemento51,Long> implements Elemento51Service {
    @Override
    protected ICrudGenericoRepository<Elemento51, Long> getRepo() {
        return null;
    }
}
