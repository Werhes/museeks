package defpackage;

import android.util.Range;
import android.util.Rational;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۨۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14417e {
    public static final LinkedHashMap ad;

    static {
        C7248e c7248e = C7248e.license;
        C6571e c6571e = new C6571e(1, c7248e);
        C7248e c7248e2 = C7248e.billing;
        C6571e c6571e2 = new C6571e(2, c7248e2);
        C7248e c7248e3 = C7248e.yandex;
        ad = AbstractC10064e.billing(new C6571e("video/hevc", AbstractC10064e.purchase(c6571e, c6571e2, new C6571e(4096, c7248e3), new C6571e(8192, c7248e3))), new C6571e("video/av01", AbstractC10064e.purchase(new C6571e(1, c7248e), new C6571e(2, c7248e2), new C6571e(4096, c7248e3), new C6571e(8192, c7248e3))), new C6571e("video/x-vnd.on2.vp9", AbstractC10064e.purchase(new C6571e(1, c7248e), new C6571e(4, c7248e2), new C6571e(4096, c7248e3), new C6571e(16384, c7248e3), new C6571e(2, c7248e), new C6571e(8, c7248e2), new C6571e(8192, c7248e3), new C6571e(32768, c7248e3))), new C6571e("video/dolby-vision", AbstractC10064e.purchase(new C6571e(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), c7248e2), new C6571e(Integer.valueOf(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE), C7248e.appmetrica))));
    }

    public static C7248e ad(int i, String str) {
        C7248e c7248e;
        Map map = (Map) ad.get(str);
        if (map != null && (c7248e = (C7248e) map.get(Integer.valueOf(i))) != null) {
            return c7248e;
        }
        AbstractC9464e.remoteconfig("VideoConfigUtil", "Unsupported mime type " + str + " or profile level " + i + ". Data space is unspecified.");
        return C7248e.license;
    }

    public static final int license(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        String str;
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        int doubleValue = (int) (new Rational(i8, i9).doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        if (AbstractC9464e.smaato("VideoConfigUtil")) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "Base Bitrate(", "bps) * Bit Depth Ratio (", " / ");
            AbstractC10257e.signatures(pro, i3, ") * Frame Rate Ratio(", i4, " / ");
            AbstractC10257e.signatures(pro, i5, ") * Width Ratio(", i6, " / ");
            AbstractC10257e.signatures(pro, i7, ") * Height Ratio(", i8, " / ");
            pro.append(i9);
            pro.append(") = ");
            pro.append(doubleValue);
            str = pro.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        AbstractC9464e.yandex("VideoConfigUtil", str);
        return doubleValue;
    }

    public static final C16980e metrica(C18247e c18247e, C14677e c14677e, C1296e c1296e) {
        int i = c18247e.vip;
        int i2 = c14677e.ad;
        if (!c14677e.vip()) {
            throw new IllegalStateException(("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c14677e + ']').toString());
        }
        String str = i == 1 ? "video/x-vnd.on2.vp8" : "video/avc";
        if (c1296e != null) {
            Set set = (Set) AbstractC6814e.vip.get(Integer.valueOf(i2));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) AbstractC6814e.ad.get(Integer.valueOf(c14677e.vip));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (C1900e c1900e : c1296e.license) {
                if (set.contains(Integer.valueOf(c1900e.adcel)) && set2.contains(Integer.valueOf(c1900e.yandex))) {
                    String str2 = c1900e.vip;
                    if (str.equals(str2)) {
                        AbstractC9464e.yandex("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str + ']');
                    } else if (i == -1) {
                        AbstractC9464e.yandex("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using CamcorderProfile to derive VIDEO settings [mime type: " + str + ", dynamic range: " + c14677e + ']');
                    }
                    str = str2;
                    break;
                }
            }
        }
        c1900e = null;
        if (c1900e == null) {
            if (i == -1) {
                String str3 = i2 != 1 ? (i2 == 3 || i2 == 4 || i2 == 5) ? "video/hevc" : i2 != 6 ? null : "video/dolby-vision" : "video/avc";
                if (str3 == null) {
                    throw new UnsupportedOperationException("Unsupported dynamic range: " + c14677e + "\nNo supported default mime type available.");
                }
                str = str3;
            }
            if (c1296e == null) {
                AbstractC9464e.yandex("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str + ", dynamic range: " + c14677e + ']');
            } else {
                AbstractC9464e.yandex("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str + ", dynamic range: " + c14677e + ']');
            }
        }
        return new C16980e(str, c1900e);
    }

    public static C12899e vip(C10354e c10354e, Range range) {
        Range range2 = C6122e.admob;
        int intValue = range.equals(range2) ? 30 : ((Number) range.getUpper()).intValue();
        c10354e.getClass();
        StringBuilder sb = new StringBuilder("Resolved capture/encode frame rate ");
        sb.append(intValue);
        sb.append("fps/");
        sb.append(intValue);
        sb.append("fps, [Expected operating range: ");
        sb.append(range.equals(range2) ? "<UNSPECIFIED>" : String.valueOf(range));
        sb.append(']');
        AbstractC9464e.yandex("VideoConfigUtil", sb.toString());
        return new C12899e(intValue, intValue);
    }
}
