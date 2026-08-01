package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2717e extends AbstractRunnableC4951e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6599e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C17768e f6600e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f6601e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f6602e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ String f6603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2717e(C17768e c17768e, C4360e c4360e, String str, String str2) {
        super(c17768e, true);
        this.f6601e = c4360e;
        this.f6603e = str;
        this.f6602e = str2;
        Objects.requireNonNull(c17768e);
        this.f6600e = c17768e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2717e(C17768e c17768e, String str, String str2, BinderC7948e binderC7948e) {
        super(c17768e, true);
        this.f6603e = str;
        this.f6602e = str2;
        this.f6601e = binderC7948e;
        this.f6600e = c17768e;
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void ad() {
        switch (this.f6599e) {
            case 0:
                InterfaceC3741e interfaceC3741e = this.f6600e.purchase;
                AbstractC9528e.startapp(interfaceC3741e);
                interfaceC3741e.getConditionalUserProperties(this.f6603e, this.f6602e, (BinderC7948e) this.f6601e);
                return;
            default:
                InterfaceC3741e interfaceC3741e2 = this.f6600e.purchase;
                AbstractC9528e.startapp(interfaceC3741e2);
                interfaceC3741e2.setCurrentScreenByScionActivityInfo((C4360e) this.f6601e, this.f6603e, this.f6602e, this.f10474e);
                return;
        }
    }

    @Override // defpackage.AbstractRunnableC4951e
    public void vip() {
        switch (this.f6599e) {
            case 0:
                ((BinderC7948e) this.f6601e).tapsense(null);
                return;
            default:
                return;
        }
    }
}
