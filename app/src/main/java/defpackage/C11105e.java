package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٛٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11105e extends AbstractC11290e {
    public long adcel;
    public float advert;
    public final C17665e appmetrica;
    public final C0576e billing;
    public boolean license;
    public String metrica;
    public float mopub;
    public AbstractC16858e purchase;
    public final C15157e smaato;
    public final C0576e startapp;
    public final C10319e vip;
    public C2815e yandex;

    /* JADX WARN: Type inference failed for: r3v3, types: [eٌَ٘, java.lang.Object] */
    public C11105e(C10319e c10319e) {
        this.vip = c10319e;
        c10319e.startapp = new C15157e(this, 0);
        this.metrica = BuildConfig.FLAVOR;
        this.license = true;
        ?? obj = new Object();
        obj.f34625e = 0L;
        obj.f34623e = 0;
        obj.f34621e = new C14434e();
        this.appmetrica = obj;
        this.purchase = C7309e.f14947e;
        this.billing = AbstractC14533e.startapp(null);
        this.startapp = AbstractC14533e.startapp(new C2108e(0L));
        this.adcel = 9205357640488583168L;
        this.mopub = 1.0f;
        this.advert = 1.0f;
        this.smaato = new C15157e(this, 1);
    }

    @Override // defpackage.AbstractC11290e
    public final void ad(InterfaceC2235e interfaceC2235e) {
        appmetrica(interfaceC2235e, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r3 != (r8 == null ? defpackage.AbstractC11815e.m3272throws(r8.ad.getConfig()) : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0114, code lost:
    
        if (r9.f34623e == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(defpackage.InterfaceC2235e r36, float r37, defpackage.C2815e r38) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11105e.appmetrica(eؓۦۚ, float, eَؔۙ):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.metrica);
        sb.append("\n\tviewportWidth: ");
        C0576e c0576e = this.startapp;
        sb.append(Float.intBitsToFloat((int) (((C2108e) c0576e.getValue()).ad >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C2108e) c0576e.getValue()).ad & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
