package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17843e extends AbstractC9510e {
    public final C2394e startapp;
    public final double yandex;

    public C17843e(double d, C2394e c2394e) {
        this.yandex = d;
        this.startapp = c2394e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17843e)) {
            return false;
        }
        C17843e c17843e = (C17843e) obj;
        return Double.compare(this.yandex, c17843e.yandex) == 0 && AbstractC7890e.billing(this.startapp, c17843e.startapp);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.yandex);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + this.startapp.f6126e;
    }

    public final String toString() {
        return "Failure(quality=" + this.yandex + ", failureStatusCode=" + this.startapp + ')';
    }
}
