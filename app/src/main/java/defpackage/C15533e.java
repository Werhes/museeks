package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15533e {
    public final InterfaceC10864e ad;
    public C10014e vip;
    public final C3631e metrica = new C3631e(this, 2);
    public final C3631e license = new C3631e(this, 0);
    public final C3631e appmetrica = new C3631e(this, 1);

    public C15533e(InterfaceC10864e interfaceC10864e) {
        this.ad = interfaceC10864e;
    }

    public final C10014e ad() {
        C10014e c10014e = this.vip;
        if (c10014e != null) {
            return c10014e;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
