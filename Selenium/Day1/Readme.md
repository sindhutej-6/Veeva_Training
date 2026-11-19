# Day 1: Software Testing & Automation Fundamentals

Welcome to my training repository! This document summarizes the core concepts covered on **Day 1**, focusing on Software Testing basics, Test Scenarios, Manual vs. Automation Testing, and setting up a Java-based Selenium project.

---

## 🛠️ Environment Setup
* **Java Development Kit (JDK)** installation and configuration.
* **IDE Setup:** Eclipse / IntelliJ IDEA.

---

## 🧪 Test Cases, Test Fields & Test Steps

* **Test Case:** A set of actions executed to verify a particular feature or functionality of a software application (e.g., testing the **Login Functionality**).
* **Test Steps:** The specific, sequential actions required to execute a test case.
  * *Example (Login Process):*
    1. Enter Username
    2. Enter Password
    3. Click the Sign-In / Login button
* **Test Fields & Boundary Value Analysis:** Checking input constraints and boundaries.
  * *Example:* An **Aadhaar Card** input field has a strict boundary where both the minimum and maximum character length is **12 digits**.

---

## 📊 High-Level vs. Low-Level Scenarios

Test scenarios are categorized into two levels based on detail:

| Feature | High-Level Scenarios | Low-Level Scenarios |
| :--- | :--- | :--- |
| **Focus** | Focuses on **what** features or goals should work. | Focuses on **how** it works (step-by-step logic, rules, and edge cases). |
| **Purpose** | Broad overview of application functionality. | Extracts specific conditions, inputs, and logical checks to prove functionality. |
| **Example 1** | Navigate to the Application | Enter the application URL in the browser |
| **Example 2** | Login to the system | Enter valid credentials (username & password) |
| **Example 3** | Verify Owl Code / Dashboard | Check and validate the entire web page content |

---

## 🤖 Manual Testing vs. Automation Testing

### Manual Testing
* Executed manually by a human tester without using automation tools.
* Requires more time and human effort.
* **When it is required:** Still essential for scenarios involving visual verification, such as validating images, videos, and UI layouts.

### Automation Testing
* Uses scripts and tools to execute test cases automatically.
* **Benefits:** Saves time and effort, improves accuracy, and is cost-efficient in the long run.
* **Popular Web Automation Tools:**
  * **Selenium:** An open-source tool used to automate web applications. It supports multiple programming languages (Java, Python, C#, etc.).
  * **Playwright:** Another modern tool used for automating web applications.

---

## ☕ Java Project Structure & Maven

When implementing a Java project for automation, there are two primary approaches:
1. **Normal Java Project (Non-Maven):** Dependencies (`.jar` files) must be downloaded and configured manually.
2. **Maven Project (Recommended):** Uses a `pom.xml` file to automatically manage project builds and dependencies.

### Maven Repository & WebDriverManager
* **Maven Repository:** A central hub where libraries and dependencies (such as **Selenium Java** or **SQL** connectors) can be searched and added to your `pom.xml` file.
* **Selenium WebDriverManager:**
  * Used to automate browser testing across different browsers (Chrome, Firefox, Edge, etc.) using a target URL.
  * Eliminates the need to manually download and set up browser driver executables; you can simply call the required browser driver directly in your code.
