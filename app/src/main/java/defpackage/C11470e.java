package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11470e {
    public final int ad;
    public final C14131e vip;

    public C11470e(int i, C14131e c14131e) {
        this.ad = i;
        if (c14131e == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.vip = c14131e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11470e) {
            C11470e c11470e = (C11470e) obj;
            if (this.ad == c11470e.ad && this.vip.equals(c11470e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.ad + ", cameraIdentifier=" + this.vip + "}";
    }
}
