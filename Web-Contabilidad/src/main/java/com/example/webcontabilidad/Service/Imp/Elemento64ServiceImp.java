package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento64;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento64Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento64ServiceImp extends CrudGenericoServiceImp<Elemento64,Long> implements Elemento64Service {
    @Override
    protected ICrudGenericoRepository<Elemento64, Long> getRepo() {
        return null;
    }
}
