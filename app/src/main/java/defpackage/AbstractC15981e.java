package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15981e {
    public static final C3123e ad;

    static {
        C14093e c14093e = C4717e.appmetrica;
        int i = c14093e.metrica;
        C5759e c5759e = new C5759e(c14093e, c14093e, 1);
        int i2 = c14093e.metrica;
        C1817e c1817e = C4717e.inmobi;
        int i3 = (c1817e.metrica << 6) | i2;
        C5759e c5759e2 = new C5759e(c14093e, c1817e, 0);
        int i4 = (i2 << 6) | c1817e.metrica;
        C5759e c5759e3 = new C5759e(c1817e, c14093e, 0);
        C3123e c3123e = AbstractC12146e.ad;
        C3123e c3123e2 = new C3123e();
        c3123e2.startapp(i | (i << 6), c5759e);
        c3123e2.startapp(i3, c5759e2);
        c3123e2.startapp(i4, c5759e3);
        ad = c3123e2;
    }
}
