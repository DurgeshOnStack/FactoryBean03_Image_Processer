# 🖼️ Spring FactoryBean Image Processor

A professional Spring Core mini project demonstrating the use of **FactoryBean**, **Java-Based Configuration**, and **Dynamic Bean Creation** using properties.

This project dynamically creates different image processor objects like:

- ✅ Resize Processor
- ✅ Filter Processor
- ✅ Watermark Processor

based on the value provided inside the `application.properties` file.

---

# 🚀 Features

- Spring `FactoryBean` implementation
- Dynamic object creation
- Property-based configuration
- Java annotation configuration
- Loose coupling using interfaces
- Easy to extend architecture
- Beginner-friendly project structure

---

# 🛠️ Technologies Used

- Java
- Spring Core
- FactoryBean
- Maven
- Annotation Configuration

---

# 📂 Project Structure

```bash
src/main/java
│
├── com.nit.config
│   └── AppConfig.java
│
├── com.nit.factory
│   └── ImageProcessorFactoryBean.java
│
├── com.nit.main
│   └── TestApp.java
│
├── com.nit.sbeans
│   ├── ImageProcessor.java
│   ├── ResizeProcessor.java
│   ├── FilterProcessor.java
│   └── WatermarkProcessor.java
│
└── com.nit.properties
    └── application.properties
```

---

# ⚙️ How It Works

The application reads a property from:

```properties
image.process=resize
```

The `FactoryBean` checks this value and dynamically creates the required implementation object.

| Property Value | Generated Bean |
|----------------|----------------|
| resize         | ResizeProcessor |
| filter         | FilterProcessor |
| watermark      | WatermarkProcessor |

---

# 🧠 Core Concept Used

## FactoryBean

This project uses Spring's `FactoryBean` interface for custom object creation.

```java
public class ImageProcessorFactoryBean implements FactoryBean<ImageProcessor>
```

Instead of Spring directly creating objects, the factory decides which implementation to return at runtime.

---

# 📌 Important Code Snippets

## ImageProcessor Interface

```java
public interface ImageProcessor {
    public void process();
}
```

Provides abstraction for all processors. :contentReference[oaicite:0]{index=0}

---

## FactoryBean Logic

```java
@Override
public ImageProcessor getObject() throws Exception {

    if("resize".equalsIgnoreCase(imageProcessorType)) {
        return new ResizeProcessor();
    }
    else if("filter".equalsIgnoreCase(imageProcessorType)) {
        return new FilterProcessor();
    }
    if("watermark".equalsIgnoreCase(imageProcessorType)) {
        return new WatermarkProcessor();
    }
    else {
        throw new IllegalArgumentException("This service is not available");
    }
}
```

Dynamic object creation using property values. :contentReference[oaicite:1]{index=1}

---

## Java Configuration

```java
@Configuration
@PropertySource("com/nit/properties/application.properties")
```

Loads external properties into Spring container. :contentReference[oaicite:2]{index=2}

---

## Main Class

```java
public static void main(String[] args) {

    AnnotationConfigApplicationContext ctx =
            new AnnotationConfigApplicationContext(AppConfig.class);

    ImageProcessor imageProcessor =
            ctx.getBean(ImageProcessor.class);

    imageProcessor.process();
}
```

Runs the application and executes the dynamically generated bean. :contentReference[oaicite:3]{index=3}

---

# ▶️ How To Run

## 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/spring-factorybean-imageprocessor.git
```

---

## 2️⃣ Open Project

Open in:

- IntelliJ IDEA
- Eclipse
- VS Code

---

## 3️⃣ Configure Processor Type

Inside `application.properties`

```properties
image.process=resize
```

Available options:

```properties
image.process=resize
```

```properties
image.process=filter
```

```properties
image.process=watermark
```

---

## 4️⃣ Run Application

Execute:

```bash
TestApp.java
```

---

# 🖥️ Sample Outputs

## Resize Processor

```bash
Image resized successfully!
```

---

## Filter Processor

```bash
Image Filtered successfully!
```

---

## Watermark Processor

```bash
Image Watermarked successfully!
```

---

# 📚 Concepts Covered

- FactoryBean
- Dynamic Bean Creation
- Spring Core
- Java Configuration
- Dependency Injection
- Interface-Based Design
- Loose Coupling

---

# 🔥 Future Improvements

- Add grayscale processor
- Add compression processor
- Real image processing support
- Convert into Spring Boot application
- REST API integration
- File upload support

---

# 🤝 Contributing

Contributions are welcome.

1. Fork repository
2. Create feature branch
3. Commit changes
4. Push code
5. Open Pull Request

---

# 📜 License

This project is licensed under the MIT License.

---

# 👨‍💻 Author

Developed using Java & Spring Core ❤️

---

# ⭐ Support

If you found this project useful, give it a ⭐ on GitHub.
