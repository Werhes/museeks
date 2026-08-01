package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7051e extends AbstractC11130e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C7936e f14470e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f14471e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f14472e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayList f14473e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f14470e = new C7936e(2);
    }

    public C7051e(C13197e c13197e) {
        super(0, false);
        this.f14473e = new ArrayList();
        C18529e c18529e = new C18529e(c13197e);
        this.f22047e = c18529e;
        int ad = c18529e.ad();
        this.f14472e = c13197e.mo1683e(4L, AbstractC4639e.vip);
        this.f14471e = c13197e.readInt();
        int i = ad - 8;
        while (i >= 4) {
            String mo1683e = c13197e.mo1683e(4L, AbstractC4639e.vip);
            i -= 4;
            if (!"\u0000\u0000\u0000\u0000".equals(mo1683e)) {
                this.f14473e.add(mo1683e);
            }
        }
        if (i != 0) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            f14470e.getClass();
            int i2 = C1724e.ad;
            c13197e.skip(i);
        }
    }

    @Override // defpackage.AbstractC11130e
    public final String toString() {
        C12894e billing = AbstractC1749e.billing(this);
        billing.metrica(this.f14472e, "majorBrand");
        billing.ad(this.f14471e, "majorBrandVersion");
        billing.metrica(this.f14473e, "compatibleBrands");
        return billing.toString();
    }
}
