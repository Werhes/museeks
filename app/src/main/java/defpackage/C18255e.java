package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٞؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18255e {
    public static final String metrica;
    public static final C18255e vip;
    public final AbstractC17475e ad;

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        vip = new C18255e(C1410e.f4222e);
        String str = AbstractC9413e.ad;
        metrica = Integer.toString(0, 36);
    }

    public C18255e(C1410e c1410e) {
        this.ad = AbstractC17475e.remoteconfig(c1410e);
    }

    public final boolean ad(int i) {
        int i2 = 0;
        while (true) {
            AbstractC17475e abstractC17475e = this.ad;
            if (i2 >= abstractC17475e.size()) {
                return false;
            }
            C6653e c6653e = (C6653e) abstractC17475e.get(i2);
            boolean[] zArr = c6653e.appmetrica;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (c6653e.vip.metrica == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18255e.class != obj.getClass()) {
            return false;
        }
        return this.ad.equals(((C18255e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
