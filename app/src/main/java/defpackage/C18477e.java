package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۤۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18477e implements InterfaceC9854e {
    public final List ad;

    public C18477e(List list) {
        this.ad = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18477e) && AbstractC7890e.billing(this.ad, ((C18477e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC1786e.tapsense(new StringBuilder("Success(vkCategories="), this.ad, ')');
    }
}
