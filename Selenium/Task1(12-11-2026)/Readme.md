# Selenium WebDriver Setup with Maven in IntelliJ IDEA

---

## Core Definitions (Easy to Remember)

* **IntelliJ IDEA (IDE):** The software workspace where you write, edit, and run your Java code.
* **Maven:** A build automation tool that automatically downloads external code libraries your project needs.
* **Dependencies:** The external libraries/code packages downloaded by Maven (e.g., Selenium, WebDriverManager).
* **`pom.xml`:** The main configuration file of a Maven project where you paste dependency XML snippets.
* **Selenium WebDriver:** The specific library that allows your Java code to control and automate a web browser (like Chrome).
* **WebDriverManager:** A helper library (`io.github.bonigarcia.wdm.WebDriverManager`) that automatically manages browser drivers (like `ChromeDriver`) so you don't have to download `.exe` driver files manually.
* **Web Element & Locators:** Any component on a webpage (button, input box, link) is a **Web Element**. **Locators** are strategies used to find those elements (found by right-clicking an element on the page → **Inspect**).

---

## Step-by-Step Setup & Execution

### Step 1: Create a Maven Project in IntelliJ
1. Open IntelliJ IDEA → **Menu → File → New → Project**.
2. Enter your project **Name** and choose the **Location**.
3. Set **Language** to `Java`.
4. Set **Build System** to `Maven` *(switches from the default "IntelliJ" build system)*.
5. Verify your **JDK** is selected and click **Create**.

### Step 2: Add Selenium WebDriver Dependency
1. Open the **`pom.xml`** file in your project root.
2. Go to [Maven Repository](https://mvnrepository.com/), search for **Selenium Java** (and **WebDriverManager**), and copy the XML `<dependency>` code.
3. Paste it inside the `<dependencies> ... </dependencies>` tag in `pom.xml`:
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.27.0</version>
       </dependency>
   </dependencies>
   ```
4. Click the **Maven Refresh (Reload)** icon that pops up in IntelliJ so Maven downloads the libraries from the internet.

### Step 3: Write & Run Your First Automation Script
1. Navigate to **`src → main → java`** in the Project sidebar.
2. Right-click `java` → **New → Java Class** and give it a name (e.g., `FirstTest`).
3. Import `ChromeDriver` (and `WebDriverManager` if used) and write your browser launch code:
4. Right-click inside the editor and select **Run** to launch the browser automatically.

---

## Quick Preview: Finding Elements
* Right-click any element on a webpage → **Inspect** to view its HTML attributes.
* Use `driver.findElement(...)` in Java to locate and interact with that Web Element.
