package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17996e {
    public final AbstractC4191e ad;
    public final int license;
    public final Object[] metrica;
    public final String vip;

    public C17996e(AbstractC4191e abstractC4191e, String str, Object[] objArr) {
        this.ad = abstractC4191e;
        this.vip = str;
        this.metrica = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.license = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.license = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    public final int ad() {
        int i = this.license;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
