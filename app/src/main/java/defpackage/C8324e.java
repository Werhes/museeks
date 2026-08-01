package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۤۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8324e implements InterfaceC8642e {
    public final /* synthetic */ InterfaceC11678e ad;
    public final /* synthetic */ Function0 appmetrica;
    public final /* synthetic */ C9708e license;
    public final /* synthetic */ InterfaceC14388e metrica;
    public final /* synthetic */ C3229e vip;

    public C8324e(InterfaceC11678e interfaceC11678e, C3229e c3229e, InterfaceC14388e interfaceC14388e, C9708e c9708e, Function0 function0) {
        this.ad = interfaceC11678e;
        this.vip = c3229e;
        this.metrica = interfaceC14388e;
        this.license = c9708e;
        this.appmetrica = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.InterfaceC8642e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC1719e r9, float r10, defpackage.InterfaceC5083e r11) {
        /*
            r8 = this;
            eٌؕؖ r0 = r8.vip
            eٔ۟ٔ r1 = r0.purchase
            boolean r2 = r11 instanceof defpackage.C4131e
            if (r2 == 0) goto L17
            r2 = r11
            eٕۣؖ r2 = (defpackage.C4131e) r2
            int r3 = r2.f9106e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f9106e = r3
            goto L1e
        L17:
            eٕۣؖ r2 = new eٕۣؖ
            eُؑ۠ r11 = (defpackage.AbstractC10731e) r11
            r2.<init>(r8, r11)
        L1e:
            java.lang.Object r11 = r2.f9105e
            int r3 = r2.f9106e
            kotlin.jvm.functions.Function0 r4 = r8.appmetrica
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L30
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Throwable -> L2d
            goto L93
        L2d:
            r9 = move-exception
            goto La8
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.AbstractC2003e.purchase(r11)
            eُِۢ r11 = r8.ad
            float r11 = r11.appmetrica()
            float r3 = -r11
            float r11 = defpackage.AbstractC3062e.vip(r10, r3, r11)
            r3 = 0
            int r6 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r6 <= 0) goto L84
            eؒۙۥ r6 = r1.startapp()
            eٌَۣ r7 = defpackage.EnumC8613e.f17430e
            boolean r6 = r6.metrica(r7)
            if (r6 == 0) goto L84
            eؒۙۥ r6 = r1.startapp()
            float r6 = r6.purchase(r7)
            float r1 = r1.smaato()
            float r6 = r6 - r1
            float r1 = java.lang.Math.max(r3, r6)
            float r3 = defpackage.C8464e.appmetrica
            eٓۦۣ r6 = r8.metrica
            float r3 = r6.mo497instanceof(r3)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L84
            float r1 = r1 / r3
            float r11 = r11 * r1
            float r1 = defpackage.C8464e.license
            float r1 = r6.mo497instanceof(r1)
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 < 0) goto L84
            float r11 = java.lang.Math.max(r11, r1)
        L84:
            eٍۘۢ r10 = r8.license     // Catch: java.lang.Throwable -> L2d
            r2.f9106e = r5     // Catch: java.lang.Throwable -> L2d
            eٌؗؗ r1 = defpackage.AbstractC11912e.vip     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = r10.license(r9, r11, r1, r2)     // Catch: java.lang.Throwable -> L2d
            eٟؔۙ r9 = defpackage.EnumC2821e.f6782e
            if (r11 != r9) goto L93
            return r9
        L93:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L2d
            float r9 = r11.floatValue()     // Catch: java.lang.Throwable -> L2d
            boolean r10 = r0.billing()
            if (r10 != 0) goto La2
            r4.invoke()
        La2:
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            return r10
        La8:
            boolean r10 = r0.billing()
            if (r10 != 0) goto Lb1
            r4.invoke()
        Lb1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8324e.ad(eٍَؓ, float, eًؗۖ):java.lang.Object");
    }
}
