# FTC Whiteboard Training Video 3

## INIT, Telemetry, and waitForStart()

**Audience:** Beginning middle- and high-school FTC programmers  
**Source program:** `BasicTwoMotorTeleOp.java`  
**Target duration:** 2:00  
**Format:** 1920×1080, 16:9, 30 fps  
**Visual style:** Bright-white whiteboard, thick black marker, green safe-action cues, red warnings

## Learning Objective

By the end of this lesson, students should be able to:

1. Describe what happens when INIT is pressed.
2. Explain the difference between `telemetry.addData()` and `telemetry.update()`.
3. Explain how `waitForStart()` pauses a `LinearOpMode`.
4. Describe what PLAY and STOP do to the OpMode.
5. Follow the team’s POWERING ON procedure before enabling the robot.

## Two-Column Production Script

| Time | Voiceover | Whiteboard visual prompt |
|---|---|---|
| 0:00–0:08 | On the FTC Driver Station, INIT, PLAY, and STOP are three different commands. Your Java program responds differently to each one. | Title: **INIT • PLAY • STOP**. Driver Station with three large buttons. Code card and disabled two-wheel FTC robot below. |
| 0:08–0:17 | When the driver selects this OpMode and presses INIT, the Robot Controller begins runOpMode and starts following its instructions from the top. | Finger presses **INIT**. Green marker path enters exact label `runOpMode()` and travels downward through a vertical code roadmap. |
| 0:17–0:27 | First, the program uses hardwareMap to connect leftMotor and rightMotor to their configured devices. If a name is wrong, initialization stops with an error. | Exact labels `leftMotor → left_motor` and `rightMotor → right_motor` connect to two motors. Misspelled name hits a red error barrier. |
| 0:27–0:37 | Next, telemetry dot addData prepares a message with the label Status and the value Initialized. Think of it as writing a note. | Large exact code `telemetry.addData("Status", "Initialized");`. Hand writes a note: **Status: Initialized**. Arrow stops at an outbox. |
| 0:37–0:46 | But the message is not sent until telemetry dot update runs. Update pushes the latest information to the Driver Station screen. | Exact code `telemetry.update();`. Green SEND arrow moves note from outbox to Driver Station display reading **Status: Initialized**. |
| 0:46–0:55 | Initialized means setup finished successfully. It does not mean the driving loop is running. The motors are still waiting for PLAY. | Green check beside **SETUP COMPLETE**. Robot marked **DISABLED**. Closed gate labeled **WAITING FOR PLAY** blocks path to wheel-motion icon. |
| 0:55–1:05 | WaitForStart is that gate. In a LinearOpMode, the method pauses here until PLAY is pressed—or until the OpMode is stopped. | Exact code `waitForStart();` becomes a closed gate. Hourglass waits between INIT side and PLAY side. Red STOP exit branches away. |
| 1:05–1:13 | Before enabling, secure the robot for testing, look around, and make sure every student and mentor is clear. Then call it out loudly. | Robot secured on blocks, wheels off surface. Operator scans the area. Students nearby. Robot visibly **DISABLED**. |
| 1:13–1:15 | POWERING ON! | Tight close-up of operator calling **POWERING ON!** in a huge speech bubble with red sound lines. |
| 1:15–1:24 | Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY. | Students move behind dotted green safety line. PLAY button remains untouched until everyone clears. Label: **STEP CLEAR BEFORE ENABLE**. |
| 1:24–1:34 | Pressing PLAY opens the waitForStart gate. The program continues to the next line and checks whether the OpMode is active. | Finger presses PLAY. Gate opens. Green code path advances from `waitForStart();` to `opModeIsActive()`. Robot status changes to **ACTIVE**. |
| 1:34–1:44 | If active is true, the program enters the control loop. It can now read the gamepads, command the motors, and send new telemetry repeatedly. | Green TRUE branch enters circular loop: **READ GAMEPAD → SET POWER → TELEMETRY → REPEAT**. Wheels turn with green arrows. |
| 1:44–1:53 | When STOP is pressed, opModeIsActive becomes false. The loop ends, and the FTC system stops the OpMode and its motors. | Finger presses red STOP. TRUE changes to red **FALSE**. Loop arrow breaks; wheel arrows disappear; robot returns to **DISABLED**. |
| 1:53–2:00 | Remember the sequence: INIT prepares, telemetry reports, waitForStart pauses, PLAY runs, and STOP ends. Build smart. Speak up. Stay safe! | Final five-step card: **INIT = PREPARE • TELEMETRY = REPORT • WAIT • PLAY = RUN • STOP = END**. Team behind robot with green check. |

## ElevenLabs Narration Chunks

Generate and export one audio file per scene.

### `01_init_play_stop.mp3`

On the FTC Driver Station, INIT, PLAY, and STOP are three different commands. Your Java program responds differently to each one.

### `02_init_run_opmode.mp3`

When the driver selects this OpMode and presses INIT, the Robot Controller begins runOpMode and starts following its instructions from the top.

### `03_map_hardware.mp3`

First, the program uses hardwareMap to connect leftMotor and rightMotor to their configured devices. If a name is wrong, initialization stops with an error.

### `04_add_data.mp3`

Next, telemetry dot addData prepares a message with the label Status and the value Initialized. Think of it as writing a note.

### `05_update.mp3`

But the message is not sent until telemetry dot update runs. Update pushes the latest information to the Driver Station screen.

### `06_initialized_not_active.mp3`

Initialized means setup finished successfully. It does not mean the driving loop is running. The motors are still waiting for PLAY.

### `07_wait_for_start.mp3`

WaitForStart is that gate. In a LinearOpMode, the method pauses here until PLAY is pressed—or until the OpMode is stopped.

### `08A_power_setup.mp3`

Before enabling, secure the robot for testing, look around, and make sure every student and mentor is clear. Then call it out loudly.

### `08B_powering_on.mp3`

POWERING ON!

### `08C_step_clear.mp3`

Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY.

### `09_play_opmode_active.mp3`

Pressing PLAY opens the waitForStart gate. The program continues to the next line and checks whether the OpMode is active.

### `10_enter_loop.mp3`

If active is true, the program enters the control loop. It can now read the gamepads, command the motors, and send new telemetry repeatedly.

### `11_stop.mp3`

When STOP is pressed, opModeIsActive becomes false. The loop ends, and the FTC system stops the OpMode and its motors.

### `12_closing.mp3`

Remember the sequence: INIT prepares, telemetry reports, waitForStart pauses, PLAY runs, and STOP ends. Build smart. Speak up. Stay safe!

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
- `08B_powering_on.mp3`: approximately 3 dB louder than normal narration

### Pronunciation Notes

- FTC: “F T C”
- Java: “jah-vuh”
- OpMode: “op mode”
- LinearOpMode: “linear op mode”
- `runOpMode`: “run op mode”
- hardwareMap: “hardware map”
- `leftMotor`: “left motor”
- `rightMotor`: “right motor”
- telemetry: “tuh-lem-uh-tree”
- `addData`: “add data”
- `update`: “update”
- `waitForStart`: “wait for start”
- `opModeIsActive`: “op mode is active”

## CapCut Scene and Timing Plan

| Scene | Timeline | Visual motion | Audio/editing notes |
|---|---|---|---|
| 1 | 0:00–0:08 | Draw Driver Station and pulse INIT, PLAY, and STOP once each. | Begin music at 10–12% of narration volume. |
| 2 | 0:08–0:17 | Finger presses INIT; green line draws down into `runOpMode()`. | Use a smooth write-on code-path animation. |
| 3 | 0:17–0:27 | Connect both variable names to configuration names and motors; stop bad name at barrier. | Flash the red error barrier once. |
| 4 | 0:27–0:37 | Write exact code, then animate handwritten status note into outbox. | Hold code long enough for students to read it. |
| 5 | 0:37–0:46 | Reveal `update()`, then move note to Driver Station with green arrow. | Add a quiet send sound if desired. |
| 6 | 0:46–0:55 | Reveal setup check, disabled robot, and closed PLAY gate in sequence. | Emphasize **SETUP COMPLETE ≠ DRIVING**. |
| 7 | 0:55–1:05 | Transform `waitForStart()` into a gate; animate hourglass; reveal STOP exit. | Pause about 0.3 seconds before safety sequence. |
| 8A | 1:05–1:13 | Pan across blocks, raised wheels, disabled label, and scanning operator. | Lower music approximately 3 dB. |
| 8B | 1:13–1:15 | Fast punch-in on speech bubble with brief scale bounce. | Raise voice 3 dB; duck music 6 dB. |
| 8C | 1:15–1:24 | Move students behind line; keep PLAY untouched until the final beat. | Restore music only after the area is clear. |
| 9 | 1:24–1:34 | Press PLAY, open gate, move green path to `opModeIsActive()`, then show ACTIVE. | Use a clean gate-opening sound at low volume. |
| 10 | 1:34–1:44 | Follow TRUE branch into loop and pulse each loop step clockwise. | Rotate only the highlight, not the whole diagram. |
| 11 | 1:44–1:53 | Press STOP, turn TRUE to FALSE, break loop arrow, stop wheels, show DISABLED. | Briefly duck music under STOP explanation. |
| 12 | 1:53–2:00 | Reveal the five-step recap from left to right, then closing safety line. | Fade music; hold final frame for two seconds. |

## Master Visual Prompt

> A clean 16:9 educational whiteboard illustration for middle- and high-school FTC robotics students, matching Videos 1 and 2 exactly. Bright pure-white background, thick black hand-drawn marker outlines, minimal gray shading, green safe-action cues and active-state arrows, red warnings, stop cues, and disabled-state marks. Reuse the same friendly student characters, Driver Station style, and recognizable two-wheel FTC robot. Use large readable hand-lettered labels, generous empty space, and uncluttered composition. No photorealism, gradients, decorative borders, watermark, tiny text, or unsafe behavior.

Append the scene-specific visual prompt from the production-script table.

## Teacher Pause Questions

1. What causes `runOpMode()` to begin executing?
2. What setup work happens before `waitForStart()`?
3. What is the difference between `telemetry.addData()` and `telemetry.update()`?
4. Does “Initialized” mean the driving loop is already running?
5. What does `waitForStart()` wait for?
6. What changes after PLAY is pressed?
7. What happens to `opModeIsActive()` after STOP?

## Hands-On Student Activity

1. Secure the robot on blocks and keep it disabled.
2. Select `Basic Two Motor TeleOp` on the Driver Station.
3. Press INIT and locate **Status: Initialized** in telemetry.
4. Confirm the motors do not respond to the sticks before PLAY.
5. Point to the line where the program is waiting.
6. Follow the POWERING ON and step-clear procedure.
7. Press PLAY and gently move one stick.
8. Press STOP and confirm the motor stops and the OpMode ends.

## Final Quality Check

- [ ] Narration remains close to two minutes at the selected voice speed.
- [ ] INIT, PLAY, and STOP are visually distinct.
- [ ] Visual order matches the supplied `LinearOpMode` code.
- [ ] Hardware mapping occurs before the initialized telemetry message.
- [ ] `telemetry.addData("Status", "Initialized");` is accurate.
- [ ] `telemetry.update();` is accurate.
- [ ] Visuals show `addData()` preparing data and `update()` sending it.
- [ ] “Initialized” is not portrayed as an active driving state.
- [ ] `waitForStart();` is shown as a pause before PLAY.
- [ ] STOP is shown as an alternate release from waiting.
- [ ] Robot is secured with wheels off the surface during the test.
- [ ] Robot remains disabled through the setup and clearance scenes.
- [ ] “POWERING ON!” is isolated, louder, and easy to hear.
- [ ] PLAY is pressed only after everyone clears.
- [ ] STOP changes `opModeIsActive()` to false and ends the loop.
- [ ] Final card remains visible for approximately two seconds.

## Technical Notes for the Instructor

- In a `LinearOpMode`, the SDK invokes `runOpMode()` during the initialization phase, and execution proceeds until it reaches `waitForStart()`.
- `waitForStart()` blocks until the OpMode starts or a stop is requested.
- `telemetry.addData()` adds an item to the telemetry packet; `telemetry.update()` transmits the current telemetry to the Driver Station.
- The program’s initialized message confirms that the preceding code ran; it does not prove every mechanism is physically safe or correctly oriented.
- After START, the supplied outer `if (opModeIsActive())` checks that the OpMode is still active before entering the loop.
- When STOP is requested, `opModeIsActive()` becomes false and the loop exits. The FTC runtime also disables hardware outputs when the OpMode stops.
