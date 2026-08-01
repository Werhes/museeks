package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6245e extends AbstractC16369e {
    public final EnumC7485e ad;
    public final EnumC6633e vip;

    public C6245e(EnumC7485e enumC7485e, EnumC6633e enumC6633e) {
        this.ad = enumC7485e;
        this.vip = enumC6633e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16369e) {
            AbstractC16369e abstractC16369e = (AbstractC16369e) obj;
            EnumC7485e enumC7485e = this.ad;
            if (enumC7485e != null ? enumC7485e.equals(((C6245e) abstractC16369e).ad) : ((C6245e) abstractC16369e).ad == null) {
                EnumC6633e enumC6633e = this.vip;
                if (enumC6633e != null ? enumC6633e.equals(((C6245e) abstractC16369e).vip) : ((C6245e) abstractC16369e).vip == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC7485e enumC7485e = this.ad;
        int hashCode = ((enumC7485e == null ? 0 : enumC7485e.hashCode()) ^ 1000003) * 1000003;
        EnumC6633e enumC6633e = this.vip;
        return (enumC6633e != null ? enumC6633e.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.ad + ", mobileSubtype=" + this.vip + "}";
    }
}
