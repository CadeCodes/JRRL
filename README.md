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


## License
[MIT](https://github.com/CadeCodes/JRRL/blob/main/LICENSE)
