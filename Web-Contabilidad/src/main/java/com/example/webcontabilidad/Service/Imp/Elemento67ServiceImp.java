package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento67;
import com.example.webcontabilidad.Repository.Elemento67Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento67Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento67ServiceImp extends CrudGenericoServiceImp<Elemento67,Long> implements Elemento67Service {
    @Autowired
    private Elemento67Repository repo67;

    @Override
    protected ICrudGenericoRepository<Elemento67, Long> getRepo() {
        return repo67;
    }
}
