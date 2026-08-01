package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4774e extends AbstractC13367e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f10202e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14005e f10203e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f10204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4774e(C14005e c14005e, C15718e c15718e) {
        super(c14005e, c15718e);
        this.f10203e = c14005e;
        this.f10202e = -1L;
        this.f10204e = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f26622e) {
            return;
        }
        if (this.f10204e) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z = AbstractC16286e.billing(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f10203e.vip.ad();
                ad(C14005e.purchase);
            }
        }
        this.f26622e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        if (r12 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
    
        if (r16.f10204e == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        defpackage.AbstractC15211e.ad(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0081, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(java.lang.Integer.toString(r14, 16)));
     */
    @Override // defpackage.AbstractC13367e, defpackage.InterfaceC2537e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long signatures(defpackage.C16151e r17, long r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4774e.signatures(eِٖۢ, long):long");
    }
}
