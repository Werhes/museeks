package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٗٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16999e extends AbstractC18159e implements InterfaceC16793e, InterfaceC1940e {
    public static final C6780e Companion = new Object();
    public static final InterfaceC3477e[] billing = {null, AbstractC18039e.appmetrica(2, new C8462e(18)), null, null};
    public final String appmetrica;
    public final String purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16999e(int i, String str, EnumC4755e enumC4755e, String str2, String str3) {
        super(str, enumC4755e, 0);
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C9686e.ad.appmetrica());
            throw null;
        }
        this.appmetrica = str2;
        this.purchase = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16999e(long r1) {
        /*
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            eٌٟؗ r2 = defpackage.EnumC4755e.Wall
            r0.<init>(r1, r2)
            r0.appmetrica = r1
            java.lang.String r1 = ""
            r0.purchase = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16999e.<init>(long):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16999e)) {
            return false;
        }
        C16999e c16999e = (C16999e) obj;
        return AbstractC7890e.billing(this.appmetrica, c16999e.appmetrica) && AbstractC7890e.billing(this.purchase, c16999e.purchase);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.appmetrica;
    }

    public final int hashCode() {
        return this.purchase.hashCode() + (this.appmetrica.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.purchase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Wall(id=");
        sb.append(this.appmetrica);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.purchase, ')');
    }
}
