package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9971e extends AbstractC18292e {
    public final C6325e appmetrica;
    public final Typeface license;
    public boolean purchase;

    public C9971e(C6325e c6325e, Typeface typeface) {
        super(5);
        this.license = typeface;
        this.appmetrica = c6325e;
    }

    @Override // defpackage.AbstractC18292e
    public final void billing(Typeface typeface, boolean z) {
        if (this.purchase) {
            return;
        }
        C1566e c1566e = (C1566e) this.appmetrica.f13170e;
        if (c1566e.adcel(typeface)) {
            c1566e.yandex(false);
        }
    }

    @Override // defpackage.AbstractC18292e
    public final void purchase(int i) {
        if (this.purchase) {
            return;
        }
        C1566e c1566e = (C1566e) this.appmetrica.f13170e;
        if (c1566e.adcel(this.license)) {
            c1566e.yandex(false);
        }
    }
}
