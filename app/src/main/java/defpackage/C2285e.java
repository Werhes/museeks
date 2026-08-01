package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2285e extends AbstractC3947e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f5786e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0642e f5787e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public HandlerC9134e f5788e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C18524e f5789e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C2383e f5790e;

    public C2285e(C6936e c6936e) {
        super(c6936e);
        this.f5786e = true;
        this.f5790e = new C2383e(this);
        this.f5789e = new C18524e(this);
        this.f5787e = new C0642e(6, this);
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m802e() {
        mo2250e();
        if (this.f5788e == null) {
            this.f5788e = new HandlerC9134e(Looper.getMainLooper(), 4);
        }
    }

    @Override // defpackage.AbstractC3947e
    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final boolean mo803e() {
        return false;
    }
}
