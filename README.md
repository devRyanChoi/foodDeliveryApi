# food Delivery Api
***

## 1. Requirements
1. Customers can choose a restaurant and place an order food from the restaurant.
2. Each restaurant has different menu items and prices.</br>
   Out of scope - customising the order by adding and removing ingredients
3. Customers can specify a delivery time, either ASAP(when the order is placed) or at a future time
4. Customers can store multiple delivery address on their profile
5. Restaurant can accept the order and update the status of the order as it is made.
6. Delivery drivers can pick an order to deliver to assign it to themselves
7. Delivery drivers can pick up an order that is ready from the restaurant and delivery it to customer
8. Customers can rate delivery drivers and restaurants

## 2. ERD

![Screenshot 2023-11-13 at 2 23 34 AM](https://github.com/devRyanChoi/foodDeliveryApi/assets/120599634/0a4556e4-02ae-4936-a6bd-3058101189ae)




## 3. Entity & DB Class Design
### (1) Menu
|   Menu_item   | -  |      -       |
|:-------------:|:--:|:------------:| 
|      id       | PK |     Long     |
| restaurant_id | FK |      -       |
|   item_name   | -  | VARCHAR(255) |
|     price     | -  |     int      |


## 4. Endpoint Design
### 1. /api/v1/menus
- GET /api/v1/menus : Retrieve the total menu
- POST /api/v1/menus/{id} : Add a specific menu
- GET /api/v1/menus{id} : Retrieve the specific menu
- PUT /api/v1/menus{id} : Edit the menu the customer added
- DELETE /api/v1/menus{id} : Delete a specific menu

2. /api/v1/restaurants

3. /api/v1/order