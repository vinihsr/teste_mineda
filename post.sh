#!/bin/bash

POST_URL="http://localhost:8080/trabalho" 

JSON_BODY='{
  "titulo": "Curl Test",
  "descricao": "Testing POST with curl",
  "grupo": "TestGroup",
  "nota": 7,
  "justificativa": "Sent from curl"
}'

echo ""
echo "--- Step 3: Sending POST request with curl ---"
echo "URL: $POST_URL"
echo "Body: $JSON_BODY"

curl -X POST \
     -H "Content-Type: application/json" \
     -d "$JSON_BODY" \
     "$POST_URL"

echo ""
echo "--- Testing complete. Remember to stop your Spring Boot application in its terminal (Ctrl+C). ---"