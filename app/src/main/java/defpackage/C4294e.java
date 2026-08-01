package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4294e {
    public final C1543e ad;
    public final C1543e vip;

    static {
        Float valueOf = Float.valueOf(0.0f);
        C6571e c6571e = new C6571e(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        new C4294e(c6571e, new C6571e(valueOf2, valueOf2));
    }

    public C4294e(C6571e... c6571eArr) {
        this.ad = new C1543e(c6571eArr.length);
        this.vip = new C1543e(c6571eArr.length);
        int length = c6571eArr.length;
        for (int i = 0; i < length; i++) {
            this.ad.ad(((Number) c6571eArr[i].f13544e).floatValue());
            this.vip.ad(((Number) c6571eArr[i].f13543e).floatValue());
        }
        AbstractC9931e.billing(this.ad);
        AbstractC9931e.billing(this.vip);
    }
}
