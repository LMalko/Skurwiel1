public class Store{

    private ArtifactsDao artifactsDao = new ArtifactsDao();
    private ItemCollection<Artifact> artifactsCollection;
    private CollectionIterator<Artifact> artifactIterator = artifactsCollection.getIterator();

    public Store(){
        this.artifactsCollection = artifactsDao.getArtifacts();

    }

    public ItemCollection<Artifact> getArtifactsCollection(){
        return this.artifactsCollection;
    }

    public int getTotalPay(int artifactID){


        while(artifactIterator.hasNext()){
            if(artifactIterator.next().getArtifactId() == artifactID){
                return artifactIterator.next().getArtifactPrice();
            }
        }
        return 0;
    }

}
