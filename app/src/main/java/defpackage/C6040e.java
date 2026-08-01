package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۥٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6040e extends C13396e implements Comparable {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long f12708e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6040e c6040e = (C6040e) obj;
        if (metrica(4) != c6040e.metrica(4)) {
            return metrica(4) ? 1 : -1;
        }
        long j = this.f15301e - c6040e.f15301e;
        if (j == 0) {
            j = this.f12708e - c6040e.f12708e;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
