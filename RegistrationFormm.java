import javax.swing.*;

//Class
public class RegistrationFormm
{
    private JFrame frame;
    private JLabel nameLabel; 
    private JTextArea nameField;
    private JLabel mobileLabel;
    private JTextArea mobileField;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel dobLabel;
    private JComboBox<String> yearComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<String> dayComboBox;
    private JLabel addressLabel;
    private JTextArea addressField;
    private JCheckBox termsCheckBox;
    private JButton submitButton;
    private JButton resetButton; 
   
    public RegistrationFormm(){
        //Creating window frame
        frame = new JFrame("Registration form");
        frame.setSize(450,500);
        frame.setLayout(null);
        
        //Name
        //declaring Name Labels and its bounds
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(20,20,80,25);
        //declaring Name TextField and its bounds
        nameField = new JTextArea();
        nameField.setBounds(120,20,200,25); //setBounds(x cord, y cord, width, height)
        //adding name Frames
        frame.add(nameLabel);
        frame.add(nameField);
        
        //Mobile
        //declaring Mobile Labels and its bounds
        mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(20, 50, 80, 25);
        //declaing Mobile TextField and its bounds
        mobileField = new JTextArea();
        mobileField.setBounds(120, 50, 200, 25);
        //adding mobile frames
        frame.add(mobileLabel);
        frame.add(mobileField);

        //Gender
        //declaing Gender Labels 
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 80, 80, 25);
        //declaring radioButtons for male and female
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(120, 80, 80, 25);
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(220, 80, 80, 25);
        //ButtonGroup to make male and female single radioButton instead of separate 
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        //adding gender frames
        frame.add(genderLabel);
        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);

        //Date Of Birth 
        //declaring DOB labels
        dobLabel = new JLabel("Date Of Birth:");
        dobLabel.setBounds(20, 110, 80, 25);
        //
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] days = new String[31];
        String[] years = new String[101];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        for (int i = 0; i < 101; i++) {
            years[i] = String.valueOf(1920 + i);
        }
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(120, 110, 100, 25);
        dayComboBox = new JComboBox<>(days);
        dayComboBox.setBounds(230, 110, 70, 25);
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(320, 110, 90, 25);
        //adding frames
        frame.add(dobLabel);
        frame.add(monthComboBox);
        frame.add(dayComboBox);
        frame.add(yearComboBox);

        //Address
        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 160, 80, 25);
        addressField = new JTextArea();
        addressField.setBounds(120, 160, 200, 50);
        frame.add(addressLabel);
        frame.add(addressField);

        //Terms And Conditions Check Box
        termsCheckBox = new JCheckBox("I accept the terms and conditions");
        termsCheckBox.setBounds(90, 230, 250, 25);
        frame.add(termsCheckBox);

        //Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(120, 260, 100, 25);
        frame.add(submitButton);

        //Reset Button
        resetButton = new JButton("Reset");
        resetButton.setBounds(220, 260, 100, 25);
        frame.add(resetButton);
        
        //setting the frames visible
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new RegistrationFormm();
    }
}