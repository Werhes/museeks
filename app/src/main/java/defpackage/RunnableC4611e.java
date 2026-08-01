package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4611e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f9936e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC14621e f9937e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4891e f9938e;

    public RunnableC4611e(C4891e c4891e, EnumC14621e enumC14621e) {
        this.f9938e = c4891e;
        this.f9937e = enumC14621e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9936e) {
            return;
        }
        this.f9938e.appmetrica(this.f9937e);
        this.f9936e = true;
    }
}
