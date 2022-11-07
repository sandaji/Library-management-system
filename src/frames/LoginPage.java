public class LoginPage extends javax.swing.JFrame{ 
        // verify credentials
        public void login(){
        String name = txt_username.getText();
        String password = txt_password.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3500/library_ms","root","");
            PreparedStatement pst = con.prepareStatement("SELECT  * FROM users WHERE name = ? and password = ?");

            pst.setString(1, name);
            pst.setString(2, password);

            resultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this,"login success");
                HomePage home = new HomePage();
                home.setVisible(true);
                this.dispose();
            } else{
                JOptionPane.showMessageDialog(this,"username or password incorrect");
  
            }

        } catch (Exception e){}
        }


}       