package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7266e extends AbstractC14565e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C7266e f14867e = new AbstractC14565e(1, 0);

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7266e)) {
            return false;
        }
        if (isEmpty() && ((C7266e) obj).isEmpty()) {
            return true;
        }
        C7266e c7266e = (C7266e) obj;
        return this.f28780e == c7266e.f28780e && this.f28779e == c7266e.f28779e;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f28780e;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.f28779e;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f28780e > this.f28779e;
    }

    public final String toString() {
        return this.f28780e + ".." + this.f28779e;
    }
}
