
// Author Bryan Pourie

package MineSeacher;

import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


    //Decide if the player win or lose, and restart the game if some of these happend
public class Game extends javax.swing.JFrame implements ActionListener{
    
    int press = 0;
    int countMine = 0;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
            press++;
           Buttons temp = (Buttons) e.getSource();
            if(temp.getStay()){
                temp.setBackground(Color.red);
                JOptionPane.showMessageDialog(null,"You lose :( ");
                Grahp(Integer.parseInt(txtX.getText()),Integer.parseInt(txtY.getText()));
                press = 0;
                countMine = 0;
            }else{
                temp.setBackground(Color.blue);
                if(press == (Integer.parseInt(txtX.getText()) * Integer.parseInt(txtY.getText())) - countMine){
                JOptionPane.showMessageDialog(null," !You win¡"); 
                Grahp(Integer.parseInt(txtX.getText()),Integer.parseInt(txtY.getText()));
                press = 0;
                countMine = 0;
           }
                Score.setText(""+(press));
                
        }     
    }
    
    public Game() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Medium = new javax.swing.JRadioButton();
        Hard = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        txtY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Easy = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Score = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Medium.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(Medium);
        Medium.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        Medium.setForeground(new java.awt.Color(255, 153, 0));
        Medium.setText("Medium");

        Hard.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(Hard);
        Hard.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        Hard.setForeground(new java.awt.Color(255, 51, 51));
        Hard.setText("Hard");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jButton1.setText("Start >");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jLabel4.setText("Level");

        txtX.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N

        txtY.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jLabel1.setText("Rows");

        jLabel2.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jLabel2.setText("Columns");

        jLabel3.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel3.setText("Mine seacher");

        Easy.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(Easy);
        Easy.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        Easy.setForeground(new java.awt.Color(51, 51, 255));
        Easy.setSelected(true);
        Easy.setText("Easy");

        jLabel5.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jLabel5.setText("Score");

        Score.setEditable(false);
        Score.setBackground(new java.awt.Color(204, 204, 204));
        Score.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        Score.setForeground(new java.awt.Color(51, 204, 0));
        Score.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Score.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(Easy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Medium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hard))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Easy)
                    .addComponent(Medium)
                    .addComponent(Hard)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txtX.getText().equals("") || txtY.getText().equals("")){
            txtX.setText("0");
            txtY.setText("0");            
        }
        
        if(!(txtX.getText().equals("0")) && !((txtY.getText()).equals("0"))){
            Grahp(Integer.parseInt(txtX.getText()),Integer.parseInt(txtY.getText()));
        }else{
            JOptionPane.showMessageDialog(null,"Set the sizes for Rows and Columns");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
        //graphed the game field
    public void Grahp(int x, int y){ 
        
        panel.removeAll();
        Random rand = new Random();
        int level = 95;
        
        //Choose level
            if(Medium.isSelected()){
                level = 80;
            }else if(Hard.isSelected()){
                level = 70;
            }else{
                level = 95;
            }
        
        
        int tx = x;
        int ty = y;        
        
        int W = panel.getWidth() / tx;
        int H = panel.getHeight() / ty;
        
        for (int i = 0; i < ty; i++) {
            for (int j = 0; j < tx; j++) {
                        
                Buttons btn = new Buttons();
                btn.addActionListener(this);
                
                if(rand.nextDouble() * 100 >= level){
                 btn.setStay(true);
                 countMine = countMine+ 1;
        }else{
            btn.setStay(false);
        }            
                 btn.setSize(W , H  ); //Width, Height           
                 btn.setLocation(j * W, H*i); // X , Y  
                 btn.setVisible(true);
                 panel.add(btn);                
            }        
        }
       panel.repaint();
       press = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Easy;
    private javax.swing.JRadioButton Hard;
    private javax.swing.JRadioButton Medium;
    private javax.swing.JTextField Score;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

    
}
