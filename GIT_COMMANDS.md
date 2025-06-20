# 🌈 Git Commands Step-by-Step Guide

## 🔰 Initial Setup

| Command | Description |
|--------|-------------|
| `git init` | Initializes a new Git repository locally |
| `git remote add origin <url>` | Adds a link to your GitHub repo |

---

## 📦 Committing Code

| Command | Description |
|--------|-------------|
| `git status` | Shows which files changed or are untracked |
| `git add .` | Adds all files to staging area |
| `git add filename` | Adds a specific file |
| `git commit -m "message"` | Commits changes with a message |

---

## 🚀 Pushing to GitHub

| Command | Description |
|--------|-------------|
| `git push origin main` | Pushes code to the `main` branch |
| `git pull origin main` | Pulls latest code from GitHub |
| `git branch -a` | Lists all local and remote branches |

---

## 🛠️ Example Flow for This Project

```bash
git init
git remote add origin https://github.com/gauravgavhale2002/Authenticationa_Authorization.git
git pull origin main
git add README.md Authentication_Authorization_Guide.pdf
git commit -m "📘 Added README and Authentication Guide PDF"
git push origin main


Or

jab git pull kar raha hai, to teri local directory me already ek README.md file hai jo GitHub pe waali se conflict kar rahi hai.

✅ Solution: 3 Options hai — tu koi bhi use kar sakta hai
🅰️ Option 1: Stash your local file temporarily
bash
Copy
Edit
git stash push README.md
git pull origin main
git stash pop
🟢 Ye tera local README.md hata ke pull kar dega, fir wapas la dega.

🅱️ Option 2: Overwrite GitHub version with your local README.md
bash
Copy
Edit
git add README.md
git commit -m "Updated local README.md"
git push origin main
⚠️ This will replace the GitHub README.md with your local one.

🅾️ Option 3: Delete local README.md and pull
bash
Copy
Edit
rm README.md         # or manually delete it
git pull origin main
Uske baad:

bash
Copy
Edit
# Replace with your own version
cp /g/path/to/your/custom/README.md .
git add README.md
git commit -m "Replaced README.md with updated version"
git push origin main