package defpackage;

import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18010e implements InterfaceC16793e, InterfaceC11116e {
    public final String ad;
    public boolean appmetrica;
    public final String license;
    public final Map metrica;
    public final String purchase;
    public final String vip;

    public C18010e(int i, String str, String str2, String str3, Map map) {
        str2 = (i & 2) != 0 ? null : str2;
        map = (i & 4) != 0 ? C9139e.f18290e : map;
        str3 = (i & 8) != 0 ? BuildConfig.FLAVOR : str3;
        this.ad = str;
        this.vip = str2;
        this.metrica = map;
        this.license = str3;
        this.purchase = "vk_mix_" + str + '_' + str2 + '_' + AbstractC13480e.m3608try(map.entrySet(), null, null, null, new C2091e(4), 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC11116e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.AbstractC10731e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C2145e
            if (r0 == 0) goto L13
            r0 = r7
            eؓ۠ۘ r0 = (defpackage.C2145e) r0
            int r1 = r0.f5521e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5521e = r1
            goto L18
        L13:
            eؓ۠ۘ r0 = new eؓ۠ۘ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5520e
            int r1 = r0.f5521e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r7)
            goto L48
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2d:
            defpackage.AbstractC2003e.purchase(r7)
            eْؕؖ r7 = new eْؕؖ
            boolean r1 = r6.appmetrica
            java.lang.String r3 = r6.vip
            java.lang.String r4 = r6.ad
            java.util.Map r5 = r6.metrica
            r7.<init>(r4, r5, r1, r3)
            r0.f5521e = r2
            java.lang.Object r7 = defpackage.AbstractC18406e.yandex(r7, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L48
            return r0
        L48:
            r0 = r7
            java.util.List r0 = (java.util.List) r0
            r6.appmetrica = r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18010e.appmetrica(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18010e)) {
            return false;
        }
        C18010e c18010e = (C18010e) obj;
        return AbstractC7890e.billing(this.ad, c18010e.ad) && AbstractC7890e.billing(this.vip, c18010e.vip) && AbstractC7890e.billing(this.metrica, c18010e.metrica) && AbstractC7890e.billing(this.license, c18010e.license);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.purchase;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        return this.license.hashCode() + ((this.metrica.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.license;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamMix(mixId=");
        sb.append(this.ad);
        sb.append(", mixEntityId=");
        sb.append(this.vip);
        sb.append(", options=");
        sb.append(this.metrica);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.license, ')');
    }
}
