package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11611e implements InterfaceC1272e {
    public final InterfaceC10625e ad;
    public int billing;
    public InterfaceC18147e purchase;
    public byte[] appmetrica = AbstractC9413e.vip;
    public final C1292e license = new C1292e();
    public final C16975e vip = null;
    public final ArrayList metrica = new ArrayList();
    public int yandex = 0;
    public long[] startapp = AbstractC9413e.metrica;
    public long adcel = -9223372036854775807L;

    public C11611e(InterfaceC10625e interfaceC10625e) {
        this.ad = interfaceC10625e;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final void billing(C10718e c10718e) {
        this.purchase.getClass();
        byte[] bArr = c10718e.f21119e;
        int length = bArr.length;
        C1292e c1292e = this.license;
        c1292e.getClass();
        c1292e.m570throw(bArr.length, bArr);
        this.purchase.appmetrica(length, c1292e);
        this.purchase.ad(c10718e.f21120e, 1, length, 0, null);
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        int i = this.yandex;
        AbstractC2301e.subscription((i == 0 || i == 5) ? false : true);
        this.adcel = j2;
        if (this.yandex == 2) {
            this.yandex = 1;
        }
        if (this.yandex == 4) {
            this.yandex = 3;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        return true;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        AbstractC2301e.subscription(this.yandex == 0);
        InterfaceC18147e Signature = interfaceC5483e.Signature(0, 3);
        this.purchase = Signature;
        C16975e c16975e = this.vip;
        if (c16975e != null) {
            Signature.billing(c16975e);
            interfaceC5483e.mopub();
            interfaceC5483e.pro(new C1873e(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.yandex = 1;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
        if (this.yandex == 5) {
            return;
        }
        this.ad.reset();
        this.yandex = 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.billing != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.adcel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new defpackage.C14033e(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.ad.mo825transient(r20.appmetrica, 0, r20.billing, r2, new defpackage.C2007e(12, r20));
        java.util.Collections.sort(r11);
        r20.startapp = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.startapp[r2] = ((defpackage.C10718e) r11.get(r2)).f21120e;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r20.appmetrica = defpackage.AbstractC9413e.vip;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r20.yandex = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = defpackage.C14033e.metrica;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        throw defpackage.C15125e.ad(r0, "SubtitleParser failed.");
     */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r21, defpackage.C14829e r22) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11611e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
