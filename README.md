# Simple Audio Player in Java Console

This is a simple audio player implemented in Java that runs in the console. It allows you to play audio files in various formats directly from the command line.

## Features

- Play audio files in formats such as MP3, WAV, and FLAC.
- Pause, resume, stop, and skip tracks.
- Adjust volume level.
- Display track information including duration and current position.
- Command-line interface for easy interaction.

## Requirements

- Java Development Kit (JDK) 8 or above.
- Supported audio files (MP3, WAV, FLAC, etc.).
- Console-based environment (terminal or command prompt).

## Installation

1. Clone the repository or download the source code as a ZIP file.

   ```
   $ git clone https://github.com/your-username/simple-audio-player.git
   ```

2. Navigate to the project directory.

   ```
   $ cd simple-audio-player
   ```

3. Build the project using your preferred build tool (e.g., Maven, Gradle) or compile the source files manually.

   ```
   $ javac *.java
   ```

## Usage

1. Open a terminal or command prompt and navigate to the project directory.

2. Start the audio player by running the following command:

   ```
   $ java SimpleAudioPlayer
   ```

3. The player will prompt you to enter the path of the audio file you want to play. Provide the file path and press Enter.

4. Once the audio starts playing, you can use the following commands:

   - `p` or `play`: Resume playback if paused.
   - `pa` or `pause`: Pause playback.
   - `s` or `stop`: Stop playback.
   - `n` or `next`: Skip to the next track.
   - `v <level>` or `volume <level>`: Set the volume level (0-100).
   - `i` or `info`: Display track information.
   - `q` or `quit`: Quit the audio player.


## Acknowledgments

- This project utilizes the [JavaSound API](https://docs.oracle.com/en/java/javase/15/docs/api/java.desktop/javax/sound/sampled/package-summary.html) for audio playback.
- Special thanks to the open-source community for providing various resources and libraries for working with audio files in Java.
