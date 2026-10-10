void setup() {
    Serial.begin(115200);
    delay(1000);

    Serial.println("Hello, ESP32!");
    Serial.println("Setup runs once.");
}

void loop() {
    Serial.println("Loop is running.");
    delay(1000);
}
