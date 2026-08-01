package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8903e implements InterfaceC4543e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C5231e f17863e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f17864e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4543e f17865e;

    public C8903e(C5231e c5231e, InterfaceC4543e interfaceC4543e) {
        this.f17863e = c5231e;
        this.f17865e = interfaceC4543e;
    }

    @Override // defpackage.InterfaceC4543e
    public final int admob(C13391e c13391e, C7507e c7507e, int i) {
        C5231e c5231e = this.f17863e;
        if (c5231e.vip()) {
            return -3;
        }
        if (this.f17864e) {
            c7507e.f19062e = 4;
            return -4;
        }
        long admob = c5231e.admob();
        int admob2 = this.f17865e.admob(c13391e, c7507e, i);
        if (c5231e.f11131e != -9223372036854775807L && admob2 != -3) {
            c5231e.f11131e = -9223372036854775807L;
        }
        if (admob2 != -5) {
            long j = c5231e.f11137e;
            if (j == Long.MIN_VALUE || ((admob2 != -4 || c7507e.f15301e < j) && !(admob2 == -3 && admob == Long.MIN_VALUE && !c7507e.f15302e))) {
                return admob2;
            }
            c7507e.amazon();
            c7507e.f19062e = 4;
            this.f17864e = true;
            return -4;
        }
        long j2 = c5231e.f11138e;
        long j3 = c5231e.f11137e;
        C16975e c16975e = (C16975e) c13391e.f26644e;
        c16975e.getClass();
        int i2 = c16975e.f33280extends;
        int i3 = c16975e.f33283native;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            C11445e ad = c16975e.ad();
            ad.f23024this = i3;
            ad.f23022native = i2;
            c13391e.f26644e = new C16975e(ad);
        }
        return -5;
    }

    @Override // defpackage.InterfaceC4543e
    public final int amazon(long j) {
        if (this.f17863e.vip()) {
            return -3;
        }
        return this.f17865e.amazon(j);
    }

    @Override // defpackage.InterfaceC4543e
    public final boolean license() {
        return !this.f17863e.vip() && this.f17865e.license();
    }

    @Override // defpackage.InterfaceC4543e
    public final void smaato() {
        this.f17865e.smaato();
    }
}
