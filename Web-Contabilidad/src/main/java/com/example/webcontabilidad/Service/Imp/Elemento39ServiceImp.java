package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento39;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento39Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento39ServiceImp extends CrudGenericoServiceImp<Elemento39,Long> implements Elemento39Service {
    @Override
    protected ICrudGenericoRepository<Elemento39, Long> getRepo() {
        return null;
    }
}
