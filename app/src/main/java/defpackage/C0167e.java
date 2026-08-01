package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167e {
    public final Rect ad;
    public final Matrix appmetrica;
    public final boolean license;
    public final int metrica;
    public final boolean purchase;
    public final int vip;

    public C0167e(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.ad = rect;
        this.vip = i;
        this.metrica = i2;
        this.license = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.appmetrica = matrix;
        this.purchase = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0167e) {
            C0167e c0167e = (C0167e) obj;
            if (this.ad.equals(c0167e.ad) && this.vip == c0167e.vip && this.metrica == c0167e.metrica && this.license == c0167e.license && this.appmetrica.equals(c0167e.appmetrica) && this.purchase == c0167e.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica) * 1000003) ^ (this.license ? 1231 : 1237)) * 1000003) ^ this.appmetrica.hashCode()) * 1000003) ^ (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.ad);
        sb.append(", getRotationDegrees=");
        sb.append(this.vip);
        sb.append(", getTargetRotation=");
        sb.append(this.metrica);
        sb.append(", hasCameraTransform=");
        sb.append(this.license);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.appmetrica);
        sb.append(", isMirroring=");
        return AbstractC8703e.signatures(sb, this.purchase, "}");
    }
}
