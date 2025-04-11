#!/bin/bash

echo "Starting PostgreSQL service..."
sudo systemctl start postgresql
echo "PostgreSQL status:"
sudo systemctl status postgresql

echo ""
echo "--- Step 2: Run Spring Boot Project ---"
echo "Navigating to project directory..."
cd demo 
echo "Running Spring Boot application with Maven..."
mvn spring-boot:run
