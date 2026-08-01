package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176e {
    public static final C0176e purchase = new C0176e(10485760, 200, ModuleDescriptor.MODULE_VERSION, 604800000, 81920);
    public final long ad;
    public final int appmetrica;
    public final long license;
    public final int metrica;
    public final int vip;

    public C0176e(long j, int i, int i2, long j2, int i3) {
        this.ad = j;
        this.vip = i;
        this.metrica = i2;
        this.license = j2;
        this.appmetrica = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0176e) {
            C0176e c0176e = (C0176e) obj;
            if (this.ad == c0176e.ad && this.vip == c0176e.vip && this.metrica == c0176e.metrica && this.license == c0176e.license && this.appmetrica == c0176e.appmetrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica) * 1000003;
        long j2 = this.license;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.ad);
        sb.append(", loadBatchSize=");
        sb.append(this.vip);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.metrica);
        sb.append(", eventCleanUpAge=");
        sb.append(this.license);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC17861e.smaato(this.appmetrica, "}", sb);
    }
}
