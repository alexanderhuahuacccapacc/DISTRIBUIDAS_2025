package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento40;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento40Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento40ServiceImp extends CrudGenericoServiceImp<Elemento40,Long> implements Elemento40Service {
    @Override
    protected ICrudGenericoRepository<Elemento40, Long> getRepo() {
        return null;
    }
}
