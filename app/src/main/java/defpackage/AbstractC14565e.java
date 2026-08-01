package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14565e implements Iterable, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f28778e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f28779e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f28780e;

    public AbstractC14565e(long j, long j2) {
        this.f28780e = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f28779e = j2;
        this.f28778e = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C12027e(this.f28780e, this.f28779e, this.f28778e);
    }
}
