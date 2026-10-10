# FTC Whiteboard Training Video 4

## The Active Loop: Check, Repeat, Respond

**Audience:** Beginning middle- and high-school FTC programmers  
**Source program:** `BasicTwoMotorTeleOp.java`  
**Target duration:** 2:00  
**Format:** 1920×1080, 16:9, 30 fps  
**Visual style:** Bright-white whiteboard, thick black marker, green safe-action cues, red warnings

## Learning Objective

By the end of this lesson, students should be able to:

1. Explain what `opModeIsActive()` checks.
2. Describe the difference between the outer `if` and inner `while`.
3. Identify the statements inside the loop body.
4. Trace one complete loop cycle.
5. Explain why repeated input readings make the robot responsive.

## Two-Column Production Script

| Time | Voiceover | Whiteboard visual prompt |
|---|---|---|
| 0:00–0:08 | A TeleOp robot must keep listening. One joystick reading would give one command, but a control loop lets the robot respond continuously. This repeating conversation is the heartbeat of TeleOp. | Title: **THE ACTIVE LOOP**. One frozen gamepad reading with red X versus circular green gamepad-to-robot arrows. |
| 0:08–0:17 | After PLAY releases waitForStart, this program asks: is the OpMode still active? That question returns either true or false. | Code path leaves `waitForStart();` and reaches exact condition `opModeIsActive()`. Split into green **TRUE** and red **FALSE** branches. |
| 0:17–0:26 | The outer if is a one-time gate. If the answer is true, execution enters the block containing the while loop. | Exact code `if (opModeIsActive()) {` becomes one green gate. Label: **CHECK ONCE BEFORE ENTERING**. Red false branch goes around the block. |
| 0:26–0:36 | While asks the same question before every cycle. As long as active remains true, everything inside its braces runs again. | Exact code `while (opModeIsActive()) {` inside a circular green arrow. Repeated TRUE cards feed the circle. Label: **CHECK BEFORE EVERY CYCLE**. |
| 0:36–0:45 | The opening and closing braces mark the loop body. Only the instructions between those braces repeat. Code outside the braces runs at a different time. | Large pair of braces surrounds three cards: **READ STICKS**, **SET MOTOR POWER**, **UPDATE TELEMETRY**. Outside code is gray and does not loop. |
| 0:45–0:55 | First, the loop reads the latest left and right joystick positions and stores them as leftPower and rightPower. | Gamepad sticks point to exact variables `leftPower` and `rightPower`. Two gauges show changing values from `-1.0` to `+1.0`. |
| 0:55–1:05 | Next, setPower sends those latest values to the two motors. Then telemetry sends the same power values to the Driver Station. | Green arrows: variables to `leftMotor.setPower(leftPower)` and `rightMotor.setPower(rightPower)`, then to Driver Station telemetry gauges. |
| 1:05–1:13 | Before running a live control loop, secure the robot on blocks, check the area, and make sure everyone is clear. | Robot secured on blocks, wheels off surface. Operator scans the area. Students nearby. Robot clearly **DISABLED**. |
| 1:13–1:15 | POWERING ON! | Tight close-up of operator calling **POWERING ON!** in a huge speech bubble with red sound lines. |
| 1:15–1:24 | Give everyone time to step behind the safety line. Only after they clear should the driver press PLAY. | Students step behind dotted green safety line. PLAY remains untouched until everyone clears. Label: **STEP CLEAR BEFORE ENABLE**. |
| 1:24–1:34 | Now watch one cycle: read the sticks, set both motor powers, update telemetry, and return to the while condition. | Numbered loop steps: **1 READ**, **2 SET POWER**, **3 TELEMETRY**, **4 CHECK AGAIN**. Bright green dot travels through one full circuit. |
| 1:34–1:44 | The loop runs repeatedly, using fresh joystick values each time. That is why changing the sticks quickly changes the robot’s motion. Even small changes are noticed on the next trip around. | Three successive gamepad positions produce straight, curve, and stop robot poses. Clock with fast repeated green arrows. |
| 1:44–1:53 | Pressing STOP makes opModeIsActive return false. The while loop exits, the repeated commands end, and the robot is disabled. | Driver presses red STOP. Condition changes **TRUE → FALSE**. Green loop breaks; wheels stop; robot label changes to **DISABLED**. |
| 1:53–2:00 | Check, read, command, report, and repeat. That is the heartbeat of TeleOp. Build smart. Speak up. Stay safe! | Final heartbeat-shaped loop: **CHECK • READ • COMMAND • REPORT • REPEAT**. Team behind robot with green check and safety closing. |

## ElevenLabs Narration Chunks

Generate and export one audio file per scene.

### `01_loop_hook.mp3`

A TeleOp robot must keep listening. One joystick reading would give one command, but a control loop lets the robot respond continuously. This repeating conversation is the heartbeat of TeleOp.

### `02_active_question.mp3`

After PLAY releases waitForStart, this program asks: is the OpMode still active? That question returns either true or false.

### `03_if_gate.mp3`

The outer if is a one-time gate. If the answer is true, execution enters the block containing the while loop.

### `04_while_repeats.mp3`

While asks the same question before every cycle. As long as active remains true, everything inside its braces runs again.

### `05_loop_body.mp3`

The opening and closing braces mark the loop body. Only the instructions between those braces repeat. Code outside the braces runs at a different time.

### `06_read_sticks.mp3`

First, the loop reads the latest left and right joystick positions and stores them as leftPower and rightPower.

### `07_power_and_telemetry.mp3`

Next, setPower sends those latest values to the two motors. Then telemetry sends the same power values to the Driver Station.

### `08A_power_setup.mp3`

Before running a live control loop, secure the robot on blocks, check the area, and make sure everyone is clear.

### `08B_powering_on.mp3`

POWERING ON!

### `08C_step_clear.mp3`

Give everyone time to step behind the safety line. Only after they clear should the driver press PLAY.

### `09_one_cycle.mp3`

Now watch one cycle: read the sticks, set both motor powers, update telemetry, and return to the while condition.

### `10_fresh_values.mp3`

The loop runs repeatedly, using fresh joystick values each time. That is why changing the sticks quickly changes the robot’s motion. Even small changes are noticed on the next trip around.

### `11_stop_loop.mp3`

Pressing STOP makes opModeIsActive return false. The while loop exits, the repeated commands end, and the robot is disabled.

### `12_closing.mp3`

Check, read, command, report, and repeat. That is the heartbeat of TeleOp. Build smart. Speak up. Stay safe!

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
- TeleOp: “tell-ee-op”
- OpMode: “op mode”
- `opModeIsActive`: “op mode is active”
- `waitForStart`: “wait for start”
- `leftPower`: “left power”
- `rightPower`: “right power”
- `setPower`: “set power”
- telemetry: “tuh-lem-uh-tree”

## CapCut Scene and Timing Plan

| Scene | Timeline | Visual motion | Audio/editing notes |
|---|---|---|---|
| 1 | 0:00–0:08 | Freeze one red-X command, then draw the continuous green circle. | Begin light music at 10–12% of narration volume. |
| 2 | 0:08–0:17 | Move code path from `waitForStart()` to condition; reveal TRUE and FALSE. | Hold both outcomes long enough to read. |
| 3 | 0:17–0:26 | Draw one gate and let green TRUE arrow pass through once. | Briefly pause arrow at the condition. |
| 4 | 0:26–0:36 | Wrap `while` in circular arrow; pulse TRUE on three passes. | Keep animation smooth and instructional. |
| 5 | 0:36–0:45 | Draw braces, then reveal the three enclosed instruction cards. | Gray out anything beyond the braces. |
| 6 | 0:45–0:55 | Move both sticks and animate values into the two variables. | Keep numeric values large and readable. |
| 7 | 0:55–1:05 | Follow arrows from variables to motors, then to telemetry display. | Use green write-on arrows. |
| 8A | 1:05–1:13 | Pan across blocks, raised wheels, disabled label, and scanning operator. | Lower music approximately 3 dB. |
| 8B | 1:13–1:15 | Fast punch-in on speech bubble with brief scale bounce. | Raise voice 3 dB; duck music 6 dB. |
| 8C | 1:15–1:24 | Move students behind line; press PLAY only on the final beat. | Restore music after the area is clear. |
| 9 | 1:24–1:34 | Move green dot through the four numbered steps once. | Match dot position to narrated action. |
| 10 | 1:34–1:44 | Cycle through straight, curve, and stop in three quick beats. | Avoid making the robot appear near students. |
| 11 | 1:44–1:53 | Press STOP, change TRUE to FALSE, break loop, stop wheels. | Brief music dip under STOP explanation. |
| 12 | 1:53–2:00 | Draw heartbeat loop, then reveal closing safety line. | Fade music and hold final frame for two seconds. |

## Master Visual Prompt

> A clean 16:9 educational whiteboard illustration for middle- and high-school FTC robotics students, matching Videos 1 through 3 exactly. Bright pure-white background, thick black hand-drawn marker outlines, minimal gray shading, green active-loop and safe-action arrows, red false, stop, warning, and disabled cues. Reuse the same friendly student characters, Driver Station style, gamepad, and recognizable two-wheel FTC robot. Use large readable hand-lettered labels, generous empty space, and uncluttered composition. No photorealism, gradients, decorative borders, watermark, tiny text, or unsafe behavior.

Append the scene-specific visual prompt from the production-script table.

## Teacher Pause Questions

1. What two values can `opModeIsActive()` return?
2. How often does the outer `if` perform its check?
3. How often does the `while` condition perform its check?
4. What do the braces identify?
5. What three major jobs happen inside each loop cycle?
6. Why does the loop read the joysticks again every cycle?
7. What causes the loop to exit?

## Hands-On Student Activity

1. Print or display the code and have students outline the `while` loop’s braces.
2. Assign four students the roles CHECK, READ, COMMAND, and REPORT.
3. Pass a “program token” from one role to the next to simulate one loop cycle.
4. Repeat with different joystick-value cards for forward, turn, and stop.
5. Hold up TRUE after each cycle to continue.
6. Hold up FALSE to simulate STOP and end the loop.
7. Transfer the activity to the secured robot using the POWERING ON procedure.

## Final Quality Check

- [ ] Narration remains close to two minutes at the chosen voice speed.
- [ ] `opModeIsActive()` is spelled correctly throughout.
- [ ] TRUE and FALSE outcomes are visually distinct.
- [ ] The outer `if` is shown as a one-time gate.
- [ ] The `while` condition is shown checking before every cycle.
- [ ] Braces clearly identify the repeating loop body.
- [ ] The visual loop order is read, set motor power, telemetry, then check again.
- [ ] `leftPower` and `rightPower` are connected to the correct motor commands.
- [ ] Repeated joystick readings are shown using fresh values.
- [ ] Robot is secured with wheels off the surface during the first test.
- [ ] Robot remains disabled through the setup and clearance scenes.
- [ ] “POWERING ON!” is isolated, louder, and easy to hear.
- [ ] PLAY occurs only after everyone clears.
- [ ] STOP changes active to false and breaks the loop.
- [ ] Final frame remains visible for approximately two seconds.

## Technical Notes for the Instructor

- `opModeIsActive()` returns true only after START and while a stop has not been requested.
- An `if` condition is evaluated once when execution reaches it; a `while` condition is evaluated before every attempted iteration.
- The outer `if (opModeIsActive())` is redundant because the inner `while` performs the same check before entering and before every repeat. Keep it for this source-code walkthrough, then simplify it in a later refactoring exercise.
- The loop has no explicit delay, so it repeats as quickly as the runtime and its operations permit.
- Each cycle reads new gamepad values; this continuous sampling is what makes driver control responsive.
- When STOP is requested, `opModeIsActive()` becomes false, the loop exits, and the FTC runtime disables hardware outputs.
