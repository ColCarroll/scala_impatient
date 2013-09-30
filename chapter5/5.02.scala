
/* 2: Write a class BankAccount with methods deposit and withdraw, and a read-only property balance. */

class BankAccount {
  
  private var _balance = 0.0

  def deposit(amount: Double) { 
    _balance += amount
  }
  def withdraw(amount: Double) { 
    if(_balance>amount) _balance -= amount 
  }
  def balance = _balance
}

var funds = new BankAccount
funds.deposit(250.03)
println(funds.balance)

funds.withdraw(250.0)
println(funds.balance)

