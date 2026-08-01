package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۘۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9708e implements InterfaceC8642e {
    public final InterfaceC9617e ad;
    public final InterfaceC2869e metrica;
    public final C15217e vip;

    public C9708e(InterfaceC9617e interfaceC9617e, C15217e c15217e, InterfaceC2869e interfaceC2869e) {
        this.ad = interfaceC9617e;
        this.vip = c15217e;
        this.metrica = interfaceC2869e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C9708e r4, defpackage.InterfaceC1719e r5, float r6, float r7, defpackage.C4253e r8, defpackage.AbstractC10731e r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C11067e
            if (r0 == 0) goto L14
            r0 = r9
            eُ٘۟ r0 = (defpackage.C11067e) r0
            int r1 = r0.f21962e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f21962e = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            eُ٘۟ r0 = new eُ٘۟
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.f21961e
            int r1 = r9.f21962e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.AbstractC2003e.purchase(r0)
            goto L85
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r0)
            float r0 = java.lang.Math.abs(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            goto L44
        L3c:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4b
        L44:
            r4 = 28
            eْٗؔ r4 = defpackage.AbstractC1284e.ad(r6, r7, r4)
            return r4
        L4b:
            r9.f21962e = r2
            eٕؔۗ r0 = r4.vip
            float r1 = defpackage.AbstractC9546e.vip(r0, r1, r7)
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L66
            eّّٓ r4 = new eّّٓ
            r4.<init>(r0)
        L64:
            r0 = r6
            goto L71
        L66:
            eؘؓٞ r0 = new eؘؓٞ
            eؔۜؐ r4 = r4.metrica
            r1 = 27
            r0.<init>(r1, r4)
            r4 = r0
            goto L64
        L71:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.admob(r5, r6, r7, r8, r9)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r0 != r4) goto L85
            return r4
        L85:
            eؘٖٝ r0 = (defpackage.C5768e) r0
            eْٗؔ r4 = r0.vip
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9708e.vip(eٍۘۢ, eٍَؓ, float, float, eؖٞؕ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8642e
    public final Object ad(InterfaceC1719e interfaceC1719e, float f, InterfaceC5083e interfaceC5083e) {
        return license(interfaceC1719e, f, AbstractC11912e.vip, (AbstractC10731e) interfaceC5083e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9708e) {
            C9708e c9708e = (C9708e) obj;
            if (AbstractC7890e.billing(c9708e.metrica, this.metrica) && AbstractC7890e.billing(c9708e.vip, this.vip) && AbstractC7890e.billing(c9708e.ad, this.ad)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode() + ((this.vip.hashCode() + (this.metrica.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.InterfaceC1719e r5, float r6, kotlin.jvm.functions.Function1 r7, defpackage.AbstractC10731e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.C3343e
            if (r0 == 0) goto L13
            r0 = r8
            eْؕ۠ r0 = (defpackage.C3343e) r0
            int r1 = r0.f7541e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7541e = r1
            goto L18
        L13:
            eْؕ۠ r0 = new eْؕ۠
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f7540e
            int r1 = r0.f7541e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r8)
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r8)
            r0.f7541e = r2
            java.lang.Object r8 = r4.metrica(r5, r6, r7, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r8 != r5) goto L3b
            return r5
        L3b:
            eؘٖٝ r8 = (defpackage.C5768e) r8
            java.lang.Float r5 = r8.ad
            float r5 = r5.floatValue()
            eْٗؔ r6 = r8.vip
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L55
        L4b:
            java.lang.Object r5 = r6.metrica()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9708e.license(eٍَؓ, float, kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.InterfaceC1719e r10, float r11, kotlin.jvm.functions.Function1 r12, defpackage.AbstractC10731e r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.C11921e
            if (r0 == 0) goto L13
            r0 = r13
            eِۗ r0 = (defpackage.C11921e) r0
            int r1 = r0.f23887e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23887e = r1
            goto L18
        L13:
            eِۗ r0 = new eِۗ
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f23885e
            int r1 = r0.f23887e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            kotlin.jvm.functions.Function1 r12 = r0.f23886e
            defpackage.AbstractC2003e.purchase(r13)
            goto L4c
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.AbstractC2003e.purchase(r13)
            eٚۚ r3 = new eٚۚ
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f23886e = r6
            r0.f23887e = r2
            eٌۘٙ r10 = defpackage.AbstractC16342e.metrica
            java.lang.Object r13 = defpackage.AbstractC5336e.advert(r10, r3, r0)
            eٟؔۙ r10 = defpackage.EnumC2821e.f6782e
            if (r13 != r10) goto L4b
            return r10
        L4b:
            r12 = r6
        L4c:
            eؘٖٝ r13 = (defpackage.C5768e) r13
            java.lang.Float r10 = new java.lang.Float
            r11 = 0
            r10.<init>(r11)
            r12.invoke(r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9708e.metrica(eٍَؓ, float, kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }
}
