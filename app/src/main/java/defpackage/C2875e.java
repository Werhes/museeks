package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2875e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f6827e;

    public /* synthetic */ C2875e(int i) {
        this.f6827e = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC7890e.yandex(this.f6827e ^ RecyclerView.UNDEFINED_DURATION, ((C2875e) obj).f6827e ^ RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2875e) {
            return this.f6827e == ((C2875e) obj).f6827e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6827e;
    }

    public final String toString() {
        return String.valueOf(this.f6827e & 4294967295L);
    }
}
