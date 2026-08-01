package defpackage;

import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۧۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17432e {
    public static final C0193e ad;
    public static final String[] license;
    public static final String[] metrica;
    public static final String[] vip;

    static {
        C0193e c0193e = new C0193e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(AbstractC5508e.ad));
        c0193e.f1410e = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        ad = c0193e;
        vip = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        metrica = new String[64];
        String[] strArr = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            strArr[i] = AbstractC16286e.license("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        license = strArr;
        String[] strArr2 = metrica;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC1786e.signatures(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = metrica;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC1786e.signatures(sb, strArr3[i4], "|PADDED");
        }
        int length = metrica.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = metrica;
            if (strArr4[i7] == null) {
                strArr4[i7] = license[i7];
            }
        }
    }

    public static String ad(int i) {
        String[] strArr = vip;
        return i < strArr.length ? strArr[i] : AbstractC16286e.license("0x%02x", Integer.valueOf(i));
    }

    public static String metrica(int i, int i2, long j, boolean z) {
        return AbstractC16286e.license("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), ad(8), Long.valueOf(j));
    }

    public static String vip(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String ad2 = ad(i3);
        if (i4 == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            String[] strArr = license;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr2 = metrica;
                    String str2 = i4 < strArr2.length ? strArr2[i4] : strArr[i4];
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : AbstractC6507e.subscription(str2, "PRIORITY", "COMPRESSED", false) : AbstractC6507e.subscription(str2, "HEADERS", "PUSH_PROMISE", false);
                }
            }
            str = strArr[i4];
        }
        return AbstractC16286e.license("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), ad2, str);
    }
}
