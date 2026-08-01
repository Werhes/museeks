package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6578e extends AbstractC9531e {
    public final AbstractC1948e purchase;

    public C6578e(AbstractC0232e abstractC0232e, AbstractC1948e abstractC1948e, String str) {
        super(abstractC0232e, str);
        this.purchase = abstractC1948e;
        this.ad.add("primitive");
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: catch */
    public final AbstractC1948e mo263catch() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: interface */
    public final AbstractC1948e mo265interface(String str) {
        if (str == "primitive") {
            return this.purchase;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // defpackage.InterfaceC2043e
    public final int yandex(InterfaceC9998e interfaceC9998e) {
        return 0;
    }
}
