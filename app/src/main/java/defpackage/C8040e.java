package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8040e implements InterfaceC11140e, InterfaceC11116e {
    public final AbstractC1792e ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final RadioInfo vip;

    public C8040e(AbstractC1792e abstractC1792e, RadioInfo radioInfo) {
        this.ad = abstractC1792e;
        this.vip = radioInfo;
        this.metrica = abstractC1792e.ad();
        this.license = abstractC1792e.license(radioInfo);
        StringBuilder sb = new StringBuilder("Bearer ");
        C15959e c15959e = C15959e.ad;
        C5089e c5089e = C15959e.vip;
        sb.append(c5089e.ad() ? c5089e.vip.vip : BuildConfig.FLAVOR);
        this.appmetrica = sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC11116e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C4689e
            if (r0 == 0) goto L13
            r0 = r5
            eؘٜؗ r0 = (defpackage.C4689e) r0
            int r1 = r0.f10076e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10076e = r1
            goto L18
        L13:
            eؘٜؗ r0 = new eؘٜؗ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10075e
            int r1 = r0.f10076e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L41
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eْؓۢ r5 = r4.ad
            eٖٕۛ r5 = r5.vip()
            r0.f10076e = r2
            java.lang.Object r5 = r5.vip(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L41
            return r0
        L41:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi r5 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi) r5
            if (r5 == 0) goto L4c
            bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo r5 = r5.ad
            if (r5 == 0) goto L4c
            java.util.List r5 = r5.ad
            goto L4d
        L4c:
            r5 = 0
        L4d:
            if (r5 != 0) goto L51
            eْۨٝ r5 = defpackage.C13664e.f27089e
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8040e.appmetrica(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return this.appmetrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8040e)) {
            return false;
        }
        C8040e c8040e = (C8040e) obj;
        return AbstractC7890e.billing(this.ad, c8040e.ad) && AbstractC7890e.billing(this.vip, c8040e.vip);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.metrica;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
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
        return "Radio(type=" + this.ad + ", config=" + this.vip + ')';
    }
}
