
package iteratorpattern;

public class DrugRepository implements Container {
   public String drug[] = {"amoxicillin", "doxycycline", "cephalexin", "ciprofloxacin", 
       "clindamycin", "metronidazole", "azithromycin", "sulfamethoxazole/trimethoprim", 
       "amoxicillin/clavulanate", "levofloxacin",};

   @Override
   public Iterator getIterator() {
      return new DrugIterator();
   }
   private class DrugIterator implements Iterator {
      int index;
      @Override
      public boolean hasNext() {
         if(index < drug.length){
            return true;
         }
         return false;
      }
      @Override
      public Object next() {
      
         if(this.hasNext()){
            return drug[index++];
         }
         return null;
      }		
   }
}
