package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7473e {
    public static final HashMap ad = new HashMap();

    public static void ad(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C10643e) arrayList.get(0)).ad.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C10643e.startapp("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C15401e(1, new C13415e(8)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C10643e) arrayList.get(0)).ad)) {
            return;
        }
        arrayList.add((C10643e) arrayList.remove(0));
    }

    public static synchronized List appmetrica(String str, boolean z, boolean z2) {
        synchronized (AbstractC7473e.class) {
            try {
                C9316e c9316e = new C9316e(str, z, z2);
                HashMap hashMap = ad;
                List list = (List) hashMap.get(c9316e);
                if (list != null) {
                    return list;
                }
                ArrayList purchase = purchase(c9316e, new C13572e(z, z2, str.equals("video/mv-hevc")));
                if (z && purchase.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    purchase = purchase(c9316e, new C13023e(4));
                    if (!purchase.isEmpty()) {
                        AbstractC2803e.smaato("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C10643e) purchase.get(0)).ad);
                    }
                }
                ad(str, purchase);
                AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(purchase);
                hashMap.put(c9316e, remoteconfig);
                return remoteconfig;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1410e billing(C2282e c2282e, C16975e c16975e, boolean z, boolean z2) {
        List ad2 = c2282e.ad(c16975e.loadAd, z, z2);
        String metrica = metrica(c16975e);
        List ad3 = metrica == null ? C1410e.f4222e : c2282e.ad(metrica, z, z2);
        C13304e Signature = AbstractC17475e.Signature();
        Signature.license(ad2);
        Signature.license(ad3);
        return Signature.billing();
    }

    public static String license(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static String metrica(C16975e c16975e) {
        Pair vip;
        String str = c16975e.loadAd;
        String str2 = c16975e.loadAd;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (vip = AbstractC13612e.vip(c16975e)) != null) {
            int intValue = ((Integer) vip.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                C14754e c14754e = c16975e.firebase;
                if (c14754e != null && c14754e.metrica == 6 && c14754e.vip == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:11:0x0138, B:12:0x0035, B:15:0x0040, B:50:0x0111, B:53:0x0119, B:55:0x011f, B:58:0x0140, B:59:0x0161), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList purchase(defpackage.C9316e r20, defpackage.InterfaceC5282e r21) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7473e.purchase(eٍؚۡ, eؗۦٌ):java.util.ArrayList");
    }

    public static boolean startapp(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC8542e.startapp(str)) {
            return true;
        }
        String tapsense = AbstractC3628e.tapsense(mediaCodecInfo.getName());
        if (tapsense.startsWith("arc.")) {
            return false;
        }
        if (tapsense.startsWith("omx.google.") || tapsense.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((tapsense.startsWith("omx.sec.") && tapsense.contains(".sw.")) || tapsense.equals("omx.qcom.video.decoder.hevcswvdec") || tapsense.startsWith("c2.android.") || tapsense.startsWith("c2.google.")) {
            return true;
        }
        return (tapsense.startsWith("omx.") || tapsense.startsWith("c2.")) ? false : true;
    }

    public static MediaCodecInfo.CodecProfileLevel vip(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static boolean yandex(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i == 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }
}
