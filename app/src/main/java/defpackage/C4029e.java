package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4029e implements InterfaceC11751e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f8958e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC16612e f8959e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C16558e f8960e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15683e f8961e;

    public C4029e(C16558e c16558e, C15683e c15683e) {
        this.f8960e = c16558e;
        this.f8961e = c15683e;
    }

    @Override // defpackage.InterfaceC11751e
    public final void release() {
        Handler handler = this.f8960e.f32506e;
        handler.getClass();
        AbstractC9413e.m2565strictfp(handler, new RunnableC17584e(23, this));
    }
}
