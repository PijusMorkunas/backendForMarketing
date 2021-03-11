package services;

import entity.Firm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.FirmRepository;
import services.mapper.EntityToDtoMapper;

import java.util.List;

@Service
public class FirmService {

    private FirmRepository firmRepository;
    private EntityToDtoMapper entityToDtoMapper;
    public List<Firm> listAll() {
        return firmRepository.findAll();
    }
    public void delete(Long id) {
        firmRepository.deleteById(id);
    }
    public Firm get(Long id) {
        return firmRepository.findById(id).get();
    }
    public void save(Firm firm){
        firmRepository.save(firm);
    }
}
