package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14807e extends AbstractC13345e {
    public final C14172e ad;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public C14807e(C14172e c14172e) {
        this.ad = c14172e;
        Set set = AbstractC7644e.ad;
        this.vip = c14172e.vip(List.class, set, null);
        this.metrica = c14172e.vip(Map.class, set, null);
        this.license = c14172e.vip(String.class, set, null);
        this.appmetrica = c14172e.vip(Double.class, set, null);
        this.purchase = c14172e.vip(Boolean.class, set, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L8;
     */
    @Override // defpackage.AbstractC13345e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(defpackage.AbstractC3442e r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.license()
            r5.purchase()
            return
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = defpackage.AbstractC7644e.ad
            r2 = 0
            eٓۖۦ r3 = r4.ad
            eْٚٙ r0 = r3.vip(r0, r1, r2)
            r0.purchase(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14807e.purchase(eۣؕ٘, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        int m2467class = AbstractC8703e.m2467class(abstractC17080e.crashlytics());
        if (m2467class == 0) {
            return this.vip.vip(abstractC17080e);
        }
        if (m2467class == 2) {
            return this.metrica.vip(abstractC17080e);
        }
        if (m2467class == 5) {
            return this.license.vip(abstractC17080e);
        }
        if (m2467class == 6) {
            return this.appmetrica.vip(abstractC17080e);
        }
        if (m2467class == 7) {
            return this.purchase.vip(abstractC17080e);
        }
        if (m2467class == 8) {
            abstractC17080e.ads();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + AbstractC0869e.crashlytics(abstractC17080e.crashlytics()) + " at path " + abstractC17080e.loadAd());
    }
}
