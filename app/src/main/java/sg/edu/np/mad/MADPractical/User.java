package sg.edu.np.mad.MADPractical;

public class User {
    String Name;
    String Description;
    int Id;
    boolean Followed;

    public User(){

    }

    public User(String n, String des, int ID, boolean f){
        Name = n;
        Description = des;
        Id = ID;
        Followed = f;
    }
}
