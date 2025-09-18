package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento26;
import com.example.webcontabilidad.Repository.Elemento26Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento26Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento26ServiceImp extends CrudGenericoServiceImp<Elemento26,Long> implements Elemento26Service {
    @Autowired
    private Elemento26Repository repo26;

    @Override
    protected ICrudGenericoRepository<Elemento26, Long> getRepo() {
        return repo26;
    }
}
