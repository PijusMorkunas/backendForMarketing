package exceptions;
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Long id){
        super("There is no entity with provided id");
    }
}