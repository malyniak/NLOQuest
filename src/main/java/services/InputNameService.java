package services;

public class InputNameService extends Service{
    private static final InputNameService service=new InputNameService();
    private InputNameService() {}
    public static InputNameService getService() {
        return service;
    }
}
