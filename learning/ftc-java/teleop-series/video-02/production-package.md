# FTC Whiteboard Training Video 2

## Meet the Motors: From Java Names to Real Hardware

**Audience:** Beginning middle- and high-school FTC programmers  
**Source program:** `BasicTwoMotorTeleOp.java`  
**Target duration:** 2:00  
**Format:** 1920×1080, 16:9, 30 fps  
**Visual style:** Bright-white whiteboard, thick black marker, green safe-action cues, red warnings

## Learning Objective

By the end of this lesson, students should be able to:

1. Explain the difference between declaring a motor and mapping a motor.
2. Identify the Java variable names and Robot Configuration names.
3. Explain the two arguments in `hardwareMap.get()`.
4. Recognize a configuration-name mismatch.
5. Perform a safe first motor-direction test.

## Two-Column Production Script

| Time | Voiceover | Whiteboard visual prompt |
|---|---|---|
| 0:00–0:08 | Your robot has real motors, but Java cannot control them until the program knows exactly which motor is which. Let’s make that connection. | Title: **MEET THE MOTORS**. Two physical motors on a robot at right; Java code card at left; broken dotted connection between them. |
| 0:08–0:17 | First, these two lines declare leftMotor and rightMotor. A variable is a labeled place where the program can remember a hardware object. | Large exact code: `private DcMotor leftMotor;` and `private DcMotor rightMotor;`. Draw two empty labeled storage boxes. |
| 0:17–0:25 | DcMotor tells Java what kind of object belongs there. LeftMotor and rightMotor are the variable names we chose. | Highlight `DcMotor` in green with label **TYPE**. Highlight `leftMotor` and `rightMotor` in blue with label **VARIABLE NAMES**. |
| 0:25–0:34 | But declaring a variable does not connect it to a physical motor. Right now, we have two name tags with nothing attached. | Two large name tags, `leftMotor` and `rightMotor`, floating above two unplugged motors. Red label: **NOT CONNECTED YET**. |
| 0:34–0:45 | HardwareMap creates the connection. Think of it as the Robot Controller’s directory: the code asks the directory to find a specific configured device. | Hand-drawn directory book labeled `hardwareMap`. Java name tag asks the directory; arrow points toward Robot Configuration and motor. |
| 0:45–0:56 | Inside get, DcMotor dot class says what type of device to find. The quoted text says which configured name to find. | Enlarge `hardwareMap.get(DcMotor.class, "left_motor")`. Bracket `DcMotor.class` as **DEVICE TYPE** and `"left_motor"` as **CONFIGURATION NAME**. |
| 0:56–1:06 | That name must exactly match the Robot Configuration—including every letter, underscore, and capital. Left underscore motor is different from left space motor. | Side-by-side comparison: green `left_motor = left_motor`; red `left_motor ≠ left motor`. Large label: **EXACT MATCH REQUIRED**. |
| 1:06–1:15 | If the name is wrong, initialization stops with an error before the robot can drive. Check the configuration and the spelling in the code. | Driver Station error card: **Unable to find: left_motor**. Magnifying glass compares code and configuration. Red X changes to green check. |
| 1:15–1:23 | Motors mounted on opposite sides often face opposite directions. One side may need to be reversed so both wheels move the robot forward. | Top view of two mirrored drivetrain motors. Same forward command; first example spins, then reverse one side and both green arrows point forward. |
| 1:23–1:31 | Before testing, secure the robot on blocks with its wheels off the surface. Look around and make sure everyone is clear. | Robot securely on blocks, wheels raised. Operator scans area. Students near robot. Robot status marked **DISABLED** in red. |
| 1:31–1:33 | POWERING ON! | Close-up of operator calling **POWERING ON!** in a large speech bubble with red sound lines. |
| 1:33–1:42 | Give everyone time to step behind the safety line. Only then enable the robot and begin the motor test. | Students step behind dotted green safety line. Robot remains disabled during movement; status turns green only after everyone clears. Label: **STEP CLEAR BEFORE ENABLE**. |
| 1:42–1:52 | Move the sticks gently and watch each wheel. If one wheel turns backward, stop, disable, and correct that motor’s direction in the code. | Gentle joystick movement. One green wheel arrow forward, one red arrow backward. STOP and DISABLE icons before code correction to `Direction.REVERSE`. |
| 1:52–2:00 | Declare creates the Java name. HardwareMap connects it to the configured motor. Match the names, test safely, and your code controls real hardware! | Final equation: **DECLARE = NAME** plus **HARDWARE MAP = CONNECTION**. Green line joins code to both motors. Closing: **MATCH • CHECK • TEST SAFELY**. |

## ElevenLabs Narration Chunks

Generate and export one file per scene.

### `01_motor_hook.mp3`

Your robot has real motors, but Java cannot control them until the program knows exactly which motor is which. Let’s make that connection.

### `02_declare_variables.mp3`

First, these two lines declare leftMotor and rightMotor. A variable is a labeled place where the program can remember a hardware object.

### `03_type_and_name.mp3`

DcMotor tells Java what kind of object belongs there. LeftMotor and rightMotor are the variable names we chose.

### `04_not_connected.mp3`

But declaring a variable does not connect it to a physical motor. Right now, we have two name tags with nothing attached.

### `05_hardware_map_directory.mp3`

HardwareMap creates the connection. Think of it as the Robot Controller’s directory: the code asks the directory to find a specific configured device.

### `06_get_arguments.mp3`

Inside get, DcMotor dot class says what type of device to find. The quoted text says which configured name to find.

### `07_exact_match.mp3`

That name must exactly match the Robot Configuration—including every letter, underscore, and capital. Left underscore motor is different from left space motor.

### `08_name_error.mp3`

If the name is wrong, initialization stops with an error before the robot can drive. Check the configuration and the spelling in the code.

### `09_motor_direction.mp3`

Motors mounted on opposite sides often face opposite directions. One side may need to be reversed so both wheels move the robot forward.

### `10A_power_setup.mp3`

Before testing, secure the robot on blocks with its wheels off the surface. Look around and make sure everyone is clear.

### `10B_powering_on.mp3`

POWERING ON!

### `10C_step_clear.mp3`

Give everyone time to step behind the safety line. Only then enable the robot and begin the motor test.

### `11_direction_test.mp3`

Move the sticks gently and watch each wheel. If one wheel turns backward, stop, disable, and correct that motor’s direction in the code.

### `12_closing.mp3`

Declare creates the Java name. HardwareMap connects it to the configured motor. Match the names, test safely, and your code controls real hardware!

## ElevenLabs Setup

- Voice: friendly STEM coach or robotics mentor
- Speaking rate: approximately 140 words per minute
- Speed: 0.97×
- Stability: 50%
- Similarity/clarity: 80%
- Style exaggeration: 15%
- Speaker boost: on
- Normal gap between clips: 0.20–0.30 seconds
- Major-topic gap: approximately 0.40 seconds
- `10B_powering_on.mp3`: approximately 3 dB louder than normal narration

### Pronunciation Notes

- Java: “jah-vuh”
- FTC: “F T C”
- DcMotor: “D C motor”
- hardwareMap: “hardware map”
- `DcMotor.class`: “D C motor dot class”
- `leftMotor`: “left motor”
- `rightMotor`: “right motor”
- `left_motor`: “left underscore motor”
- `right_motor`: “right underscore motor”
- `Direction.REVERSE`: “direction dot reverse”

## CapCut Scene and Timing Plan

| Scene | Timeline | Visual motion | Audio/editing notes |
|---|---|---|---|
| 1 | 0:00–0:08 | Draw motors and code card; let dotted connection search but not connect. | Begin light music at 10–12% of narration volume. |
| 2 | 0:08–0:17 | Write the two exact declaration lines; draw labeled boxes beneath them. | Highlight each declaration as it is spoken. |
| 3 | 0:17–0:25 | Green underline under `DcMotor`; blue circles around variable names. | Slow 3% punch-in on the code. |
| 4 | 0:25–0:34 | Drop name tags toward motors, then stop them before contact. | Brief red write-on for **NOT CONNECTED YET**. |
| 5 | 0:34–0:45 | Open directory book; animate request arrow through configuration to motor. | Use a smooth arrow movement, not a flashy transition. |
| 6 | 0:45–0:56 | Reveal the method call, then draw the two explanatory brackets. | Hold exact code for the full narration clip. |
| 7 | 0:56–1:06 | Show correct green equality, followed by incorrect red comparison. | Pulse the underscore once. |
| 8 | 1:06–1:15 | Show error card; move magnifier between both spellings; replace X with check. | Optional soft error tone at very low volume. |
| 9 | 1:15–1:23 | Rotate wheel arrows in opposite directions, then flip one arrow after `REVERSE`. | Keep student hands away from the robot. |
| 10A | 1:23–1:31 | Pan across blocks, raised wheels, disabled label, and scanning operator. | Lower music approximately 3 dB. |
| 10B | 1:31–1:33 | Fast punch-in on speech bubble with a brief scale bounce. | Raise voice 3 dB; duck music 6 dB. |
| 10C | 1:33–1:42 | Move students behind line; change status to enabled only after they clear. | Restore music gradually after the clearance. |
| 11 | 1:42–1:52 | Move sticks slightly; show wrong wheel; animate STOP, DISABLE, then code fix. | Make the stop-before-adjusting order visually unmistakable. |
| 12 | 1:52–2:00 | Build final equation and connect green line from code to motors. | Hold final card two seconds after narration ends. |

## Master Visual Prompt

> A clean 16:9 educational whiteboard illustration for middle- and high-school FTC robotics students, matching Video 1 exactly. Bright pure-white background, thick black hand-drawn marker outlines, minimal gray shading, green safe-action cues and arrows, red warnings and incorrect examples. Reuse the same friendly student characters and recognizable two-wheel FTC robot. Use large readable hand-lettered labels, generous empty space, and uncluttered composition. No photorealism, gradients, decorative borders, watermark, tiny text, or unsafe behavior.

Append the scene-specific visual prompt from the production-script table.

## Teacher Pause Questions

1. What does declaring a variable accomplish?
2. Does declaring `leftMotor` connect it to a physical motor?
3. What job does `hardwareMap` perform?
4. What are the two important arguments inside `hardwareMap.get()`?
5. Why must `left_motor` include the underscore?
6. Why might one drivetrain motor need to be reversed?
7. What is the safe sequence for the first direction test?

## Hands-On Student Activity

1. With the robot disabled, locate the motor names in the Robot Configuration.
2. Compare them character-by-character with the strings in the program.
3. Predict what error a misspelled name would cause.
4. Secure the robot on blocks with the wheels clear.
5. Follow the POWERING ON procedure.
6. Move each joystick gently and record the direction of each wheel.
7. Press STOP and disable before discussing or changing motor direction.

## Final Quality Check

- [ ] Narration remains close to two minutes at the chosen voice speed.
- [ ] Both declaration lines are accurate and readable.
- [ ] Java variable names appear as `leftMotor` and `rightMotor`.
- [ ] Robot Configuration names appear as `left_motor` and `right_motor`.
- [ ] Visuals clearly distinguish variable names from configuration strings.
- [ ] `DcMotor.class` is identified as the device type.
- [ ] The incorrect `left motor` example has no underscore and is marked wrong.
- [ ] Motor direction is presented as dependent on physical mounting.
- [ ] Robot wheels are off the surface during the first test.
- [ ] The robot is visibly disabled during the setup and clearance scenes.
- [ ] “POWERING ON!” is isolated, louder, and easy to hear.
- [ ] Students clear the robot before it becomes enabled.
- [ ] The direction-test scene shows STOP and DISABLE before any correction.
- [ ] Music never competes with narration.
- [ ] Final frame remains visible for approximately two seconds.

## Technical Notes for the Instructor

- `private DcMotor leftMotor;` declares a field; it does not instantiate or map a motor.
- `hardwareMap.get(DcMotor.class, "left_motor")` returns the configured `DcMotor` associated with that exact configuration name.
- FTC configuration names are case-sensitive strings and should be treated as exact identifiers.
- The supplied direction lines are commented out and have no effect until the leading `//` is removed.
- Which motor should be reversed depends on motor mounting, gearing, and the team’s forward-direction convention; do not teach that the right motor is universally the reversed side.
- Stop and disable the OpMode before students touch the drivetrain or change physical connections.
