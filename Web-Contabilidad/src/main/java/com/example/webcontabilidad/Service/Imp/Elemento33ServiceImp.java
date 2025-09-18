package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Entity.Elemento33;
import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.Elemento33Service;
import org.springframework.stereotype.Service;

@Service
public class Elemento33ServiceImp extends CrudGenericoServiceImp<Elemento33,Long> implements Elemento33Service {
    @Override
    protected ICrudGenericoRepository<Elemento33, Long> getRepo() {
        return null;
    }
}
