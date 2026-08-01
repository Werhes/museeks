package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۡ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11330e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final short f22778e;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC7890e.yandex(this.f22778e & 65535, ((C11330e) obj).f22778e & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11330e) {
            return this.f22778e == ((C11330e) obj).f22778e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22778e;
    }

    public final String toString() {
        return String.valueOf(this.f22778e & 65535);
    }
}
