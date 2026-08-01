package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9608e extends AbstractC13270e {
    public static final /* synthetic */ InterfaceC8614e[] yandex = {AbstractC3820e.ad.yandex(new C12156e(C9608e.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};
    public final C0394e billing;
    public C1245e purchase;

    /* JADX WARN: Type inference failed for: r1v1, types: [eٖؑٚ, eٖۥٌ] */
    public C9608e(C6272e c6272e) {
        super(c6272e);
        this.billing = new C16622e(c6272e, new C12056e(this, c6272e, 24));
        int m2467class = AbstractC8703e.m2467class(1);
        if (m2467class != 0) {
            if (m2467class == 1) {
                metrica();
            } else {
                if (m2467class != 2) {
                    throw new C14803e(10);
                }
                metrica();
            }
        }
    }

    @Override // defpackage.AbstractC13270e
    public final InterfaceC2684e Signature() {
        return m2621native();
    }

    @Override // defpackage.AbstractC13270e
    public final InterfaceC0020e license() {
        return m2621native();
    }

    /* renamed from: native, reason: not valid java name */
    public final C18214e m2621native() {
        InterfaceC8614e interfaceC8614e = yandex[0];
        return (C18214e) this.billing.invoke();
    }

    @Override // defpackage.AbstractC13270e
    public final Iterable smaato() {
        return AbstractC13480e.m3571case(super.smaato(), new C3942e(this.license, advert()));
    }
}
