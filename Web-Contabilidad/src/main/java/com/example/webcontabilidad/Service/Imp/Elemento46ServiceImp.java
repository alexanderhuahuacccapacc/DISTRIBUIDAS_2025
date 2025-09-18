package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento46;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento46Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento46ServiceImp extends CrudGenericoServiceImp<Elemento46,Long> implements Elemento46Service {
    @Override
    protected ICrudGenericoRepository<Elemento46, Long> getRepo() {
        return null;
    }
}
