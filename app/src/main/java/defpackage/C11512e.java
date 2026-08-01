package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11512e extends AbstractC9559e {
    public final C4403e amazon;
    public C1326e loadAd;
    public final Object smaato;

    public C11512e(Object obj, C4403e c4403e) {
        this.smaato = obj;
        this.amazon = c4403e;
    }

    @Override // defpackage.AbstractC9790e
    public final Object license() {
        C1326e c1326e = this.loadAd;
        return c1326e == null ? this.smaato : this.amazon.apply(c1326e.license());
    }
}
