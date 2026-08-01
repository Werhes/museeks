package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۡؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12040e {
    public final int ad;

    public C12040e(int i) {
        this.ad = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C12040e) && this.ad == ((C12040e) obj).ad;
    }

    public final int hashCode() {
        return (this.ad ^ 1000003) * 1000003;
    }

    public final String toString() {
        return AbstractC17861e.smaato(this.ad, ", cause=null}", new StringBuilder("StateError{code="));
    }
}
