package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9727e {
    public final C16723e ad;
    public final AtomicReference metrica = new AtomicReference();
    public final InterfaceC8018e vip;

    public C9727e(InterfaceC8850e interfaceC8850e, C16723e c16723e, InterfaceC8018e interfaceC8018e) {
        this.ad = c16723e;
        this.vip = interfaceC8018e;
        AbstractC5336e.purchase(AbstractC9743e.ad(interfaceC8850e), null, 0, new C6926e(this, null, 0), 3);
    }

    public final C8688e ad() {
        AtomicReference atomicReference = this.metrica;
        if (atomicReference.get() == null) {
            Object yandex = AbstractC5336e.yandex(C2693e.f6576e, new C6926e(this, null, 1));
            while (!atomicReference.compareAndSet(null, yandex) && atomicReference.get() == null) {
            }
        }
        return (C8688e) atomicReference.get();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0025, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        android.util.Log.w("FirebaseSessions", "Failed to update config values: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.C8688e r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C12265e
            if (r0 == 0) goto L13
            r0 = r7
            eّؖٔ r0 = (defpackage.C12265e) r0
            int r1 = r0.f24604e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24604e = r1
            goto L18
        L13:
            eّؖٔ r0 = new eّؖٔ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f24603e
            int r1 = r0.f24604e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.AbstractC2003e.purchase(r7)     // Catch: java.io.IOException -> L25
            goto L5a
        L25:
            r6 = move-exception
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            eًٙۡ r7 = r5.vip     // Catch: java.io.IOException -> L25
            eّۤ r1 = new eّۤ     // Catch: java.io.IOException -> L25
            r3 = 0
            r4 = 10
            r1.<init>(r6, r3, r4)     // Catch: java.io.IOException -> L25
            r0.f24604e = r2     // Catch: java.io.IOException -> L25
            java.lang.Object r6 = r7.vip(r1, r0)     // Catch: java.io.IOException -> L25
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r6 != r7) goto L5a
            return r7
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L5a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9727e.metrica(eًٌٔ, eُؑ۠):java.lang.Object");
    }

    public final boolean vip() {
        Long l = ad().appmetrica;
        Integer num = ad().license;
        return l == null || num == null || this.ad.ad().metrica - l.longValue() >= ((long) num.intValue());
    }
}
