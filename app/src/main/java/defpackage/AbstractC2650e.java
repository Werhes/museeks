package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2650e {
    public static final float ad = 400;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, eٔۦْ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.InterfaceC1719e r9, float r10, defpackage.C16747e r11, defpackage.C15217e r12, kotlin.jvm.functions.Function1 r13, defpackage.AbstractC10731e r14) {
        /*
            boolean r0 = r14 instanceof defpackage.C0328e
            if (r0 == 0) goto L13
            r0 = r14
            eٕؑۨ r0 = (defpackage.C0328e) r0
            int r1 = r0.f2352e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2352e = r1
            goto L18
        L13:
            eٕؑۨ r0 = new eٕؑۨ
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f2354e
            int r1 = r0.f2352e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            float r10 = r0.f2353e
            eٔۦْ r9 = r0.f2355e
            eْٗؔ r11 = r0.f2351e
            defpackage.AbstractC2003e.purchase(r14)
            goto L6a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.AbstractC2003e.purchase(r14)
            eٔۦْ r5 = new eٔۦْ
            r5.<init>()
            java.lang.Object r14 = r11.metrica()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4c
            r14 = r2
            goto L4d
        L4c:
            r14 = 0
        L4d:
            r14 = r14 ^ r2
            eّْؒ r3 = new eّْؒ
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f2351e = r11
            r0.f2355e = r5
            r0.f2353e = r4
            r0.f2352e = r2
            java.lang.Object r9 = defpackage.AbstractC7844e.appmetrica(r11, r12, r14, r3, r0)
            eٟؔۙ r10 = defpackage.EnumC2821e.f6782e
            if (r9 != r10) goto L68
            return r10
        L68:
            r10 = r4
            r9 = r5
        L6a:
            eؘٖٝ r12 = new eؘٖٝ
            float r9 = r9.f29883e
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2650e.ad(eٍَؓ, float, eْٗؔ, eٕؔۗ, kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }

    public static final float license(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final void metrica(C17142e c17142e, InterfaceC1719e interfaceC1719e, Function1 function1, float f) {
        float f2;
        try {
            f2 = interfaceC1719e.ad(f);
        } catch (CancellationException unused) {
            c17142e.ad();
            f2 = 0.0f;
        }
        function1.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            c17142e.ad();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, eٔۦْ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.InterfaceC1719e r16, float r17, float r18, defpackage.C16747e r19, defpackage.InterfaceC2869e r20, kotlin.jvm.functions.Function1 r21, defpackage.AbstractC10731e r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.C1625e
            if (r2 == 0) goto L18
            r2 = r1
            eؓؗۗ r2 = (defpackage.C1625e) r2
            int r3 = r2.f4545e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f4545e = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            eؓؗۗ r2 = new eؓؗۗ
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f4543e
            int r2 = r8.f4545e
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            float r0 = r8.f4542e
            float r2 = r8.f4544e
            eٔۦْ r3 = r8.f4546e
            eْٗؔ r4 = r8.f4547e
            defpackage.AbstractC2003e.purchase(r1)
            r1 = r0
            r0 = r2
            goto L90
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            defpackage.AbstractC2003e.purchase(r1)
            eٔۦْ r12 = new eٔۦْ
            r12.<init>()
            java.lang.Object r1 = r19.metrica()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.metrica()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            r2 = r3
            goto L66
        L65:
            r2 = 0
        L66:
            r6 = r2 ^ 1
            eّْؒ r10 = new eّْؒ
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.f4547e = r2
            r8.f4546e = r12
            r8.f4544e = r0
            r8.f4542e = r1
            r8.f4545e = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = defpackage.AbstractC7844e.purchase(r3, r4, r5, r6, r7, r8)
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r2 != r3) goto L8d
            return r3
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.metrica()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = license(r2, r1)
            eؘٖٝ r2 = new eؘٖٝ
            float r3 = r3.f29883e
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            eْٗؔ r0 = defpackage.AbstractC1284e.vip(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2650e.vip(eٍَؓ, float, float, eْٗؔ, eؔۜؐ, kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }
}
