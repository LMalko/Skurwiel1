class Group{
    private String groupName;
    private static ArrayList<Group> allGroupsCollection;

    public Group(String name){
        this.groupName = name;
    }

    public String getGroupName(){
        return this.groupName;
    }

    public void setGroupName(String newName){
        this.groupName = newName;
    }

    public void addGroupToGroupCollection(Group group){
        allGroupsCollection.add(group);
    }

    public static ArrayList<Group> getAllGroups(){
        return allGroupsCollection;
    }
}
