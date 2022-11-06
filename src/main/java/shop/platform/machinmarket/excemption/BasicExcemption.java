package shop.platform.machinmarket.excemption;

public class BasicExcemption {
    private  int status;
    private String message;


    public BasicExcemption(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BasicExcemption() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
