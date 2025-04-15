package a3.expections;

public class DomainExceptions extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DomainExceptions(String message) {
        super(message);
    }
}
