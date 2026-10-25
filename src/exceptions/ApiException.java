package exceptions;

public class ApiException extends RuntimeException{
    private final String apiMethod;

    public ApiException(String apiMethod) {
        this.apiMethod = apiMethod;
    }

    public String getApiMethod() {
        return apiMethod;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "apiMethod='" + apiMethod + '\'' +
                '}';
    }
}
