package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento65;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento65Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento65ServiceImp extends CrudGenericoServiceImp<Elemento65,Long> implements Elemento65Service {
    @Override
    protected ICrudGenericoRepository<Elemento65, Long> getRepo() {
        return null;
    }
}
