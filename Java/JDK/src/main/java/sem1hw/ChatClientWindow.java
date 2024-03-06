package sem1hw;

import javax.swing.*;
import java.awt.*;

public class ChatClientWindow extends JFrame {
    private JTextField loginField;
    private JPasswordField passwordField;
    private JTextField serverIPField;
    private JTextField portField;
    private JTextArea chatArea;
    private JTextField messageField;

    public ChatClientWindow() {
        setTitle("Chat Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel connectionPanel = new JPanel(new GridLayout(5, 2));
        loginField = new JTextField();
        passwordField = new JPasswordField();
        serverIPField = new JTextField();
        portField = new JTextField();

        connectionPanel.add(new JLabel("Login:"));
        connectionPanel.add(loginField);
        connectionPanel.add(new JLabel("Password:"));
        connectionPanel.add(passwordField);
        connectionPanel.add(new JLabel("Server:"));
        connectionPanel.add(serverIPField);
        connectionPanel.add(new JLabel("Port:"));
        connectionPanel.add(portField);
        connectionPanel.add(new JButton("Connect..."));

        add(connectionPanel, BorderLayout.NORTH);

        JPanel messagePanel = new JPanel(new BorderLayout());
        messageField = new JTextField();
        JButton sendButton = new JButton("Send");

        messagePanel.add(messageField, BorderLayout.CENTER);
        messagePanel.add(sendButton, BorderLayout.EAST);

        chatArea = new JTextArea();
        JScrollPane chatScrollPane = new JScrollPane(chatArea);

        add(chatScrollPane, BorderLayout.CENTER);
        add(messagePanel, BorderLayout.SOUTH);

        setSize(400, 450);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChatClientWindow window = new ChatClientWindow();
            window.setVisible(true);
        });
    }
}
