package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17339e implements InterfaceC12179e, AutoCloseable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f34022e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0333e f34023e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f34024e;

    public C17339e(String str, C0333e c0333e) {
        this.f34024e = str;
        this.f34023e = c0333e;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        if (enumC14621e == EnumC14621e.ON_DESTROY) {
            this.f34022e = false;
            interfaceC16400e.vip().vip(this);
        }
    }

    public final void ad(C3168e c3168e, AbstractC0003e abstractC0003e) {
        if (this.f34022e) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f34022e = true;
        abstractC0003e.ad(this);
        c3168e.m1261e(this.f34024e, (C14574e) this.f34023e.ad.f36194e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
