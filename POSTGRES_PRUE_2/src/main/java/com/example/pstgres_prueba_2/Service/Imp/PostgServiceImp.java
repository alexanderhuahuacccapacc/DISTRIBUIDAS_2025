package com.example.pstgres_prueba_2.Service.Imp;

import com.example.pstgres_prueba_2.Entity.Postg;
import com.example.pstgres_prueba_2.Repository.PostgRepository;
import com.example.pstgres_prueba_2.Service.PostgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostgServiceImp implements PostgService {

    @Autowired
    private PostgRepository postgRepository;

    @Override
    public List<Postg> listar() {
        return postgRepository.findAll() ;
    }

    @Override
    public Optional<Postg> buscarPorId(Integer id) {
        return postgRepository.findById(id);
    }

    @Override
    public Postg guardar(Postg postg) {
        return postgRepository.save(postg) ;
    }

    @Override
    public Postg actualizar(Postg postg) {
        return postgRepository.save(postg) ;
    }

    @Override
    public void borrarPorId(Integer id) {
        postgRepository.deleteById(id);
    }
}
