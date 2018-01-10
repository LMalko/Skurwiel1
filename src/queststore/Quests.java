import java.util.ArrayList;


public class Quests{
    private String name;
    private int id;
    private int award;
    private static ArrayList achieversCollection;

    public Quests(int id, String name, int award){
        this.name = name;
        this.id = id;
        this.award = award;
    }

    public void setQuestName(String name){
        this.name = name;
    }

    public String getQuestName(){
        return this.name;
    }

    public int getQuestId(){
        return this.id;
    }

    public void setQuestId(int id){
        this.id = id;
    }

    public int getQuestAward(){
        return this.award;
    }

    public void setQuestAward(int award){
        this.award = award;
    }

    public ArrayList<Quests> getQuests(){
        return achieversCollection;
    }

    public void addQuest(quest){
        achieversCollection.add(quest);
    }
}