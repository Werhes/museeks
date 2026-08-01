package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15379e extends AbstractC17230e {
    public final C17681e ad;
    public final Object metrica;
    public final String vip;

    public C15379e(C17681e c17681e, C2403e c2403e, int i) {
        String str = c17681e.vip;
        c2403e = (i & 4) != 0 ? null : c2403e;
        this.ad = c17681e;
        this.vip = str;
        this.metrica = c2403e;
    }

    @Override // defpackage.AbstractC17230e
    public final C17681e ad() {
        return this.ad;
    }

    @Override // defpackage.AbstractC17230e
    public final C14171e license() {
        return null;
    }

    @Override // defpackage.AbstractC17230e
    public final String metrica() {
        return this.vip;
    }

    @Override // defpackage.AbstractC17230e
    public final Object vip() {
        return this.metrica;
    }
}
