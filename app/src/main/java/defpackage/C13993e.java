package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13993e extends AbstractC10947e {
    public final C6140e ad;
    public final AbstractC10947e license;
    public final C17089e metrica;
    public final String vip;

    public C13993e(C6140e c6140e, String str, C17089e c17089e, AbstractC10947e abstractC10947e) {
        this.ad = c6140e;
        this.vip = str;
        this.metrica = c17089e;
        this.license = abstractC10947e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.ad != C6140e.f12911e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13993e)) {
            return false;
        }
        C13993e c13993e = (C13993e) obj;
        return c13993e.metrica.equals(this.metrica) && c13993e.license.equals(this.license) && c13993e.vip.equals(this.vip) && c13993e.ad.equals(this.ad);
    }

    public final int hashCode() {
        return Objects.hash(C13993e.class, this.vip, this.metrica, this.license, this.ad);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.vip + ", dekParsingStrategy: " + this.metrica + ", dekParametersForNewKeys: " + this.license + ", variant: " + this.ad + ")";
    }
}
