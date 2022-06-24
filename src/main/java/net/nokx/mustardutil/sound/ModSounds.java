package net.nokx.mustardutil.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nokx.mustardutil.MustardUtil;

public class ModSounds {

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(MustardUtil.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));

    }

}
