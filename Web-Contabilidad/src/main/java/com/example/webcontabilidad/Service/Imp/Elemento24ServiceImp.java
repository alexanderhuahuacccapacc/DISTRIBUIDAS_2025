package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento24;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento24Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento24ServiceImp extends CrudGenericoServiceImp<Elemento24,Long> implements Elemento24Service {
    @Override
    protected ICrudGenericoRepository<Elemento24, Long> getRepo() {
        return null;
    }
}
