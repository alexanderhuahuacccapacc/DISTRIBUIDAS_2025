package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento25;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento25Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento25ServiceImp extends CrudGenericoServiceImp<Elemento25,Long> implements Elemento25Service {
    @Override
    protected ICrudGenericoRepository<Elemento25, Long> getRepo() {
        return null;
    }
}
