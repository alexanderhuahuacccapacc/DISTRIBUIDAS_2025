package com.example.repuestos.Service.Imp;

import com.example.repuestos.Entity.Repuesto;
import com.example.repuestos.Repository.RepuestoRepository;
import com.example.repuestos.Service.RepuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepuestoServieImp implements RepuestoService {

    @Autowired
    private RepuestoRepository repuestoRepository;

    @Override
    public List<Repuesto> listar() {
        return repuestoRepository.findAll();
    }

    @Override
    public Optional<Repuesto> buscarPorId(Integer id) {
        return repuestoRepository.findById(id);
    }

    @Override
    public Repuesto guardar(Repuesto repuesto) {
        return repuestoRepository.save(repuesto) ;
    }

    @Override
    public Repuesto actualizar(Repuesto repuesto) {
        return repuestoRepository.save(repuesto) ;
    }

    @Override
    public void borrarPorId(Integer id) {
        repuestoRepository.deleteById(id);
    }
}
