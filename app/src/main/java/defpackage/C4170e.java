package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4170e {
    public final UUID ad;
    public final Size appmetrica;
    public final boolean billing;
    public final Rect license;
    public final int metrica;
    public final int purchase;
    public final int vip;

    public C4170e(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.ad = uuid;
        this.vip = i;
        this.metrica = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.license = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.appmetrica = size;
        this.purchase = i3;
        this.billing = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4170e)) {
            return false;
        }
        C4170e c4170e = (C4170e) obj;
        return this.ad.equals(c4170e.ad) && this.vip == c4170e.vip && this.metrica == c4170e.metrica && this.license.equals(c4170e.license) && this.appmetrica.equals(c4170e.appmetrica) && this.purchase == c4170e.purchase && this.billing == c4170e.billing;
    }

    public final int hashCode() {
        return ((((((((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica.hashCode()) * 1000003) ^ this.purchase) * 1000003) ^ (this.billing ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.ad);
        sb.append(", getTargets=");
        sb.append(this.vip);
        sb.append(", getFormat=");
        sb.append(this.metrica);
        sb.append(", getCropRect=");
        sb.append(this.license);
        sb.append(", getSize=");
        sb.append(this.appmetrica);
        sb.append(", getRotationDegrees=");
        sb.append(this.purchase);
        sb.append(", isMirroring=");
        return AbstractC8703e.signatures(sb, this.billing, ", shouldRespectInputCropRect=false}");
    }
}
