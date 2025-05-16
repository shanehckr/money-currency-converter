import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JComboBox<CurrencyItem> fromCurrencyCombo, toCurrencyCombo;
    private JTextField amountField;
    private JLabel resultLabel;
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        setTitle("Currency Converter with Flags");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Initialize exchange rates (example values)
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);    // Base currency
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.73);
        exchangeRates.put("JPY", 110.15);
        exchangeRates.put("INR", 74.50);

        // Load flag icons (adjust paths if needed)
        Icon usFlag = new ImageIcon(getClass().getResource("/flags/us.png"));
        Icon euFlag = new ImageIcon(getClass().getResource("/flags/eu.png"));
        Icon gbFlag = new ImageIcon(getClass().getResource("/flags/gb.png"));
        Icon jpFlag = new ImageIcon(getClass().getResource("/flags/jp.png"));
        Icon inFlag = new ImageIcon(getClass().getResource("/flags/in.png"));

        // Create currency items
        CurrencyItem usd = new CurrencyItem("USD", "US Dollar", usFlag);
        CurrencyItem eur = new CurrencyItem("EUR", "Euro", euFlag);
        CurrencyItem gbp = new CurrencyItem("GBP", "British Pound", gbFlag);
        CurrencyItem jpy = new CurrencyItem("JPY", "Japanese Yen", jpFlag);
        CurrencyItem inr = new CurrencyItem("INR", "Indian Rupee", inFlag);

        // Set up combo boxes
        fromCurrencyCombo = new JComboBox<>();
        toCurrencyCombo = new JComboBox<>();
        fromCurrencyCombo.addItem(usd);
        fromCurrencyCombo.addItem(eur);
        fromCurrencyCombo.addItem(gbp);
        fromCurrencyCombo.addItem(jpy);
        fromCurrencyCombo.addItem(inr);
        toCurrencyCombo.addItem(usd);
        toCurrencyCombo.addItem(eur);
        toCurrencyCombo.addItem(gbp);
        toCurrencyCombo.addItem(jpy);
        toCurrencyCombo.addItem(inr);

        // Set custom renderers
        fromCurrencyCombo.setRenderer(new CurrencyComboBoxRenderer());
        toCurrencyCombo.setRenderer(new CurrencyComboBoxRenderer());

        // GUI Components
        amountField = new JTextField();
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

        // Add components to frame
        add(new JLabel("From:"));
        add(fromCurrencyCombo);
        add(new JLabel("To:"));
        add(toCurrencyCombo);
        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel()); // Empty cell
        add(convertButton);
        add(new JLabel("Result:"));
        add(resultLabel);

        // Convert button action
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            CurrencyItem from = (CurrencyItem) fromCurrencyCombo.getSelectedItem();
            CurrencyItem to = (CurrencyItem) toCurrencyCombo.getSelectedItem();

            double fromRate = exchangeRates.get(from.getCode());
            double toRate = exchangeRates.get(to.getCode());
            double convertedAmount = (amount / fromRate) * toRate;

            resultLabel.setText(String.format("Result: %.2f %s", convertedAmount, to.getCode()));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid amount!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CurrencyConverter().setVisible(true);
        });
    }
}

// Class to hold currency data (code, name, flag)
class CurrencyItem {
    private String code;
    private String name;
    private Icon flagIcon;

    public CurrencyItem(String code, String name, Icon flagIcon) {
        this.code = code;
        this.name = name;
        this.flagIcon = flagIcon;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public Icon getFlagIcon() { return flagIcon; }

    @Override
    public String toString() {
        return code + " - " + name;
    }
}

// Custom renderer to display flag + text in JComboBox
class CurrencyComboBoxRenderer extends JLabel implements ListCellRenderer<CurrencyItem> {
    public CurrencyComboBoxRenderer() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    @Override
    public Component getListCellRendererComponent(
            JList<? extends CurrencyItem> list, CurrencyItem item,
            int index, boolean isSelected, boolean cellHasFocus) {

        setText(item.getCode() + " - " + item.getName());
        setIcon(item.getFlagIcon());

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;
    }
}