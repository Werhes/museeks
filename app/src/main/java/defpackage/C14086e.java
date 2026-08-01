package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٓٚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14086e {
    public static final C2382e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C11689e(8))};
    public final List ad;

    public /* synthetic */ C14086e(int i, List list) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14086e) && AbstractC7890e.billing(this.ad, ((C14086e) obj).ad);
    }

    public final int hashCode() {
        List list = this.ad;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "PodcastCoverDto(sizes=" + this.ad + ")";
    }
}
