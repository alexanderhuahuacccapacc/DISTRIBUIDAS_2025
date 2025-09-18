package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento33;
import com.example.webcontabilidad.Repository.Elemento33Repository;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento33Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elemento33ServiceImp extends CrudGenericoServiceImp<Elemento33,Long> implements Elemento33Service {
    @Autowired
    private Elemento33Repository repo33;

    @Override
    protected ICrudGenericoRepository<Elemento33, Long> getRepo() {
        return repo33;
    }
}
