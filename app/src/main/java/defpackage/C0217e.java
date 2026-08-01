package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217e {
    public final long ad;
    public final float metrica;
    public final long vip;

    public C0217e(long j, long j2, float f) {
        this.ad = j;
        this.vip = j2;
        this.metrica = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0217e)) {
            return false;
        }
        C0217e c0217e = (C0217e) obj;
        return this.ad == c0217e.ad && this.vip == c0217e.vip && Float.compare(this.metrica, c0217e.metrica) == 0;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        return Float.floatToIntBits(this.metrica) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadState(bytesToDownload=");
        sb.append(this.ad);
        sb.append(", bytesDownloaded=");
        sb.append(this.vip);
        sb.append(", progress=");
        return AbstractC17861e.remoteconfig(sb, this.metrica, ')');
    }
}
