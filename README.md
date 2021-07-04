# Java Reflective Resource Loader
A Java JAR that will take a file from itself, write it to a new location and then execute the new file.
## How does it work?
- There is only one java class, named Loader which will get "img.png" as a resource,
write it to a new file in AppData called "img.exe", and then execute that exe.
- "img.png" is just a renamed executable file, so it will run normally. 
- "img.exe" will display a couple message boxes, and then delete itself
using a  Command Prompt window.

## Files

These are all the files in the repo and their use.

| File | Use |
| ------ | ------ |
| Loader.java | Main class, will get the png as a resource, write the exe, and finally execute it. |
| img.png | An executable that just displays a couple message boxes, renamed to a .png. |
| Reflective.cs| The C# class that powers the exe. |

## Goals/Purpose
I originally intended on making this piece of code because it is an extremely effiencient way to package multiple files into one JAR,
especially if installing things onto a users computer, this can act as a folder while also providing a hassle-free way to reflect.

Although, like all things, this can very easily be used maliciously, so with that, I am in no way responsible for any of your actions with this code.
Also, if used maliciously, [VirusTotal](https://virustotal.com) would be able to detect that there is a file in the jar that is malicious.
Here is this JAR's VT Scan: [Scan](https://www.virustotal.com/gui/file/f6ab2631b950d9b9fb1197dfa33ef43db588917aeba0f3828573b49bf54763bf/detection)
## License
[MIT](https://github.com/CadeCodes/JRRL/blob/main/LICENSE)
