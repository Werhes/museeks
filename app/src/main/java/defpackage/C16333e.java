package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16333e {
    public final C16724e ad(Object obj) {
        AbstractC18270e abstractC18270e = (AbstractC18270e) obj;
        C16724e c16724e = abstractC18270e.unknownFields;
        if (c16724e != C16724e.purchase) {
            return c16724e;
        }
        C16724e c16724e2 = new C16724e(0, new int[8], new Object[8], true);
        abstractC18270e.unknownFields = c16724e2;
        return c16724e2;
    }

    public final boolean vip(int i, C11226e c11226e, Object obj) {
        int i2 = c11226e.vip;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c11226e.m3077continue(0);
            ((C16724e) obj).metrica(i3 << 3, Long.valueOf(((AbstractC3513e) c11226e.appmetrica).amazon()));
            return true;
        }
        if (i4 == 1) {
            c11226e.m3077continue(1);
            ((C16724e) obj).metrica((i3 << 3) | 1, Long.valueOf(((AbstractC3513e) c11226e.appmetrica).mopub()));
            return true;
        }
        if (i4 == 2) {
            ((C16724e) obj).metrica((i3 << 3) | 2, c11226e.admob());
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
                throw C11690e.vip();
            }
            c11226e.m3077continue(5);
            ((C16724e) obj).metrica(5 | (i3 << 3), Integer.valueOf(((AbstractC3513e) c11226e.appmetrica).adcel()));
            return true;
        }
        C16724e c16724e = new C16724e(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c11226e.appmetrica() != Integer.MAX_VALUE && vip(i7, c11226e, c16724e)) {
        }
        if (i6 != c11226e.vip) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        if (c16724e.appmetrica) {
            c16724e.appmetrica = false;
        }
        ((C16724e) obj).metrica(i5 | 3, c16724e);
        return true;
    }
}
