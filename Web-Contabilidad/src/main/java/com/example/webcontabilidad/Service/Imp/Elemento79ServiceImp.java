package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento79;
import com.example.webcontabilidad.Repository.Elemento79Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento79Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento79ServiceImp extends CrudGenericoServiceImp<Elemento79,Long> implements Elemento79Service {
    @Autowired
    private Elemento79Repository repo79;

    @Override
    protected ICrudGenericoRepository<Elemento79, Long> getRepo() {
        return repo79;
    }
}
