/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.Sel_Treinador.control;
import Pokemons.*;
import Treinadores.*;
import java.awt.Canvas;
import java.awt.Component;
import pokedexf.Pokemon;

/**
 *
 * @author Renan
 */
public class campoDeBatalha extends javax.swing.JFrame {
    
    static int dano_meu;
    static int dano_ini;
    
    /**
     * Creates new form campoDeBatalha
     */
    public campoDeBatalha() {
        initComponents();
       
        
       /* Canvas ImagemPokeball = new Canvas();
        this.Quadro1.add(ImagemPokeball);*/
       // Implementar Uma Imagem para o fundo do campo de batalha, eu pensei em uma das Pokebolas que esá na pasta Sprite
    }
    
    public String ganharOuPerder(Treinador t, Pokemon p1,Pokemon p2,Pokemon p3){
        if (p1.getHp() <= 0 && p2.getHp() <= 0 && p3.getHp() <= 0)
        {
            return "<br> Treinador: " + t.getNome()+ " Perdeu!";
        } else
            return "<br> Treinador: " + t.getNome()+ " Ganhou!";
    }
    
    public void InimigoPublico(){
        
        Treinador adversario = new Treinador("Luiz", 18, "M", 0, 3, 0, 0);
        Squirtle sq = new Squirtle();
        Vulpix vul = new Vulpix();
        Zubat zub = new Zubat();
         if (sq.getHp() <= 0)
        {
            jTextPane1.setContentType("text/html");
            jTextPane1.setText("<html>" + sq.apresentarPokemon() + "</html>");
            sq.apresentarPokemon();
            while(sq.getHp() <= 0){
                dano_ini = sq.atacar();
                sq.sofredano(dano_meu);
            }
        }
        else if (vul.getHp() <= 0)
        {
            jTextPane1.setContentType("text/html");
            jTextPane1.setText("<html>" + vul.apresentarPokemon() + "</html>");
            vul.apresentarPokemon();
            while(vul.getHp() <= 0){
                dano_ini = vul.atacar();
                vul.sofredano(dano_meu);
            }
        }
        else if (zub.getHp() <= 0)
        {
            jTextPane1.setContentType("text/html");
            jTextPane1.setText("<html>" + zub.apresentarPokemon() + "</html>"); 
            zub.apresentarPokemon();
            while(zub.getHp() <= 0){
                dano_ini = zub.atacar();
                zub.sofredano(dano_meu);
            }
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        Quadro1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        fechar = new javax.swing.JButton();
        atacar = new javax.swing.JButton();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        label1.setText("Pokemos");

        javax.swing.GroupLayout Quadro1Layout = new javax.swing.GroupLayout(Quadro1);
        Quadro1.setLayout(Quadro1Layout);
        Quadro1Layout.setHorizontalGroup(
            Quadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Quadro1Layout.setVerticalGroup(
            Quadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jTextPane1.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Quadro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quadro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Blastoise.png"))); // NOI18N
        fechar.setText("Encerrar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        atacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/586-spring.png"))); // NOI18N
        atacar.setText("Ataque");
        atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(atacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(fechar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechar)
                    .addComponent(atacar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharActionPerformed

    private void atacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacarActionPerformed

        switch (control)
        {
            case 0:
                Julia j = new Julia();
                j.apresentaTreinador();
                
                j.setpokemons();
                
                Bulbassauro b = new Bulbassauro();
                Caterpie ca = new Caterpie();
                Charmander cha = new Charmander();
                
                InimigoPublico();
                
                if(b.getHp() >= 0)
                {
                    //jScrollPane2.setVisible(true);
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+b.apresentarPokemon()+"</html>");
                    b.apresentarPokemon();
                    while(b.getHp() >= 0){
                        dano_meu = b.atacar();
                        b.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+b.getHp()+"</html>");
                        
                      //  sofreDano(dano);
                    }
                } else if (ca.getHp() >= 0)
                {
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+ca.apresentarPokemon()+"</html>");
                    ca.apresentarPokemon();
                    while(ca.getHp() >= 0){
                        dano_meu = ca.atacar();
                        ca.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+ca.getHp()+"</html>");
                    }
                } else if (cha.getHp() >= 0){
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+cha.apresentarPokemon()+"</html>");
                    cha.apresentarPokemon();
                    while(cha.getHp() >= 0){
                        dano_meu = cha.atacar();
                        cha.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+cha.getHp()+"</html>");
                    }
                } else {
                jTextPane1.setContentType("text/html");
                jTextPane1.setText("<html>"+ganharOuPerder(j, ca, cha, b)+"</html>");
                }
                
            case 1:
                Mathews m = new Mathews();
                m.apresentaTreinador();
                
                Diglett d = new Diglett();
                Magikarp ma = new Magikarp();
                Oddish od = new Oddish();
                
                if(d.getHp() >= 0)
                {
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+d.apresentarPokemon()+"</html>");
                    d.apresentarPokemon();
                    while(d.getHp() >= 0){    
                        dano_meu = d.atacar();
                        d.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+d.getHp()+"</html>");
                    }
                } else if (ma.getHp() >= 0)
                {
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+ma.apresentarPokemon()+"</html>");
                    ma.apresentarPokemon();
                    while(ma.getHp() >= 0){
                        dano_meu = ma.atacar();
                        ma.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+ma.getHp()+"</html>");
                    }
                } else if (od.getHp() >= 0){
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+od.apresentarPokemon()+"</html>");
                    od.apresentarPokemon();
                    while(od.getHp() >= 0){
                        dano_meu = od.atacar();
                        od.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+od.getHp()+"</html>");
                    }
                }
                else {
                jTextPane1.setContentType("text/html");
                jTextPane1.setText("<html>"+ganharOuPerder(m, ma, od, d)+"</html>");
                }
                
            case 2:
                Renan r = new Renan();
                r.apresentaTreinador();
                
                Pidgey pid = new Pidgey();
                Pikachu pik = new Pikachu();
                Psyduck psy = new Psyduck();
                
                if(pid.getHp() >= 0)
                {
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+pid.apresentarPokemon()+"</html>");
                    while(pid.getHp() >= 0){
                        dano_meu = pid.atacar();
                        pid.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+pid.getHp()+"</html>");
                    }
                } else if (pik.getHp() >= 0)
                {
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+pik.apresentarPokemon()+"</html>");
                    pik.apresentarPokemon();
                    while(pik.getHp() >= 0){
                        dano_meu = pik.atacar();
                        pik.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+pik.getHp()+"</html>");
                    }
                } else if (psy.getHp() >= 0){
                    //jTextPane1.setContentType("text/html");
                    //jTextPane1.setText("<html>"+m.apresentaTreinador()+"</html>");
                    jTextPane1.setContentType("text/html");
                    jTextPane1.setText("<html>"+psy.apresentarPokemon()+"</html>");
                    
                    while(psy.getHp() >= 0){
                        dano_meu = psy.atacar();
                        psy.sofredano(dano_meu);
                        jTextPane1.setText("<html>"+psy.getHp()+"</html>");
                    }
                }
                else {
                jTextPane1.setContentType("text/html");
                jTextPane1.setText("<html>"+ganharOuPerder(r, psy, pik, pid)+"</html>");
                }
            default:
        }
    }//GEN-LAST:event_atacarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(campoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(campoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(campoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(campoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new campoDeBatalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Quadro1;
    private javax.swing.JButton atacar;
    private javax.swing.JButton fechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
