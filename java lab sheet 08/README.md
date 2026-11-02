# Java Lab Sheet 08 - MCA III Semester

## Course: Object Oriented Programming Using Java (MCA203P)

### Topics Covered:
- **JavaBeans Fundamentals**: Encapsulation, No-arg constructors, Getters/Setters, Serialization (`StudentBean`, `RectangleBean`, `EmployeeBean`, `CarBean`).
- **Property Types**: Read-only properties (`DateBean`, `CircleBean`), Write-only properties (`UserBean`), Bound properties with `PropertyChangeSupport` and `PropertyChangeListener` (`AccountBean`).
- **Bean Introspection**: Inspecting bean properties, getters, setters, and method descriptors using `java.beans.Introspector`.
- **Networking in Java**:
  - `InetAddress` for IP address and hostname resolution.
  - TCP Socket Programming: `ServerSocket`, `Socket` (`HelloServer`, `HelloClient`, `EchoServer`).
  - UDP Socket Programming: `DatagramSocket`, `DatagramPacket` (`MessageSender`, `MessageReceiver`).
  - Web Access: Reading web pages via `URL`, downloading files via `URLConnection`.
  - Multithreaded TCP Server: Concurrent client request processing with thread handlers (`MultiClientServer`).

### Programs List:
1. `Q01_StudentBean.java` / `StudentBean.java`: StudentBean with id, name, grade, getters, setters.
2. `Q02_RectangleBean.java` / `RectangleBean.java`: RectangleBean with area and perimeter calculations.
3. `Q03_EmployeeBean.java` / `EmployeeBean.java`: EmployeeBean implementing Serializable with object serialization.
4. `Q04_DateBean.java` / `DateBean.java`: Read-only currentDate property.
5. `Q05_UserBean.java` / `UserBean.java`: Write-only password property.
6. `Q06_AccountBeanListener.java` / `AccountBean.java`: PropertyChangeListener on balance changes.
7. `Q07_AccountBeanEventDemo.java`: Balance updating demonstrating property change event firing.
8. `Q08_BeanIntrospector.java`: Using Introspector to list all properties and methods.
9. `Q09_CarBean.java` / `CarBean.java`: CarBean with make, model, year.
10. `Q10_CircleBean.java` / `CircleBean.java`: CircleBean with read-only calculated area & circumference.
11. `Q11_InetAddressDemo.java`: Display IP address and host name using InetAddress.
12. `Q12_HelloServer.java`: TCP server on port 5000 printing "Client connected".
13. `Q13_HelloClient.java`: TCP client connecting to HelloServer and sending "Hello Server".
14. `Q14_HelloServerReadMessage.java`: HelloServer reading and displaying client message.
15. `Q15_EchoServer.java`: TCP Echo server returning client message.
16. `Q16_MessageSender.java`: UDP client sending "Ping" to port 6000.
17. `Q17_MessageReceiver.java`: UDP server receiving message on port 6000.
18. `Q18_WebReader.java`: Reading web content using URL.
19. `Q19_FileDownloader.java`: Downloading a file using URLConnection.
20. `Q20_MultiClientServer.java`: Multithreaded TCP server handling multiple clients.

### How to Compile & Run:
```bash
# Compile all files
javac *.java

# Run any question (e.g. Q01)
java Q01_StudentBean
```
