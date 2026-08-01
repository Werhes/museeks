package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۢؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2164e {
    public final /* synthetic */ C3225e ad;
    public final /* synthetic */ EnumC17426e vip;

    public C2164e(C3225e c3225e, EnumC17426e enumC17426e) {
        this.ad = c3225e;
        this.vip = enumC17426e;
    }

    public final int ad() {
        return this.ad.ad;
    }

    public final long metrica() {
        int i = this.ad.Signature;
        int ordinal = this.vip.ordinal();
        if (ordinal == 0) {
            return (i & 4294967295L) | (0 << 32);
        }
        if (ordinal == 1) {
            return (i << 32) | (4294967295L & 0);
        }
        throw new C14803e(10);
    }

    public final long vip() {
        int i = this.ad.loadAd;
        int ordinal = this.vip.ordinal();
        if (ordinal == 0) {
            return AbstractC17324e.vip(0, i);
        }
        if (ordinal == 1) {
            return AbstractC17324e.vip(i, 0);
        }
        throw new C14803e(10);
    }
}
