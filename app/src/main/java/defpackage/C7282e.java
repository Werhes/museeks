package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7282e {
    public final List ad;

    public C7282e(InterfaceC1039e... interfaceC1039eArr) {
        if (interfaceC1039eArr.length <= 0) {
            this.ad = AbstractC1660e.m670implements(interfaceC1039eArr);
        } else {
            InterfaceC1039e interfaceC1039e = interfaceC1039eArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7282e) {
            return AbstractC7890e.billing(this.ad, ((C7282e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
