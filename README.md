# BankSystem
# Console Bank App (Java)

Simple console banking application written in Java as a learning project.
The goal was to practice OOP basics, separation of concerns (UI / Service / Model),
and input validation.

## Features
- Select user by ID
- Show user profile (ID, name, balance)
- Withdraw money with validation (invalid amount / not enough balance)
- Deposit money with validation
- Input validation (prevents crashes when user enters letters instead of numbers)

## Project Structure
- `Main` — application entry point (creates initial users and starts UI)
- `ConsoleUI` — console interaction (Scanner, menu, messages)
- `BankService` — business logic (search user, withdraw, deposit)
- `UserBank` — model (encapsulated fields, withdraw/deposit rules)

## Technologies
- Java
- Maven
- OOP: encapsulation, separation of concerns

## How to Run
### Option 1: Run from IDE (IntelliJ IDEA)
1. Open the project
2. Run `Main`

### Option 2: Run with Maven
1. Build:
   ```bash
   mvn clean package
