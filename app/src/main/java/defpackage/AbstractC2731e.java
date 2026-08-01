package defpackage;

import androidx.car.app.adcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2731e implements InterfaceC16400e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final adcel f6629e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4891e f6630e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4891e f6631e;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.car.app.mopub, java.lang.Object] */
    public AbstractC2731e() {
        C8344e c8344e = new C8344e(4, this);
        C4891e c4891e = new C4891e(this, true);
        this.f6631e = c4891e;
        this.f6630e = new C4891e(this, true);
        c4891e.ad(c8344e);
        this.f6629e = new adcel(c4891e, new Object());
    }

    public final void metrica(EnumC14621e enumC14621e) {
        this.f6631e.appmetrica(enumC14621e);
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f6630e;
    }
}
