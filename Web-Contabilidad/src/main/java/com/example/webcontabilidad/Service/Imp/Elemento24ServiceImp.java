package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento24;
import com.example.webcontabilidad.Repository.Elemento24Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento24Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento24ServiceImp extends CrudGenericoServiceImp<Elemento24,Long> implements Elemento24Service {
    @Autowired
    private Elemento24Repository repo24;

    @Override
    protected ICrudGenericoRepository<Elemento24, Long> getRepo() {
        return repo24;
    }
}
