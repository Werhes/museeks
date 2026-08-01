package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8678e {
    public final AbstractC4765e ad;
    public final int license;
    public final Object[] metrica;
    public final String vip;

    public C8678e(AbstractC18270e abstractC18270e, String str, Object[] objArr) {
        this.ad = abstractC18270e;
        this.vip = str;
        this.metrica = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.license = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.license = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
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
