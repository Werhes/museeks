package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18217e {
    public final int ad;

    public static final String ad(int i) {
        switch (i) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case 6:
                return "TEMPLATE_MANUAL";
            default:
                return AbstractC1786e.admob(i, "UNKNOWN-");
        }
    }

    public static String vip(int i) {
        return AbstractC8647e.applovin("RequestTemplate(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18217e) {
            return this.ad == ((C18217e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return vip(this.ad);
    }
}
