package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۨ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0745e extends AbstractC14437e {
    public final /* synthetic */ C4026e metrica;
    public final /* synthetic */ AbstractC18292e vip;

    public C0745e(C4026e c4026e, AbstractC18292e abstractC18292e) {
        this.metrica = c4026e;
        this.vip = abstractC18292e;
    }

    @Override // defpackage.AbstractC14437e
    public final void startapp(Typeface typeface) {
        C4026e c4026e = this.metrica;
        c4026e.amazon = Typeface.create(typeface, c4026e.metrica);
        c4026e.smaato = true;
        this.vip.billing(c4026e.amazon, false);
    }

    @Override // defpackage.AbstractC14437e
    public final void yandex(int i) {
        this.metrica.smaato = true;
        this.vip.purchase(i);
    }
}
