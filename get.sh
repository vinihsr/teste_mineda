#!/bin/bash

POST_URL="http://localhost:8080/livro" 

curl -X GET \
     -H "Content-Type: application/json" \
     "$POST_URL"

echo ""
echo "--- Testing complete. Remember to stop your Spring Boot application in its terminal (Ctrl+C). ---"