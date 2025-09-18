package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento95;
import com.example.webcontabilidad.Repository.Elemento95Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento95Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento95ServiceImp extends CrudGenericoServiceImp<Elemento95,Long> implements Elemento95Service {

    private Elemento95Repository repo95;

    @Override
    protected ICrudGenericoRepository<Elemento95, Long> getRepo() {
        return repo95;
    }
}
