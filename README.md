# 🧪 Admin User Flow Test Automation
This UI automation testing project was built using Selenium WebDriver and TestNG, following the Page Object Model (POM) design pattern for clean architecture and maintainability.
## 🔗 Base URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
## 🧡 The test suite targets the OrangeHRM demo site, simulating an admin user's interaction with the system.

---
## 📁 Project Structure

- `src/`
  - `pages/`
    - `BasePage.java`
    - `LoginPage.java`
    - `DashboardPage.java`
    - `AdminManagementPage.java`
  - `tests/`
    - `AdminUserFlow.java`
    - `BaseTest.java`

---

## 🛠 Tools & Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven** (for build and dependency management)
- **Page Object Model** (for better code organization)
- **IntelliJ IDEA / Eclipse** (any Java IDE)

---

## 🚀 Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/muhammadsalah7/eSpaceAutomationTask.git
   cd eSpaceAutomationTask
2. **Install Dependencies**
    Ensure you have Maven and JDK installed, then run: mvn clean install
3. **Configure WebDriver**
    Make sure your desired browser driver (e.g., ChromeDriver) is downloaded.
    Please place it in your system path or configure it in your test base setup.
4. **Update Test Configuration**
    If using a configuration file or BaseTest setup, make sure your WebDriver is initialized correctly.

## ▶️ How to Run the Test
### Through the IDE
- Open the project in IntelliJ IDEA, Eclipse, or any Java IDE.
- Navigate to the `AdminUserFlow.java` file.
- Right-click the file and select **Run**.




