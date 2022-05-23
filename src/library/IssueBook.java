/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author melda_000
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    Book[] books = new Book[100];
    String[] Ids = new String[100];
    Student[] students = new Student[100];
    int counter = 0;
    int idCount = 0;
    int sCount = 0;

    public void writeInBooks() {
        File myfile2 = new File("books.txt");
        try {
            try ( FileWriter myWriter = new FileWriter(myfile2)) {

                myWriter.write(books[0].getID() + ",");
                myWriter.write(books[0].getCallNo() + ",");
                myWriter.write(books[0].getBookName() + ",");
                myWriter.write(books[0].getAuthor() + ",");
                myWriter.write(books[0].getPublisher() + ",");
                myWriter.write(books[0].getQuantity() + ",");
                myWriter.write(books[0].getIssued() + ",");
                myWriter.write(books[0].getAddDate() + "\n");
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }
        try {
            FileWriter myWriter = new FileWriter(myfile2, true);
            for (int j = 1; j < counter; j++) {

                myWriter.write(books[j].getID() + ",");
                myWriter.write(books[j].getCallNo() + ",");
                myWriter.write(books[j].getBookName() + ",");
                myWriter.write(books[j].getAuthor() + ",");
                myWriter.write(books[j].getPublisher() + ",");
                myWriter.write(books[j].getQuantity() + ",");
                myWriter.write(books[j].getIssued() + ",");
                myWriter.write(books[j].getAddDate() + "\n");
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }
    }

    public void writeInIssued(String strrDate) {
        File myfile1 = new File("issued.txt");
        String strDate = strrDate;
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YY");
        Date date = new Date();
        String d = dateFormat.format(date);

        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(myfile1));
            Object[] tableLines = br.lines().toArray();
            i = tableLines.length;
        } catch (IOException ex) {
        }
        try {
            try ( FileWriter myWriter = new FileWriter(myfile1, true)) {

                myWriter.write(++i + ",");
                myWriter.write(callNoText.getText() + ",");
                myWriter.write(idText.getText() + ",");
                myWriter.write(nameText.getText() + ",");
                myWriter.write(contactText.getText() + ",");
                myWriter.write(d + ",");
                myWriter.write(strDate + "\n");

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "An Error occured");

        }
    }

    public void writeInStudents() {
        File myfile2 = new File("Students.txt");
        try {
            try ( FileWriter myWriter = new FileWriter(myfile2)) {

                myWriter.write(students[0].getID() + ",");
                myWriter.write(students[0].getName() + ",");
                myWriter.write(students[0].getPassword() + ",");
                myWriter.write(students[0].getEmail() + ",");
                myWriter.write(students[0].getAddress() + ",");
                myWriter.write(students[0].getCity() + ",");
                myWriter.write(students[0].getContactNo() + ",");
                myWriter.write(students[0].getIssued() + "\n");
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }
        try {
            FileWriter myWriter = new FileWriter(myfile2, true);
            for (int j = 1; j < sCount; j++) {

                myWriter.write(students[j].getID() + ",");
                myWriter.write(students[j].getName() + ",");
                myWriter.write(students[j].getPassword() + ",");
                myWriter.write(students[j].getEmail() + ",");
                myWriter.write(students[j].getAddress() + ",");
                myWriter.write(students[j].getCity() + ",");
                myWriter.write(students[j].getContactNo() + ",");
                myWriter.write(students[j].getIssued() + "\n");
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }
    }

    public void readBooks() {
        File f = new File("books.txt");
        try {
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String x = s.nextLine();
                String tokens[] = x.split(",");
                books[counter] = new Book(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6]), tokens[7]);
                counter++;
            }
        } catch (IOException ex) {

        }
    }

    public void readIssued() {
        File f1 = new File("issued.txt");
        try {
            Scanner s = new Scanner(f1);

            while (s.hasNextLine()) {
                String x = s.nextLine();
                String token[] = x.split(",");
                Ids[idCount] = token[2];
                idCount++;
            }
        } catch (IOException ex) {

        }
    }

    public void readStudents() {
        File f = new File("Students.txt");
        try {
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String x = s.nextLine();
                String tokens[] = x.split(",");
                students[sCount] = new Student(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], Integer.parseInt(tokens[7]));
                sCount++;
            }
        } catch (IOException ex) {
        }

    }

    public IssueBook() {
        initComponents();
        readBooks();
        readStudents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        issueBookButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        callNoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(223, 252, 223));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("                         Issue Book");

        issueBookButton.setText("Issue Book");
        issueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Student ID :");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Student Name :");

        jLabel6.setText("Student contact :");

        jLabel7.setText("Book Call no :");

        jLabel2.setText("Return Date :");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(issueBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(callNoText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactText)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(callNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(issueBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookButtonActionPerformed
        // TODO add your handling code here:
        Date d;
        d = jDateChooser1.getDate();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = dateFormat.format(d);
        boolean flag = false;

        int issued = 0;
        int m;
        boolean found = false;
        for (m = 0; m < sCount; m++) {
            if (students[m].getID().equals(idText.getText())) {
                issued = students[m].getIssued();
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Student not found");
        }

        if (issued < 3) {
            for (int c = 0; c < counter; c++) {
                if (books[c].getCallNo().equals(callNoText.getText())) {
                    flag = true;
                    if (books[c].getQuantity() > 0) {
                        books[c].issueBook();
                        students[m].issueBook();
                        writeInIssued(strDate);
                        writeInStudents();
                        writeInBooks();
                        JOptionPane.showMessageDialog(this, "Book Issued Successfully");

                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "This Book is not Available");
                        break;
                    }
                }

            }
            if (!flag) {
                JOptionPane.showMessageDialog(this, "There is no Book with this Call No.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Student already issued 3 books !");
        }
        // JOptionPane.showMessageDialog(this,"Book Issued Successfully");
    }//GEN-LAST:event_issueBookButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        LibrarianSection LibSec3 = new LibrarianSection();
        LibSec3.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField callNoText;
    private javax.swing.JTextField contactText;
    private javax.swing.JTextField idText;
    private javax.swing.JButton issueBookButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    // End of variables declaration//GEN-END:variables
}
