package Module3.Task3;


public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    SpecialStudent(long secretKey){
        this.secretKey = secretKey;
    }

    SpecialStudent(String collegeName, int rating, long id){super(collegeName, rating,id);}

    SpecialStudent(String firstName, String lastName, int group){super(firstName, lastName, group);}

// getters and setters

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
