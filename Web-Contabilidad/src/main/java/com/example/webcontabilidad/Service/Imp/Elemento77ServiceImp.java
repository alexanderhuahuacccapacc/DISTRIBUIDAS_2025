package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento77;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento77Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento77ServiceImp extends CrudGenericoServiceImp<Elemento77,Long> implements Elemento77Service {
    @Override
    protected ICrudGenericoRepository<Elemento77, Long> getRepo() {
        return null;
    }
}
