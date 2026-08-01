package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1590e extends AbstractC8548e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f4496e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f4497e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f4498e;

    public C1590e(InterfaceC2537e interfaceC2537e, long j, boolean z) {
        super(interfaceC2537e);
        this.f4497e = j;
        this.f4496e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [eِٖۢ, java.lang.Object] */
    @Override // defpackage.AbstractC8548e, defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        long j2 = this.f4498e;
        long j3 = this.f4497e;
        if (j2 > j3) {
            j = 0;
        } else if (this.f4496e) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long signatures = this.f17361e.signatures(c16151e, j);
        if (signatures != -1) {
            this.f4498e += signatures;
        }
        long j5 = this.f4498e;
        if ((j5 >= j3 || signatures != -1) && j5 <= j3) {
            return signatures;
        }
        if (signatures > 0 && j5 > j3) {
            long j6 = c16151e.f31731e - (j5 - j3);
            ?? obj = new Object();
            obj.mo2629class(c16151e);
            c16151e.mo272transient(obj, j6);
            obj.ad();
        }
        StringBuilder inmobi = AbstractC1786e.inmobi(j3, "expected ", " bytes but got ");
        inmobi.append(this.f4498e);
        throw new IOException(inmobi.toString());
    }
}
