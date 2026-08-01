package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254e {
    public final CachedTrack ad;

    public /* synthetic */ C1254e(CachedTrack cachedTrack) {
        this.ad = cachedTrack;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1254e) {
            return AbstractC7890e.billing(this.ad, ((C1254e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return C12575e.ads(this.ad);
    }

    public final String toString() {
        return "ComposableCachedTrack(wrapped=" + this.ad + ')';
    }
}
