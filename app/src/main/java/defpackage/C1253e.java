package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1253e {
    public final InterfaceC14502e ad;
    public final InterfaceC14502e vip;

    public C1253e(InterfaceC14502e interfaceC14502e, InterfaceC14502e interfaceC14502e2) {
        this.ad = interfaceC14502e;
        this.vip = interfaceC14502e2;
    }

    public final double ad() {
        Double license = this.ad.license();
        if (license != null) {
            double doubleValue = license.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double license2 = this.vip.license();
        if (license2 != null) {
            double doubleValue2 = license2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.vip(r0) != r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C2050e
            if (r0 == 0) goto L13
            r0 = r6
            eؓۘۡ r0 = (defpackage.C2050e) r0
            int r1 = r0.f5337e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5337e = r1
            goto L18
        L13:
            eؓۘۡ r0 = new eؓۘۡ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5335e
            int r1 = r0.f5337e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            eؒۗٚ r1 = r0.f5336e
            defpackage.AbstractC2003e.purchase(r6)
            goto L49
        L38:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f5336e = r5
            r0.f5337e = r3
            eٔؕٛ r6 = r5.ad
            java.lang.Object r6 = r6.vip(r0)
            if (r6 != r4) goto L48
            goto L56
        L48:
            r1 = r5
        L49:
            eٔؕٛ r6 = r1.vip
            r1 = 0
            r0.f5336e = r1
            r0.f5337e = r2
            java.lang.Object r6 = r6.vip(r0)
            if (r6 != r4) goto L57
        L56:
            return r4
        L57:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1253e.vip(eُؑ۠):java.lang.Object");
    }
}
