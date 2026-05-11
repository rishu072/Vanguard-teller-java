# Simple ATM System

Simple ATM System is a small Java console application that simulates basic ATM operations. It starts with an initial balance and lets the user check their balance, deposit money, and withdraw money through a text menu.

## Features

- Check current account balance
- Deposit money into the account
- Withdraw money from the account
- Input validation for menu choices and amounts
- Simple console-based interaction

## Project File

- `SimpleATMSystem.java`

## How It Works

The program creates an ATM account with an initial balance of 5000. The user can then choose actions from a menu:

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit

The app prevents invalid deposits, invalid withdrawals, and withdrawals greater than the available balance.

## Requirements

- Java installed on your system
- A terminal or command prompt

## How to Run

Open a terminal in the project folder and run:

```bash
javac SimpleATMSystem.java
java SimpleATMSystem
```

## Example Usage

```text
===== SIMPLE ATM MENU =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
```

## Notes

- The project is a learning example for Java basics, classes, methods, conditionals, and user input handling.
- The balance is stored only while the program is running.