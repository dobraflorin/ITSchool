Online furniture store
- user profile
- buy/return furniture (shopping cart)
- free delivery option if user buys >2k euro
- furniture options (different types : massive wood, mdf, pal)

Stories
1. Create User class and add properties, with properties:
username, password, email, adres, phoneNumber, wallet
2. We should have a functionality to check furniture stock
- create StockService class
- create Closet class extends Product
- create Table class extends Product
- create Product class (name, furnitureType, price, colour)
- user a Product list for the furniture stock, 
and in this way we can check availability
3. Create buy method
- check the availability of the stock
- this should remove one item from Product List
- check if the value is > 2k -> free transport