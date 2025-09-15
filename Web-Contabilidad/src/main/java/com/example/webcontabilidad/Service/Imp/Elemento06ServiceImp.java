package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento06;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento06Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento06ServiceImp extends CrudGenericoServiceImp<Elemento06,Long> implements Elemento06Service {
    @Override
    protected ICrudGenericoRepository<Elemento06, Long> getRepo() {
        return null;
    }
}
