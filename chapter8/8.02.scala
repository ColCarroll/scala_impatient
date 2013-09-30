
/* 2: Extend the BankAccount class of the preceding exercise into a class SavingsAccount that earns interest every month (when a method earnMonthlyInterest is called) and has three free deposits or withdrawals every month. Reset the transaction count in the earnMonthlyInterest method. */

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def checkBalance = balance
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  var tCount = 0
  private val interestRate = 0.0025

  def earnMonthlyInterest = {
    super.deposit(checkBalance*interestRate)
    tCount = 0
  }

  override def deposit(amount: Double) = {
    if(tCount < 3) super.deposit(amount) 
    else super.deposit(amount-1.0)
    tCount += 1; tCount
  }

  override def withdraw(amount: Double) = {
    if(tCount < 3) super.withdraw(amount)
    else super.withdraw(amount+1.0)
    tCount += 1; tCount
  }
}

