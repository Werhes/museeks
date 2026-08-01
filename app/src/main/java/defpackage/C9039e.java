package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9039e {
    public static final String appmetrica;
    public static final C9039e license;
    public static final C3426e metrica = new C3426e(new C10612e(1), C5949e.f12529e);
    public static final String purchase;
    public final C1410e ad;
    public final long vip;

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        license = new C9039e(0L, C1410e.f4222e);
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
    }

    public C9039e(long j, List list) {
        this.ad = AbstractC17475e.firebase(metrica, list);
        this.vip = j;
    }
}
