package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9287e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte f18508e;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC7890e.yandex(this.f18508e & 255, ((C9287e) obj).f18508e & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9287e) {
            return this.f18508e == ((C9287e) obj).f18508e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18508e;
    }

    public final String toString() {
        return String.valueOf(this.f18508e & 255);
    }
}
