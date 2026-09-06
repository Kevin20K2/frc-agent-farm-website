# FTC Whiteboard Training Video 1

## How an FTC TeleOp Program Works

**Audience:** Beginning middle- and high-school FTC programmers  
**Source program:** `BasicTwoMotorTeleOp.java`  
**Target duration:** 2:00  
**Format:** 1920×1080, 16:9, 30 fps  
**Visual style:** Bright-white whiteboard, thick black marker, green safe-action cues, red warnings

## Learning Objective

By the end of the video, students should be able to describe the four main phases of the program:

1. Identify the OpMode.
2. Connect the Java motor names to configured robot hardware.
3. Initialize safely and wait for PLAY.
4. Repeatedly turn joystick input into motor output and telemetry.

## Two-Column Production Script

| Time | Voiceover | Whiteboard visual prompt |
|---|---|---|
| 0:00–0:09 | How does a joystick movement become a spinning robot wheel? This small Java program completes that entire journey—again and again, many times every second. | Title: **HOW AN FTC TELEOP WORKS**. Hand-drawn gamepad on left, Java code card in center, two-wheel FTC robot on right. Black arrows connect them. Green wheel-motion arrows. |
| 0:09–0:18 | Think of the program as four stations: identify the OpMode, connect the hardware, wait safely for PLAY, and then run the control loop. | Four large numbered stations in a top-to-bottom path: **1 IDENTIFY**, **2 CONNECT**, **3 WAIT**, **4 REPEAT**. Simple icons beside each. |
| 0:18–0:28 | At the top, the package gives the file an address. The imports open the FTC toolbox and bring in LinearOpMode, TeleOp, and DcMotor. | Address label over a file folder marked `teamcode`. Toolbox opens with three labeled tools: `LinearOpMode`, `TeleOp`, `DcMotor`. Keep code lettering large. |
| 0:28–0:38 | The TeleOp annotation gives the program its Driver Station name. The class extends LinearOpMode, which means its instructions run in order through one main method. | Driver Station list highlighting **Basic Two Motor TeleOp**. Arrow to a vertical checklist labeled `runOpMode()`. Green check beside **LinearOpMode**. |
| 0:38–0:47 | Next, the program declares two DcMotor variables: leftMotor and rightMotor. These are Java names—not physical connections yet. | Two empty outlined motor-name tags: `leftMotor` and `rightMotor`. Separate drawing of two unconnected motors. Dotted lines and question marks show “not connected yet.” |
| 0:47–0:58 | HardwareMap makes those connections. The names left underscore motor and right underscore motor must exactly match the names saved in the Robot Configuration. | Robot Configuration panel with `left_motor` and `right_motor`. Solid green cables connect each name to its correct motor. Red X beside misspelled `left motor`. Label: **NAMES MUST MATCH**. |
| 0:58–1:06 | During INIT, telemetry reports that the robot is initialized. Then waitForStart pauses the program until the driver presses PLAY. | Driver Station screen reading **Status: Initialized**. Large pause symbol before a green triangular PLAY button. Robot remains disabled. |
| 1:06–1:14 | Before enabling the robot, place it safely for testing, look around, and make sure everyone is clear. Then call it out loudly. | Robot secured on blocks, wheels off the table. Operator at controls. Two students near the robot. Red disabled-status light. Green eye icon scanning the area. |
| 1:14–1:16 | POWERING ON! | Huge speech bubble: **POWERING ON!** Operator calling toward team. Red sound lines. Tight punch-in composition. |
| 1:16–1:26 | Give everyone time to step behind the safety line before enabling. Never assume someone knows the motors are about to move. | Students step behind a dotted green safety line. Robot status light turns green only after they clear. Label: **STEP CLEAR BEFORE ENABLE**. |
| 1:26–1:37 | After PLAY, the while loop repeats while the OpMode remains active: read the joysticks, set the motor powers, send telemetry, and repeat. | Circular four-step loop with arrows: **READ → SET POWER → TELEMETRY → REPEAT**. Small STOP button breaks the circle. |
| 1:37–1:48 | Each stick supplies a value from about negative one to positive one. FTC joystick Y values are inverted, so the minus sign makes forward stick movement positive power. | Vertical joystick scale: forward `-1.0`, center `0.0`, backward `+1.0`. A bold minus-sign flip arrow produces forward power `+1.0`. Green forward arrow. |
| 1:48–1:56 | SetPower sends those values to the motors. Two sticks forward drive forward; different stick positions let the robot curve or turn. | Split panel: both sticks forward and robot driving straight; second mini-panel with unequal sticks and robot curving. Green motion arrows, no students near robot. |
| 1:56–2:00 | That is the TeleOp cycle: connect, wait, read, move, and report. Build smart. Speak up. Stay safe! | Final card: **CONNECT • WAIT • READ • MOVE • REPORT** and **BUILD SMART • SPEAK UP • STAY SAFE**. Friendly students behind robot, green check mark. Hold for two seconds after narration. |

## ElevenLabs Narration Chunks

Export each chunk as a separate file. Suggested filename order is included.

### `01_hook.mp3`

How does a joystick movement become a spinning robot wheel? This small Java program completes that entire journey—again and again, many times every second.

### `02_four_stations.mp3`

Think of the program as four stations: identify the OpMode, connect the hardware, wait safely for PLAY, and then run the control loop.

### `03_package_imports.mp3`

At the top, the package gives the file an address. The imports open the FTC toolbox and bring in LinearOpMode, TeleOp, and DcMotor.

### `04_annotation_class.mp3`

The TeleOp annotation gives the program its Driver Station name. The class extends LinearOpMode, which means its instructions run in order through one main method.

### `05_declare_motors.mp3`

Next, the program declares two DcMotor variables: leftMotor and rightMotor. These are Java names—not physical connections yet.

### `06_hardware_map.mp3`

HardwareMap makes those connections. The names left underscore motor and right underscore motor must exactly match the names saved in the Robot Configuration.

### `07_initialize_wait.mp3`

During INIT, telemetry reports that the robot is initialized. Then waitForStart pauses the program until the driver presses PLAY.

### `08A_power_setup.mp3`

Before enabling the robot, place it safely for testing, look around, and make sure everyone is clear. Then call it out loudly.

### `08B_powering_on.mp3`

POWERING ON!

### `08C_step_clear.mp3`

Give everyone time to step behind the safety line before enabling. Never assume someone knows the motors are about to move.

### `09_active_loop.mp3`

After PLAY, the while loop repeats while the OpMode remains active: read the joysticks, set the motor powers, send telemetry, and repeat.

### `10_joystick_values.mp3`

Each stick supplies a value from about negative one to positive one. FTC joystick Y values are inverted, so the minus sign makes forward stick movement positive power.

### `11_set_power.mp3`

SetPower sends those values to the motors. Two sticks forward drive forward; different stick positions let the robot curve or turn.

### `12_closing.mp3`

That is the TeleOp cycle: connect, wait, read, move, and report. Build smart. Speak up. Stay safe!

## ElevenLabs Setup

- Voice character: friendly STEM coach or robotics mentor
- Speaking rate: 140 words per minute
- Speed: 0.97×
- Stability: 50%
- Similarity/clarity: 80%
- Style exaggeration: 15%
- Speaker boost: on
- Normal gap between chunks: 0.20–0.30 seconds
- Major-topic gap: approximately 0.40 seconds
- `08B_powering_on.mp3`: deliver louder and more firmly than the normal narration

### Pronunciation Notes

- FTC: “F T C”
- TeleOp: “tell-ee-op”
- LinearOpMode: “linear op mode”
- DcMotor: “D C motor”
- hardwareMap: “hardware map”
- `left_motor`: “left underscore motor”
- `right_motor`: “right underscore motor”
- `waitForStart`: “wait for start”
- `setPower`: “set power”

## CapCut Scene and Timing Plan

| Scene | Timeline | Visual motion | Audio/editing notes |
|---|---|---|---|
| 1 | 0:00–0:09 | Draw gamepad, code card, robot, then animate connecting arrows. | Music begins at 10–12% of narration volume. |
| 2 | 0:09–0:18 | Reveal the four stations one at a time with fast write-on animation. | Pause about 0.25 seconds before the next subject. |
| 3 | 0:18–0:28 | Slide in the address folder; pop toolbox open; reveal three tools. | Emphasize the three FTC class names. |
| 4 | 0:28–0:38 | Highlight the Driver Station selection, then pan to the vertical method checklist. | Slow 3% zoom toward `runOpMode()`. |
| 5 | 0:38–0:47 | Draw two labels first, then motors; leave dotted connections incomplete. | Keep motion restrained so the “not connected” concept is obvious. |
| 6 | 0:47–0:58 | Turn dotted lines into green solid cables. Flash the red X once beside the bad name. | Hold **NAMES MUST MATCH** for at least three seconds. |
| 7 | 0:58–1:06 | Write telemetry status, show pause icon, then pulse the PLAY button without pressing it. | Music dips slightly in preparation for safety sequence. |
| 8A | 1:06–1:14 | Slow pan across the secured robot and nearby students. Operator looks left and right. | Reduce music by about 3 dB. Robot remains visibly disabled. |
| 8B | 1:14–1:16 | Fast punch-in on speech bubble; two-frame scale bounce. | Raise voice 3 dB. Duck music 6 dB. |
| 8C | 1:16–1:26 | Animate students stepping behind the line. Only then change status light from red to green. | Restore music gradually after everyone clears. |
| 9 | 1:26–1:37 | Draw clockwise arrows around the four-step loop. Pulse one step at a time. | Do not rotate the whole graphic; move only the highlight. |
| 10 | 1:37–1:48 | Move a joystick dot up the scale, then animate the minus-sign value flip. | Hold `-1.0 → +1.0` long enough to read on a phone. |
| 11 | 1:48–1:56 | Show both wheels turning, then a curved robot path. | Use simple green wheel and path arrows. |
| 12 | 1:56–2:00 | Write the five action words, then reveal closing safety line. | Fade music gently. Hold final card for two seconds after speech ends. |

## Visual Consistency Master Prompt

Use the following style direction for every generated scene:

> A clean 16:9 educational whiteboard illustration for middle- and high-school FTC robotics students. Bright pure-white background, thick black hand-drawn marker outlines, minimal gray shading, green check marks and safe-motion arrows, red warning marks and danger callouts. Friendly age-appropriate student figures, simple technically recognizable two-wheel FTC robot, large readable hand-lettered labels, generous empty space, uncluttered composition. Match the character design, robot design, line weight, palette, and lettering across every scene. No photorealism, no gradients, no decorative border, no watermark, and no tiny text.

Append the scene-specific visual prompt from the production-script table to this master prompt.

## Teacher Pause Questions

Use these after playing the video:

1. What are the program’s four main stations?
2. When do `leftMotor` and `rightMotor` become connected to physical devices?
3. Why must Robot Configuration names match the Java strings exactly?
4. What does `waitForStart()` do?
5. What four actions repeat inside the control loop?
6. Why does the joystick code contain a minus sign?
7. What must the team do before enabling the robot?

## Final Quality Check

- [ ] Total narration remains close to two minutes at the selected voice speed.
- [ ] All labels are readable on a phone screen.
- [ ] `LinearOpMode`, `TeleOp`, `DcMotor`, and method names are spelled correctly.
- [ ] `left_motor` and `right_motor` include underscores and match the example configuration.
- [ ] Visuals distinguish Java variable names from Robot Configuration names.
- [ ] The robot remains disabled during scene 8A.
- [ ] “POWERING ON!” is louder and easy to hear.
- [ ] Students step clear before the robot status changes to enabled.
- [ ] Joystick inversion is shown as `-1.0 → +1.0` for forward movement.
- [ ] Motor movement is demonstrated with the robot secured or the area clear.
- [ ] Narration and visual actions match in every scene.
- [ ] Music never competes with spoken instruction.
- [ ] Final safety card remains visible for approximately two seconds.

## Technical Notes for the Instructor

- The supplied program uses tank drive: each joystick controls one side independently.
- The outer `if (opModeIsActive())` is redundant because the `while` loop checks the same condition. Leave that simplification for a later refactoring lesson.
- The annotation group says `Iterative Opmode`, but the class extends `LinearOpMode`. The group is only a Driver Station organization label; consider renaming it later to avoid confusing beginners.
- The motor-direction commands are commented out. Confirm physical motor orientation and configure one side as `REVERSE` when needed before a floor test.
