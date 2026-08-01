package defpackage;

import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۥٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4495e {
    public final C1292e ad = new C1292e();
    public final StringBuilder vip = new StringBuilder();
    public static final Pattern metrica = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern license = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    public static String ad(C1292e c1292e, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c1292e.vip;
        int i2 = c1292e.metrica;
        while (i < i2 && !z) {
            char c = (char) c1292e.ad[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        c1292e.m568protected(i - c1292e.vip);
        return sb.toString();
    }

    public static void metrica(C1292e c1292e) {
        while (true) {
            for (boolean z = true; c1292e.ad() > 0 && z; z = false) {
                int i = c1292e.vip;
                byte[] bArr = c1292e.ad;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    c1292e.m568protected(1);
                } else {
                    int i2 = c1292e.metrica;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            c1292e.m568protected(i2 - c1292e.vip);
                        }
                    }
                }
            }
            return;
        }
    }

    public static String vip(C1292e c1292e, StringBuilder sb) {
        metrica(c1292e);
        if (c1292e.ad() == 0) {
            return null;
        }
        String ad = ad(c1292e, sb);
        if (!ad.isEmpty()) {
            return ad;
        }
        return BuildConfig.FLAVOR + ((char) c1292e.ads());
    }
}
