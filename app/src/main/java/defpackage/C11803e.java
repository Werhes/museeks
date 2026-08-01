package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11803e extends AbstractC0181e {
    public final /* synthetic */ int yandex;
    public static final C11803e startapp = new C11803e(0);
    public static final C11803e adcel = new C11803e(1);
    public static final C11803e mopub = new C11803e(2);

    public /* synthetic */ C11803e(int i) {
        this.yandex = i;
    }

    @Override // defpackage.AbstractC0181e
    public final InterfaceC14822e license(C17611e c17611e, InterfaceC9905e interfaceC9905e) {
        switch (this.yandex) {
            case 0:
                return c17611e.metrica.firebase(interfaceC9905e);
            case 1:
                throw new UnsupportedOperationException("Should not be called");
            default:
                return c17611e.metrica.mo1279strictfp(interfaceC9905e);
        }
    }
}
