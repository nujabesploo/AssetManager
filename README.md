# 🚀 Asset Management System 🏡🚗

Welcome to the **Asset Management System**, a Java application that helps manage various types of assets like houses and vehicles! 🏠🚘 This project demonstrates **object-oriented programming (OOP)** concepts, including **inheritance, polymorphism, and encapsulation**.

---

## 📌 Features
✔️ Manage different types of assets (Houses, Vehicles)  
✔️ Store and display asset details dynamically  
✔️ Demonstrates Java OOP principles  
✔️ Simple and easy-to-understand implementation  

---

## 🛠 Technologies Used
- **Java** ☕  
- **OOP (Inheritance, Polymorphism, Encapsulation)**  
- **ArrayLists for dynamic storage**  
- **Formatted output for better readability**  

---

## 📸 Screenshots

<img src="https://github.com/user-attachments/assets/2cbc425e-2e8d-4ce7-b44d-18de122e5a22" alt="Screenshot 2025-03-15 at 12 23 58 PM" width="700" height="470">

---

## 🚀 Getting Started

### 📥 Installation
1. Clone this repository:
   ```sh
   git clone https://github.com/YourGitHubUsername/YourRepositoryName.git
   ```
2. Open the project in your favorite IDE (IntelliJ, Eclipse, VS Code).  
3. Run the `Main.java` file to see it in action! 🎬  

---

## 🏗 Project Structure

```
📂 com.pluralsight
 ┣ 📜 Main.java         // Entry point of the application
 ┣ 📜 Asset.java        // Base class for all assets
 ┣ 📜 House.java        // Subclass representing a house asset
 ┗ 📜 Vehicle.java      // Subclass representing a vehicle asset
```

---

## 📖 How It Works

1. **Creates an asset collection** using an `ArrayList<Asset>`.  
2. **Adds different assets** (houses and vehicles) to the collection.  
3. **Displays asset information** using polymorphism.  

```java
// Create an asset collection
ArrayList<Asset> myAssets = new ArrayList<>();

// Add a house
myAssets.add(new House("01/15/2020", "My house", 250000.00, "123 Main St", 1, 2000, 5000));

// Add a vehicle
myAssets.add(new Vehicle("03/10/2023", "Family car", 35000.00, "Honda Accord", 2022, 15000));
```

---

## ✨ Crediting & Publishing

If you use or modify this project:  
✔️ **Give credit** by mentioning the original project in your repository.  
✔️ **Feel free to fork** and customize for your own needs.  
✔️ **Publish improvements** and contribute back to the community!  

If you plan to **publish** your own version, please:  
📌 Include an acknowledgment to this original repository.  
📌 Clearly document any modifications or enhancements you've made. 

---

🌟 If you like this project, consider giving it a ⭐ **star** on GitHub!  
