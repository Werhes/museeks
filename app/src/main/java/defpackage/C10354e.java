package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10354e {
    public static final /* synthetic */ int license = 0;
    public final C16108e ad;
    public final String metrica;
    public final int vip;

    static {
        C16108e c16108e = C16108e.metrica;
    }

    public C10354e(C16108e c16108e, int i, String str) {
        this.ad = c16108e;
        this.vip = i;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10354e)) {
            return false;
        }
        C10354e c10354e = (C10354e) obj;
        return AbstractC7890e.billing(this.ad, c10354e.ad) && this.vip == c10354e.vip && AbstractC7890e.billing(this.metrica, c10354e.metrica);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, 0, 0, Integer.valueOf(this.vip), this.metrica);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.ad);
        sb.append(", encodeFrameRate=0, bitrate=0, aspectRatio=");
        sb.append(this.vip);
        sb.append(", mimeType=");
        return AbstractC4653e.applovin(sb, this.metrica, '}');
    }
}
