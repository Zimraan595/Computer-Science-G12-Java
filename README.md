# Grade 12 Computer Science - Java Assignments

## Autosave script

Run this in IntelliJ's terminal (Alt+F12, PowerShell) when you start coding.
It commits every minute if anything changed and pushes to GitHub every 5 minutes.

```powershell
$n = 0; while ($true) { if (git status --porcelain) { git add -A; git commit -q -m "autosave $(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')" }; $n++; if ($n % 5 -eq 0) { git pull --rebase --autostash -q; git push -q }; Start-Sleep -Seconds 60 }
```

**To stop:** click in the terminal and press `Ctrl+C`, then run:

```powershell
git push
```

## Viewing my work history

To export the work, go to the file and, in the link, replace `github.com` with `githistory.xyz`
The link is only required one time and will automatically update as you edit

To view another file, swap the path after `/blob/master/`.

## 📂 Repository Structure

To keep the repository clean and optimized for version control, all configuration files from the IDE are ignored. 

* **`src/`** 📁 - **This is where all of the source files are located.** Every assignment package, Java class, and core logic script can be found inside this folder.
* `.gitignore` 🚫 - Used to automatically exclude local workspace configuration files (like `.idea/` and `*.iml`) to keep the repository portable and clear of junk files.

## 💻 Tech Stack & Environment
* **Language:** Java
* **IDE Used:** IntelliJ IDEA
* **Version Control:** Git & GitHub

---
*Managed and updated by [Zimraan595](https://github.com).*
