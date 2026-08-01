package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16404e {
    public static final String[] ad;
    public static final List vip;

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        ad = strArr;
        vip = Arrays.asList(strArr);
    }

    public static void ad(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC7890e.yandex(charAt, 32) <= 0 || AbstractC5304e.isPro("\"(),/:;<=>?@[\\]{}", charAt)) {
                StringBuilder applovin = AbstractC8703e.applovin("Header name '", str, "' contains illegal character '");
                applovin.append(str.charAt(i2));
                applovin.append("' (code ");
                throw new IllegalArgumentException(AbstractC1786e.pro(applovin, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    public static void vip(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC7890e.yandex(charAt, 32) < 0 && charAt != '\t') {
                StringBuilder applovin = AbstractC8703e.applovin("Header value '", str, "' contains illegal character '");
                applovin.append(str.charAt(i2));
                applovin.append("' (code ");
                throw new IllegalArgumentException(AbstractC1786e.pro(applovin, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }
}
