package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11440e {
    public static final C11440e ad = new Object();
    public static final Map vip = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static C1426e ad(EnumC17850e enumC17850e) {
        Object obj = vip.get(enumC17850e);
        if (obj != null) {
            return (C1426e) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC17850e + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #0 {all -> 0x00b8, blocks: (B:12:0x008f, B:23:0x009f, B:24:0x00b7), top: B:11:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008d -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.AbstractC10731e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.C1218e
            if (r0 == 0) goto L13
            r0 = r10
            eْؒٞ r0 = (defpackage.C1218e) r0
            int r1 = r0.f3850e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3850e = r1
            goto L18
        L13:
            eْؒٞ r0 = new eْؒٞ
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f3851e
            int r1 = r0.f3850e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r1 = r0.f3855e
            java.util.Map r3 = r0.f3852e
            eٍٖ٘ r4 = r0.f3856e
            eٟ٘ٚ r5 = r0.f3857e
            java.util.Iterator r6 = r0.f3849e
            java.util.Map r7 = r0.f3854e
            defpackage.AbstractC2003e.purchase(r10)
            goto L8e
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            defpackage.AbstractC2003e.purchase(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            java.util.Map r1 = defpackage.C11440e.vip
            int r3 = r1.size()
            int r3 = defpackage.AbstractC10064e.appmetrica(r3)
            r10.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r10
            r6 = r1
        L57:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r4 = r10.getKey()
            r5 = r4
            eٟ٘ٚ r5 = (defpackage.EnumC17850e) r5
            java.lang.Object r10 = r10.getValue()
            eۣؒ۠ r10 = (defpackage.C1426e) r10
            eٍٖ٘ r4 = r10.ad
            r0.f3854e = r3
            r0.f3849e = r6
            r0.f3857e = r5
            r0.f3856e = r4
            r0.f3852e = r3
            r0.f3855e = r1
            r0.f3850e = r2
            java.lang.Object r10 = r4.appmetrica(r0)
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r10 != r7) goto L8d
            return r7
        L8d:
            r7 = r3
        L8e:
            r10 = 0
            eۣؒ۠ r8 = ad(r5)     // Catch: java.lang.Throwable -> Lb8
            eٕؒۡ r8 = r8.vip     // Catch: java.lang.Throwable -> Lb8
            if (r8 == 0) goto L9f
            r4.billing(r10)
            r3.put(r1, r8)
            r3 = r7
            goto L57
        L9f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb8
            r1.append(r5)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r0 = move-exception
            r4.billing(r10)
            throw r0
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11440e.vip(eُؑ۠):java.lang.Object");
    }
}
