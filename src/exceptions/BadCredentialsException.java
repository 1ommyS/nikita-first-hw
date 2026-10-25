package exceptions;

public class BadCredentialsException extends ApiException {
    public BadCredentialsException() {
        super("/api/v1/login");
    }
}
