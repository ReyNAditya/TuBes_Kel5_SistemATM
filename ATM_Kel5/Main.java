import javax.swing.JOptionPane;

//inheritance
public class Main extends BankATM {

    //override
    public void btnCekSaldo(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Jumlah Saldo Anda Saat Ini adalah :"+ getSaldo());
        //encapsulation
        hasil = getSaldo();
        answer = String.format(" %,.2f ",hasil);
        jtxtTampilan2.setText(answer);
    }

    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        Main atm = new Main();

        //overload
        atm.BankATM(1000000);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                atm.setVisible(true);
            }
        });
    }
}
