
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FormUtil {

    public void sendData(String N, String P) {
        PatientView PV = new PatientView();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/she_db", "user1", "xxxx");
            String sql = ("SELECT p_id,pname,sex,bloodgrp,age,prescription,email FROM she_db.patient WHERE `pname` =? AND `password` =?");
            ps = con.prepareStatement(sql);
            ps.setString(1, N);
            ps.setString(2, P);
            rs = ps.executeQuery();

            while (rs.next()) {

                Integer pid1 = rs.getInt(1);
                String pid = String.valueOf(pid1);
                PV.TF_PID.setText(pid);
                PV.TF_Name.setText(N);
                PV.TF_Sex.setText(rs.getString(3));
                PV.TF_Bloodgrp.setText(rs.getString(4));
                Integer age1 = rs.getInt(5);
                String age = String.valueOf(age1);
                PV.TF_Age.setText(age);
                PV.TF_Presc.setText(rs.getString(6));
                PV.TF_Email.setText(rs.getString(7));
                PV.setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void sendDocData(String N, String P) {
        DoctorView DV = new DoctorView();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/she_db", "user1", "xxxx");
            String sql = ("SELECT d_id,dname,speciality FROM she_db.doctor WHERE `dname` =? AND `password` =?");
            ps = con.prepareStatement(sql);
            ps.setString(1, N);
            ps.setString(2, P);
            rs = ps.executeQuery();

            while (rs.next()) {

                Integer did1 = rs.getInt(1);
                String did = String.valueOf(did1);
                DV.TF_DID.setText(did);
                DV.TF_DName.setText(N);
                DV.TF_Spec.setText(rs.getString(3));
                DV.setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void sendData(int id) {
        PatientView PV = new PatientView();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/she_db", "user1", "xxxx");
            String sql = ("SELECT p_id,pname,sex,bloodgrp,age,prescription,email FROM she_db.patient WHERE `p_id` =?");
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                String pid = String.valueOf(id);
                PV.TF_PID.setText(pid);
                PV.TF_Name.setText(rs.getString(2));
                PV.TF_Sex.setText(rs.getString(3));
                PV.TF_Bloodgrp.setText(rs.getString(4));
                Integer age1 = rs.getInt(5);
                String age = String.valueOf(age1);
                PV.TF_Age.setText(age);
                PV.TF_Presc.setText(rs.getString(6));
                PV.TF_Email.setText(rs.getString(7));
                PV.setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void sendDocData(int id) {
        DoctorView DV = new DoctorView();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/she_db", "user1", "xxxx");
            String sql = ("SELECT d_id,dname,speciality FROM she_db.doctor WHERE `d_id` =?");
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                String did = String.valueOf(id);
                DV.TF_DID.setText(did);
                DV.TF_DName.setText(rs.getString(2));
                DV.TF_Spec.setText(rs.getString(3));
                DV.setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
