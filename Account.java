package org.example;


    public class Account {
        private double balance;

        public Account() {
            this.balance = 0.0;
        }

        public Account(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds!");
            }
        }
    }


