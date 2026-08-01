package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3150e implements AutoCloseable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6764e f7238e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f7241e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC1415e f7243e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f7236e = new Object();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f7235e = 1;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f7245e = Long.MIN_VALUE;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f7244e = Long.MIN_VALUE;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f7239e = Long.MIN_VALUE;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f7242e = Long.MIN_VALUE;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final ArrayList f7237e = new ArrayList();

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final LinkedHashMap f7240e = new LinkedHashMap();

    public C3150e(InterfaceC1415e interfaceC1415e, C6764e c6764e) {
        this.f7243e = interfaceC1415e;
        this.f7238e = c6764e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(long r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f7236e
            monitor-enter(r0)
            boolean r1 = r9.f7241e     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r9.f7239e = r10     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r1 = r9.f7237e     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
        L15:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L37
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L35
            r7 = r6
            eٍۧٝ r7 = (defpackage.C9925e) r7     // Catch: java.lang.Throwable -> L35
            long r7 = r7.vip     // Catch: java.lang.Throwable -> L35
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r8 = 1
            if (r7 != 0) goto L2b
            r7 = r8
            goto L2c
        L2b:
            r7 = r2
        L2c:
            if (r7 == 0) goto L15
            if (r4 == 0) goto L32
        L30:
            r5 = r3
            goto L3a
        L32:
            r5 = r6
            r4 = r8
            goto L15
        L35:
            r10 = move-exception
            goto L5a
        L37:
            if (r4 != 0) goto L3a
            goto L30
        L3a:
            eٍۧٝ r5 = (defpackage.C9925e) r5     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L4a
            long r10 = r5.appmetrica     // Catch: java.lang.Throwable -> L35
            r9.f7242e = r10     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r10 = r9.f7237e     // Catch: java.lang.Throwable -> L35
            r10.remove(r5)     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            r3 = r5
        L4a:
            monitor-exit(r0)
            if (r3 == 0) goto L59
            eؕؔٔ r10 = new eؕؔٔ
            r11 = 10
            r10.<init>(r11)
            r0 = -1
            r3.ad(r0, r10)
        L59:
            return
        L5a:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3150e.ad(long):void");
    }

    public final ArrayList advert(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7237e;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C9925e c9925e = (C9925e) next;
            if (c9925e.ad == z && c9925e.license < j && c9925e.appmetrica < j2) {
                arrayList.add(next);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f7236e) {
            if (this.f7241e) {
                return;
            }
            this.f7241e = true;
            ArrayList arrayList = new ArrayList(this.f7240e.values());
            this.f7240e.clear();
            ArrayList arrayList2 = new ArrayList(this.f7237e);
            this.f7237e.clear();
            Unit unit = Unit.INSTANCE;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj = ((C4418e) it.next()).ad;
                InterfaceC1415e interfaceC1415e = this.f7243e;
                if (!C4418e.ad(obj)) {
                    obj = null;
                }
                interfaceC1415e.ad(obj);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C9925e c9925e = (C9925e) it2.next();
                c9925e.getClass();
                c9925e.ad(-1L, new C3110e(11));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void license(long r11, java.lang.Object r13) {
        /*
            r10 = this;
            java.lang.Object r1 = r10.f7236e
            monitor-enter(r1)
            boolean r0 = r10.f7241e     // Catch: java.lang.Throwable -> L8f
            r2 = 0
            if (r0 != 0) goto L12
            eَؙۤ r0 = r10.f7238e     // Catch: java.lang.Throwable -> L8f
            long r3 = r10.f7242e     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r0.ad(r3, r11)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L15
        L12:
            r4 = r10
            goto L92
        L15:
            java.util.ArrayList r0 = r10.f7237e     // Catch: java.lang.Throwable -> L8f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8f
        L1b:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L33
            r4 = r3
            eٍۧٝ r4 = (defpackage.C9925e) r4     // Catch: java.lang.Throwable -> L33
            eَؙۤ r5 = r10.f7238e     // Catch: java.lang.Throwable -> L33
            long r6 = r4.appmetrica     // Catch: java.lang.Throwable -> L33
            boolean r4 = r5.ad(r6, r11)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L1b
            goto L39
        L33:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto Ld2
        L38:
            r3 = r2
        L39:
            eٍۧٝ r3 = (defpackage.C9925e) r3     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L56
            boolean r9 = r3.ad     // Catch: java.lang.Throwable -> L8f
            long r5 = r3.license     // Catch: java.lang.Throwable -> L8f
            long r7 = r3.appmetrica     // Catch: java.lang.Throwable -> L8f
            r4 = r10
            java.util.ArrayList r0 = r4.advert(r5, r7, r9)     // Catch: java.lang.Throwable -> L52
            r3.ad(r11, r13)     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r11 = r4.f7237e     // Catch: java.lang.Throwable -> L52
            r11.remove(r3)     // Catch: java.lang.Throwable -> L52
            r11 = r2
            goto L98
        L52:
            r0 = move-exception
        L53:
            r11 = r0
            goto Ld2
        L56:
            r4 = r10
            java.util.LinkedHashMap r0 = r4.f7240e     // Catch: java.lang.Throwable -> L52
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L52
            eّؖ۠ r12 = new eّؖ۠     // Catch: java.lang.Throwable -> L52
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L52
            r0.put(r11, r12)     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap r11 = r4.f7240e     // Catch: java.lang.Throwable -> L52
            int r11 = r11.size()     // Catch: java.lang.Throwable -> L52
            r12 = 3
            if (r11 <= r12) goto L8c
            java.util.LinkedHashMap r11 = r4.f7240e     // Catch: java.lang.Throwable -> L52
            java.util.Set r11 = r11.keySet()     // Catch: java.lang.Throwable -> L52
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L52
            java.lang.Object r11 = defpackage.AbstractC13480e.m3573class(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L52
            long r11 = r11.longValue()     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap r13 = r4.f7240e     // Catch: java.lang.Throwable -> L52
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r11 = r13.remove(r11)     // Catch: java.lang.Throwable -> L52
        L8a:
            r0 = r2
            goto L98
        L8c:
            r11 = r2
            r0 = r11
            goto L98
        L8f:
            r0 = move-exception
            r4 = r10
            goto L53
        L92:
            eّؖ۠ r11 = new eّؖ۠     // Catch: java.lang.Throwable -> L52
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L52
            goto L8a
        L98:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)
            eّؖ۠ r11 = (defpackage.C4418e) r11
            if (r11 == 0) goto Laf
            java.lang.Object r11 = r11.ad
            boolean r12 = defpackage.C4418e.ad(r11)
            if (r12 == 0) goto La8
            r2 = r11
        La8:
            if (r2 == 0) goto Laf
            eْۣؒ r11 = r4.f7243e
            r11.ad(r2)
        Laf:
            if (r0 == 0) goto Ld1
            java.util.Iterator r11 = r0.iterator()
        Lb5:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Ld1
            java.lang.Object r12 = r11.next()
            eٍۧٝ r12 = (defpackage.C9925e) r12
            r12.getClass()
            eؕؔٔ r13 = new eؕؔٔ
            r0 = 12
            r13.<init>(r0)
            r0 = -1
            r12.ad(r0, r13)
            goto Lb5
        Ld1:
            return
        Ld2:
            monitor-exit(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3150e.license(long, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0009, B:5:0x000f, B:7:0x0015, B:14:0x002d, B:16:0x0031, B:21:0x0081, B:24:0x008d, B:26:0x0093, B:28:0x009d, B:32:0x00a8, B:33:0x00aa, B:37:0x00b5, B:42:0x00bf, B:43:0x00cb, B:45:0x00d1, B:50:0x00ed, B:52:0x00f1), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0009, B:5:0x000f, B:7:0x0015, B:14:0x002d, B:16:0x0031, B:21:0x0081, B:24:0x008d, B:26:0x0093, B:28:0x009d, B:32:0x00a8, B:33:0x00aa, B:37:0x00b5, B:42:0x00bf, B:43:0x00cb, B:45:0x00d1, B:50:0x00ed, B:52:0x00f1), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(long r21, long r23, long r25, defpackage.InterfaceC0420e r27) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3150e.purchase(long, long, long, eؙٜؑ):void");
    }
}
