package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7690e implements InterfaceC4543e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f15614e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4543e f15615e;

    public C7690e(InterfaceC4543e interfaceC4543e, long j) {
        this.f15615e = interfaceC4543e;
        this.f15614e = j;
    }

    @Override // defpackage.InterfaceC4543e
    public final int admob(C13391e c13391e, C7507e c7507e, int i) {
        int admob = this.f15615e.admob(c13391e, c7507e, i);
        if (admob == -4) {
            c7507e.f15301e += this.f15614e;
        }
        return admob;
    }

    @Override // defpackage.InterfaceC4543e
    public final int amazon(long j) {
        return this.f15615e.amazon(j - this.f15614e);
    }

    @Override // defpackage.InterfaceC4543e
    public final boolean license() {
        return this.f15615e.license();
    }

    @Override // defpackage.InterfaceC4543e
    public final void smaato() {
        this.f15615e.smaato();
    }
}
