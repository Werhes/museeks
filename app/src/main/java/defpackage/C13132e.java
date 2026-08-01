package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13132e implements InterfaceC17717e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f26091e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f26092e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f26093e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC0566e f26094e;

    public C13132e(InterfaceC0566e interfaceC0566e, int i, long j) {
        this.f26094e = interfaceC0566e;
        this.f26092e = i;
        this.f26091e = (interfaceC0566e.admob() + interfaceC0566e.Signature()) * 1000000;
        this.f26093e = j * 1000000;
    }

    @Override // defpackage.InterfaceC17717e
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.InterfaceC17717e
    public final AbstractC3424e adcel(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return this.f26094e.adcel(vip(j), abstractC3424e, abstractC3424e2, metrica(j, abstractC3424e, abstractC3424e3, abstractC3424e2));
    }

    @Override // defpackage.InterfaceC17717e
    public final long inmobi(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return Long.MAX_VALUE;
    }

    public final AbstractC3424e metrica(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        long j2 = this.f26093e;
        long j3 = j + j2;
        long j4 = this.f26091e;
        return j3 > j4 ? this.f26094e.adcel(j4 - j2, abstractC3424e, abstractC3424e3, abstractC3424e2) : abstractC3424e2;
    }

    @Override // defpackage.InterfaceC17717e
    public final AbstractC3424e pro(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return this.f26094e.pro(vip(j), abstractC3424e, abstractC3424e2, metrica(j, abstractC3424e, abstractC3424e3, abstractC3424e2));
    }

    @Override // defpackage.InterfaceC17717e
    public final AbstractC3424e tapsense(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return adcel(Long.MAX_VALUE, abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    public final long vip(long j) {
        long j2 = j + this.f26093e;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.f26091e;
        long j4 = j2 / j3;
        if (this.f26092e != 1 && j4 % 2 != 0) {
            return ((j4 + 1) * j3) - j2;
        }
        Long.signum(j4);
        return j2 - (j4 * j3);
    }
}
