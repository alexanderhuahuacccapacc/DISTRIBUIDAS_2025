package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento94;
import com.example.webcontabilidad.Repository.Elemento94Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento94Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento94ServiceImp extends CrudGenericoServiceImp<Elemento94,Long> implements Elemento94Service {

    private Elemento94Repository repo94;

    @Override
    protected ICrudGenericoRepository<Elemento94, Long> getRepo() {
        return repo94;
    }
}
