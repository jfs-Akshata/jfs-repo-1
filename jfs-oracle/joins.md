# why joins?
Noramlization  : Process of Breaking down complex tables into simpler tables
Advantage : Simpler tables with less redundancy.
Disadvantage: Join many tables to fetch data.

Denormalizatoin : Combining simpler tables into a complex tables
Advantage : Reduces number of Joins required.
Disadvantage : Increases redundancy.

DBMS : Design
Entity Relationship Diagram.
UML Diagrams

1 table : CustomerOrders
User1 order1 28th pro1
User1 order1 28th pro2
User1 order1 28th pro3
User1 order1 28th pro4

2 tables : Orders and OrderDetails
Orders
User1 order1 28th
OrderDetails
order1 pro1
order1 pro2
order1 pro3
order1 pro4
