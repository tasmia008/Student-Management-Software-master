public class User {
    
    private String Roll;
    private int serial;
    private String Messege;
    
    public User(int a,String ID, String mes)
    {
        serial=a;
        this.Roll = ID;
        this.Messege = mes;
    }
    
    public int getserial(){
        return serial;
    }
    public String getRoll()
    {
        return Roll;
    }
    
    public String getMessege()
    {
        return Messege;
    }
    
    
}
