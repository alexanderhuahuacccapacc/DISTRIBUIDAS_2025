package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento67;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento67Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento67ServiceImp extends CrudGenericoServiceImp<Elemento67,Long> implements Elemento67Service {
    @Override
    protected ICrudGenericoRepository<Elemento67, Long> getRepo() {
        return null;
    }
}
