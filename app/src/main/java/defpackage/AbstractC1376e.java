package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1376e {
    public static final C2892e ad = new C2892e(547289810, false, new C10387e(13));

    public static final InterfaceC12864e ad(InterfaceC12864e interfaceC12864e, float f) {
        return f == 1.0f ? interfaceC12864e : AbstractC12546e.startapp(interfaceC12864e, 0.0f, 0.0f, f, 0.0f, null, true, 520187);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؚؗۘ, eًۖ٘] */
    public static final C8130e license(Context context) {
        C18381e c18381e;
        AbstractC9528e.adcel(context, "Context must not be null");
        ?? abstractC6950e = new AbstractC6950e(context, C8130e.advert, null, C16258e.metrica);
        C2271e c2271e = C18381e.license;
        synchronized (C18381e.class) {
            try {
                C16284e c16284e = new C16284e(abstractC6950e);
                C2271e c2271e2 = C18381e.license;
                if (!c2271e2.containsKey(c16284e)) {
                    c2271e2.put(c16284e, new C18381e());
                }
                c18381e = (C18381e) c2271e2.get(c16284e);
            } catch (Throwable th) {
                throw th;
            }
        }
        abstractC6950e.mopub = c18381e;
        return abstractC6950e;
    }

    public static final long metrica(int i, int i2, C11388e c11388e) {
        C16585e c16585e;
        if (i == -1) {
            return (i2 << 32) | (4294967295L & (-1));
        }
        boolean z = i > i2;
        C6656e c6656e = c11388e.license;
        C2025e c2025e = (c6656e == null || (c16585e = (C16585e) c6656e.getValue()) == null) ? null : c16585e.vip;
        long ad2 = c2025e != null ? c2025e.ad(i, false) : AbstractC9262e.metrica(i, i);
        long purchase = c11388e.purchase(ad2);
        int m2467class = AbstractC8703e.m2467class((C12347e.license(ad2) && C12347e.license(purchase)) ? 1 : (C12347e.license(ad2) || C12347e.license(purchase)) ? (!C12347e.license(ad2) || C12347e.license(purchase)) ? 4 : 2 : 3);
        if (m2467class == 0) {
            return AbstractC7111e.appmetrica(i, z ? 1 : 2);
        }
        if (m2467class == 1) {
            return z ? i == ((int) (purchase >> 32)) ? AbstractC7111e.appmetrica(i, 1) : AbstractC7111e.appmetrica((int) (purchase & 4294967295L), 2) : i == ((int) (purchase & 4294967295L)) ? AbstractC7111e.appmetrica(i, 2) : AbstractC7111e.appmetrica((int) (purchase >> 32), 1);
        }
        if (m2467class == 2) {
            return z ? AbstractC7111e.appmetrica((int) (purchase & 4294967295L), 1) : AbstractC7111e.appmetrica((int) (purchase >> 32), 2);
        }
        if (m2467class == 3) {
            return (i << 32) | (4294967295L & (-1));
        }
        throw new C14803e(10);
    }

    public static boolean vip(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
