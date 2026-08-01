package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6671e {
    public C14845e license;
    public String purchase;
    public static final C8456e yandex = new C8456e(2);
    public static final Random startapp = new Random();
    public final C11501e ad = new C11501e();
    public final C6158e vip = new C6158e();
    public final HashMap metrica = new HashMap();
    public AbstractC6690e appmetrica = AbstractC6690e.ad;
    public long billing = -1;

    public final void ad(C2085e c2085e) {
        long j = c2085e.metrica;
        if (j != -1 && c2085e.appmetrica) {
            this.billing = j;
        }
        this.purchase = null;
    }

    public final void appmetrica(C18177e c18177e) {
        C18208e c18208e;
        AbstractC6690e abstractC6690e = c18177e.vip;
        int i = c18177e.metrica;
        C18208e c18208e2 = c18177e.license;
        boolean Signature = abstractC6690e.Signature();
        HashMap hashMap = this.metrica;
        if (Signature) {
            String str = this.purchase;
            if (str != null) {
                C2085e c2085e = (C2085e) hashMap.get(str);
                c2085e.getClass();
                ad(c2085e);
                return;
            }
            return;
        }
        C2085e c2085e2 = (C2085e) hashMap.get(this.purchase);
        this.purchase = metrica(i, c18208e2).ad;
        purchase(c18177e);
        if (c18208e2 != null) {
            long j = c18208e2.license;
            if (c18208e2.vip()) {
                if (c2085e2 != null && c2085e2.metrica == j && (c18208e = c2085e2.license) != null && c18208e.vip == c18208e2.vip && c18208e.metrica == c18208e2.metrica) {
                    return;
                }
                metrica(i, new C18208e(j, c18208e2.ad));
                this.license.getClass();
            }
        }
    }

    public final synchronized void billing(C18177e c18177e, int i) {
        try {
            this.license.getClass();
            boolean z = i == 0;
            Iterator it = this.metrica.values().iterator();
            while (it.hasNext()) {
                C2085e c2085e = (C2085e) it.next();
                if (c2085e.ad(c18177e)) {
                    it.remove();
                    boolean equals = c2085e.ad.equals(this.purchase);
                    if (equals) {
                        ad(c2085e);
                    }
                    if (c2085e.appmetrica) {
                        if (z && equals) {
                            boolean z2 = c2085e.purchase;
                        }
                        this.license.m3860else(c18177e, c2085e.ad);
                    }
                }
            }
            appmetrica(c18177e);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String license(AbstractC6690e abstractC6690e, C18208e c18208e) {
        return metrica(abstractC6690e.billing(c18208e.ad, this.vip).metrica, c18208e).ad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C2085e metrica(int r19, defpackage.C18208e r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.metrica
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            eؙؓۛ r8 = (defpackage.C2085e) r8
            long r9 = r8.metrica
            eَٛ r11 = r8.license
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.vip
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.license
            eؙۜٛ r14 = r8.billing
            java.util.HashMap r15 = r14.metrica
            r16 = r12
            java.lang.String r12 = r14.purchase
            java.lang.Object r12 = r15.get(r12)
            eؙؓۛ r12 = (defpackage.C2085e) r12
            if (r12 == 0) goto L4b
            long r12 = r12.metrica
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.billing
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.metrica = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.license
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.vip()
            if (r12 != 0) goto L16
            long r12 = r8.metrica
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.license
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.vip
            int r10 = r11.vip
            if (r9 != r10) goto L16
            int r9 = r2.metrica
            int r10 = r11.metrica
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.vip
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.metrica
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.AbstractC9413e.ad
            eَٛ r9 = r5.license
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        La0:
            r5 = r8
            r6 = r9
            goto L16
        La4:
            if (r5 != 0) goto Lb6
            eٌؔ r4 = defpackage.C6671e.yandex
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            eؙؓۛ r5 = new eؙؓۛ
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6671e.metrica(int, eَٛ):eؙؓۛ");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void purchase(defpackage.C18177e r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6671e.purchase(eؙٙ):void");
    }

    public final synchronized void vip(C18177e c18177e) {
        C14845e c14845e;
        try {
            String str = this.purchase;
            if (str != null) {
                C2085e c2085e = (C2085e) this.metrica.get(str);
                c2085e.getClass();
                ad(c2085e);
            }
            Iterator it = this.metrica.values().iterator();
            while (it.hasNext()) {
                C2085e c2085e2 = (C2085e) it.next();
                it.remove();
                if (c2085e2.appmetrica && (c14845e = this.license) != null) {
                    c14845e.m3860else(c18177e, c2085e2.ad);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
