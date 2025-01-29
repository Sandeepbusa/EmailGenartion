# Email Application

This is a simple Java-based application for managing employee email accounts in an organization. The application provides functionalities like generating email addresses, assigning departments, generating random passwords, and setting mailbox capacities.

## Features

- Generate an email address based on the user's first and last name.
- Assign a department to the user.
- Automatically generate a secure random password.
- Set mailbox capacity.
- Allow users to set an alternate email.
- Display user information including email and mailbox capacity.

## Project Structure

```
com.flm.email
├── Email.java         # Core logic for email generation and user management
├── EmailApp.java      # Entry point of the application
```

## How to Run

1. Clone this repository or download the project files.
   ```
git clone <repository-url>
cd <project-folder>
```
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. Compile and run the `EmailApp.java` file.

4. Follow the prompts to input the user's first name, last name, and department selection.

## Example Usage

When you run the program, you will be prompted to enter:

1. First name
2. Last name
3. Department selection (e.g., Sales, Development, Accounting, or None)

The program will:

- Generate an email address based on the inputs.
- Display a randomly generated secure password.
- Provide details such as the user's full name, email address, and mailbox capacity.

### Sample Output
```
Enter the firstName : John
Enter the lastName : Doe
New worker John department Codes :
1 for Sales
2 for Development
3 for Accounting
0 for None
Enter department code: 2
Your Password is: AB!C1@D2
DISPLAY NAME : John Doe
COMPANY EMAIL : john.doe@development.sscompany.com
MAILBOX CAPACITY : 500mb
```

## Configuration

The application allows you to configure:

- **Default password length**: Modify the `defaultPasswordLength` variable in the `Email` class.
- **Company domain**: Update the `companySuffix` variable in the `Email` class.
- **Mailbox capacity**: Use the `setMailboxCapacity` method.
- **Alternate email**: Use the `setAlternateEmail` method.

## Technologies Used

- Java
- Scanner for input handling
- Random password generation using Math.random

## Future Enhancements

- Add GUI for better user experience.
- Implement database integration to store and manage user details.
- Provide email validation and formatting options.
- Allow users to update their details dynamically.

## License

This project is licensed under the [MIT License](LICENSE).

## Author

Sandeep Busa

Feel free to fork, contribute, or raise issues for this project!
