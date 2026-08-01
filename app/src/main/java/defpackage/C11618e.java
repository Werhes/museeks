package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11618e implements InterfaceC5083e, InterfaceC18430e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC8850e f23326e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC5083e f23327e;

    public C11618e(InterfaceC5083e interfaceC5083e, InterfaceC8850e interfaceC8850e) {
        this.f23327e = interfaceC5083e;
        this.f23326e = interfaceC8850e;
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return this.f23326e;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        this.f23327e.billing(obj);
    }

    @Override // defpackage.InterfaceC18430e
    public final InterfaceC18430e vip() {
        InterfaceC5083e interfaceC5083e = this.f23327e;
        if (interfaceC5083e instanceof InterfaceC18430e) {
            return (InterfaceC18430e) interfaceC5083e;
        }
        return null;
    }
}
