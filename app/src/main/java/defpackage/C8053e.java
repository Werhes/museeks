package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8053e {
    public static final HashMap Signature;
    public static final HashMap admob;
    public static final HashMap amazon;
    public static final HashMap loadAd;
    public static final HashMap pro;
    public static final HashMap remoteconfig;
    public static final HashMap signatures;
    public static final HashMap subscription;
    public static final HashMap tapsense;
    public byte[] ad;
    public boolean adcel;
    public boolean advert;
    public String appmetrica;
    public int billing;
    public int license;
    public String metrica;
    public boolean mopub;
    public Integer purchase;
    public Integer smaato;
    public boolean startapp;
    public int vip;
    public String yandex;

    static {
        HashMap hashMap = new HashMap();
        amazon = hashMap;
        hashMap.put(0, "MPEG-2.5");
        hashMap.put(2, "MPEG-2");
        hashMap.put(3, "MPEG-1");
        HashMap hashMap2 = new HashMap();
        loadAd = hashMap2;
        hashMap2.put(3, "Layer 1");
        hashMap2.put(2, "Layer 2");
        hashMap2.put(1, "Layer 3");
        HashMap hashMap3 = new HashMap();
        Signature = hashMap3;
        hashMap3.put(30, 32);
        hashMap3.put(46, 64);
        hashMap3.put(62, 96);
        hashMap3.put(78, 128);
        hashMap3.put(94, 160);
        hashMap3.put(110, 192);
        hashMap3.put(126, 224);
        Integer valueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        hashMap3.put(142, valueOf);
        hashMap3.put(158, 288);
        hashMap3.put(174, 320);
        hashMap3.put(190, 352);
        hashMap3.put(206, 384);
        hashMap3.put(222, 416);
        hashMap3.put(238, 448);
        hashMap3.put(28, 32);
        hashMap3.put(44, 48);
        hashMap3.put(60, 56);
        hashMap3.put(76, 64);
        hashMap3.put(92, 80);
        hashMap3.put(108, 96);
        hashMap3.put(124, 112);
        hashMap3.put(140, 128);
        AbstractC5087e.m1753throw(156, hashMap3, 160, 172, 192);
        AbstractC5087e.m1753throw(188, hashMap3, 224, 204, valueOf);
        AbstractC5087e.m1753throw(220, hashMap3, 320, 236, 384);
        hashMap3.put(26, 32);
        hashMap3.put(42, 40);
        hashMap3.put(58, 48);
        AbstractC5087e.m1753throw(74, hashMap3, 56, 90, 64);
        AbstractC5087e.m1753throw(106, hashMap3, 80, 122, 96);
        AbstractC5087e.m1753throw(138, hashMap3, 112, 154, 128);
        AbstractC5087e.m1753throw(170, hashMap3, 160, 186, 192);
        AbstractC5087e.m1753throw(202, hashMap3, 224, 218, valueOf);
        AbstractC5087e.m1753throw(234, hashMap3, 320, 22, 32);
        AbstractC5087e.m1753throw(38, hashMap3, 48, 54, 56);
        AbstractC5087e.m1753throw(70, hashMap3, 64, 86, 80);
        AbstractC5087e.m1753throw(102, hashMap3, 96, 118, 112);
        hashMap3.put(134, 128);
        hashMap3.put(150, 144);
        hashMap3.put(166, 160);
        hashMap3.put(182, 176);
        hashMap3.put(198, 192);
        AbstractC5087e.m1753throw(214, hashMap3, 224, 230, valueOf);
        hashMap3.put(20, 8);
        hashMap3.put(36, 16);
        hashMap3.put(52, 24);
        hashMap3.put(68, 32);
        AbstractC5087e.m1753throw(84, hashMap3, 40, 100, 48);
        AbstractC5087e.m1753throw(116, hashMap3, 56, 132, 64);
        AbstractC5087e.m1753throw(148, hashMap3, 80, 164, 96);
        AbstractC5087e.m1753throw(180, hashMap3, 112, 196, 128);
        AbstractC5087e.m1753throw(212, hashMap3, 144, 228, 160);
        AbstractC5087e.m1753throw(18, hashMap3, 8, 34, 16);
        AbstractC5087e.m1753throw(50, hashMap3, 24, 66, 32);
        AbstractC5087e.m1753throw(82, hashMap3, 40, 98, 48);
        AbstractC5087e.m1753throw(114, hashMap3, 56, 130, 64);
        AbstractC5087e.m1753throw(146, hashMap3, 80, 162, 96);
        AbstractC5087e.m1753throw(178, hashMap3, 112, 194, 128);
        hashMap3.put(210, 144);
        hashMap3.put(226, 160);
        HashMap hashMap4 = new HashMap();
        admob = hashMap4;
        hashMap4.put(0, "Stereo");
        hashMap4.put(1, "Joint Stereo");
        hashMap4.put(2, "Dual");
        hashMap4.put(3, "Mono");
        HashMap hashMap5 = new HashMap();
        subscription = hashMap5;
        hashMap5.put(0, "None");
        hashMap5.put(1, "5015MS");
        hashMap5.put(2, "Reserved");
        hashMap5.put(3, "CCITT");
        HashMap hashMap6 = new HashMap();
        remoteconfig = hashMap6;
        HashMap hashMap7 = new HashMap();
        pro = hashMap7;
        hashMap6.put(0, "4-31");
        hashMap6.put(1, "8-31");
        hashMap6.put(2, "12-31");
        hashMap6.put(3, "16-31");
        hashMap7.put(0, "off-off");
        hashMap7.put(1, "on-off");
        hashMap7.put(2, "off-on");
        hashMap7.put(3, "on-on");
        HashMap hashMap8 = new HashMap();
        signatures = hashMap8;
        HashMap hashMap9 = new HashMap();
        HashMap hashMap10 = new HashMap();
        HashMap hashMap11 = new HashMap();
        hashMap9.put(0, 44100);
        hashMap9.put(1, 48000);
        hashMap9.put(2, 32000);
        hashMap10.put(0, 22050);
        hashMap10.put(1, 24000);
        hashMap10.put(2, Integer.valueOf(AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE));
        hashMap11.put(0, 11025);
        hashMap11.put(1, 12000);
        hashMap11.put(2, 8000);
        hashMap8.put(3, hashMap9);
        hashMap8.put(2, hashMap10);
        hashMap8.put(0, hashMap11);
        HashMap hashMap12 = new HashMap();
        tapsense = hashMap12;
        HashMap hashMap13 = new HashMap();
        HashMap hashMap14 = new HashMap();
        HashMap hashMap15 = new HashMap();
        hashMap13.put(3, 384);
        hashMap13.put(2, 1152);
        hashMap13.put(1, 1152);
        hashMap14.put(3, 384);
        hashMap14.put(2, 1152);
        hashMap14.put(1, 1152);
        hashMap15.put(3, 384);
        hashMap15.put(2, 1152);
        hashMap15.put(1, 1152);
        hashMap12.put(3, hashMap13);
        hashMap12.put(2, hashMap14);
        hashMap12.put(0, hashMap15);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, eًٟٛ] */
    public static C8053e license(C16151e c16151e) {
        byte[] bArr = new byte[4];
        int min = Math.min(4, 4);
        for (int i = 0; i < min; i++) {
            bArr[i] = c16151e.Signature(i);
        }
        ?? obj = new Object();
        obj.ad = bArr;
        int i2 = bArr[2] & 240;
        byte b = bArr[1];
        Integer num = (Integer) Signature.get(Integer.valueOf(i2 | (b & 8) | (b & 6)));
        obj.purchase = num;
        if (num == null) {
            throw new Exception("Invalid bitrate");
        }
        byte b2 = (byte) ((bArr[1] & 24) >> 3);
        obj.vip = b2;
        String str = (String) amazon.get(Integer.valueOf(b2));
        obj.metrica = str;
        if (str == null) {
            throw new Exception("Invalid mpeg version");
        }
        int i3 = (bArr[1] & 6) >>> 1;
        obj.license = i3;
        String str2 = (String) loadAd.get(Integer.valueOf(i3));
        obj.appmetrica = str2;
        if (str2 == null) {
            throw new Exception("Invalid Layer");
        }
        obj.mopub = (bArr[1] & 1) == 0;
        int i4 = (bArr[2] & 12) >>> 2;
        Map map = (Map) signatures.get(Integer.valueOf(obj.vip));
        if (map == null) {
            throw new Exception("Invalid version");
        }
        Integer num2 = (Integer) map.get(Integer.valueOf(i4));
        obj.smaato = num2;
        if (num2 == null) {
            throw new Exception("Invalid sampling rate");
        }
        byte b3 = bArr[2];
        obj.startapp = (b3 & 2) != 0;
        obj.advert = (b3 & 1) != 0;
        int i5 = (bArr[3] & 192) >>> 6;
        obj.billing = i5;
        String str3 = (String) admob.get(Integer.valueOf(i5));
        obj.yandex = str3;
        if (str3 == null) {
            throw new Exception("Invalid channel mode");
        }
        int i6 = (bArr[3] & 48) >> 4;
        if (obj.license == 1) {
            if (((String) pro.get(Integer.valueOf(i6))) == null) {
                throw new Exception("Invalid Mode Extension");
            }
        } else if (((String) remoteconfig.get(Integer.valueOf(i6))) == null) {
            throw new Exception("Invalid Mode Extension");
        }
        byte b4 = bArr[3];
        obj.adcel = (b4 & 8) != 0;
        if (((String) subscription.get(Integer.valueOf(b4 & 3))) != null) {
            return obj;
        }
        throw new Exception("Invalid emphasis");
    }

    public static boolean metrica(C16151e c16151e) {
        return (c16151e.Signature((long) 0) & 255) == 255 && (c16151e.Signature((long) 1) & 224) == 224 && (c16151e.Signature((long) 2) & 252) != 252;
    }

    public final int ad() {
        int i = this.vip;
        if (i == 0 || i == 2) {
            int i2 = this.license;
            if (i2 == 1) {
                if (this.billing == 3) {
                    return vip() + ((this.purchase.intValue() * 72000) / this.smaato.intValue());
                }
                return vip() + ((this.purchase.intValue() * 144000) / this.smaato.intValue());
            }
            if (i2 == 2) {
                return vip() + ((this.purchase.intValue() * 144000) / this.smaato.intValue());
            }
            if (i2 == 3) {
                return (vip() + ((this.purchase.intValue() * 12000) / this.smaato.intValue())) * 4;
            }
            throw new RuntimeException("Mp3 Unknown Layer:" + this.license);
        }
        if (i != 3) {
            throw new RuntimeException("Mp3 Unknown Version:" + this.vip);
        }
        int i3 = this.license;
        if (i3 == 1) {
            return vip() + ((this.purchase.intValue() * 144000) / this.smaato.intValue());
        }
        if (i3 == 2) {
            return vip() + ((this.purchase.intValue() * 144000) / this.smaato.intValue());
        }
        if (i3 == 3) {
            return (vip() + ((this.purchase.intValue() * 12000) / this.smaato.intValue())) * 4;
        }
        throw new RuntimeException("Mp3 Unknown Layer:" + this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" mpeg frameheader: frame length:");
        sb.append(ad());
        sb.append(" version:");
        sb.append(this.metrica);
        sb.append(" layer:");
        sb.append(this.appmetrica);
        sb.append(" channelMode:");
        sb.append(this.yandex);
        sb.append(" noOfSamples:");
        sb.append(((Integer) ((Map) tapsense.get(Integer.valueOf(this.vip))).get(Integer.valueOf(this.license))).intValue());
        sb.append(" samplingRate:");
        sb.append(this.smaato);
        sb.append(" isPadding:");
        sb.append(this.startapp);
        sb.append(" isProtected:");
        sb.append(this.mopub);
        sb.append(" isPrivate:");
        sb.append(this.advert);
        sb.append(" isCopyrighted:");
        sb.append(this.adcel);
        sb.append(" isOriginal:");
        sb.append(this.adcel);
        sb.append(" isVariableBitRatefalse header as binary:");
        byte[] bArr = this.ad;
        sb.append(AbstractC18431e.ad(bArr[0]));
        sb.append(" ");
        sb.append(AbstractC18431e.ad(bArr[1]));
        sb.append(" ");
        sb.append(AbstractC18431e.ad(bArr[2]));
        sb.append(" ");
        sb.append(AbstractC18431e.ad(bArr[3]));
        return sb.toString();
    }

    public final int vip() {
        return this.startapp ? 1 : 0;
    }
}
