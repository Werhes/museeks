package defpackage;

import j$.time.LocalTime;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C7531e.class)
/* renamed from: eؙٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0471e implements Comparable<C0471e>, Serializable {
    public static final C6281e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LocalTime f2537e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؙٝ, java.lang.Object] */
    static {
        LocalTime localTime = LocalTime.MIN;
        LocalTime localTime2 = LocalTime.MAX;
    }

    public C0471e(LocalTime localTime) {
        this.f2537e = localTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0471e c0471e) {
        return this.f2537e.compareTo(c0471e.f2537e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0471e) {
            return AbstractC7890e.billing(this.f2537e, ((C0471e) obj).f2537e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2537e.hashCode();
    }

    public final String toString() {
        return this.f2537e.toString();
    }
}
