# Day 5: WebElement Methods, Standard Locators & Multi-Browser Execution

---

## 1. WebElement Methods

Once Selenium locates an element on a webpage, we use **`WebElement` methods** to interact with it or verify its state:

| Method | Purpose | Example Use Case |
| :--- | :--- | :--- |
| **`click()`** | Clicks on an element | Clicking a button, link, or checkbox |
| **`sendKeys()`** | Types text into an input field | Entering a username or password |
| **`clear()`** | Clears existing text inside an input box | Resetting a pre-filled text field |
| **`getText()`** | Retrieves the visible text of an element | Reading an error message or heading |
| **`getAttribute()`** | Fetches the value of a specified HTML attribute | Getting the `value`, `href`, or `placeholder` |
| **`isDisplayed()`** | Checks if the element is visible on the page (`true`/`false`) | Verifying a logo or banner is shown |
| **`isEnabled()`** | Checks if the element is active and interactable (`true`/`false`) | Checking if a "Submit" button is clickable |
| **`isSelected()`** | Checks if a checkbox, radio button, or option is selected (`true`/`false`) | Verifying "Remember Me" is checked |

---

## 2. Standard Selenium Locators (`By` Class)

**Locators** tell Selenium *how* to find a specific HTML element on a webpage. Selenium provides 6 basic attribute/text-based locators (alongside CSS Selector and XPath):

### 1. ID Locator (`By.id`)
* **Definition:** Identifies an element using its unique HTML `id` attribute *(fastest and most reliable locator)*.
* **HTML:** `<input type="text" id="username">`
* **Java:** `driver.findElement(By.id("username")).sendKeys("Manikanta");`

### 2. Name Locator (`By.name`)
* **Definition:** Identifies an element using its HTML `name` attribute.
* **HTML:** `<input type="text" name="email">`
* **Java:** `driver.findElement(By.name("email")).sendKeys("test@gmail.com");`

### 3. Class Name Locator (`By.className`)
* **Definition:** Identifies an element using its HTML `class` attribute. *(Best used when the class name is unique and doesn't contain spaces).*
* **HTML:** `<input type="text" class="user-input">`
* **Java:** `driver.findElement(By.className("user-input")).sendKeys("Hello");`

### 4. Tag Name Locator (`By.tagName`)
* **Definition:** Identifies an element using its HTML tag name (e.g., `input`, `a`, `button`). Commonly used with `findElements()` to count links or inputs on a page.
* **HTML:** `<input type="text">`
* **Java:** `driver.findElement(By.tagName("input"));`

### 5. Link Text Locator (`By.linkText`)
* **Definition:** Identifies a hyperlink (`<a>` tag) by matching its **exact, complete visible text**.
* **HTML:** `<a href="https://www.google.com">Google</a>`
* **Java:** `driver.findElement(By.linkText("Google")).click();`

### 6. Partial Link Text Locator (`By.partialLinkText`)
* **Definition:** Identifies a hyperlink (`<a>` tag) by matching a **substring (part)** of its visible text—useful for long or dynamic link texts.
* **HTML:** `<a href="https://www.google.com">Visit Google Website</a>`
* **Java:** `driver.findElement(By.partialLinkText("Google")).click();`

---

## 3. Multi-Browser Execution & Session Management

Cross-browser testing ensures a web application works properly across different browsers (Chrome, Edge, Firefox).

### Browser Driver Classes
Selenium provides separate driver classes that all implement the common **`WebDriver`** interface:
* **`new ChromeDriver()`** — Launches Google Chrome.
* **`new EdgeDriver()`** — Launches Microsoft Edge.
* **`new FirefoxDriver()`** — Launches Mozilla Firefox.

### Tracking & Closing Multiple Browser Sessions (`List<WebDriver>`)
When opening multiple browsers sequentially in a single test run, reassigning the `driver` variable overwrites the reference to the previous browser—meaning `driver.quit()` at the end would only close the *last* opened browser.

To manage all open sessions cleanly:
1. **Store each instance in a `List`:**
   ```java
   static List<WebDriver> allDrivers = new ArrayList<>();
   ```
   Every time a new browser opens (`ChromeDriver`, `EdgeDriver`, `FirefoxDriver`), add it to the list via `allDrivers.add(driver);`.
2. **Quit all browsers together using a loop:**
   ```java
   for (WebDriver d : allDrivers) {
       d.quit();
   }
   allDrivers.clear();
   ```
   This iterates through every stored `WebDriver` instance, closes each browser window properly, and clears the list to free up memory.
