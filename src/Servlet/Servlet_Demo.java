package Servlet;

public class Servlet_Demo {
    //Flow:
    //1.Browser hit : http://abcd.in/login
    //2.DNS lookup
    //    a. Resolves http://abcd.in/login -> 10.22.123.44
    //3.TCP handshake and establishing connection
    //4.HTTP request sent via TCP stream
    //   a.TCP breaks HTTP into packets
    //   b.Each packet has sequence number
    //   c.IP route them to server
    //   d.Server read that request and return response
    //5.HTTP response sent via TCP
    //6.TCP close the connection


  //Ques ---> if tcp establishes connection to the server first before Domain name(ip address), who tells tcp to go to that perticular port? and how?

    //------------------------------------------------------------------------------------------
    //Alright Kushagra, this is the correct, exact truth — no analogies, no confusion.
    //
    //Your question:
    //
    //If TCP establishes connection to the server first before domain name, who tells TCP to go to that particular port? And how?
    //
    //Let’s break it properly.
    //
    //🚀 FIRST: Correct the misunderstanding
    //
    //TCP does NOT establish connection before domain name.
    //
    //The exact order is:
    //
    //1. Browser takes Domain Name
    //2. DNS converts it → IP Address
    //3. Browser decides port
    //4. TCP connects to (IP, PORT)
    //5. Then TLS/HTTP request happens
    //
    //
    //So Domain Name is resolved BEFORE TCP connection.
    //
    //🔥 Now answer your REAL question:
    //❓ “Who tells TCP to go to that particular port? And how?”
    //✔️ Answer: The Browser tells TCP the port.
    //
    //Before TCP does anything, the browser decides the port number.
    //
    //✅ Step-by-step Exactly What Happens
    //STEP 1: You type a URL
    //
    //Example:
    //
    //http://facebook.com
    //
    //STEP 2: Browser parses the URL
    //
    //Browser identifies:
    //
    //Protocol: HTTP
    //
    //Host: facebook.com
    //
    //Port: default for HTTP = 80
    //
    //If URL was HTTPS → port = 443
    //If URL is http://localhost:8080
    // → port = 8080
    //If URL is http://example.com:3000
    // → port = 3000
    //
    //🔥 Here is the rule:
    //
    //If URL contains a port → use that.
    //If not → use default port for the protocol.
    //
    //STEP 3: Browser resolves Domain → IP using DNS
    //
    //Example:
    //
    //facebook.com → 157.240.22.35
    //
    //
    //Now browser has:
    //
    //IP = 157.240.22.35
    //
    //Port = 80
    //
    //STEP 4: Browser calls the OS to open TCP connection
    //
    //Browser tells Operating System:
    //
    //👉 "Open a TCP connection to (157.240.22.35, 80)"
    //
    //This is literally how it works.
    //
    //The OS (kernel) handles TCP, not the browser.
    //
    //STEP 5: TCP 3-Way Handshake happens
    //
    //Between your machine and:
    //
    //(IP = 157.240.22.35, PORT = 80)
    //
    //
    //Only when TCP handshake succeeds → connection is formed.
    //
    //Now HTTP request begins.
    //
    //🎯 So the REAL truth:
    //TCP NEVER chooses the port.
    //
    //TCP is dumb. It is the postman that delivers packets.
    //
    //The port is chosen BEFORE TCP does anything.
    //
    //Chosen by:
    //
    //The URL itself (if port is written)
    //
    //Browser defaults:
    //
    //HTTP → 80
    //
    //HTTPS → 443
    //
    //FTP → 21
    //
    //SMTP → 25
    //
    //Custom ports in URL (8080, 3000, etc.)
    //
    //The browser passes (IP, PORT) to TCP, and TCP just connects.
    //
    //🧩 Visual Summary (Accurate)
    //User types URL
    //       ↓
    //Browser extracts protocol → decides port
    //       ↓
    //Browser resolves domain → gets IP
    //       ↓
    //Browser calls OS: "TCP connect to (IP,port)"
    //       ↓
    //TCP handshake (SYN, SYN-ACK, ACK)
    //       ↓
    //HTTP request starts
    //
    //🔥 Ultra-Short Answer (the essence)
    //
    //The port is selected by the browser based on the URL or protocol.
    //TCP never chooses the port; it simply connects to the port that the browser/URL tells it to.
}
