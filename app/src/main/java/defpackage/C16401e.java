package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16401e {
    public static final C16401e ad = new Object();

    public final boolean ad(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof C14542e) || !(obj2 instanceof C14542e)) {
            return AbstractC7890e.billing(obj, obj2);
        }
        C14542e c14542e = (C14542e) obj;
        C14542e c14542e2 = (C14542e) obj2;
        return AbstractC7890e.billing(c14542e.ad, c14542e2.ad) && c14542e.vip.equals(c14542e2.vip) && AbstractC7890e.billing(c14542e.license, c14542e2.license) && AbstractC7890e.billing(c14542e.appmetrica, c14542e2.appmetrica) && AbstractC7890e.billing(c14542e.subscription, c14542e2.subscription) && c14542e.remoteconfig == c14542e2.remoteconfig && c14542e.pro == c14542e2.pro;
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }

    public final int vip(Object obj) {
        if (!(obj instanceof C14542e)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        C14542e c14542e = (C14542e) obj;
        int hashCode = (c14542e.vip.hashCode() + (c14542e.ad.hashCode() * 31)) * 31;
        String str = c14542e.license;
        return AbstractC8703e.m2467class(c14542e.pro) + AbstractC1786e.mopub(c14542e.remoteconfig, (c14542e.subscription.hashCode() + ((c14542e.appmetrica.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 31, 31);
    }
}
