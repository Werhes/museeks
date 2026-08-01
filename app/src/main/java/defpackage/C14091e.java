package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14091e implements InterfaceC16400e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C14091e f27846e = new C14091e();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Handler f27847e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f27849e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f27852e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f27848e = true;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f27851e = true;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C4891e f27854e = new C4891e(this, true);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final RunnableC2783e f27853e = new RunnableC2783e(25, this);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C6594e f27850e = new C6594e(23, this);

    public final void metrica() {
        int i = this.f27849e + 1;
        this.f27849e = i;
        if (i == 1) {
            if (!this.f27848e) {
                this.f27847e.removeCallbacks(this.f27853e);
            } else {
                this.f27854e.appmetrica(EnumC14621e.ON_RESUME);
                this.f27848e = false;
            }
        }
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f27854e;
    }
}
