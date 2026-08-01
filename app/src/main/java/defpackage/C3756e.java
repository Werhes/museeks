package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3756e {
    public static C16137e ad(Object obj) {
        AbstractC4994e abstractC4994e = (AbstractC4994e) obj;
        C16137e c16137e = abstractC4994e.unknownFields;
        if (c16137e != C16137e.purchase) {
            return c16137e;
        }
        C16137e metrica = C16137e.metrica();
        abstractC4994e.unknownFields = metrica;
        return metrica;
    }

    public static boolean vip(int i, C11226e c11226e, Object obj) {
        int i2 = c11226e.vip;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c11226e.m3077continue(0);
            ((C16137e) obj).license(i3 << 3, Long.valueOf(((AbstractC15825e) c11226e.appmetrica).premium()));
            return true;
        }
        if (i4 == 1) {
            c11226e.m3077continue(1);
            ((C16137e) obj).license((i3 << 3) | 1, Long.valueOf(((AbstractC15825e) c11226e.appmetrica).isPro()));
            return true;
        }
        if (i4 == 2) {
            ((C16137e) obj).license((i3 << 3) | 2, c11226e.subscription());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C11872e.metrica();
            }
            c11226e.m3077continue(5);
            ((C16137e) obj).license(5 | (i3 << 3), Integer.valueOf(((AbstractC15825e) c11226e.appmetrica).inmobi()));
            return true;
        }
        C16137e metrica = C16137e.metrica();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c11226e.appmetrica() != Integer.MAX_VALUE && vip(i7, c11226e, metrica)) {
        }
        if (i6 != c11226e.vip) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        if (metrica.appmetrica) {
            metrica.appmetrica = false;
        }
        ((C16137e) obj).license(i5 | 3, metrica);
        return true;
    }
}
