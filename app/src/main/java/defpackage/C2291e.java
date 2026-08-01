package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2291e extends AbstractC10072e {
    public final /* synthetic */ C7431e ad;

    public C2291e(C7431e c7431e) {
        this.ad = c7431e;
    }

    @Override // defpackage.AbstractC10072e
    public final void ad() {
        C7431e c7431e = this.ad;
        c7431e.appmetrica = c7431e.metrica.billing();
        C14052e c14052e = c7431e.license;
        ((C17199e) c14052e.appmetrica).adcel();
        c14052e.license();
    }

    @Override // defpackage.AbstractC10072e
    public final void appmetrica(int i, int i2) {
        C7431e c7431e = this.ad;
        c7431e.appmetrica -= i2;
        C14052e c14052e = c7431e.license;
        ((C17199e) c14052e.appmetrica).admob(i + c14052e.appmetrica(c7431e), i2);
        if (c7431e.appmetrica >= 1 || c7431e.metrica.f588e != 2) {
            return;
        }
        c14052e.license();
    }

    @Override // defpackage.AbstractC10072e
    public final void license(int i, int i2) {
        C7431e c7431e = this.ad;
        C14052e c14052e = c7431e.license;
        int appmetrica = c14052e.appmetrica(c7431e);
        ((C17199e) c14052e.appmetrica).smaato(i + appmetrica, i2 + appmetrica);
    }

    @Override // defpackage.AbstractC10072e
    public final void metrica(int i, int i2) {
        C7431e c7431e = this.ad;
        c7431e.appmetrica += i2;
        C14052e c14052e = c7431e.license;
        ((C17199e) c14052e.appmetrica).Signature(i + c14052e.appmetrica(c7431e), i2);
        if (c7431e.appmetrica <= 0 || c7431e.metrica.f588e != 2) {
            return;
        }
        c14052e.license();
    }

    @Override // defpackage.AbstractC10072e
    public final void purchase() {
        this.ad.license.license();
    }

    @Override // defpackage.AbstractC10072e
    public final void vip(int i, int i2, Object obj) {
        C7431e c7431e = this.ad;
        C14052e c14052e = c7431e.license;
        ((C17199e) c14052e.appmetrica).amazon(i + c14052e.appmetrica(c7431e), i2, obj);
    }
}
