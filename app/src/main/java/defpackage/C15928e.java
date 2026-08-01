package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15928e extends AbstractC0198e {
    public final String vip;

    public C15928e(String str, String str2) {
        super(str);
        this.vip = str2;
        if (!AbstractC7999e.metrica.license(str2)) {
            throw new C8750e("Invalid blob value: it should be token68");
        }
    }

    @Override // defpackage.AbstractC0198e
    public final String ad() {
        return this.ad + ' ' + this.vip;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15928e)) {
            return false;
        }
        C15928e c15928e = (C15928e) obj;
        return AbstractC6507e.loadAd(c15928e.ad, this.ad, true) && AbstractC6507e.loadAd(c15928e.vip, this.vip, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        return AbstractC1660e.m670implements(new Object[]{this.ad.toLowerCase(locale), this.vip.toLowerCase(locale)}).hashCode();
    }
}
