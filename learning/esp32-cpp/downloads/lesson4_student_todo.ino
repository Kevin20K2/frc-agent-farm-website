void setup() {
    Serial.begin(115200);
    delay(1000);

    // TODO: Print a greeting that includes your team number.
    Serial.println("Hello, ESP32!");
}

void loop() {
    // TODO: Print a short status message once per second.
    Serial.println("Loop is running.");
    delay(1000);
}
