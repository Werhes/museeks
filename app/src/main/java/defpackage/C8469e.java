package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8469e {
    public final long ad;

    public static final boolean ad(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8469e) {
            return this.ad == ((C8469e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "StreamUseCase(value=" + this.ad + ')';
    }
}
