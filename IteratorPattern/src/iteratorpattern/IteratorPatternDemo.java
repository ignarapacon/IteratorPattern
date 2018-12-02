
package iteratorpattern;

public class IteratorPatternDemo {
	
   public static void main(String[] args) {
      DrugRepository namesRepository = new DrugRepository();
      
      System.out.println("Top 10 List of Generic Antibiotics");
      
      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String medicine = (String)iter.next();
         System.out.println("Drug Name : " + medicine);
      } 	
   }
}
