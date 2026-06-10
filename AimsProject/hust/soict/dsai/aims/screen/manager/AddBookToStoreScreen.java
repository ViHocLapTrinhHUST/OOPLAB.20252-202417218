package hust.soict.dsai.aims.screen.manager;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.store.Store;
import javax.swing.*;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    public AddBookToStoreScreen(Store store) {
        super(store, "Add Book to Store");

        centerPanel.add(new JLabel("Title:"));
        JTextField tfTitle = new JTextField();
        centerPanel.add(tfTitle);

        centerPanel.add(new JLabel("Category:"));
        JTextField tfCategory = new JTextField();
        centerPanel.add(tfCategory);

        centerPanel.add(new JLabel("Cost:"));
        JTextField tfCost = new JTextField();
        centerPanel.add(tfCost);

        JButton btnAdd = new JButton("Add Book");
        btnAdd.addActionListener(e -> {
            Book newBook = new Book(tfTitle.getText(), tfCategory.getText(), Float.parseFloat(tfCost.getText()));
            store.addMedia(newBook);
            JOptionPane.showMessageDialog(this, "Book added successfully!");
            tfTitle.setText(""); tfCategory.setText(""); tfCost.setText("");
        });
        centerPanel.add(btnAdd);
    }
}