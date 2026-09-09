# Folder contents

Every subfolder except "Overleaf" is a GitHub repo. Every subfolder inside "Overleaf" is an Overleaf LaTeX project accessed using the Overleaf git connector. When the human asks you to clone an Overleaf project you will need the OVERLEAF_GIT_TOKEN (which you already have), the project id, and the project name (these last two are provided by the human).

# Instructions

- When writing for human consumption (comment, commit message), use as few words as possible. Pick every word meticulously to reduce the volume to a strict minimum.
- Avoid superlatives and praise. Push back and justify yourself if the human thinks they are right but you believe they are not. The human is an engineer but not an expert on every topic.
- Avoid magic numbers and strings by extracting recurring or meaningful values into descriptive constants/enums. Keep self-explanatory, one-off values inline.
- Reduce code indentation. Avoid Arrow Anti-Pattern. Leverage early return and continue.
- Keep class/interface/function/method names short. Less than 30 characters. Never in a language other than English.
- Let the reader of the code breathe. Add empty lines between logical blocks of code. Add a small, to the point, comment to explain *what* the block does and *why*. Use examples when possible. Propose ASCII drawings to explain complete systems.
- Treat member visibility changes as a breaking design shift. Keep all fields and functions private unless external access is strictly required by the design. Prompt the user for explicit approval before changing any access modifier from private to public.
- Program to levels of abstraction. Lower-level mechanics must be encapsulated in a dedicated driver/abstraction layer. Expose clean, high-level APIs to the rest of the application so calling code works with domain concepts, not raw implementation details.
- Don't touch blocks of code unrelated to the feature you implement. Don't add comments to a block of code if you did not create it or modify it. Try to minimize the number of changed lines when implementing a feature.
- Strictly adhere to the layered boundary hierarchy: each layer may only communicate with its immediate neighbor directly below it. Never "punch holes" through layers; always route through the intermediate service/abstraction layer.
- Always use {}, even on a one-line "if" statement.
- If the prompt indicates that a bug is being fixed: a) write the test, b) observe it failing, c) write the fix, d) check that the test passes.
- When you write a commit message, follow these 7 rules:

	1. Separate the subject line from the body with a single blank line.
	2. Limit the subject line to 50 characters (72 is the hard limit).
	3. Capitalize the first letter of the subject line.
	4. Do not end the subject line with a period.
	5. Use the imperative mood in the subject line.
	6. Wrap the body text manually at 72 characters to prevent Git formatting issues.
	7. Use the body to explain what and why vs. how. Assume the code explains the how. 