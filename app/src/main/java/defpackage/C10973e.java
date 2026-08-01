package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10973e implements InterfaceC18442e {
    public final Class ad;
    public final C6999e appmetrica;
    public final C17651e license;
    public final C11993e metrica;
    public final C14151e vip;

    public C10973e() {
        C14151e c14151e = new C14151e((byte) 0, 2);
        this.ad = SessionWorker.class;
        this.vip = c14151e;
        this.metrica = C4160e.ad;
        this.license = AbstractC12751e.ad();
        this.appmetrica = new C6999e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r9.appmetrica(r0) == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object ad(defpackage.C10973e r7, kotlin.jvm.functions.Function2 r8, defpackage.AbstractC10731e r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C4375e
            if (r0 == 0) goto L13
            r0 = r9
            eؖۛؑ r0 = (defpackage.C4375e) r0
            int r1 = r0.f9522e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9522e = r1
            goto L18
        L13:
            eؖۛؑ r0 = new eؖۛؑ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f9523e
            int r1 = r0.f9522e
            r2 = 2
            r3 = 1
            r4 = 0
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L49
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.f9521e
            eؚؗؔ r7 = (defpackage.InterfaceC4619e) r7
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L2f
            goto L74
        L2f:
            r8 = move-exception
            goto L7c
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            eٍٖ٘ r7 = r0.f9524e
            eؚٖؓ r8 = r0.f9519e
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r1 = r0.f9521e
            eُْٝ r1 = (defpackage.C10973e) r1
            defpackage.AbstractC2003e.purchase(r9)
            r9 = r7
            r7 = r1
            goto L60
        L49:
            defpackage.AbstractC2003e.purchase(r9)
            eٍٖ٘ r9 = r7.license
            r0.f9521e = r7
            r1 = r8
            eؚٖؓ r1 = (defpackage.AbstractC7185e) r1
            r0.f9519e = r1
            r0.f9524e = r9
            r0.f9522e = r3
            java.lang.Object r1 = r9.appmetrica(r0)
            if (r1 != r5) goto L60
            goto L70
        L60:
            eؚؚ٘ r7 = r7.appmetrica     // Catch: java.lang.Throwable -> L7a
            r0.f9521e = r9     // Catch: java.lang.Throwable -> L7a
            r0.f9519e = r4     // Catch: java.lang.Throwable -> L7a
            r0.f9524e = r4     // Catch: java.lang.Throwable -> L7a
            r0.f9522e = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r7 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L7a
            if (r7 != r5) goto L71
        L70:
            return r5
        L71:
            r6 = r9
            r9 = r7
            r7 = r6
        L74:
            eٍٖ٘ r7 = (defpackage.C17651e) r7
            r7.billing(r4)
            return r9
        L7a:
            r8 = move-exception
            r7 = r9
        L7c:
            eٍٖ٘ r7 = (defpackage.C17651e) r7
            r7.billing(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10973e.ad(eُْٝ, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }
}
