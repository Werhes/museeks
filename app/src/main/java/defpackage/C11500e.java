package defpackage;

import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C8282e.class)
/* renamed from: eِؔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11500e implements Comparable<C11500e>, Serializable {
    public static final C4829e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LocalDateTime f23098e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؗ۠, java.lang.Object] */
    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
    }

    public C11500e(LocalDateTime localDateTime) {
        this.f23098e = localDateTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C11500e c11500e) {
        return this.f23098e.compareTo((ChronoLocalDateTime<?>) c11500e.f23098e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11500e) {
            return AbstractC7890e.billing(this.f23098e, ((C11500e) obj).f23098e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23098e.hashCode();
    }

    public final String toString() {
        return this.f23098e.toString();
    }
}
