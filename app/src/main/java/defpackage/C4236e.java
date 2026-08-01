package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4236e {
    public static final C4236e vip;
    public final AbstractC12107e ad;

    static {
        int i = AbstractC12107e.f24267e;
        vip = new C4236e(C3889e.f8715e);
    }

    public C4236e(AbstractC12107e abstractC12107e) {
        this.ad = abstractC12107e;
    }

    public static C4236e ad(AbstractC3513e abstractC3513e) {
        long j;
        String str;
        C3175e c3175e;
        int mo647synchronized = abstractC3513e.mo647synchronized();
        if (mo647synchronized < 0) {
            throw new IOException("Negative number of flags");
        }
        int i = AbstractC12107e.f24267e;
        C7642e c7642e = new C7642e();
        long j2 = 0;
        for (int i2 = 0; i2 < mo647synchronized; i2++) {
            long mo642return = abstractC3513e.mo642return();
            int i3 = (int) mo642return;
            long j3 = mo642return >>> 3;
            if (j3 == 0) {
                j = 0;
                str = abstractC3513e.mo631final();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    throw new IOException("Flag name larger than max size");
                }
                j = j4;
                str = null;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                c3175e = new C3175e(j, str, i4, 0L, null);
            } else if (i4 == 2) {
                c3175e = new C3175e(j, str, i4, abstractC3513e.mo642return(), null);
            } else if (i4 == 3) {
                c3175e = new C3175e(j, str, i4, Double.doubleToRawLongBits(abstractC3513e.mo651try()), null);
            } else if (i4 == 4) {
                c3175e = new C3175e(j, str, i4, 0L, abstractC3513e.mo631final());
            } else {
                if (i4 != 5) {
                    throw new IOException(AbstractC8647e.isPro(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                }
                c3175e = new C3175e(j, str, i4, 0L, abstractC3513e.mo644strictfp());
            }
            long j5 = c3175e.f7295e;
            if (j5 != 0) {
                j2 = j5;
            }
            c7642e.metrica(c3175e);
        }
        return new C4236e(c7642e.yandex());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4236e)) {
            return false;
        }
        return this.ad.equals(((C4236e) obj).ad);
    }

    public final int hashCode() {
        AbstractC12107e abstractC12107e = this.ad;
        abstractC12107e.getClass();
        return AbstractC6100e.purchase(abstractC12107e);
    }
}
