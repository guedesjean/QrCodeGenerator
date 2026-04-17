# QR Code Generator - Spring Boot + AWS S3

A Spring Boot application that generates QR codes and stores them in AWS S3.  
This project demonstrates the integration of Google's ZXing library for QR code generation and AWS S3 for storage.

---

## 📚 Table of Contents

- [How to Use](#how-to-use)
- [Prerequisites](#prerequisites)
- [Environment Variables](#environment-variables)
- [Running the Application](#running-the-application)
  - [Local Development](#local-development)
  - [Docker Deployment](#docker-deployment)
- [AWS S3 Configuration](#aws-s3-configuration)
- [Application Flow](#application-flow)
- [API Endpoints](#api-endpoints)
- [License](#license)

---

## 🚀 How to Use

This section provides comprehensive instructions for setting up and running the QR Code Generator application.

---

## ✅ Prerequisites

Make sure you have the following installed:

- Java 21 JDK
- Maven
- Docker
- AWS Account with S3 access
- AWS CLI configured with appropriate credentials

---

## 🔐 Environment Variables

Create a `.env` file in the project root with the following variables:

```env
AWS_ACCESS_KEY_ID=your_access_key
AWS_SECRET_ACCESS_KEY=your_secret_key
AWS_REGION=your_region
AWS_BUCKET_NAME=your_bucket_name
     -d '{"text": "https://example.com"}'
