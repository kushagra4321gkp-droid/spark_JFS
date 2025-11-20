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


    //port + ip ------> goes to server's Operating system
}
