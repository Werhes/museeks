package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14022e implements InterfaceC11571e {
    public final InterfaceC13403e ad;
    public static final C1950e vip = new C1950e();
    public static final C3443e metrica = new C3443e(10);
    public static final C3210e license = new C3210e(3);

    public C14022e(InterfaceC13403e interfaceC13403e) {
        this.ad = interfaceC13403e;
    }

    @Override // defpackage.InterfaceC11571e
    public final void ad(String str, C4052e c4052e) {
        InterfaceC13403e interfaceC13403e = this.ad;
        if (interfaceC13403e.loadAd() && str.indexOf(":") != interfaceC13403e.amazon().length() + 1) {
            throw C15608e.ad(interfaceC13403e.amazon(), 27, str);
        }
    }
}
