package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٖٛۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16339e {
    public static final C18417e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C14561e(7))};
    public final List ad;

    public /* synthetic */ C16339e(int i, List list) {
        if (1 == (i & 1)) {
            this.ad = list;
        } else {
            AbstractC5756e.billing(i, 1, C7346e.ad.appmetrica());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16339e) && AbstractC7890e.billing(this.ad, ((C16339e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AudioGetRelatedArtistsResponseDto(artists=" + this.ad + ")";
    }
}
