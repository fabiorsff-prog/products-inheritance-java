# Product Pricing System (Inheritance and Polymorphism)

This project consists of a mini inventory control and pricing system that distinguishes between common, used, and imported products. It was developed to learn and apply core object-oriented programming concepts in Java, focusing on Inheritance and Polymorphism.

## System Architecture (UML)

The software design follows a classic inheritance model, where the `Product` superclass extends its attributes and behaviors to specialized business entities:

* **Product (Common):** The base class for all items in the system.
* **ImportedProduct (Imported):** Integrates a customs fee (`customsFee`) and calculates the final total price by adding this fee to the base price.
* **UsedProduct (Used):** Registers a manufacture date and overrides the price tag presentation to display this formatted temporal data.

## Applied Technical Concepts

* **Inheritance (`extends`):** Reused attributes (`name`, `price`) and methods from the base class to prevent code duplication.
* **Polymorphism:** Method overriding (`@Override`) ensures that calling the `priceTag()` method dynamically executes the specific formatting logic corresponding to each object type at runtime.
* **Date Manipulation with Modern API:** Employed the `LocalDate` and `DateTimeFormatter` classes from the `java.time` package for safe data parsing and string formatting according to standard international representations.

## Tech Stack & Tools

* **Language:** Java 25 (JDK 25)
* **Main IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub
