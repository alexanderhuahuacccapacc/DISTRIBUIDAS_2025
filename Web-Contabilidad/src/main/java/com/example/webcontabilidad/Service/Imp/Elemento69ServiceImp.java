package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento69;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento69Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento69ServiceImp extends CrudGenericoServiceImp<Elemento69,Long> implements Elemento69Service {
    @Override
    protected ICrudGenericoRepository<Elemento69, Long> getRepo() {
        return null;
    }
}
