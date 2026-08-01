package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3493e {
    public static C1434e ad(Object obj) {
        AbstractC3405e abstractC3405e = (AbstractC3405e) obj;
        C1434e c1434e = abstractC3405e.unknownFields;
        if (c1434e != C1434e.purchase) {
            return c1434e;
        }
        C1434e metrica = C1434e.metrica();
        abstractC3405e.unknownFields = metrica;
        return metrica;
    }

    public static boolean vip(int i, C11226e c11226e, Object obj) {
        int i2 = c11226e.vip;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c11226e.m3077continue(0);
            ((C1434e) obj).license(i3 << 3, Long.valueOf(((AbstractC15825e) c11226e.appmetrica).premium()));
            return true;
        }
        if (i4 == 1) {
            c11226e.m3077continue(1);
            ((C1434e) obj).license((i3 << 3) | 1, Long.valueOf(((AbstractC15825e) c11226e.appmetrica).isPro()));
            return true;
        }
        if (i4 == 2) {
            ((C1434e) obj).license((i3 << 3) | 2, c11226e.remoteconfig());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new IOException("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw C8868e.metrica();
            }
            c11226e.m3077continue(5);
            ((C1434e) obj).license(5 | (i3 << 3), Integer.valueOf(((AbstractC15825e) c11226e.appmetrica).inmobi()));
            return true;
        }
        C1434e metrica = C1434e.metrica();
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
        ((C1434e) obj).license(i5 | 3, metrica);
        return true;
    }
}
