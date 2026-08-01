package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٛۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18220e implements InterfaceC12179e, InterfaceC18435e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC8850e f35680e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC0003e f35681e;

    public C18220e(AbstractC0003e abstractC0003e, InterfaceC8850e interfaceC8850e) {
        this.f35681e = abstractC0003e;
        this.f35680e = interfaceC8850e;
        if (((C4891e) abstractC0003e).license == EnumC7785e.f15780e) {
            AbstractC6629e.license(interfaceC8850e, null);
        }
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        AbstractC0003e abstractC0003e = this.f35681e;
        if (((C4891e) abstractC0003e).license.compareTo(EnumC7785e.f15780e) <= 0) {
            abstractC0003e.vip(this);
            AbstractC6629e.license(this.f35680e, null);
        }
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f35680e;
    }
}
