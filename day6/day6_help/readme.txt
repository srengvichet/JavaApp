Better objective -- Applying validations for bank scenario.


Create Account class 
1. data members --- acct ID,customerName
type,balance , creationDate
2. Add Account class constructor (with validation rules.)
3. Add equals -- id based method

Validation Rules

while creating an account -- opening  balance  > min balance(declare constant)

valid account types -- saving,current,fd.

In any transaction maintain account balance > min balance.

a/c creation date must be in current financial yr.

If rules are not satisfied , raise custom exception. 
Do not handle exceptions in Account class , BUT handle in Tester in centralized manner.

In Account class ---add methods - 
1. withdraw(amount) -- in case of insufficient funds , raise custom excs
2. deposit(amount)
3. transfer funds (Account dest, double amount) -- cust exc


TestAccount1
Using scanner -- accept a/c info --in case of success --display a/c summary else --via exc -- show err mesg to customer

Withdraw
Deposit
Funds transfer 


String Handling


1. Date Time Handling in Java

1.1 API class
java.util.Date
constructor -- Date() -- creates Date class instance for current date.
Date (long ms)  -- Home work -- read API documentation & explain.

Important Methods
after,before,equals,compareTo,toString,getTime,setTime
--go thro' API docs & test their usage in code example.


1.2 How to parse string to Date?
API class -- java.text.SimpleDateFormat
Steps
1.2.1 Create its instance
SimpleDateFormat(String pattern)
eg --
SimpleDateFormat sdf=new SimpleDateFormat("dd|MMM|yyyy");
MM -- month in number(1-12)
MMM -- abbreviated month name
> 3 M -- complete month name
1.2.2
API method (inherited from DateFormat)
public Date parse(String source) throws ParseException
eg ---
Date d1=sdf.parse(sc.next());

1.2.3
API method of SDF
public String format(Date d)
rets formatted string for specified date instance,as per specified pattern.




1.3 Reading homework
How to create java.util.GregorianCalendar class instace?
What will its toString print?
How to convert Date ---> GregorianCalendar?
How to convert GregorianCalendar ---> Date?
