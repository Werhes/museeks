package defpackage;

import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C15696e.class)
/* renamed from: eُْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11060e implements Comparable<C11060e>, Serializable {
    public static final C6996e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final YearMonth f21947e;

    public C11060e(YearMonth yearMonth) {
        this.f21947e = yearMonth;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C11060e c11060e) {
        return this.f21947e.compareTo(c11060e.f21947e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11060e) {
            return AbstractC7890e.billing(this.f21947e, ((C11060e) obj).f21947e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21947e.hashCode();
    }

    public final String toString() {
        return ((DateTimeFormatter) AbstractC10316e.ad.getValue()).format(this.f21947e);
    }
}
