public class Student extends User{

    private int wallet;
    private int experience;
    private Group group;
    private ItemCollection<Integer> myArtifacts;

    public Student(String name, String surname, String password){
        super(name, surname, password, "student");
        // this.wallet = 1500;
        // this.experience = 0;
        // this.group = null;
    }

    public Student(int id, String name, String surname, String password, int groupId) {
        super(id,name,surname,password,"student", groupId);
    }

    public Integer getStudentWallet(){
        return wallet;
    }

    public Integer getStudentExperiance(){
        return experience;
    }

    public void setStudentGroup(Group group){
        this.groupId = group.getGroupId();
        this.groupName = group.getGroupName();
    }

    public String getStudentGroupName(){
        return this.group.getGroupName();

    }

    public void reduceWallet(int amount){
        this.wallet = this.wallet - amount;
    }
}
