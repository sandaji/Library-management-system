public class Register extends javax.swing.JFrame{
    public Register(){
        initComponent();

    }
    // method to insert values to users table
    public void insertRegisterDetails(){
        String name = txt_username.getText();
        String password = txt_password.getText();
        String email = txt_email.getText();
        String contact = txt_contact.getText();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into users(name,password,email,contact) values(?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, password);
            pst.setString(3, email);
            pst.setString(4, contact);

            int updatedRowCount = pst.executeUpdate();

            if (updatedRowCount>0){
                JOptionPane.showMessageDialog(this, "registration succefull");
                LoginPage login = new LoginPage();
                page.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "registration failed");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // VALIDATION
    public boolean validateRegistration(){
        String name = txt_username.getText();
    }







}