[![github](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/github_vector.svg)](https://github.com/Meowlan/CC-WATERMeDIA)
[![modrinth](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3.2.0/assets/cozy/available/modrinth_vector.svg)](https://modrinth.com/mod/cc-watermedia)
![forge](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3.2.0/assets/cozy/supported/forge_vector.svg)
![neoforge](.github/assets/neoforge_vector.svg)

# CC: WATERMeDIA
Adds compability between [CC: Tweaked](https://modrinth.com/mod/cc-tweaked) and [WaterFrames](https://modrinth.com/mod/waterframes)
<br>
<br>
<br>
### Peripheral API
| Function | Arguments | Returns | Description |
| --- | --- | --- | --- |
| `getUrl` | | `string` | The URL currently loaded on the display. |
| `setUrl` | `url: string` | `boolean` | Sets the display's URL. Returns `false` if `url` isn't a valid URI. |
| `getActive` | | `boolean` | Whether the display is switched on. |
| `setActive` | `active: boolean` | `boolean` | Switches the display on/off. |
| `getMute` | | `boolean` | Whether the display's audio is muted. |
| `setMute` | `mute: boolean` | `boolean` | Mutes/unmutes the display's audio. |
| `getPause` | | `boolean` | Whether playback is paused. |
| `setPause` | `pause: boolean` | `boolean` | Pauses/resumes playback. |
| `getVolume` | | `number` | The current volume. |
| `setVolume` | `volume: number` | `boolean` | Sets the volume. |
| `setLoop` | `loop: boolean` | `boolean` | Sets whether the current media repeats. |
| `getTick` | | `number` | The current playback tick. |
| `setTick` | `tick: number` | `boolean` | Seeks playback to the given tick. |
| `getMaxTick` | | `number` | The playback length, in ticks. |
| `setMaxTick` | `tickMax: number` | `boolean` | Overrides the playback length, in ticks. |
