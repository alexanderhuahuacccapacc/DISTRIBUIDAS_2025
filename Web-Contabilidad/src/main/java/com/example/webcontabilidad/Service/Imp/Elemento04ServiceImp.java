package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento04;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento04Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento04ServiceImp extends CrudGenericoServiceImp<Elemento04,Long> implements Elemento04Service {
    @Override
    protected ICrudGenericoRepository<Elemento04, Long> getRepo() {
        return null;
    }
}
