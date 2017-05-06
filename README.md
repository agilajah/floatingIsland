# itbGL
ITB Map with OpenGL

## Setup lwjgl Intellij Idea
1. Download library di https://www.lwjgl.org/
2. Masukkan semua dll ke folder libs di project
3. Tambahkan library jar yang didownload (kecuali *-sources.jar dan *-javadoc.jar)
4. Untuk run configuration, gunakan <br/>
VM options: -Djava.library.path=libs/<br/>
Program arguments: -Dorg.lwjgl.util.Debug=true<br/>
Keliatannya gampang tapi mungkin bakal menyita waktu, good luck gan!
