public class Cliente {
    private String name;
    private String email;
    private boolean isLoyal;

    public Cliente(String name, String email) {
        this.name = name;
        this.email = email;
        this.isLoyal = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLoyal() {
        return isLoyal;
    }

    public void setLoyal(boolean isLoyal) {
        this.isLoyal = isLoyal;
    }
}
