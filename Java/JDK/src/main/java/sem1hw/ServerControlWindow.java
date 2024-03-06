package sem1hw;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class ServerControlWindow extends JFrame {
    private boolean isServerWorking = false;
    private final JTextArea serverMessages;

    public ServerControlWindow() {
        setTitle("Управление сервером");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton startButton = new JButton("Запустить сервер");
        startButton.addActionListener(e -> {
            if (isServerWorking) {
                addServerMessage("Сервер уже запущен");
            } else {
                isServerWorking = true;
                addServerMessage("Сервер запущен");
            }
        });

        JButton stopButton = new JButton("Остановить сервер");
        stopButton.addActionListener(e -> {
            if (isServerWorking) {
                isServerWorking = false;
                addServerMessage("Сервер остановлен");
            } else {
                addServerMessage("Сервер не запущен");
            }
        });

        serverMessages = new JTextArea();

        panel.add(startButton, BorderLayout.NORTH);
        panel.add(stopButton, BorderLayout.CENTER);
        panel.add(serverMessages, BorderLayout.EAST);

        add(panel);
    }

    private void addServerMessage(String message) {
        serverMessages.append(message + "\n");
    }

    public static void main(String[] args) {
        ServerControlWindow window = new ServerControlWindow();
        window.setVisible(true);
    }
}
