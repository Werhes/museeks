package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۥٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0688e extends AbstractC9531e {
    public final int billing;
    public final C7960e purchase;
    public int yandex;

    public C0688e(AbstractC0232e abstractC0232e, C7960e c7960e) {
        super(abstractC0232e, null);
        this.purchase = c7960e;
        this.billing = c7960e.f16124e.size();
        this.yandex = -1;
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: catch */
    public final AbstractC1948e mo263catch() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: implements */
    public final String mo264implements(InterfaceC9998e interfaceC9998e, int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: interface */
    public final AbstractC1948e mo265interface(String str) {
        return (AbstractC1948e) this.purchase.f16124e.get(Integer.parseInt(str));
    }

    @Override // defpackage.InterfaceC2043e
    public final int yandex(InterfaceC9998e interfaceC9998e) {
        int i = this.yandex;
        if (i >= this.billing - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.yandex = i2;
        return i2;
    }
}
