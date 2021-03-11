package services;

import entity.Advert;
import entity.Firm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AdvertRepository;
import repositories.FirmRepository;

import java.util.List;

@Service
public class AdvertService {
    @Autowired
    private AdvertRepository advertRepository;
    @Autowired
    private FirmRepository firmRepository;

    public List<Advert> listAll() {
        return advertRepository.findAll();
    }
    public void delete(Long id) {
        advertRepository.deleteById(id);
    }
    public Advert get(Long id) {
        return advertRepository.findById(id).get();
    }
    public void save(Firm firm, Advert advert){
//        advert.Firm(firmRepository.getOne(firm.getId()));
        advertRepository.save(advert);
    }


}
