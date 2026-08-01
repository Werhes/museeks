package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C7299e.class)
/* renamed from: eؘؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13084e implements Comparable<C13084e>, Serializable {
    public static final C10086e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LocalDate f26019e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eَؘؙ] */
    static {
        LocalDate localDate = LocalDate.MIN;
        LocalDate localDate2 = LocalDate.MAX;
    }

    public C13084e(int i, int i2, int i3) {
        try {
            this(LocalDate.of(i, i2, i3));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C13084e(LocalDate localDate) {
        this.f26019e = localDate;
    }

    public final EnumC17671e ad() {
        return (EnumC17671e) EnumC17671e.f34634e.get(this.f26019e.getMonth().getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C13084e c13084e) {
        return this.f26019e.compareTo((ChronoLocalDate) c13084e.f26019e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13084e) {
            return AbstractC7890e.billing(this.f26019e, ((C13084e) obj).f26019e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26019e.hashCode();
    }

    public final String toString() {
        return this.f26019e.toString();
    }
}
