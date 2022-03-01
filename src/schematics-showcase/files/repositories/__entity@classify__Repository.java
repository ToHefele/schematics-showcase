import org.springframework.data.repository.CrudRepository;

public interface <%= classify(entity) %>Repository extends CrudRepository<<%= classify(entity) %>, Integer> {

}