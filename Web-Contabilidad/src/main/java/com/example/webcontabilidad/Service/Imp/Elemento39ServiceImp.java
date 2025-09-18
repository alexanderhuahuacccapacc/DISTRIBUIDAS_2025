package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento39;
import com.example.webcontabilidad.Repository.Elemento39Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento39Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento39ServiceImp extends CrudGenericoServiceImp<Elemento39,Long> implements Elemento39Service {
    @Autowired
    private Elemento39Repository repo39;

    @Override
    protected ICrudGenericoRepository<Elemento39, Long> getRepo() {
        return repo39;
    }
}
