# Day 4: Selenium Locators, Scrolling & Browser Actions

## Core Definitions (Easy to Remember)

* **`WebDriver`:** The main Selenium interface that represents and controls the web browser.
* **`WebDriverManager`:** Automatically downloads and configures the browser driver (like `ChromeDriver`) so you don't have to set manual file paths.
* **`By` Class:** Provides locator mechanisms (like `name`, `xpath`, `id`) to find specific elements on a webpage.
* **XPath:** A query language used to navigate through HTML tags and attributes to locate elements when simple attributes like `id` aren't enough.
* **`JavascriptExecutor`:** A Selenium interface that lets you run JavaScript commands directly inside the browser (used for tasks Selenium can't do natively, like scrolling).
* **`Thread.sleep(ms)`:** A Java command that pauses script execution for a fixed number of milliseconds (`1000 ms = 1 second`).

---

## Code Breakdown & Line-by-Line Explanation

### 1. Browser Setup & Navigation
| Code | What It Does |
| :--- | :--- |
| `WebDriverManager.chromedriver().setup();` | Automatically sets up the Chrome browser driver binary. |
| `WebDriver driver = new ChromeDriver();` | Launches a new Google Chrome browser window. |
| `driver.get("https://maya.adityauniversity.in/");` | Opens the specified URL in the browser. |
| `driver.manage().window().maximize();` | Maximizes the browser to full screen so all elements are clearly visible. |

---

### 2. Waits (`Thread.sleep`)
* **`Thread.sleep(3000);`** — Pauses the code for **3 seconds** to give the webpage time to load before searching for elements. *(Requires `throws InterruptedException` in the `main` method signature).*

---

### 3. Finding Elements (`findElement` & Locators)
* **`driver.findElement(By.xpath("//a[.='Login']")).click();`**
  * **`//a`** searches for any `<a>` (anchor/link) tag on the page.
  * **`[.='Login']`** matches the exact visible text `"Login"`.
  * **`.click()`** clicks the located link.
* **`driver.findElement(By.name("roll_no"));`**
  * Locates the Roll Number input box using its HTML `name="roll_no"` attribute.
* **`driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc");`**
  * **`//input[@name='password']`** finds an `<input>` tag whose `name` attribute equals `'password'`.
  * **`.sendKeys("Abc")`** types the text `"Abc"` into that input field.

---

### 4. Scrolling the Page (`JavascriptExecutor`)
Selenium does not have a built-in scroll method, so we cast `driver` to `JavascriptExecutor`:
```java
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,200)");
```
* **`window.scrollBy(x, y)`:** Scrolls horizontally by `x` pixels and vertically by `y` pixels. Here, `(0, 200)` scrolls **down by 200 pixels**.

---

### 5. Closing the Browser
* **`driver.quit();`** — Closes all browser windows opened by Selenium and safely ends the WebDriver session to free up system memory. *(Note: `driver.close()` only closes the current tab, whereas `driver.quit()` shuts down the entire browser session).*

---
