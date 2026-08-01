package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٞٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5060e {
    public final String ad;

    public /* synthetic */ C5060e(String str) {
        this.ad = str;
    }

    public static void ad(String str) {
        if (AbstractC5304e.m1866native(str)) {
            throw new IllegalArgumentException("CameraId cannot be null or blank!");
        }
    }

    public static String vip(String str) {
        return AbstractC17861e.Signature("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5060e) {
            return AbstractC7890e.billing(this.ad, ((C5060e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return vip(this.ad);
    }
}
