package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۥٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1455e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Bitmap f4290e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4291e;

    public /* synthetic */ C1455e(Bitmap bitmap, int i) {
        this.f4291e = i;
        this.f4290e = bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4291e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C6479e c6479e = new C6479e(R.drawable.rounded_card_dock);
                    C6705e c6705e = C6705e.ad;
                    AbstractC8141e.metrica(c6479e, null, AbstractC10589e.billing(new C8851e(c6705e)), 1, null, c13770e, 48, 16);
                    Bitmap bitmap = this.f4290e;
                    if (bitmap == null) {
                        c13770e.m3676strictfp(-1469947522);
                    } else {
                        c13770e.m3676strictfp(-1469947521);
                        AbstractC8141e.metrica(new C13224e(bitmap), null, AbstractC10589e.billing(new C8851e(c6705e)), 1, null, c13770e, 48, 16);
                    }
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC11613e.ad(AbstractC0933e.vip(c13770e2), null, AbstractC16653e.license(-911877177, new C1455e(this.f4290e, 2), c13770e2), c13770e2, 384, 2);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C6479e c6479e2 = new C6479e(R.drawable.rounded_card_dock);
                    C6705e c6705e2 = C6705e.ad;
                    AbstractC8141e.metrica(c6479e2, null, AbstractC10589e.billing(new C8851e(c6705e2)), 1, null, c13770e3, 48, 16);
                    Bitmap bitmap2 = this.f4290e;
                    if (bitmap2 == null) {
                        c13770e3.m3676strictfp(-64458977);
                    } else {
                        c13770e3.m3676strictfp(-64458976);
                        AbstractC8141e.metrica(new C13224e(bitmap2), null, AbstractC10589e.billing(new C8851e(c6705e2)), 1, null, c13770e3, 48, 16);
                    }
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
