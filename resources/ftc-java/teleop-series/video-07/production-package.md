# FTC Whiteboard Training Video 7

## Split Arcade Drive: One Stick Drives, One Stick Turns

**Audience:** Beginning middle- and high-school FTC programmers  
**Companion program:** `BasicArcadeDriveTeleOp.java`  
**Target duration:** 2:00  
**Format:** 1920×1080, 16:9, 30 fps  
**Visual style:** Bright-white whiteboard, thick black marker, green safe-action cues, red warnings  
**Screenshot rule:** No visible slide numbers, scene numbers, panel numbers, or numbered badges

## Learning Objective

By the end of this lesson, students should be able to:

1. Distinguish tank drive from split arcade drive.
2. Explain the jobs of the `drive` and `turn` variables.
3. Mix drive and turn into left and right motor powers.
4. Explain why mixed values must be normalized.
5. Test arcade-drive behavior safely and systematically.

## Key Code

```java
double drive = -gamepad1.left_stick_y;
double turn = gamepad1.right_stick_x;

double denominator = Math.max(
        Math.abs(drive) + Math.abs(turn),
        1.0
);

double leftPower = (drive + turn) / denominator;
double rightPower = (drive - turn) / denominator;
```

## Two-Column Production Script

| Time | Voiceover | Whiteboard visual prompt |
|---|---|---|
| 0:00–0:08 | What if one stick controlled speed and the other controlled steering? That driving system is called split arcade drive. | Title: **SPLIT ARCADE DRIVE**. Left stick marked **DRIVE**, right stick marked **TURN**, arrows flow to two-wheel robot. No slide number. |
| 0:08–0:18 | In tank drive, each stick controls one side. In split arcade drive, the left stick moves the whole robot forward and backward, while the right stick turns it. | Side-by-side comparison: **TANK** with stick-to-wheel arrows; **SPLIT ARCADE** with left stick to forward path and right stick to curved path. |
| 0:18–0:28 | The code stores left-stick Y in drive. Because FTC Y values are inverted, the minus sign makes pushing forward produce a positive drive value. | Exact code `double drive = -gamepad1.left_stick_y;`. Raw forward `-0.7` passes through minus sign and becomes `drive = +0.7`. |
| 0:28–0:38 | Right-stick X becomes turn. Moving the stick right normally gives a positive value; moving it left gives a negative value. | Exact code `double turn = gamepad1.right_stick_x;`. Horizontal scale: **LEFT -1.0**, **CENTER 0.0**, **RIGHT +1.0**. |
| 0:38–0:48 | Now we mix the two commands. Left power equals drive plus turn. Right power equals drive minus turn. | Exact formulas `leftPower = drive + turn` and `rightPower = drive - turn`. Colored paths combine DRIVE and TURN into two motor gauges. |
| 0:48–0:58 | With drive at zero and turn positive, the left side moves forward and the right side backward. The robot spins right. | Values: `drive = 0.0`, `turn = +0.6`, `left = +0.6`, `right = -0.6`. Robot spins right with clear arrows. |
| 0:58–1:08 | Drive and turn can combine. Full forward plus full right creates raw powers of two and zero—but motor power must stay between negative one and positive one. | Values: `drive = +1.0`, `turn = +1.0`; raw `left = +2.0`, raw `right = 0.0`. Red warning around `+2.0`: **OUT OF RANGE**. |
| 1:08–1:18 | The denominator normalizes the mix. It scales both sides together, keeping every value in range while preserving the steering relationship. | Exact concept `denominator = max(|drive| + |turn|, 1.0)`. Transform raw `+2.0/0.0` into normalized `+1.0/0.0`. Label **SCALE TOGETHER**. |
| 1:18–1:26 | Before testing, secure the robot on blocks, inspect the wheels, and make sure every student and mentor is clear. | Robot secured on blocks, wheels off surface. Operator scans area. Students nearby. Robot clearly **DISABLED**. No visible number. |
| 1:26–1:28 | POWERING ON! | Tight close-up of operator calling **POWERING ON!** in a large speech bubble with red sound lines. No badge or number. |
| 1:28–1:37 | Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY. | Students step behind dotted green safety line. PLAY remains untouched until clear. Label **STEP CLEAR BEFORE ENABLE**. |
| 1:37–1:47 | SetPower sends the normalized values to the motors. Telemetry shows drive, turn, left power, and right power for comparison. | Exact setPower calls and Driver Station telemetry: **Drive**, **Turn**, **Left Power**, **Right Power**. Green arrows from math to motors and display. |
| 1:47–1:56 | Test one command at a time: forward, backward, right turn, left turn, then gentle combinations. Press STOP if movement differs from your prediction. | Unnumbered test path using icons and arrows: forward, backward, turn right, turn left, combination. Red STOP available. Robot stays on blocks. |
| 1:56–2:00 | Drive, turn, mix, normalize, and command. You just upgraded your robot to split arcade drive. Test safely! | Final unnumbered flow **DRIVE + TURN → MIX → NORMALIZE → MOTORS**. Team behind robot. **ARCADE DRIVE COMPLETE!** |

## ElevenLabs Narration Chunks

Generate and export one audio file per scene.

### `01_arcade_hook.mp3`

What if one stick controlled speed and the other controlled steering? That driving system is called split arcade drive.

### `02_tank_vs_arcade.mp3`

In tank drive, each stick controls one side. In split arcade drive, the left stick moves the whole robot forward and backward, while the right stick turns it.

### `03_drive_input.mp3`

The code stores left-stick Y in drive. Because FTC Y values are inverted, the minus sign makes pushing forward produce a positive drive value.

### `04_turn_input.mp3`

Right-stick X becomes turn. Moving the stick right normally gives a positive value; moving it left gives a negative value.

### `05_mix_values.mp3`

Now we mix the two commands. Left power equals drive plus turn. Right power equals drive minus turn.

### `06_turn_example.mp3`

With drive at zero and turn positive, the left side moves forward and the right side backward. The robot spins right.

### `07_out_of_range.mp3`

Drive and turn can combine. Full forward plus full right creates raw powers of two and zero—but motor power must stay between negative one and positive one.

### `08_normalize.mp3`

The denominator normalizes the mix. It scales both sides together, keeping every value in range while preserving the steering relationship.

### `09A_power_setup.mp3`

Before testing, secure the robot on blocks, inspect the wheels, and make sure every student and mentor is clear.

### `09B_powering_on.mp3`

POWERING ON!

### `09C_step_clear.mp3`

Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY.

### `10_set_power_telemetry.mp3`

SetPower sends the normalized values to the motors. Telemetry shows drive, turn, left power, and right power for comparison.

### `11_test_sequence.mp3`

Test one command at a time: forward, backward, right turn, left turn, then gentle combinations. Press STOP if movement differs from your prediction.

### `12_closing.mp3`

Drive, turn, mix, normalize, and command. You just upgraded your robot to split arcade drive. Test safely!

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
- TeleOp: “tell-ee-op”
- arcade drive: “arcade drive”
- `gamepad1`: “gamepad one”
- `left_stick_y`: “left underscore stick underscore Y”
- `right_stick_x`: “right underscore stick underscore X”
- `leftPower`: “left power”
- `rightPower`: “right power”
- denominator: “dee-nom-uh-nay-ter”
- normalize: “normal-ize”
- `Math.max`: “math dot max”
- `Math.abs`: “math dot absolute value”
- `setPower`: “set power”

## CapCut Scene and Timing Plan

The filenames remain ordered, but no visual contains a scene number.

| Scene file | Timeline | Visual motion | Audio/editing notes |
|---|---|---|---|
| `01_arcade_hook.png` | 0:00–0:08 | Draw DRIVE and TURN labels, then connect them to robot. | Begin light music at 10–12% of narration volume. |
| `02_tank_vs_arcade.png` | 0:08–0:18 | Animate tank arrows first, then replace with split arcade arrows. | Keep both layouts visible for comparison. |
| `03_drive_input.png` | 0:18–0:28 | Push left stick forward and flip `-0.7` to `+0.7`. | Hold exact code throughout narration. |
| `04_turn_input.png` | 0:28–0:38 | Move right stick across horizontal X scale. | Emphasize center before both directions. |
| `05_mix_values.png` | 0:38–0:48 | Merge DRIVE and TURN paths into left and right formulas. | Use consistent variable colors. |
| `06_turn_example.png` | 0:48–0:58 | Fill all four values, then rotate robot right. | Match wheel arrows to signs. |
| `07_out_of_range.png` | 0:58–1:08 | Combine full inputs; pulse red warning around `+2.0`. | Do not show `+2.0` being sent to a motor. |
| `08_normalize.png` | 1:08–1:18 | Scale both raw gauges down together to `+1.0/0.0`. | Emphasize proportional scaling. |
| `09A_power_setup.png` | 1:18–1:26 | Pan across blocks, raised wheels, disabled label, and scanning operator. | Lower music approximately 3 dB. |
| `09B_powering_on.png` | 1:26–1:28 | Fast punch-in on speech bubble with brief scale bounce. | Raise voice 3 dB; duck music 6 dB. |
| `09C_step_clear.png` | 1:28–1:37 | Move students behind line; press PLAY only on final beat. | Restore music after the area is clear. |
| `10_set_power_telemetry.png` | 1:37–1:47 | Send normalized values to motors and telemetry display. | Keep all four telemetry labels readable. |
| `11_test_sequence.png` | 1:47–1:56 | Highlight each movement icon using arrows, with no numeric labels. | End with STOP visible. |
| `12_closing.png` | 1:56–2:00 | Draw final four-stage flow and reveal completion message. | Fade music; hold final frame for two seconds. |

## Master Visual Prompt

> A clean 16:9 educational whiteboard illustration for middle- and high-school FTC robotics students, matching Videos 1 through 6 exactly. Bright pure-white background, thick black hand-drawn marker outlines, minimal gray shading, green correct, safe, forward, and normalized-value cues, red out-of-range, stop, warning, and disabled cues, and blue secondary numeric highlights. Reuse the same friendly student characters, Driver Station, gamepad, and recognizable two-wheel FTC robot. Use large readable hand-lettered labels, generous empty space, and uncluttered composition. Do not include any visible slide number, scene number, panel number, numbered circle, numbered badge, page number, or corner number. No photorealism, gradients, decorative borders, watermark, tiny text, or unsafe behavior.

Append the scene-specific visual prompt from the production-script table.

## Teacher Pause Questions

1. What is the difference between tank drive and split arcade drive?
2. Which controller axis supplies `drive`?
3. Which controller axis supplies `turn`?
4. Why is left-stick Y negated?
5. Why does one motor formula add turn while the other subtracts it?
6. How can mixed values exceed the motor-power range?
7. What does normalization accomplish?

## Hands-On Student Activity

1. Give students cards labeled DRIVE, TURN, LEFT POWER, and RIGHT POWER.
2. Start with `drive = +0.5` and `turn = 0.0`; calculate both sides.
3. Try `drive = 0.0` and `turn = +0.5`; predict the spin direction.
4. Try `drive = +1.0` and `turn = +1.0`; identify the out-of-range result.
5. Normalize that result using a denominator of `2.0`.
6. Secure the robot on blocks and follow the POWERING ON procedure.
7. Test forward, backward, turns, and gentle combinations one at a time.

## Final Quality Check

- [ ] No screenshot contains a visible slide number, scene number, panel number, corner number, or numbered badge.
- [ ] Narration remains close to two minutes at the chosen voice speed.
- [ ] Split arcade drive is distinguished from tank drive.
- [ ] `drive` uses negated `gamepad1.left_stick_y`.
- [ ] `turn` uses `gamepad1.right_stick_x` without negation.
- [ ] `leftPower` uses drive plus turn.
- [ ] `rightPower` uses drive minus turn.
- [ ] Turn-only example produces equal and opposite motor powers.
- [ ] Raw combined values are never shown being sent directly to the motors.
- [ ] Normalization scales both motor values together.
- [ ] Normalized values remain between `-1.0` and `+1.0`.
- [ ] Robot is secured with wheels off the surface during testing.
- [ ] Robot remains disabled through setup and clearance.
- [ ] “POWERING ON!” is isolated, louder, and easy to hear.
- [ ] PLAY occurs only after everyone clears.
- [ ] Telemetry distinguishes drive, turn, left power, and right power.
- [ ] Final frame remains visible for approximately two seconds.

## Technical Notes for the Instructor

- This control arrangement is commonly called split arcade drive or two-stick arcade drive. Single-stick arcade drive uses the X and Y axes of one stick.
- With positive motor power configured as forward, positive `turn` produces positive left power and negative right power, turning the robot right.
- The denominator `Math.max(Math.abs(drive) + Math.abs(turn), 1.0)` is always at least `1.0`, so normal driving values are not amplified.
- When the raw mix exceeds magnitude `1.0`, dividing both sides by the same denominator preserves their steering ratio.
- The example program sets the right motor to `REVERSE`, but which motor requires reversal depends on the physical drivetrain. Adjust the directions during a safe blocks test.
- A joystick deadband and response shaping are valuable later improvements but are intentionally outside this introductory arcade-drive lesson.
