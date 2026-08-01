package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10324e {
    public final AbstractC2832e ad;
    public final /* synthetic */ int adcel;
    public boolean appmetrica;
    public boolean billing;
    public boolean license;
    public boolean metrica;
    public boolean purchase;
    public InterfaceC1036e yandex;
    public boolean vip = true;
    public final HashMap startapp = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C10324e(InterfaceC1036e interfaceC1036e, int i) {
        this.adcel = i;
        this.ad = (AbstractC2832e) interfaceC1036e;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [eؚۛۖ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [eْؒٔ, eؔۚؓ] */
    public static final void ad(C10324e c10324e, AbstractC17016e abstractC17016e, int i, AbstractC17732e abstractC17732e) {
        HashMap hashMap = c10324e.startapp;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (c10324e.adcel) {
                    case 0:
                        InterfaceC0983e interfaceC0983e = abstractC17732e.f34778e;
                        if (interfaceC0983e != null) {
                            j = ((C5048e) interfaceC0983e).metrica(j, false);
                        }
                        j = AbstractC17324e.appmetrica(j, abstractC17732e.f34793e);
                        break;
                    default:
                        long j2 = abstractC17732e.mo2526e().f9110e;
                        j = C2152e.startapp((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                abstractC17732e = abstractC17732e.f34794e;
                if (AbstractC7890e.billing(abstractC17732e, c10324e.ad.appmetrica())) {
                    int round = Math.round(abstractC17016e instanceof C4782e ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(abstractC17016e)) {
                        int intValue = ((Number) AbstractC10064e.license(abstractC17016e, hashMap)).intValue();
                        C4782e c4782e = AbstractC14806e.ad;
                        round = ((Number) abstractC17016e.ad.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(abstractC17016e, Integer.valueOf(round));
                    return;
                }
            } while (!c10324e.vip(abstractC17732e).containsKey(abstractC17016e));
            float metrica = c10324e.metrica(abstractC17732e, abstractC17016e);
            long floatToRawIntBits3 = Float.floatToRawIntBits(metrica);
            long floatToRawIntBits4 = Float.floatToRawIntBits(metrica);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final boolean appmetrica() {
        yandex();
        return this.yandex != null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eْؒٔ, eؔۚؓ] */
    public final void billing() {
        HashMap hashMap = this.startapp;
        hashMap.clear();
        C17097e c17097e = new C17097e(0, this);
        ?? r2 = this.ad;
        r2.inmobi(c17097e);
        hashMap.putAll(vip(r2.appmetrica()));
        this.vip = false;
    }

    public final boolean license() {
        return this.metrica || this.appmetrica || this.purchase || this.billing;
    }

    public final int metrica(AbstractC17732e abstractC17732e, AbstractC17016e abstractC17016e) {
        switch (this.adcel) {
            case 0:
                return abstractC17732e.mo393try(abstractC17016e);
            default:
                return abstractC17732e.mo2526e().mo393try(abstractC17016e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eْؒٔ, eؔۚؓ] */
    public final void purchase() {
        this.vip = true;
        ?? r0 = this.ad;
        InterfaceC1036e purchase = r0.purchase();
        if (purchase == null) {
            return;
        }
        if (this.metrica) {
            purchase.mo449throw();
        } else if (this.appmetrica || this.license) {
            purchase.requestLayout();
        }
        if (this.purchase) {
            r0.mo449throw();
        }
        if (this.billing) {
            r0.requestLayout();
        }
        purchase.ad().purchase();
    }

    public final Map vip(AbstractC17732e abstractC17732e) {
        switch (this.adcel) {
            case 0:
                return abstractC17732e.mo1469e().ad();
            default:
                return abstractC17732e.mo2526e().mo1469e().ad();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [eْؒٔ, eؔۚؓ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex() {
        /*
            r2 = this;
            boolean r0 = r2.license()
            eؔۚؓ r1 = r2.ad
            if (r0 == 0) goto L9
            goto L51
        L9:
            eْؒٔ r0 = r1.purchase()
            if (r0 != 0) goto L10
            goto L53
        L10:
            eَ٘ؖ r0 = r0.ad()
            eْؒٔ r1 = r0.yandex
            if (r1 == 0) goto L23
            eَ٘ؖ r0 = r1.ad()
            boolean r0 = r0.license()
            if (r0 == 0) goto L23
            goto L51
        L23:
            eْؒٔ r0 = r2.yandex
            if (r0 == 0) goto L53
            eَ٘ؖ r1 = r0.ad()
            boolean r1 = r1.license()
            if (r1 == 0) goto L32
            goto L53
        L32:
            eْؒٔ r1 = r0.purchase()
            if (r1 == 0) goto L41
            eَ٘ؖ r1 = r1.ad()
            if (r1 == 0) goto L41
            r1.yandex()
        L41:
            eْؒٔ r0 = r0.purchase()
            if (r0 == 0) goto L50
            eَ٘ؖ r0 = r0.ad()
            if (r0 == 0) goto L50
            eْؒٔ r1 = r0.yandex
            goto L51
        L50:
            r1 = 0
        L51:
            r2.yandex = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10324e.yandex():void");
    }
}
