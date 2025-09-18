package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento12;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento12Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento12ServiceImp extends CrudGenericoServiceImp<Elemento12,Long> implements Elemento12Service {
    @Override
    protected ICrudGenericoRepository<Elemento12, Long> getRepo() {
        return null;
    }
}
