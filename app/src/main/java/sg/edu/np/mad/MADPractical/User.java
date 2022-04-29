package sg.edu.np.mad.MADPractical;

public class User {
    String Name;
    String Description;
    int Id;
    boolean Followed;

    private User(){
        this.Name = "Griffin";
        this.Description = "Year 2";
        this.Id = 0;
        this.Followed = true;
    }

    private User(String n, String des, int ID, boolean f){
        Name = n;
        Description = des;
        Id = ID;
        Followed = f;
    }
}
