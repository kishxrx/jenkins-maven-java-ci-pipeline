[![Build Status](https://cuddly-space-capybara-4jg6p4j9g9v6fpjg-8080.app.github.dev/job/CreativeJavaBuild/badge/icon)](https://cuddly-space-capybara-4jg6p4j9g9v6fpjg-8080.app.github.dev/job/CreativeJavaBuild/)


# CI/CD Pipeline with Jenkins & Maven for Java Projects

## 📌 Overview
This project demonstrates the setup of a **Continuous Integration (CI) pipeline** using **Jenkins** and **Maven** for a Java application hosted on **GitHub**.  
The pipeline automates code checkout, build, and packaging steps to ensure every commit is continuously integrated and verified.

During the journey, I faced **real-world challenges** like repository misconfiguration, missing `pom.xml` detection, and Jenkins restarts — and solved them step by step. This README documents the entire process.

---

## 🛠 Tools & Technologies Used

- **Jenkins** – CI/CD automation server  
- **Maven** – Build automation tool for Java  
- **Java** – Programming language  
- **GitHub Codespaces** – Cloud IDE & runtime  
- **GitHub** – Repository hosting & version control  

---

## ⚙️ Implementation Steps

### 1️⃣ Project Setup
- Created a new repository: **`jenkins-maven-java-ci-pipeline`**  
- Initialized with a **Java Maven project structure** including `pom.xml`  
- Pushed code to GitHub for Jenkins integration  

### 2️⃣ Jenkins Configuration
1. Installed **Maven** and **Git** inside Jenkins  
2. Created a **Freestyle Project** in Jenkins named **CreativeJavaBuild**  
3. Configured Source Code Management with repo URL:  
   `https://github.com/kingg123/jenkins-maven-java-ci-pipeline.git`  
4. Set branch to build → **main**  
5. Added Maven goals under **Build Step**:  
   ```
   clean package
   ```

### 3️⃣ Resolving Workspace Issues
- Jenkins initially failed to locate `pom.xml` because it looked in the wrong directory.  
- ✅ Fix: Used **Advanced Maven Options** → explicitly set **POM path**:  
  ```
  jenkins-maven-java-ci-pipeline/pom.xml
  ```

### 4️⃣ Successful Build
Once fixed, Jenkins pipeline executed perfectly:  
✔ Code cloned from GitHub  
✔ Maven executed `clean package`  
✔ Project compiled, tested, and packaged into artifacts  

---

## 📦 Deliverables
- ✅ **Jenkins Job Config** (linked repo + Maven build)  
- ✅ **Successful Build Logs** (console output confirming pipeline success)  
- ✅ **Java Artifact** (`.jar` generated inside `target/` folder)  

---

## 🌟 Struggles & Learnings

### 💥 Struggles
- Jenkins couldn’t detect repo revisions  
- Missing `pom.xml` due to wrong workspace  
- Pipeline breaking after Codespace restarts  
- Maven build failures from misconfiguration  

### ✨ Learnings
- Gained **deep understanding** of Jenkins SCM integration  
- Learned how **Jenkins jobs execute in workspaces**  
- Mastered **Advanced Maven Options** for POM path control  
- Understood how to **restart Jenkins safely in cloud environments**  
- Improved confidence in **debugging CI/CD issues under pressure**  

---

## 🔮 Future Enhancements
- Add **JUnit tests** → automated test integration  
- Extend pipeline → **Continuous Deployment (CD)** stage  
- Add **Slack/GitHub notifications** on build success/failure  

---

## ✅ Conclusion
This project demonstrates a **real-world CI/CD pipeline** using **Jenkins + Maven**, built and debugged entirely inside **GitHub Codespaces**.  

It not only showcases technical setup but also **problem-solving skills** — proving readiness for professional DevOps environments.  

---
