package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import j$.util.Comparator;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16098e {
    public static final C1410e ad = AbstractC17475e.ads(12);

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.Function] */
    public static AbstractC17475e ad(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new Object())));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && AbstractC9413e.m2572try(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return AbstractC17475e.remoteconfig(treeSet);
    }

    public static AbstractC17475e vip(AudioDeviceInfo audioDeviceInfo) {
        int type;
        AbstractC17475e abstractC17475e;
        int speakerLayoutChannelMask;
        boolean ad2 = AbstractC5297e.ad(audioDeviceInfo.getType());
        C1410e c1410e = ad;
        if (!ad2) {
            if (audioDeviceInfo.getType() == 1) {
                return AbstractC17475e.ads(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return AbstractC17475e.ads(Integer.valueOf(speakerLayoutChannelMask));
                }
                AbstractC2803e.smaato("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return c1410e;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || audioDeviceInfo.getType() != 10) {
                if (i >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i >= 31 && type2 == 29) {
                        AbstractC17475e ad3 = ad(audioDeviceInfo);
                        if (!ad3.isEmpty()) {
                            return ad3;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i < 34 || audioDescriptors == null) {
                                C2171e c2171e = AbstractC17475e.f34223e;
                                abstractC17475e = C1410e.f4222e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor vip = C4403e.vip(it.next());
                                    if (vip.getStandard() == 2) {
                                        byte[] descriptor = vip.getDescriptor();
                                        if (descriptor.length != 3) {
                                            AbstractC2803e.smaato("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b = descriptor[0];
                                                r10 = (b & 1) != 0 ? 12 : 0;
                                                if ((b & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    r10 |= 192;
                                                }
                                                if ((b & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b & 32) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    r10 |= 8192;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    r10 |= 262144;
                                                }
                                                if ((b2 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    r10 = 8388608 | r10;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                List.EL.sort(arrayList, new C6575e(1));
                                abstractC17475e = AbstractC17475e.remoteconfig(arrayList);
                            }
                            if (!abstractC17475e.isEmpty()) {
                                return abstractC17475e;
                            }
                        }
                        AbstractC17475e advert = AbstractC16048e.advert(audioDescriptors);
                        if (!advert.isEmpty()) {
                            return advert;
                        }
                    }
                }
                if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    AbstractC17475e ad4 = ad(audioDeviceInfo);
                    if (!ad4.isEmpty()) {
                        return ad4;
                    }
                }
            } else {
                AbstractC17475e ad5 = ad(audioDeviceInfo);
                if (!ad5.isEmpty()) {
                    return ad5;
                }
                AbstractC17475e advert2 = AbstractC16048e.advert(audioDeviceInfo.getAudioDescriptors());
                if (!advert2.isEmpty()) {
                    return advert2;
                }
            }
        }
        return c1410e;
    }
}
