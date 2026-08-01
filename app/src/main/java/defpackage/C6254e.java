package defpackage;

import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6254e {
    public final CharSequence ad;
    public final TextClassification metrica;
    public final long vip;

    public C6254e(CharSequence charSequence, long j, TextClassification textClassification) {
        this.ad = charSequence;
        this.vip = j;
        this.metrica = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6254e)) {
            return false;
        }
        C6254e c6254e = (C6254e) obj;
        return AbstractC7890e.billing(this.ad, c6254e.ad) && C12347e.metrica(this.vip, c6254e.vip) && AbstractC7890e.billing(this.metrica, c6254e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((C12347e.startapp(this.vip) + (this.ad.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.ad) + ", selection=" + ((Object) C12347e.adcel(this.vip)) + ", textClassification=" + this.metrica + ')';
    }
}
