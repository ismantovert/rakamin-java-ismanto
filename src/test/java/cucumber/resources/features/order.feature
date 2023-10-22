Feature: Order barang di applikasi saucedemo.com

  Scenario: Customer orders goods
    Given The customer is opening the saucedemo application
    When Customers see products and order goods/products
    And Customer checks out ordered goods
    And Customer pays for ordered goods
    Then Customers wait for the goods to be delivered to the shipping destination
    And Customer opens package of ordered goods
