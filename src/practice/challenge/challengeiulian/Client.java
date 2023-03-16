package practice.challenge.challengeiulian;

public class Client extends User{
    private String getClientNickname;
    private String clientNickname;

    public void setClientNickname(String clientNickname) {
        this.clientNickname = clientNickname;
    }
    public String getClientNickname(){
        return this.clientNickname;
    }

    public String getGetClientNickname() {
        return getClientNickname;
    }

    public void setGetClientNickname(String getClientNickname) {
        this.getClientNickname = getClientNickname;
    }
}
