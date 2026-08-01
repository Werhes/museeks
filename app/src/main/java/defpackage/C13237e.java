package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalTime;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13237e implements InterfaceC12705e, InterfaceC5374e {
    public Integer ad;
    public Integer appmetrica;
    public Integer license;
    public final EnumC13402e metrica;
    public Integer purchase;
    public final Integer vip;

    public /* synthetic */ C13237e() {
        this(null, null, null, null, null, null);
    }

    public C13237e(Integer num, Integer num2, EnumC13402e enumC13402e, Integer num3, Integer num4, Integer num5) {
        this.ad = num;
        this.vip = num2;
        this.metrica = enumC13402e;
        this.license = num3;
        this.appmetrica = num4;
        this.purchase = num5;
    }

    @Override // defpackage.InterfaceC5374e
    public final Object ad() {
        return new C13237e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase);
    }

    @Override // defpackage.InterfaceC12705e
    public final void advert(Integer num) {
        this.ad = num;
    }

    @Override // defpackage.InterfaceC12705e
    public final Integer amazon() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC12705e
    public final void appmetrica(Integer num) {
        this.license = num;
    }

    @Override // defpackage.InterfaceC12705e
    public final C2403e billing() {
        Integer num = this.purchase;
        if (num != null) {
            return new C2403e(num.intValue(), 9);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13237e)) {
            return false;
        }
        C13237e c13237e = (C13237e) obj;
        return AbstractC7890e.billing(this.ad, c13237e.ad) && AbstractC7890e.billing(this.vip, c13237e.vip) && this.metrica == c13237e.metrica && AbstractC7890e.billing(this.license, c13237e.license) && AbstractC7890e.billing(this.appmetrica, c13237e.appmetrica) && AbstractC7890e.billing(this.purchase, c13237e.purchase);
    }

    public final int hashCode() {
        Integer num = this.ad;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.vip;
        int intValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + intValue;
        EnumC13402e enumC13402e = this.metrica;
        int hashCode = ((enumC13402e != null ? enumC13402e.hashCode() : 0) * 31) + intValue2;
        Integer num3 = this.license;
        int intValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + hashCode;
        Integer num4 = this.appmetrica;
        int intValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + intValue3;
        Integer num5 = this.purchase;
        return intValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.InterfaceC12705e
    public final Integer license() {
        return this.license;
    }

    @Override // defpackage.InterfaceC12705e
    public final void loadAd(Integer num) {
        this.appmetrica = num;
    }

    public final C0471e metrica() {
        int intValue;
        int intValue2;
        Integer num = this.ad;
        EnumC13402e enumC13402e = EnumC13402e.f26660e;
        if (num != null) {
            intValue = num.intValue();
            Integer num2 = this.vip;
            if (num2 != null && ((intValue + 11) % 12) + 1 != (intValue2 = num2.intValue())) {
                throw new IllegalArgumentException(AbstractC1786e.Signature(intValue, intValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is ").toString());
            }
            EnumC13402e enumC13402e2 = this.metrica;
            if (enumC13402e2 != null) {
                if ((enumC13402e2 == enumC13402e) != (intValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + intValue + ", but the AM/PM marker is " + enumC13402e2).toString());
                }
            }
        } else {
            Integer num3 = null;
            Integer num4 = this.vip;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                EnumC13402e enumC13402e3 = this.metrica;
                if (enumC13402e3 != null) {
                    if (intValue3 == 12) {
                        intValue3 = 0;
                    }
                    num3 = Integer.valueOf(intValue3 + (enumC13402e3 != enumC13402e ? 0 : 12));
                }
            }
            if (num3 == null) {
                throw new IllegalArgumentException("Incomplete time: missing hour");
            }
            intValue = num3.intValue();
        }
        Integer num5 = this.license;
        AbstractC10763e.ad(num5, "minute");
        int intValue4 = num5.intValue();
        Integer num6 = this.appmetrica;
        int intValue5 = num6 != null ? num6.intValue() : 0;
        Integer num7 = this.purchase;
        try {
            return new C0471e(LocalTime.of(intValue, intValue4, intValue5, num7 != null ? num7.intValue() : 0));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.InterfaceC12705e
    public final Integer smaato() {
        return this.ad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r1 = r4.ad
            java.lang.String r2 = "??"
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.Integer r3 = r4.license
            if (r3 != 0) goto L19
            r3 = r2
        L19:
            r0.append(r3)
            r0.append(r1)
            java.lang.Integer r1 = r4.appmetrica
            if (r1 != 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            r0.append(r2)
            r1 = 46
            r0.append(r1)
            java.lang.Integer r1 = r4.purchase
            if (r1 == 0) goto L45
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = 9 - r2
            java.lang.String r1 = defpackage.AbstractC5304e.m1850abstract(r2, r1)
            if (r1 != 0) goto L47
        L45:
            java.lang.String r1 = "???"
        L47:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13237e.toString():java.lang.String");
    }

    @Override // defpackage.InterfaceC12705e
    public final void vip(C2403e c2403e) {
        this.purchase = c2403e != null ? Integer.valueOf(c2403e.ad(9)) : null;
    }
}
