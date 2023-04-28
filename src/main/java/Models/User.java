package Models;

public class User {
    private int Id;
    private String Username;
    private String Email;
    private String Phone;

    @Override
    public String toString() {
        return this.Id + " " +
                this.Username + " " +
                this.Email + " " +
                this.Phone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
