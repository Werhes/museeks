package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۡؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18059e {
    public final long ad;

    public static long ad(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18059e) {
            return this.ad == ((C18059e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.ad;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC1786e.pro(sb, (int) (j & 4294967295L), ')');
    }
}
