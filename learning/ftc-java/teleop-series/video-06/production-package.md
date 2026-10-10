# FTC Whiteboard Training Video 6

## Motor Power, Movement, and Telemetry

**Audience:** Beginning middle- and high-school FTC programmers  
**Source program:** `BasicTwoMotorTeleOp.java`  
**Target duration:** 2:00  
**Format:** 1920×1080, 16:9, 30 fps  
**Visual style:** Bright-white whiteboard, thick black marker, green safe-action cues, red warnings  
**Screenshot rule:** No visible slide numbers, scene numbers, panel numbers, or numbered badges

## Learning Objective

By the end of this lesson, students should be able to:

1. Explain the parts of a `setPower()` method call.
2. Relate power values from `-1.0` through `+1.0` to motor behavior.
3. Predict basic tank-drive movement from left and right power values.
4. Explain how power telemetry supports testing and troubleshooting.
5. Perform a safe, systematic two-motor test.

## Two-Column Production Script

| Time | Voiceover | Whiteboard visual prompt |
|---|---|---|
| 0:00–0:08 | We have joystick values stored in leftPower and rightPower. Now the program must turn those numbers into real motor commands. | Title: **MOTOR POWER & TELEMETRY**. Two variable cards flow toward two stopped drivetrain motors. No slide or panel number. |
| 0:08–0:18 | These two setPower lines do that job. The left value goes to leftMotor, and the right value goes to rightMotor. | Exact code `leftMotor.setPower(leftPower);` and `rightMotor.setPower(rightPower);`. Color-match each motor, argument, and wheel. |
| 0:18–0:28 | Read each call in three parts: choose the motor object, call its setPower method, and pass the desired power inside the parentheses. | Enlarge `leftMotor.setPower(leftPower);`. Brackets label **OBJECT**, **METHOD**, and **ARGUMENT**. Green arrow reads left to right. |
| 0:28–0:38 | Motor power ranges from negative one to positive one. Zero requests stop, larger magnitudes request more output, and the sign selects direction. | Horizontal scale: `-1.0`, `-0.5`, `0.0 STOP`, `+0.5`, `+1.0`. Arrow length grows away from zero. Label **MAGNITUDE = HOW MUCH** and **SIGN = DIRECTION**. |
| 0:38–0:48 | With correctly configured directions, equal positive values drive forward. Equal negative values drive backward. Two zeros stop both sides. | Three mini-scenes: `+0.7/+0.7` forward, `-0.7/-0.7` backward, `0.0/0.0` stopped. Green and blue arrows. |
| 0:48–0:58 | Opposite signs spin the robot. Unequal values curve it toward the slower side. That is the basic movement vocabulary of tank drive. | Two mini-scenes: `+0.6/-0.6` spin, `+0.8/+0.3` curve right. Large readable power values beside wheels. |
| 0:58–1:08 | After commanding the motors, telemetry dot addData prepares the Left Power and Right Power readings. Telemetry dot update sends them to the Driver Station. | Exact telemetry lines with labels **PREPARE DATA** and **SEND DATA**. Arrows lead to Driver Station displaying Left Power and Right Power. |
| 1:08–1:16 | Before testing live motor output, secure the robot on blocks, inspect the drivetrain, and make sure everyone is clear. | Robot secured on blocks, wheels off surface. Operator scans area. Students nearby. Robot clearly **DISABLED**. No visible slide number. |
| 1:16–1:18 | POWERING ON! | Tight close-up of operator calling **POWERING ON!** in a huge speech bubble with red sound lines. No badge or number. |
| 1:18–1:27 | Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY. | Students step behind dotted green safety line. PLAY remains untouched until clear. Label **STEP CLEAR BEFORE ENABLE**. No panel number. |
| 1:27–1:37 | Test slowly and systematically: move only the left stick, return it to zero, then move only the right stick. Confirm the matching wheel responds. | Three-step unnumbered visual path using arrows rather than numerals: left stick only, both centered, right stick only. Correct wheel highlights green. |
| 1:37–1:47 | Next, move both sticks forward gently. Compare wheel direction with the telemetry values. If the robot behaves differently than predicted, press STOP. | Both sticks at `+0.3`; telemetry shows `+0.3/+0.3`; both wheels forward. Alternate wrong wheel direction leads to red STOP button. |
| 1:47–1:55 | Disable before touching the robot. Then check motor direction, configuration names, wiring, and the live power readings one item at a time. | Large **DISABLE FIRST** card, then unnumbered checklist icons: direction, names, wiring, telemetry. Student hands remain away from robot. |
| 1:55–2:00 | Read, command, observe, and verify. Your first TeleOp is complete. Build smart. Speak up. Stay safe! | Final unnumbered flow **READ → COMMAND → OBSERVE → VERIFY**. Team behind robot. **FIRST TELEOP COMPLETE!** and safety closing. |

## ElevenLabs Narration Chunks

Generate and export one audio file per scene.

### `01_power_hook.mp3`

We have joystick values stored in leftPower and rightPower. Now the program must turn those numbers into real motor commands.

### `02_set_power_lines.mp3`

These two setPower lines do that job. The left value goes to leftMotor, and the right value goes to rightMotor.

### `03_method_call_parts.mp3`

Read each call in three parts: choose the motor object, call its setPower method, and pass the desired power inside the parentheses.

### `04_power_range.mp3`

Motor power ranges from negative one to positive one. Zero requests stop, larger magnitudes request more output, and the sign selects direction.

### `05_straight_and_stop.mp3`

With correctly configured directions, equal positive values drive forward. Equal negative values drive backward. Two zeros stop both sides.

### `06_spin_and_curve.mp3`

Opposite signs spin the robot. Unequal values curve it toward the slower side. That is the basic movement vocabulary of tank drive.

### `07_power_telemetry.mp3`

After commanding the motors, telemetry dot addData prepares the Left Power and Right Power readings. Telemetry dot update sends them to the Driver Station.

### `08A_power_setup.mp3`

Before testing live motor output, secure the robot on blocks, inspect the drivetrain, and make sure everyone is clear.

### `08B_powering_on.mp3`

POWERING ON!

### `08C_step_clear.mp3`

Give everyone time to step behind the safety line. Only after the area is clear should the driver press PLAY.

### `09_one_side_test.mp3`

Test slowly and systematically: move only the left stick, return it to zero, then move only the right stick. Confirm the matching wheel responds.

### `10_both_sides_test.mp3`

Next, move both sticks forward gently. Compare wheel direction with the telemetry values. If the robot behaves differently than predicted, press STOP.

### `11_disable_and_diagnose.mp3`

Disable before touching the robot. Then check motor direction, configuration names, wiring, and the live power readings one item at a time.

### `12_closing.mp3`

Read, command, observe, and verify. Your first TeleOp is complete. Build smart. Speak up. Stay safe!

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
- `leftPower`: “left power”
- `rightPower`: “right power”
- `leftMotor`: “left motor”
- `rightMotor`: “right motor”
- `setPower`: “set power”
- telemetry: “tuh-lem-uh-tree”
- `addData`: “add data”
- `update`: “update”

## CapCut Scene and Timing Plan

The filenames remain ordered, but no visual contains a scene number.

| Scene file | Timeline | Visual motion | Audio/editing notes |
|---|---|---|---|
| `01_power_hook.png` | 0:00–0:08 | Draw two value cards, then connect them to stopped motors. | Begin light music at 10–12% of narration volume. |
| `02_set_power_lines.png` | 0:08–0:18 | Write each exact line and color-match its motor and argument. | Hold code for the entire clip. |
| `03_method_call_parts.png` | 0:18–0:28 | Reveal OBJECT, METHOD, and ARGUMENT brackets from left to right. | Use a slow 3% punch-in. |
| `04_power_range.png` | 0:28–0:38 | Draw scale outward from zero; lengthen directional arrows. | Emphasize zero before the endpoints. |
| `05_straight_and_stop.png` | 0:38–0:48 | Show forward, backward, and stopped examples in sequence. | Use clean cuts between examples. |
| `06_spin_and_curve.png` | 0:48–0:58 | Rotate robot for spin, then trace a curved path. | Keep power values visible. |
| `07_power_telemetry.png` | 0:58–1:08 | Highlight addData, then update; move values to Driver Station. | Match arrows to narration. |
| `08A_power_setup.png` | 1:08–1:16 | Pan across blocks, raised wheels, disabled label, and scanning operator. | Lower music approximately 3 dB. |
| `08B_powering_on.png` | 1:16–1:18 | Fast punch-in on speech bubble with brief scale bounce. | Raise voice 3 dB; duck music 6 dB. |
| `08C_step_clear.png` | 1:18–1:27 | Move students behind line; press PLAY only on final beat. | Restore music after the area is clear. |
| `09_one_side_test.png` | 1:27–1:37 | Highlight left test, center pause, then right test using arrows only. | Do not overlay numeric step labels. |
| `10_both_sides_test.png` | 1:37–1:47 | Move both sticks slightly; compare wheels and telemetry; reveal STOP. | Duck music briefly at STOP. |
| `11_disable_and_diagnose.png` | 1:47–1:55 | Reveal DISABLE FIRST, then each troubleshooting icon. | Keep robot visibly disabled. |
| `12_closing.png` | 1:55–2:00 | Draw four-part flow and reveal completion/safety message. | Fade music; hold final frame for two seconds. |

## Master Visual Prompt

> A clean 16:9 educational whiteboard illustration for middle- and high-school FTC robotics students, matching Videos 1 through 5 exactly. Bright pure-white background, thick black hand-drawn marker outlines, minimal gray shading, green correct, safe, and forward-action cues, red stop, warning, and disabled cues, and blue secondary numeric highlights. Reuse the same friendly student characters, Driver Station, gamepad, and recognizable two-wheel FTC robot. Use large readable hand-lettered labels, generous empty space, and uncluttered composition. Do not include any visible slide number, scene number, panel number, numbered circle, numbered badge, page number, or corner number. No photorealism, gradients, decorative borders, watermark, tiny text, or unsafe behavior.

Append the scene-specific visual prompt from the production-script table.

## Teacher Pause Questions

1. What are the object, method, and argument in `leftMotor.setPower(leftPower)`?
2. What power value requests a stopped motor?
3. What do magnitude and sign communicate?
4. What happens when both sides receive equal positive values?
5. What happens when the values have opposite signs?
6. What does telemetry help the team compare?
7. What should the driver do when observed movement does not match the prediction?

## Hands-On Student Activity

1. Secure the robot on blocks and confirm both wheels are clear.
2. Write predictions for `0.0/0.0`, `+0.3/+0.3`, `-0.3/-0.3`, and `+0.3/-0.3`.
3. Follow the POWERING ON and step-clear procedure.
4. Test the left stick alone, center it, and test the right stick alone.
5. Test both sticks gently while watching telemetry.
6. Press STOP immediately if movement differs from the prediction.
7. Disable before inspecting direction settings, names, or wiring.

## Final Quality Check

- [ ] No screenshot contains a visible slide number, scene number, panel number, corner number, or numbered badge.
- [ ] Narration remains close to two minutes at the chosen voice speed.
- [ ] Both `setPower()` lines exactly match the source program.
- [ ] Object, method, and argument are labeled correctly.
- [ ] Power range is shown from `-1.0` through `0.0` to `+1.0`.
- [ ] Zero is described as stop, magnitude as amount, and sign as direction.
- [ ] Forward, backward, stop, spin, and curve examples are internally consistent.
- [ ] `leftPower` is sent only to `leftMotor`.
- [ ] `rightPower` is sent only to `rightMotor`.
- [ ] Telemetry lines use the exact labels `Left Power` and `Right Power`.
- [ ] `addData()` is shown preparing data and `update()` sending it.
- [ ] Robot is secured with wheels off the surface during testing.
- [ ] Robot remains disabled through setup and clearance.
- [ ] “POWERING ON!” is isolated, louder, and easy to hear.
- [ ] PLAY occurs only after everyone clears.
- [ ] Troubleshooting shows STOP and DISABLE before touching the robot.
- [ ] Final frame remains visible for approximately two seconds.

## Technical Notes for the Instructor

- `setPower(double power)` accepts a requested power value. FTC motor implementations constrain usable power to the supported range, normally `-1.0` through `+1.0`.
- The sign controls commanded motor direction relative to the motor’s configured direction; physical wheel direction also depends on drivetrain mounting.
- Equal left and right values produce straight motion only when the drivetrain is mechanically aligned and motor directions are configured correctly.
- Telemetry reports commanded values from the program, not independent measurements of actual wheel speed.
- The safest first test uses low stick values with the robot secured on blocks and the area clear.
- The FTC runtime disables motor outputs when the OpMode stops, but students should still confirm the robot is disabled before touching mechanisms.
