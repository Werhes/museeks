package defpackage;

import java.io.Closeable;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۟ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8252e implements Closeable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8208e f16750e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6173e f16751e = new C6173e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8419e f16752e = AbstractC5336e.purchase(C5162e.f11047e, AbstractC6731e.vip, 0, new C17019e(this, (InterfaceC5083e) null, 1), 2);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final List f16753e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11698e f16754e;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(C8252e.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(C8252e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        f16750e = new C8208e("HttpCookies", new C12025e(vip, interfaceC13984e));
    }

    public C8252e(C11698e c11698e, List list) {
        this.f16754e = c11698e;
        this.f16753e = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.C10263e r20, defpackage.AbstractC10731e r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof defpackage.C0062e
            if (r3 == 0) goto L19
            r3 = r2
            eؑؔؖ r3 = (defpackage.C0062e) r3
            int r4 = r3.f1209e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f1209e = r4
            goto L1e
        L19:
            eؑؔؖ r3 = new eؑؔؖ
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f1210e
            int r4 = r3.f1209e
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            int r1 = r3.f1213e
            int r4 = r3.f1214e
            java.util.Iterator r6 = r3.f1208e
            eٌؙٔ r7 = r3.f1211e
            defpackage.AbstractC2003e.purchase(r2)
            goto Lbc
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            defpackage.AbstractC2003e.purchase(r2)
            eِٜٗ r2 = r1.ad
            eِٜٗ r4 = new eِٜٗ
            r4.<init>()
            defpackage.AbstractC14385e.appmetrica(r4, r2)
            eٌؙٔ r2 = r4.vip()
            eَؘۘ r4 = r1.metrica
            java.lang.String r6 = "Cookie"
            java.lang.String r4 = r4.m4623e(r6)
            if (r4 == 0) goto Lb1
            eٕؗٞ r6 = defpackage.AbstractC2410e.ad
            java.lang.String r7 = "Saving cookie "
            java.lang.String r8 = " for "
            java.lang.StringBuilder r7 = defpackage.AbstractC8703e.applovin(r7, r4, r8)
            eِٜٗ r1 = r1.ad
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r6.amazon(r1)
            java.util.Map r1 = defpackage.AbstractC15064e.ad(r4, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r1.size()
            r4.<init>(r6)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L82:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r6.getValue()
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            eّٕٚ r8 = new eّٕٚ
            r17 = 0
            eٌۧۘ r18 = defpackage.C9139e.f18290e
            eؙۦٜ r11 = defpackage.EnumC6792e.f14000e
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r8)
            goto L82
        Lb1:
            r4 = 0
        Lb2:
            if (r4 == 0) goto Ldd
            java.util.Iterator r1 = r4.iterator()
            r4 = 0
            r6 = r1
            r7 = r2
            r1 = r4
        Lbc:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r6.next()
            eّٕٚ r2 = (defpackage.C15566e) r2
            r3.f1211e = r7
            r3.f1208e = r6
            r3.f1214e = r4
            r3.f1213e = r1
            r3.f1209e = r5
            eِّٞ r8 = r0.f16754e
            java.lang.Object r2 = r8.ad(r7, r2, r3)
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r2 != r8) goto Lbc
            return r8
        Ldd:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8252e.ad(eَٔٔ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object advert(defpackage.C10263e r8, defpackage.AbstractC10731e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C12038e
            if (r0 == 0) goto L13
            r0 = r9
            eِ۠ۨ r0 = (defpackage.C12038e) r0
            int r1 = r0.f24066e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24066e = r1
            goto L18
        L13:
            eِ۠ۨ r0 = new eِ۠ۨ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f24064e
            int r1 = r0.f24066e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eَٔٔ r8 = r0.f24065e
            defpackage.AbstractC2003e.purchase(r9)
            goto L4d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.AbstractC2003e.purchase(r9)
            eِٜٗ r9 = r8.ad
            eِٜٗ r1 = new eِٜٗ
            r1.<init>()
            defpackage.AbstractC14385e.appmetrica(r1, r9)
            eٌؙٔ r9 = r1.vip()
            r0.f24065e = r8
            r0.f24066e = r2
            java.lang.Object r9 = r7.license(r9, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r9 != r0) goto L4d
            return r0
        L4d:
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            boolean r9 = r0.isEmpty()
            java.lang.String r6 = "Cookie"
            if (r9 != 0) goto L82
            eٕؗٞ r9 = defpackage.AbstractC2410e.ad
            eٕٝۥ r4 = defpackage.C15618e.f30802e
            r5 = 30
            java.lang.String r1 = "; "
            r2 = 0
            r3 = 0
            java.lang.String r9 = defpackage.AbstractC13480e.m3608try(r0, r1, r2, r3, r4, r5)
            eَؘۘ r0 = r8.metrica
            r0.m4622e(r6, r9)
            eٕؗٞ r0 = defpackage.AbstractC2410e.ad
            java.lang.String r1 = "Sending cookie "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r9 = defpackage.AbstractC8703e.applovin(r1, r9, r2)
            eِٜٗ r8 = r8.ad
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r0.amazon(r8)
            goto L87
        L82:
            eَؘۘ r8 = r8.metrica
            r8.m4628e(r6)
        L87:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8252e.advert(eَٔٔ, eُؑ۠):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16754e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r5.f16752e.mo696protected(r0) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.C6399e r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C2495e
            if (r0 == 0) goto L13
            r0 = r7
            eُؔؒ r0 = (defpackage.C2495e) r0
            int r1 = r0.f6345e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6345e = r1
            goto L18
        L13:
            eُؔؒ r0 = new eُؔؒ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6343e
            int r1 = r0.f6345e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            eٌؙٔ r6 = r0.f6344e
            defpackage.AbstractC2003e.purchase(r7)
            goto L48
        L38:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f6344e = r6
            r0.f6345e = r3
            eٌُؑ r7 = r5.f16752e
            java.lang.Object r7 = r7.mo696protected(r0)
            if (r7 != r4) goto L48
            goto L55
        L48:
            r7 = 0
            r0.f6344e = r7
            r0.f6345e = r2
            eِّٞ r7 = r5.f16754e
            java.io.Serializable r6 = r7.purchase(r6, r0)
            if (r6 != r4) goto L56
        L55:
            return r4
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8252e.license(eٌؙٔ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.AbstractC16824e r30, defpackage.AbstractC10731e r31) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8252e.purchase(eؘٗٙ, eُؑ۠):java.lang.Object");
    }
}
