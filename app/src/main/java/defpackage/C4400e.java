package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۜۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4400e extends AbstractC15825e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f9581e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f9582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4400e(ViewGroup viewGroup, int i) {
        super(1);
        this.f9581e = i;
        this.f9582e = viewGroup;
    }

    @Override // defpackage.AbstractC15825e
    public final C12948e amazon(C12948e c12948e, List list) {
        switch (this.f9581e) {
            case 0:
                return ((C9820e) this.f9582e).smaato(c12948e);
            default:
                C1262e c1262e = (C1262e) this.f9582e;
                if (c1262e.f3962e) {
                    return c12948e;
                }
                View childAt = c1262e.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, c1262e.getWidth() - childAt.getRight());
                int max4 = Math.max(0, c1262e.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? c12948e : c12948e.ad.subscription(max, max2, max3, max4);
        }
    }

    @Override // defpackage.AbstractC15825e
    public final C7302e loadAd(C12773e c12773e, C7302e c7302e) {
        switch (this.f9581e) {
            case 0:
                C14747e c14747e = (C14747e) ((C9820e) this.f9582e).f19649e.f27592e.license;
                if (!c14747e.f29169e.f27016e) {
                    return c7302e;
                }
                long purchase = AbstractC17324e.purchase(c14747e.mo211this(0L));
                int i = (int) (purchase >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (purchase & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long advert = AbstractC0890e.metrica(c14747e).advert();
                int i3 = (int) (advert >> 32);
                int i4 = (int) (advert & 4294967295L);
                long j = c14747e.f6803e;
                long purchase2 = AbstractC17324e.purchase(c14747e.mo211this((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (purchase2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & purchase2));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? c7302e : new C7302e(AbstractC9936e.advert((C7088e) c7302e.f14916e, i, i2, i5, i7), AbstractC9936e.advert((C7088e) c7302e.f14915e, i, i2, i5, i7), 1);
            default:
                C1262e c1262e = (C1262e) this.f9582e;
                if (c1262e.f3962e) {
                    return c7302e;
                }
                View childAt = c1262e.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, c1262e.getWidth() - childAt.getRight());
                int max4 = Math.max(0, c1262e.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return c7302e;
                }
                C7088e vip = C7088e.vip(max, max2, max3, max4);
                int i8 = vip.ad;
                C7088e c7088e = (C7088e) c7302e.f14916e;
                int i9 = vip.vip;
                int i10 = vip.metrica;
                int i11 = vip.license;
                return new C7302e(C12948e.appmetrica(c7088e, i8, i9, i10, i11), C12948e.appmetrica((C7088e) c7302e.f14915e, i8, i9, i10, i11), 1);
        }
    }
}
