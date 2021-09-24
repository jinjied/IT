public class Contact {
    private Contact contact;
    private String name = "NULL";
    private String phone = "NULL";
    private String email = "NULL";
    private String teamName = "NULL";
    private String remark = "NULL";
    private Boolean marked = false;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getRemark() {
        return remark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String phone, String email, String teamName, String remark) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.teamName = teamName;
        this.remark = remark;
    }

    public Contact mark(){
        this.marked = true;
        return this;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", teamName='" + teamName + '\'' +
                ", remark='" + remark + '\'' +
                ", marked='" + marked + '\'' +
                '}';
    }


}


