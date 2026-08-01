package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10643e {
    public final String ad;
    public int adcel;
    public float advert;
    public final boolean appmetrica;
    public final boolean billing;
    public final MediaCodecInfo.CodecCapabilities license;
    public final String metrica;
    public int mopub;
    public final boolean purchase;
    public final boolean startapp;
    public final String vip;
    public final boolean yandex;

    public C10643e(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = codecCapabilities;
        this.billing = z;
        this.appmetrica = z4;
        this.purchase = z5;
        this.yandex = z6;
        this.startapp = AbstractC8542e.smaato(str2);
        this.advert = -3.4028235E38f;
        this.adcel = -1;
        this.mopub = -1;
    }

    public static boolean ad(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC9413e.billing(i, widthAlignment) * widthAlignment, AbstractC9413e.billing(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }

    public static C10643e startapp(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str6;
        boolean z9 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z10 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z5 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z6 = z;
                z7 = z2;
                z8 = z3;
                str4 = str2;
                return new C10643e(str6, str4, str5, codecCapabilities2, z6, z7, z8, z9, z10, z5);
            }
        }
        z5 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z6 = z;
        z7 = z2;
        z8 = z3;
        str6 = str;
        return new C10643e(str6, str4, str5, codecCapabilities2, z6, z7, z8, z9, z10, z5);
    }

    public final boolean appmetrica(Context context, C16975e c16975e) {
        int i;
        String str = c16975e.loadAd;
        String str2 = this.vip;
        if ((!str2.equals(str) && !str2.equals(AbstractC7473e.metrica(c16975e))) || !metrica(context, c16975e, true) || !license(c16975e)) {
            return false;
        }
        if (this.startapp) {
            int i2 = c16975e.tapsense;
            if (i2 > 0 && (i = c16975e.isVip) > 0) {
                return billing(c16975e.applovin, i2, i);
            }
        } else {
            int i3 = c16975e.f33281goto;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.license;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    yandex("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    yandex("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    yandex("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = c16975e.f33282interface;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    yandex("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    yandex("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder smaato = AbstractC10257e.smaato("AssumedMaxChannelAdjustment: ", this.ad, ", [", maxInputChannelCount, " to ");
                    smaato.append(i5);
                    smaato.append("]");
                    AbstractC2803e.smaato("MediaCodecInfo", smaato.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    yandex("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean billing(double d, int i, int i2) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.license;
        if (codecCapabilities == null) {
            yandex("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            yandex("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int vip = (i3 < 29 || ((bool = AbstractC5032e.license) != null && bool.booleanValue())) ? 0 : AbstractC14204e.vip(videoCapabilities, i, i2, d);
            if (vip != 2) {
                if (vip == 1) {
                    StringBuilder pro = AbstractC17861e.pro(i, i2, "sizeAndRate.cover, ", "x", "@");
                    pro.append(d);
                    yandex(pro.toString());
                    return false;
                }
            }
            return true;
        }
        if (!ad(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.ad;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && ad(videoCapabilities, i2, i, d)) {
                    StringBuilder pro2 = AbstractC17861e.pro(i, i2, "sizeAndRate.rotated, ", "x", "@");
                    pro2.append(d);
                    StringBuilder tapsense = AbstractC17861e.tapsense("AssumedSupport [", pro2.toString(), "] [", str, ", ");
                    tapsense.append(this.vip);
                    tapsense.append("] [");
                    tapsense.append(AbstractC9413e.ad);
                    tapsense.append("]");
                    AbstractC2803e.license("MediaCodecInfo", tapsense.toString());
                    return true;
                }
            }
            StringBuilder pro3 = AbstractC17861e.pro(i, i2, "sizeAndRate.support, ", "x", "@");
            pro3.append(d);
            yandex(pro3.toString());
            return false;
        }
        return true;
    }

    public final boolean license(C16975e c16975e) {
        return (Objects.equals(c16975e.loadAd, "audio/flac") && c16975e.f33285this == 22 && Build.VERSION.SDK_INT < 34 && this.ad.equals("c2.android.flac.decoder")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean metrica(android.content.Context r21, defpackage.C16975e r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10643e.metrica(android.content.Context, eٌْٗ, boolean):boolean");
    }

    public final boolean purchase(C16975e c16975e) {
        if (this.startapp) {
            return this.appmetrica;
        }
        Pair vip = AbstractC13612e.vip(c16975e);
        return vip != null && ((Integer) vip.first).intValue() == 42;
    }

    public final String toString() {
        return this.ad;
    }

    public final C4268e vip(C16975e c16975e, C16975e c16975e2) {
        C16975e c16975e3;
        C16975e c16975e4;
        int i;
        String str = c16975e.loadAd;
        C14754e c14754e = c16975e.firebase;
        String str2 = c16975e2.loadAd;
        C14754e c14754e2 = c16975e2.firebase;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.startapp) {
            if (c16975e.ads != c16975e2.ads) {
                i2 |= 1024;
            }
            boolean z = (c16975e.tapsense == c16975e2.tapsense && c16975e.isVip == c16975e2.isVip) ? false : true;
            if (!this.appmetrica && z) {
                i2 |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
            }
            if ((!C14754e.appmetrica(c14754e) || !C14754e.appmetrica(c14754e2)) && !Objects.equals(c14754e, c14754e2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.ad) && !c16975e.vip(c16975e2)) {
                i2 |= 2;
            }
            int i3 = c16975e.inmobi;
            if (i3 != -1 && (i = c16975e.isPro) != -1 && i3 == c16975e2.inmobi && i == c16975e2.isPro && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(c16975e2.loadAd, "video/dolby-vision")) {
                Pair vip = AbstractC13612e.vip(c16975e);
                Pair vip2 = AbstractC13612e.vip(c16975e2);
                if (vip == null || vip2 == null || !((Integer) vip.first).equals(vip2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new C4268e(this.ad, c16975e, c16975e2, c16975e.vip(c16975e2) ? 3 : 2, 0);
            }
            c16975e3 = c16975e;
            c16975e4 = c16975e2;
        } else {
            c16975e3 = c16975e;
            c16975e4 = c16975e2;
            if (c16975e3.f33282interface != c16975e4.f33282interface) {
                i2 |= 4096;
            }
            if (c16975e3.f33281goto != c16975e4.f33281goto) {
                i2 |= 8192;
            }
            if (c16975e3.f33285this != c16975e4.f33285this) {
                i2 |= 16384;
            }
            String str3 = this.vip;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair vip3 = AbstractC13612e.vip(c16975e3);
                Pair vip4 = AbstractC13612e.vip(c16975e4);
                if (vip3 != null && vip4 != null) {
                    int intValue = ((Integer) vip3.first).intValue();
                    int intValue2 = ((Integer) vip4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C4268e(this.ad, c16975e3, c16975e4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && vip3.equals(vip4)) {
                        return new C4268e(this.ad, c16975e3, c16975e4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new C4268e(this.ad, c16975e3, c16975e4, 3, 0);
            }
            if (!c16975e3.vip(c16975e4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C4268e(this.ad, c16975e3, c16975e4, 1, 0);
            }
        }
        return new C4268e(this.ad, c16975e3, c16975e4, 0, i2);
    }

    public final void yandex(String str) {
        StringBuilder applovin = AbstractC8703e.applovin("NoSupport [", str, "] [");
        applovin.append(this.ad);
        applovin.append(", ");
        applovin.append(this.vip);
        applovin.append("] [");
        applovin.append(AbstractC9413e.ad);
        applovin.append("]");
        AbstractC2803e.license("MediaCodecInfo", applovin.toString());
    }
}
