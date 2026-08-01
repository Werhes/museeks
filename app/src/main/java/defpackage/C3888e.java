package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3888e extends AbstractC3954e {
    public final C11447e adcel;
    public C18185e advert;
    public C1362e mopub;
    public final C4383e startapp;

    public C3888e(C4383e c4383e, AbstractC14073e abstractC14073e) {
        super(abstractC14073e);
        this.startapp = c4383e;
        this.adcel = AbstractC17331e.vip();
    }

    @Override // defpackage.AbstractC3954e
    public final void ad(InterfaceC2235e interfaceC2235e, long j, long j2, C17985e c17985e) {
        C1362e ad;
        C4383e c4383e = this.startapp;
        float mo497instanceof = interfaceC2235e.mo497instanceof(c4383e.ad);
        float mo497instanceof2 = interfaceC2235e.mo497instanceof(c4383e.vip);
        C11447e c11447e = this.adcel;
        if (c17985e != null) {
            float f = 2;
            float f2 = (f * mo497instanceof2) + (mo497instanceof * f);
            ad = AbstractC7214e.ad((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f2), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f2), 1, 24);
            C11648e ad2 = AbstractC17324e.ad(ad);
            if (mo497instanceof2 > 0.0f) {
                float f3 = mo497instanceof + mo497instanceof2;
                ad2.loadAd(f3, f3);
                ad2.appmetrica(c17985e, C17138e.ad(c11447e, 0, mo497instanceof > 0.0f ? AbstractC6537e.ad(mo497instanceof) : null, 11));
                C11447e ad3 = C17138e.ad(c11447e, 0, mo497instanceof > 0.0f ? AbstractC6537e.ad(mo497instanceof) : null, 3);
                ad3.advert(mo497instanceof2 * 2.0f);
                Unit unit = Unit.INSTANCE;
                ad2.appmetrica(c17985e, ad3);
            } else {
                C17138e.ad(c11447e, 0, mo497instanceof > 0.0f ? AbstractC6537e.ad(mo497instanceof) : null, 11);
                ad2.loadAd(mo497instanceof, mo497instanceof);
                ad2.appmetrica(c17985e, c11447e);
            }
        } else {
            float f4 = 2;
            float f5 = (mo497instanceof2 * f4) + (mo497instanceof * f4);
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f5;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f5;
            ad = AbstractC7214e.ad((int) Math.ceil(intBitsToFloat), (int) Math.ceil(intBitsToFloat2), 1, 24);
            AbstractC17324e.ad(ad).purchase(mo497instanceof, mo497instanceof, intBitsToFloat - mo497instanceof, intBitsToFloat2 - mo497instanceof, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), C17138e.ad(c11447e, 0, mo497instanceof > 0.0f ? AbstractC6537e.ad(mo497instanceof) : null, 11));
        }
        this.mopub = ad;
    }

    @Override // defpackage.AbstractC3954e
    public final void metrica(InterfaceC2235e interfaceC2235e, long j, C17985e c17985e, float f, C2815e c2815e, AbstractC4457e abstractC4457e, int i) {
        C18185e c18185e;
        AbstractC4457e abstractC4457e2 = abstractC4457e;
        C1362e c1362e = this.mopub;
        if (c1362e != null) {
            Bitmap bitmap = c1362e.ad;
            C4383e c4383e = this.startapp;
            float f2 = -(interfaceC2235e.mo497instanceof(c4383e.vip) + interfaceC2235e.mo497instanceof(c4383e.ad));
            if (abstractC4457e2 == null || c2815e != null) {
                AbstractC4653e.smaato(interfaceC2235e, c1362e, (4294967295L & Float.floatToRawIntBits(f2)) | (Float.floatToRawIntBits(f2) << 32), f, c2815e, i, 8);
                return;
            }
            C18185e c18185e2 = this.advert;
            if (c18185e2 == null || !c18185e2.license.equals(abstractC4457e2)) {
                C9317e c9317e = new C9317e(AbstractC14520e.ad(c1362e));
                if (abstractC4457e2 instanceof AbstractC9876e) {
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    abstractC4457e2 = new C9317e(((AbstractC9876e) abstractC4457e2).metrica((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L)));
                }
                c18185e = new C18185e(AbstractC7595e.billing(c9317e), AbstractC7595e.billing(abstractC4457e2));
                this.advert = c18185e;
            } else {
                c18185e = c18185e2;
            }
            ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(f2, f2);
            try {
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                AbstractC4653e.admob(interfaceC2235e, c18185e, 0L, (4294967295L & Float.floatToRawIntBits(height2)) | (Float.floatToRawIntBits(width2) << 32), f, null, null, i, 50);
            } finally {
                float f3 = -f2;
                ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(f3, f3);
            }
        }
    }
}
