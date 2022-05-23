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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author melda_000
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    String[] ID = new String[100];
    String[] callNo = new String[100];
    String[] returnDate = new String[100];
    Book[] books = new Book[25];
    Issued[] issue = new Issued[25];
    Student[] students = new Student[25];
    int counter = 0;
    int iCount = 0;
    int sCount = 0;
    int sScount = 0;

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
                String tokens[] = x.split(",");
                issue[iCount] = new Issued(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
                iCount++;
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

    public void readStudentSection() {
        File f = new File("Student Section.txt");
        try {
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String x = s.nextLine();
                String tokens[] = x.split(",");
                ID[sScount] = tokens[0];
                callNo[sScount] = tokens[1];
                returnDate[sScount] = tokens[2];
                sScount++;
            }
        } catch (IOException ex) {

        }
    }

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
                myWriter.close();
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

    public void writeInIssued() {
        File myfile3 = new File("issued.txt");
        try {
            try ( FileWriter myWriter = new FileWriter(myfile3)) {

                myWriter.write(issue[0].getId() + ",");
                myWriter.write(issue[0].getCallNo() + ",");
                myWriter.write(issue[0].getSId() + ",");
                myWriter.write(issue[0].getSName() + ",");
                myWriter.write(issue[0].getSContact() + ",");
                myWriter.write(issue[0].getIssueDate() + ",");
                myWriter.write(issue[0].getReturnDate() + "\n");
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }
        try {
            FileWriter myWriter = new FileWriter(myfile3, true);
            for (int j = 1; j < iCount; j++) {

                myWriter.write(issue[j].getId() + ",");
                myWriter.write(issue[j].getCallNo() + ",");
                myWriter.write(issue[j].getSId() + ",");
                myWriter.write(issue[j].getSName() + ",");
                myWriter.write(issue[j].getSContact() + ",");
                myWriter.write(issue[j].getIssueDate() + ",");
                myWriter.write(issue[j].getReturnDate() + "\n");
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

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
            for (int j = 1; j < counter; j++) {

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

    public void writeInStudentSection() {
        File myfile2 = new File("Students.txt");
        try {
            try ( FileWriter myWriter = new FileWriter(myfile2)) {

                myWriter.write(ID[0] + ",");
                myWriter.write(callNo[0] + ",");
                myWriter.write(returnDate[0] + "\n");

                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }
        try {
            FileWriter myWriter = new FileWriter(myfile2, true);
            for (int j = 1; j < sScount; j++) {

                myWriter.write(ID[j] + ",");
                myWriter.write(callNo[j] + ",");
                myWriter.write(returnDate[j] + "\n");

                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }

    }

    public void deleteFirstIssued() {
        File myfile3 = new File("issued.txt");
        try {
            FileWriter w = new FileWriter(myfile3);
            w.write("");
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteFirstStudentSection() {
        File myfile3 = new File("Student Section.txt");
        try {
            FileWriter w = new FileWriter(myfile3);
            w.write("");
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ReturnBook() {
        initComponents();
        readBooks();
        readIssued();
        readStudents();
        readStudentSection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CallText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 237, 209));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("                         Return Book");

        jLabel7.setText("Book Call no :");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ReturnButton.setText("Return Book");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Student ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(CallText))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(257, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CallText)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        LibrarianSection LibSec3 = new LibrarianSection();
        LibSec3.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        // TODO add your handling code here:
        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date today = Calendar.getInstance().getTime();
        boolean issuedFound = false;
        boolean penalty = false;
        boolean firstIssueFlag = false;
        boolean firstStudentFlag = false;
        for (int i = 0; i < iCount; i++) {

            if (issue[i].getCallNo().equals(CallText.getText()) && issue[i].getSId().equals(idText.getText())) {
                issuedFound = true;
                try {
                    d = formatter.parse(issue[i].getReturnDate());
                } catch (ParseException ex) {
                    Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (d.compareTo(today) > 0) { // checking if there is a penalty
                    penalty = true;
                }
                if (today.getDay() == d.getDay() && today.getMonth() == d.getMonth() && today.getYear() == d.getYear()) {
                    penalty = false;
                }
                if (i == 0) { // there is only one issued book and delete it
                    issue[i] = new Issued();
                    firstIssueFlag = true;
                    deleteFirstIssued();
                }
                for (int j = i; j < iCount - 1; j++) { // delete in issued books

                    issue[j] = issue[j + 1];
                }
                iCount--;
                break;
            }
        }
        int m = 0;
        for (m = 0; m < sCount; m++) {
            if (students[m].getID().equals(idText.getText())) {

                break;
            }
        }
        for (int n = 0; n < sScount; n++) { //delete in student section
            if (callNo[n].equals(CallText.getText())) {
                if (n == 0) { // there is only one issued book and delete it
                    firstStudentFlag = true;
                    deleteFirstStudentSection();
                }
                for (int q = n; q < sScount; q++) {
                    callNo[q] = callNo[q + 1];
                    returnDate[q] = returnDate[q + 1];
                }
            }
        }
        if (!issuedFound) {
            JOptionPane.showMessageDialog(this, "Book not found");
        } else {

            for (int i = 0; i < counter; i++) {
                if (books[i].getCallNo().equals(CallText.getText())) {
                    penalty = true;
                    books[i].returnBook();
                    students[m].returnBook();
                    break;
                }
            }
        }
        if (penalty) {
            JOptionPane.showMessageDialog(this, "There is a penalty");
        } else {
            JOptionPane.showMessageDialog(this, "Book returned");
        }
        writeInBooks();
        writeInStudents();
        if (!firstIssueFlag) {
            writeInIssued();
        }
        if (!firstStudentFlag) {
            writeInStudentSection();
        }
        //JOptionPane.showMessageDialog(this,"Book Returned Successfully");
    }//GEN-LAST:event_ReturnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CallText;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
