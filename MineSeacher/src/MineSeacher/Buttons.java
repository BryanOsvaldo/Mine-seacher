
// Author Bryan Pourie

package MineSeacher;

import javax.swing.JButton;

        //That class is for make a buttons
    public class Buttons extends JButton {
        
        private boolean mined;
        
      public Buttons(){
        super();  
       }
      
        //Setter and Getter
      public void setStay(boolean Stay){
          mined = Stay;
      }
      
      public boolean getStay(){
          return mined;
      }  
}
