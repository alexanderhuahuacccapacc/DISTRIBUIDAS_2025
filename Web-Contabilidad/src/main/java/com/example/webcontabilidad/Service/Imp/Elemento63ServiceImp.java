package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento63;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento63Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento63ServiceImp extends CrudGenericoServiceImp<Elemento63,Long> implements Elemento63Service {
    @Override
    protected ICrudGenericoRepository<Elemento63, Long> getRepo() {
        return null;
    }
}
