package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C5815e extends AbstractC17066e {
    public final WindowInsets.Builder appmetrica;

    public C5815e() {
        this.appmetrica = AbstractC7440e.purchase();
    }

    public C5815e(C12948e c12948e) {
        super(c12948e);
        WindowInsets billing = c12948e.billing();
        this.appmetrica = billing != null ? AbstractC7440e.billing(billing) : AbstractC7440e.purchase();
    }

    @Override // defpackage.AbstractC17066e
    public void appmetrica(C7088e c7088e) {
        this.appmetrica.setMandatorySystemGestureInsets(c7088e.license());
    }

    @Override // defpackage.AbstractC17066e
    public void billing(C7088e c7088e) {
        this.appmetrica.setSystemGestureInsets(c7088e.license());
    }

    @Override // defpackage.AbstractC17066e
    public void purchase(C7088e c7088e) {
        this.appmetrica.setStableInsets(c7088e.license());
    }

    @Override // defpackage.AbstractC17066e
    public void startapp(C7088e c7088e) {
        this.appmetrica.setTappableElementInsets(c7088e.license());
    }

    @Override // defpackage.AbstractC17066e
    public C12948e vip() {
        ad();
        C12948e yandex = C12948e.yandex(null, this.appmetrica.build());
        C7088e[] c7088eArr = this.vip;
        C2893e c2893e = yandex.ad;
        c2893e.isVip(c7088eArr);
        c2893e.tapsense(null);
        c2893e.premium(this.metrica);
        c2893e.subs(this.license);
        return yandex;
    }

    @Override // defpackage.AbstractC17066e
    public void yandex(C7088e c7088e) {
        this.appmetrica.setSystemWindowInsets(c7088e.license());
    }
}
