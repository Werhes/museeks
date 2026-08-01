package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14184e extends AbstractC8548e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C0193e f28030e = AbstractC5458e.license("0021F904");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16151e f28031e;

    /* JADX WARN: Type inference failed for: r1v1, types: [eِٖۢ, java.lang.Object] */
    public C14184e(InterfaceC4895e interfaceC4895e) {
        super(interfaceC4895e);
        this.f28031e = new Object();
    }

    public final boolean ad(long j) {
        C16151e c16151e = this.f28031e;
        long j2 = c16151e.f31731e;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.signatures(c16151e, j3) == j3;
    }

    @Override // defpackage.AbstractC8548e, defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        long j2;
        long j3;
        ad(j);
        C16151e c16151e2 = this.f28031e;
        long j4 = 0;
        if (c16151e2.f31731e == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long j6 = -1;
            while (true) {
                C0193e c0193e = f28030e;
                j2 = j4;
                j6 = c16151e2.isVip(c0193e.f1412e[0], j6 + 1, Long.MAX_VALUE);
                if (j6 == -1 || (ad(c0193e.f1412e.length) && c16151e2.ads(j6, c0193e, c0193e.license()))) {
                    break;
                }
                j4 = j2;
            }
            if (j6 == -1) {
                break;
            }
            long signatures = c16151e2.signatures(c16151e, j6 + 4);
            if (signatures < j2) {
                signatures = j2;
            }
            j5 += signatures;
            if (ad(5L) && c16151e2.Signature(4L) == 0 && (((c16151e2.Signature(2L) & 255) << 8) | (c16151e2.Signature(1L) & 255)) < 2) {
                c16151e.m4128final(c16151e2.Signature(j2));
                c16151e.m4128final(10);
                c16151e.m4128final(0);
                c16151e2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long signatures2 = c16151e2.signatures(c16151e, j - j5);
            j3 = 0;
            if (signatures2 < 0) {
                signatures2 = 0;
            }
            j5 += signatures2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
