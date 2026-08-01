package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2182e {
    public static final C12916e ad = new C12916e(12, C13664e.f27089e);
    public static final C12916e license;
    public static final C12916e metrica;
    public static final C12916e vip;

    static {
        int i = 4096;
        AbstractC17540e.ad(4096);
        C3645e c3645e = new C3645e(i);
        AbstractC17540e.ad(4096);
        C16320e c16320e = new C16320e(c3645e, new C3645e(i));
        int i2 = 12;
        vip = new C12916e(i2, c16320e);
        metrica = new C12916e(i2, Boolean.FALSE);
        license = new C12916e(i2, Boolean.TRUE);
    }

    public static final void ad(C5944e c5944e, boolean z) {
        int i = z ? 200 : 0;
        C12916e c12916e = AbstractC15659e.ad;
        c5944e.vip().ad(AbstractC15659e.ad, i > 0 ? new C9856e(i) : InterfaceC5562e.ad);
    }

    public static final void metrica(C5944e c5944e, AbstractC8981e... abstractC8981eArr) {
        vip(c5944e, AbstractC1660e.m670implements(abstractC8981eArr));
    }

    public static final void vip(C5944e c5944e, List list) {
        c5944e.vip().ad(ad, AbstractC18467e.metrica(list));
        String m3608try = AbstractC13480e.m3608try(list, null, null, null, new C2109e(10, new Object()), 31);
        if (m3608try != null) {
            c5944e.metrica().put("coil#transformations", m3608try);
        } else {
            c5944e.metrica().remove("coil#transformations");
        }
    }
}
