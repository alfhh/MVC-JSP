package business;

public class User
{
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String career;
    
    public User()
    {
        firstName = "";
        lastName = "";
        emailAddress = "";
        career = "";
    }
    
    public User(String first, String last, String email, String carrera)
    {
        firstName = first;
        lastName = last;
        emailAddress = email;
        career = carrera;
    }
    
    public void setFirstName(String f)
    {
        firstName = f;
    }

    public String getFirstName()
    { 
        return firstName; 
    }
    
    public void setLastName(String l)
    {
        lastName = l;
    }

    public String getLastName()
    { 
        return lastName; 
    }
    
    public void setEmailAddress(String e)
    {
        emailAddress = e;
    }

    public String getEmailAddress()
    { 
        return emailAddress; 
    }

    public String getCareer()
    {
        return career;
    }

    public void setCareer(String c)
    {
        career = c;
    }
}
