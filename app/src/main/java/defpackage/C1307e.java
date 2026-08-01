package defpackage;

import android.graphics.Matrix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307e implements InterfaceC10073e {
    public final C18543e ad;
    public final int appmetrica;
    public final Matrix license;
    public final int metrica;
    public final long vip;

    public C1307e(C18543e c18543e, long j, int i, Matrix matrix, int i2) {
        if (c18543e == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.ad = c18543e;
        this.vip = j;
        this.metrica = i;
        this.license = matrix;
        this.appmetrica = i2;
    }

    @Override // defpackage.InterfaceC10073e
    public final C18543e ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC10073e
    public final Matrix appmetrica() {
        return this.license;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1307e) {
            C1307e c1307e = (C1307e) obj;
            if (this.ad.equals(c1307e.ad) && this.vip == c1307e.vip && this.metrica == c1307e.metrica && this.license.equals(c1307e.license) && this.appmetrica == c1307e.appmetrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() ^ 1000003) * 1000003;
        long j = this.vip;
        return ((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.metrica) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica;
    }

    @Override // defpackage.InterfaceC10073e
    public final int license() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC10073e
    public final long metrica() {
        return this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.ad);
        sb.append(", timestamp=");
        sb.append(this.vip);
        sb.append(", rotationDegrees=");
        sb.append(this.metrica);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.license);
        sb.append(", flashState=");
        return AbstractC17861e.smaato(this.appmetrica, "}", sb);
    }

    @Override // defpackage.InterfaceC10073e
    public final int vip() {
        return this.appmetrica;
    }
}
