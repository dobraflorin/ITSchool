Online furniture store

Planning
- user profile
- furniture stock
- buy/return furniture (shopping cart)
- free delivery option if user buys > 2k euro
- furniture options (different types: massive wood, mdf, pal)
- furniture type: closets, tables

Stories/Task
1. Create User class and add properties, with properties:
username, password, email, address, phoneNumber, wallet
2. We should have a functionality to check furniture stock
- create StockService class
- create Closet class extends Product
- create Table class extends Product
- create Product class (name, price, colour, rawMaterial)
- user a Product list for the furniture stock, and in this way we can
check availability

//create product list with 50 items (closets and tables)

3. Create buy method
- check the availability of the stock by furniture type
- this should remove one item from Product list
- check if the value is > 2k -> free transport