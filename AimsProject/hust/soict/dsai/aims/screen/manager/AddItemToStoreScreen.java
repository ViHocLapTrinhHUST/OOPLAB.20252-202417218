package hust.soict.dsai.aims.screen.manager;

import hust.soict.globalict.aims.store.Store;
import java.awt.*;
import javax.swing.*;

public abstract class AddItemToStoreScreen extends JFrame {
    protected Store store;
    protected JPanel centerPanel;

    public AddItemToStoreScreen(Store store, String title) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(5, 2, 5, 5));
        cp.add(centerPanel, BorderLayout.CENTER);

        setTitle(title);
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    // Copy/Paste hàm createNorth() và createHeader() từ StoreManagerScreen qua đây
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        JMenuItem viewStore = new JMenuItem("View store");
        
        // Nút để quay lại màn hình xem Store
        viewStore.addActionListener(e -> {
            new StoreManagerScreen(store);
            dispose();
        });
        menu.add(viewStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }
}