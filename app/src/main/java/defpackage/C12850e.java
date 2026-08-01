package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12850e {
    public final long ad;
    public C12476e appmetrica;
    public final C1040e metrica;
    public final C1040e vip;
    public final C12850e license = this;
    public int purchase = -1;

    public C12850e(long j, C1040e c1040e, C1040e c1040e2) {
        this.ad = j;
        this.vip = c1040e;
        this.metrica = c1040e2;
    }

    public final long ad(C9106e c9106e, boolean z) {
        C12476e c12476e;
        long j = this.ad;
        if (z && c9106e.ad.metrica != j) {
            return 9205357640488583168L;
        }
        if ((!z && c9106e.vip.metrica != j) || metrica() == null || (c12476e = (C12476e) this.metrica.invoke()) == null) {
            return 9205357640488583168L;
        }
        return AbstractC4584e.metrica(c12476e, AbstractC3062e.metrica((z ? c9106e.ad : c9106e.vip).vip, 0, vip(c12476e)), z, c9106e.metrica);
    }

    public final C10566e license() {
        C12476e c12476e = (C12476e) this.metrica.invoke();
        return c12476e == null ? new C10566e(BuildConfig.FLAVOR) : c12476e.ad.ad;
    }

    public final InterfaceC0043e metrica() {
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.vip.invoke();
        if (interfaceC0043e == null || !interfaceC0043e.billing()) {
            return null;
        }
        return interfaceC0043e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.C12476e r10) {
        /*
            r9 = this;
            eّۣۤ r0 = r9.license
            monitor-enter(r0)
            eِّٔ r1 = r9.appmetrica     // Catch: java.lang.Throwable -> L4d
            if (r1 == r10) goto L62
            eّۦٌ r1 = r10.vip     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r1.metrica     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 1
            if (r2 != 0) goto L22
            long r7 = r10.metrica     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4d
            float r8 = r1.appmetrica     // Catch: java.lang.Throwable -> L4d
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L20
            goto L22
        L20:
            r7 = r3
            goto L23
        L22:
            r7 = r6
        L23:
            if (r7 == 0) goto L54
            if (r2 == 0) goto L28
            goto L54
        L28:
            long r7 = r10.metrica     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r2 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.appmetrica(r2)     // Catch: java.lang.Throwable -> L4d
            eّۦٌ r2 = r10.vip     // Catch: java.lang.Throwable -> L4d
            int r2 = r2.purchase     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 - r6
            if (r1 <= r2) goto L39
            r1 = r2
        L39:
            if (r1 < 0) goto L4f
            eّۦٌ r2 = r10.vip     // Catch: java.lang.Throwable -> L4d
            float r2 = r2.purchase(r1)     // Catch: java.lang.Throwable -> L4d
            long r7 = r10.metrica     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4d
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L4f
            int r1 = r1 + (-1)
            goto L39
        L4d:
            r10 = move-exception
            goto L66
        L4f:
            if (r1 >= 0) goto L52
            goto L58
        L52:
            r3 = r1
            goto L58
        L54:
            int r1 = r1.purchase     // Catch: java.lang.Throwable -> L4d
            int r3 = r1 + (-1)
        L58:
            eّۦٌ r1 = r10.vip     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.metrica(r3, r6)     // Catch: java.lang.Throwable -> L4d
            r9.purchase = r1     // Catch: java.lang.Throwable -> L4d
            r9.appmetrica = r10     // Catch: java.lang.Throwable -> L4d
        L62:
            int r10 = r9.purchase     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            return r10
        L66:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12850e.vip(eِّٔ):int");
    }
}
