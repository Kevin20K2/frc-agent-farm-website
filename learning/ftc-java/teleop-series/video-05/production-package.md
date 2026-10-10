# FTC Whiteboard Training Video 5

## Reading the Joysticks: Values, Variables, and the Minus Sign

**Audience:** Beginning middle- and high-school FTC programmers  
**Source program:** `BasicTwoMotorTeleOp.java`  
**Target duration:** 2:00  
**Format:** 1920×1080, 16:9, 30 fps  
**Visual style:** Bright-white whiteboard, thick black marker, green safe-action cues, red warnings

## Learning Objective

By the end of this lesson, students should be able to:

1. Read the two joystick assignment statements from right to left.
2. Explain why `double` is used for motor-power variables.
3. Trace `gamepad1.left_stick_y` and `gamepad1.right_stick_y`.
4. Identify the joystick range from `-1.0` to `+1.0`.
5. Explain why the program negates each Y-axis value.

## Two-Column Production Script

| Time | Voiceover | Whiteboard visual prompt |
|---|---|---|
| 0:00–0:08 | How does moving a thumbstick become a number Java can use? These two lines translate the driver’s hands into left and right power values. | Title: **READING THE JOYSTICKS**. Gamepad hands at left, two exact code lines in center, power gauges at right. Green translation arrows. |
| 0:08–0:18 | The first line creates a variable called leftPower. The second creates rightPower. Each variable remembers the newest value for one side of the drivetrain. | Exact lines `double leftPower = -gamepad1.left_stick_y;` and `double rightPower = -gamepad1.right_stick_y;`. Highlight the two variable names. |
| 0:18–0:27 | Double is the data type. It can store decimal numbers like zero point two-five, negative zero point six, or one point zero. | Large green label **DOUBLE = DECIMAL NUMBER** with cards `0.25`, `-0.6`, and `1.0`. Integer-only box marked too limited. |
| 0:27–0:36 | Read an assignment from right to left: calculate the joystick expression first, then store the result in the variable on the left. | Exact assignment split by equals sign. Green arrow travels from `-gamepad1.left_stick_y` through `=` into `leftPower`. Label: **CALCULATE → STORE**. |
| 0:36–0:46 | Gamepad one means the first connected controller. Left stick Y means the vertical, or forward-and-backward, axis of its left thumbstick. | Break `gamepad1.left_stick_y` into three labeled blocks: **CONTROLLER 1**, **LEFT STICK**, **Y AXIS**. Vertical green arrow on left stick. |
| 0:46–0:56 | The right-hand line does the same job with the right stick. That gives tank drive independent control of the robot’s left and right sides. | Split gamepad: left stick arrow to left wheel; right stick arrow to right wheel. Labels `leftPower` and `rightPower`. |
| 0:56–1:06 | A centered stick is about zero. Pulling backward gives positive values up to one. Pushing forward gives negative values down to negative one. | Raw FTC Y-axis scale: top **FORWARD = -1.0**, center **0.0**, bottom **BACKWARD = +1.0**. Label: **RAW STICK VALUE**. |
| 1:06–1:15 | That feels backward for motor power, so the minus sign negates the value. Negate means change its sign: negative becomes positive, and positive becomes negative. | Large unary minus flips two cards: `-(-0.7) = +0.7` and `-(+0.4) = -0.4`. Green forward arrow, blue backward arrow. |
| 1:15–1:23 | Before testing joystick input with live motors, secure the robot on blocks, inspect the area, and make sure everyone is clear. | Robot secured on blocks with wheels off surface. Operator scans area. Students nearby. Robot marked **DISABLED**. |
| 1:23–1:25 | POWERING ON! | Tight close-up of operator calling **POWERING ON!** in a huge speech bubble with red sound lines. |
| 1:25–1:34 | Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY. | Students step behind dotted green safety line. PLAY remains untouched until they clear. Label: **STEP CLEAR BEFORE ENABLE**. |
| 1:34–1:44 | Push both sticks forward. Each raw negative value is flipped to positive power, so both variables now request forward motion. | Both sticks forward. Two equations `-(-0.8) = +0.8`. Green arrows to `leftPower` and `rightPower`, then robot forward. |
| 1:44–1:53 | Move the sticks differently and the two variables hold different values. The loop refreshes both values every cycle as the driver moves. | Left variable `+0.8`, right variable `+0.3`; robot curves. Circular loop replaces old number cards with fresh values. |
| 1:53–2:00 | Follow the path: gamepad, stick, Y value, minus sign, variable. Read the numbers, predict the motion, and test safely! | Final pathway: **GAMEPAD → Y AXIS → NEGATE → STORE → POWER VALUE**. Team behind robot. Closing **PREDICT • TEST • STAY SAFE**. |

## ElevenLabs Narration Chunks

Generate and export one audio file per scene.

### `01_joystick_hook.mp3`

How does moving a thumbstick become a number Java can use? These two lines translate the driver’s hands into left and right power values.

### `02_power_variables.mp3`

The first line creates a variable called leftPower. The second creates rightPower. Each variable remembers the newest value for one side of the drivetrain.

### `03_double_type.mp3`

Double is the data type. It can store decimal numbers like zero point two-five, negative zero point six, or one point zero.

### `04_assignment_order.mp3`

Read an assignment from right to left: calculate the joystick expression first, then store the result in the variable on the left.

### `05_gamepad_path.mp3`

Gamepad one means the first connected controller. Left stick Y means the vertical, or forward-and-backward, axis of its left thumbstick.

### `06_tank_drive_inputs.mp3`

The right-hand line does the same job with the right stick. That gives tank drive independent control of the robot’s left and right sides.

### `07_raw_y_values.mp3`

A centered stick is about zero. Pulling backward gives positive values up to one. Pushing forward gives negative values down to negative one.

### `08_negate_values.mp3`

That feels backward for motor power, so the minus sign negates the value. Negate means change its sign: negative becomes positive, and positive becomes negative.

### `09A_power_setup.mp3`

Before testing joystick input with live motors, secure the robot on blocks, inspect the area, and make sure everyone is clear.

### `09B_powering_on.mp3`

POWERING ON!

### `09C_step_clear.mp3`

Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY.

### `10_both_forward.mp3`

Push both sticks forward. Each raw negative value is flipped to positive power, so both variables now request forward motion.

### `11_different_values.mp3`

Move the sticks differently and the two variables hold different values. The loop refreshes both values every cycle as the driver moves.

### `12_closing.mp3`

Follow the path: gamepad, stick, Y value, minus sign, variable. Read the numbers, predict the motion, and test safely!

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
- `09B_powering_on.mp3`: approximately 3 dB louder than normal narration

### Pronunciation Notes

- FTC: “F T C”
- Java: “jah-vuh”
- `double`: “double”
- `leftPower`: “left power”
- `rightPower`: “right power”
- `gamepad1`: “gamepad one”
- `left_stick_y`: “left underscore stick underscore Y”
- `right_stick_y`: “right underscore stick underscore Y”
- negative sign / unary minus: say “minus sign” for beginners

## CapCut Scene and Timing Plan

| Scene | Timeline | Visual motion | Audio/editing notes |
|---|---|---|---|
| 1 | 0:00–0:08 | Draw gamepad, code lines, and gauges; animate translation arrows. | Begin light music at 10–12% of narration volume. |
| 2 | 0:08–0:18 | Write both code lines; highlight `leftPower`, then `rightPower`. | Keep exact code visible throughout the clip. |
| 3 | 0:18–0:27 | Reveal three decimal cards and place them inside the DOUBLE box. | Emphasize the decimal points visually. |
| 4 | 0:27–0:36 | Move green arrow right-to-left through the assignment. | Pause briefly at the equals sign. |
| 5 | 0:36–0:46 | Separate property chain into three blocks; move stick vertically. | Match block highlights to narration. |
| 6 | 0:46–0:56 | Send left and right arrows from sticks to matching wheels. | Use different colors only for side identification. |
| 7 | 0:56–1:06 | Move stick dot from center to backward and forward positions on scale. | Hold all three raw values long enough to read. |
| 8 | 1:06–1:15 | Flip both example number cards through the large minus sign. | Use a quick card-turn animation, not a flashy transition. |
| 9A | 1:15–1:23 | Pan across blocks, raised wheels, disabled label, and scanning operator. | Lower music approximately 3 dB. |
| 9B | 1:23–1:25 | Fast punch-in on speech bubble with brief scale bounce. | Raise voice 3 dB; duck music 6 dB. |
| 9C | 1:25–1:34 | Move students behind line; press PLAY only on final beat. | Restore music after the area is clear. |
| 10 | 1:34–1:44 | Push both sticks forward; flip both values; move robot forward. | Keep robot separated from students. |
| 11 | 1:44–1:53 | Change two number cards; show curved path; refresh values around loop. | Use a slow curve arrow and two value swaps. |
| 12 | 1:53–2:00 | Draw final five-step path and reveal closing safety message. | Fade music; hold final frame for two seconds. |

## Master Visual Prompt

> A clean 16:9 educational whiteboard illustration for middle- and high-school FTC robotics students, matching Videos 1 through 4 exactly. Bright pure-white background, thick black hand-drawn marker outlines, minimal gray shading, green safe-action and forward-value cues, red warning and disabled cues, and blue secondary numeric highlights. Reuse the same friendly student characters, Driver Station, gamepad, and recognizable two-wheel FTC robot. Use large readable hand-lettered labels, generous empty space, and uncluttered composition. No photorealism, gradients, decorative borders, watermark, tiny text, or unsafe behavior.

Append the scene-specific visual prompt from the production-script table.

## Teacher Pause Questions

1. What does the word `double` tell Java?
2. Which side of an assignment is calculated first?
3. What does `gamepad1` identify?
4. Which direction does the Y axis measure?
5. What raw value normally represents a fully forward FTC stick?
6. What does the minus sign do to that value?
7. How does tank drive use the two sticks independently?

## Hands-On Student Activity

Give students cards labeled `RAW VALUE`, `MINUS SIGN`, and `POWER VARIABLE`.

1. Show a raw joystick value such as `-0.7`.
2. Have the minus-sign student negate it.
3. Have the variable student hold the resulting `+0.7` card.
4. Repeat with `0.0`, `+0.4`, and `-1.0`.
5. Ask the class to predict forward, stop, or backward motion.
6. Secure the robot on blocks and repeat with live telemetry after the POWERING ON procedure.

## Final Quality Check

- [ ] Narration remains close to two minutes at the chosen voice speed.
- [ ] Both joystick assignment lines exactly match the source program.
- [ ] `double` is described as a decimal-number data type.
- [ ] Assignments are traced from right to left: calculate, then store.
- [ ] `gamepad1`, stick selection, and Y axis are visually separated.
- [ ] `leftPower` is paired with `left_stick_y`.
- [ ] `rightPower` is paired with `right_stick_y`.
- [ ] Raw Y-axis scale shows forward `-1.0`, center `0.0`, backward `+1.0`.
- [ ] Negation examples are mathematically correct.
- [ ] Tank-drive inputs connect to the correct sides.
- [ ] Robot is secured with wheels off the surface during testing.
- [ ] Robot remains disabled through setup and clearance.
- [ ] “POWERING ON!” is isolated, louder, and easy to hear.
- [ ] PLAY occurs only after everyone clears.
- [ ] Final frame remains visible for approximately two seconds.

## Technical Notes for the Instructor

- FTC gamepad stick axes are represented as floating-point values, typically within `-1.0` to `+1.0`.
- For FTC Y axes, pushing a stick forward normally produces a negative raw value; negation makes the program’s forward command positive.
- The unary minus applies to the joystick value before that result is assigned to the variable.
- `leftPower` and `rightPower` are local variables recreated during every loop iteration in the supplied program.
- A physical gamepad may not return exactly zero when released. A deadband is a useful later improvement, but it is intentionally outside this source-code lesson.
- Negating the joystick value establishes a convenient input convention; actual wheel direction still depends on motor-direction configuration and physical mounting.
