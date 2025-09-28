
public class user {
    private String username;
        private String email;
        public user(String username,String email)
        {
            this.username=username;
            this.email=email;
        }
        public String get username()
        {
            return username;
    }
    public void set username(String username)
    {
        this.username=username;
    }
    public String get email()
    {
        return email;
    }
    public void set email(String email)
    {
        this.email=email;
    }
    @Override
    public String to String()
    {
        return "user{"+username="+username'\'+"email="+email+\+'}';
    }

    public static void main(String[] args)
    {
    arrylist<usre>user.new arrylist<>();
    user user1=new user("john doe",john@example.com);
    user user2=new user("jane doe",jane@examle.com);
    user user3=new user("alice",alice@examle.com);
    user.add(user1);
    user.add(user2);
    user.add(user3);
    system.out.println("user in the collection:");
    for(user user:user)
    {
    system.out.println(user);
    }
    }
    }