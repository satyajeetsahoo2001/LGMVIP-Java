
import javax.swing.JOptionPane;


/**
 *
 * @author SATYAJEET SAHOO
 */
public class p2 extends javax.swing.JFrame {

    
    /**
     * Creates new form p2
     */
    public p2() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusableWindowState(false);

        b4.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // 
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); //
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // 
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // 
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // 
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // 
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); //
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // 
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // 
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        btn.setBackground(new java.awt.Color(204, 204, 255));
        btn.setFont(new java.awt.Font("Snap ITC", 0, 18)); // 
        btn.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btn.setText("Playagain");
        btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }

    //GEN-LAST:event_b3ActionPerformed
//class block it is so what ever value will nbe created it will be global variable
    int n=2;
    int [] once={0,0,0,0,0,0,0,0,0};
    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        
        if(once[0] == 0){
        if(n%2==0){
            b1.setText("X");
            n++;
            once[0]=1;
        }
        else{
            b1.setText("O");
            n++;
            once[0]=1;
            
        }
            
        }
                if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         if(once[1] == 0){
        if(n%2==0){
            b2.setText("X");
            n++;
            once[1]=1;
        }
        else{
            b2.setText("O");
            n++;
            once[1]=1;
        }
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         if(once[2] == 0){
        if(n%2==0){
            b3.setText("X");
            n++;
            once[2]=1;
        }
        else{
            b3.setText("O");
            n++;
            once[2]=1;
        }
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         if(once[3] == 0){
        if(n%2==0){
            b4.setText("X");
            n++;
            once[3]=1;
        }
        else{
            b4.setText("O");
            n++;
            once[3]=1;
        }
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         if(once[4] == 0){
        if(n%2==0){
            b5.setText("X");
            n++;
            once[4]=1;
        }
        else{
            b5.setText("O");
            n++;
            once[4]=1;
        }
        
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         if(once[5] == 0){
        if(n%2==0){
            b6.setText("X");
            n++;
            once[5]=1;
        }
        else{
            b6.setText("O");
            n++;
            once[5]=1;
        }
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         if(once[6] == 0){
        if(n%2==0){
            b7.setText("X");
            n++;
            once[6]=1;
        }
        else{
            b7.setText("O");
            n++;
            once[6]=1;
        }
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         if(once[7] == 0){
        if(n%2==0){
            b8.setText("X");
            n++;
            once[7]=1;
        }
        else{
            b8.setText("O");
            n++;
            once[7]=1;
        }
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         if(once[8] == 0){
        if(n%2==0){
            b9.setText("X");
            n++;
            once[8]=1;
        }
        else{
            b9.setText("O");
            n++;
            once[8]=1;
        }
    }
         if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"||b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"||b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"||b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"||b9.getText().toString()=="X"&&b6.getText().toString()=="X"&&b3.getText().toString()=="X"||b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"||b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 1 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                   if(b4.getText().toString()=="O"&&b5.getText().toString()=="O"&&b6.getText().toString()=="O"||b2.getText().toString()=="O"&&b5.getText().toString()=="O"&&b8.getText().toString()=="O"||b1.getText().toString()=="O"&&b2.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b4.getText().toString()=="O"&&b7.getText().toString()=="O"||b7.getText().toString()=="O"&&b8.getText().toString()=="O"&&b9.getText().toString()=="O"||b9.getText().toString()=="O"&&b6.getText().toString()=="O"&&b3.getText().toString()=="O"||b1.getText().toString()=="O"&&b5.getText().toString()=="O"&&b9.getText().toString()=="O"||b3.getText().toString()=="O"&&b5.getText().toString()=="O"&&b7.getText().toString()=="O"){

        JOptionPane.showMessageDialog(rootPane, "congratulation player 2 you won the match      do you want to play again ? if yes click on play again button thank you ");
    }
                     if(once[0]==1&&once[1]==1&&once[2]==1&&once[3]==1&&once[4]==1&&once[5]==1&&once[6]==1&&once[7]==1&&once[8]==1){
                               JOptionPane.showMessageDialog(rootPane, " draw!!!!! uff      do you want to play again ? if yes click on play again button thank you ");

                   }
    }//GEN-LAST:event_b9ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        n=2;
        for(int i = 0;i<9;i++){
            once[i]=0;
          b1.setText("");
           b2.setText("");
            b3.setText(""); 
             b4.setText("");
              b5.setText("");
               b6.setText("");
                b7.setText("");
                 b8.setText("");
                  b9.setText("");
        }
    }//GEN-LAST:event_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton btn;
    // End of variables declaration//GEN-END:variables
}
