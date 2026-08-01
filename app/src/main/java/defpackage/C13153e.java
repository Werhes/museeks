package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13153e extends AbstractC3839e {
    public final /* synthetic */ int metrica;
    public static final C13153e license = new C13153e("must have no value parameters", 0);
    public static final C13153e appmetrica = new C13153e("must have a single value parameter", 1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13153e(String str, int i) {
        super(str, 1);
        this.metrica = i;
    }

    @Override // defpackage.InterfaceC16897e
    public final boolean metrica(C0782e c0782e) {
        switch (this.metrica) {
            case 0:
                return c0782e.mo330e().isEmpty();
            default:
                return c0782e.mo330e().size() == 1;
        }
    }
}
