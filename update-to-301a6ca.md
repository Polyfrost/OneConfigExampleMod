# Updating to commit [`301a6ca`](https://github.com/Polyfrost/OneConfigExampleMod/commit/301a6cae2fc9b62d00e968b05eb689f3175c5f79)

If you don't care to check the commit and manually apply everything, here are all the changes we made in that commit:

## build.gradle.kts

![Screenshot 2024-06-17 at 5 24 13 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/830faef9-bb86-4279-86d5-b9b7f837d1af)

Updates blossom to 1.3.2 (what this template uses to automatically replace mentions of mod_id, mod_ver, etc. with the values in `gradle.properties`. unofficial Polyfrost update fixing Kotlin 1.9.x support), and removes unnecessary preprocessor variable (it's already included by PGT)

## gradle.properties

![Screenshot 2024-06-17 at 5 27 35 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/a170663b-2449-4043-9be3-865e982387c9)

Updates `polyfrost.defaults.loom` (PGT's "loom revision," aka what mappings the mod uses) to `3`. This won't really affect anyone outside of modern version users, but this is just good practice.

## gradle/wrapper/gradle-wrapper.properties

![Screenshot 2024-06-17 at 5 29 02 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/ff423c15-1339-47bc-8435-e05d15181b32)

Updates Gradle to 8.8. 

### IMPORTANT!!

This Gradle update is why some other gradle-related files in this project (`gradle-wrapper.jar`, `gradlew` and `gradlew.bat`) changed. Obviously, it would be a bit inconvenient to apply the changes to those files manually, so here's what you do to properly apply the new changes:

1. Apply the rest of the changes in this document
2. Temporarily change `gradle/wrapper/gradle-wrapper.properties` to gradle 8.6 or 8.7. This is necessary because in order for Loom to function, 8.6 or higher is required.
3. Reload the Gradle project
4. Run `gradle wrapper --gradle-version 8.8` in Terminal or through your IDE (IntelliJ users can run this through the following method:)
![Screenshot 2024-06-17 at 5 33 24 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/8df43b0f-485d-4f4b-a288-f4db2c4521fe)
![Screenshot 2024-06-17 at 5 34 05 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/0d7b0598-d486-4fa4-af07-f72b2ab77966)
5. Done!

## root.gradle.kts

![Screenshot 2024-06-17 at 5 35 02 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/b4622399-6548-47ef-9724-cfe5f2785243)

Updates shadow (what Gradle uses to shade dependencies) to 8.1.1.

## settings.gradle.kts

![Screenshot 2024-06-17 at 5 36 43 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/88252eb9-3aeb-48c4-b7f0-ec1553d999a3)

Updates PGT to 0.6.2 (which updates loom), and comments out 1.12.2 support in case people don't want it.

## src/resources/mcmod.info

![Screenshot 2024-06-17 at 5 38 49 AM](https://github.com/Polyfrost/OneConfigExampleMod/assets/45589059/bb721a82-edd8-4a2e-8678-3b53f3741671)

Makes sure the `mcversion` field in `mcmod.info` is updated to the actual Minecraft version (in this case, either 1.8.9 or 1.12.2)
