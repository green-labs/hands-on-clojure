### JDK 설치 ###
- [JDK17 Corretto](https://corretto.aws/downloads/latest/amazon-corretto-17-x64-windows-jdk.msi)

### Clojure 설치 ###
- [download clojure](https://download.clojure.org/install/win-install-1.11.1.1165.ps1)
<img src="./images/windows/clojure.png"></img>
    - 1,2,3 중 하나를 입력해서 설치 경로 지정
- 실행 권한이 없을 경우 아래 명령어를 입력
```bash
Set-ExecutionPolicy RemoteSigned -Scope CurrentUser -Force
```
### VSCODE 설치 ###
https://code.visualstudio.com/


### VSCODE 에서 Calva 플러그인 설치 ###
<img src="./images/windows/calva.png"></img>
- 설정 바꾸기 ```ctrl + ,``` 
- ```calva save``` 입력
<img src="./images/windows/calva-save.png"></img>


### project 실행 ###
Command Palette 실행 ```cmd + shift + p```
<img src="./images/windows/calva-first.png"></img>
<img src="./images/windows/jackin.png"></img>
<img src="./images/windows/deps.png"></img>
<img src="./images/windows/success.png"></img>

### solution.clj 실행 ###
- ```solution.clj``` 로 들어가서
- evaluation ```ctrl + alt + c``` 누르고 ```enter``` 따로 누르기
- 한 줄씩 evaluation ```ctrl + enter```