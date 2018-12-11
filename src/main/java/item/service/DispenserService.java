package item.service;

import item.domain.Dispenser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import item.repository.DispenserRepository;

@Service
public class DispenserService {

    @Autowired
    DispenserRepository dispenserRepository;

    public Dispenser addDispenser(Dispenser dispenser){
        dispenserRepository.save(dispenser);
        return dispenser;
    }

    public Iterable<Dispenser> getDispanser(){
        return dispenserRepository.findAll();
    }

}
