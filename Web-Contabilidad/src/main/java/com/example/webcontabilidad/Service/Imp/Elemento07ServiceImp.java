package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento07;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento07Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento07ServiceImp extends CrudGenericoServiceImp<Elemento07,Long> implements Elemento07Service {
    @Override
    protected ICrudGenericoRepository<Elemento07, Long> getRepo() {
        return null;
    }
}
