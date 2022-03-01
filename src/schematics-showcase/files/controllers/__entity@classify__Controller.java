

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/<%= decamelize(entity) %>")
public class <%= classify(entity) %>Controller {

    @Autowired
    private <%= classify(entity) %>Service <%= camelize(entity) %>Service;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public <%= classify(entity) %> get<%= classify(entity) %>(@PathVariable("id") Integer id){
        return this.<%= camelize(entity) %>Service.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<<%= classify(entity) %>> getAll<%= classify(entity) %>s(){
        return this.<%= camelize(entity) %>Service.findAll();
    }
}