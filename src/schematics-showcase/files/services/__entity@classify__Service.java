
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Transactional
@Component
public class <%= classify(entity) %>Service {

    @Autowired
    private <%= classify(entity) %>Repository <%= camelize(entity) %>Repository;

    public <%= classify(entity) %> findOne(Integer id){
        return this.<%= camelize(entity) %>Repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<<%= classify(entity) %>> findAll(){
        return this.<%= camelize(entity) %>Repository.findAll();
    }

}