package array;

public class LengthEx {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  
  
  
    
  public String[] getTopics(){
    return topics;
  }
  
  public int getNumTopics(){
    int a = topics.length;
    return a;
  }
  
  public static void main(String[] args){
    LengthEx sampleFeed = new LengthEx();
    
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
   
  }
}
