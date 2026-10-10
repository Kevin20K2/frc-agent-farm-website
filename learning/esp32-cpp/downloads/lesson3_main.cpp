#include <iostream>

using namespace std;

int main() {
    int batteryPercent = 0;

    cout << "Enter battery percent: ";
    cin >> batteryPercent;

    if (batteryPercent >= 50) {
        cout << "Battery check passed." << endl;
    } else {
        cout << "Charge the battery before driving." << endl;
    }

    return 0;
}
