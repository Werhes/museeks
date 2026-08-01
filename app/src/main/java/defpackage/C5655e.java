package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘٕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5655e {
    public static final C7333e Companion = new Object();
    public final long ad;

    public /* synthetic */ C5655e(long j) {
        this.ad = j;
    }

    public static final boolean ad(long j, long j2) {
        return j == j2;
    }

    public static int vip(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5655e) {
            return this.ad == ((C5655e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return vip(this.ad);
    }

    public final String toString() {
        return String.valueOf(this.ad);
    }
}
