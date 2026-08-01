package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۢؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16576e implements InterfaceC3997e {
    public final Set ad;

    public C16576e(Set set) {
        this.ad = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set of sizes cannot be empty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return C16576e.class.equals(obj != null ? obj.getClass() : null) && AbstractC7890e.billing(this.ad, ((C16576e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.ad + ')';
    }
}
