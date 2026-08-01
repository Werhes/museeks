package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0048e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16904e f1186e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1187e;

    public /* synthetic */ C0048e(AbstractC16904e abstractC16904e, int i) {
        this.f1187e = i;
        this.f1186e = abstractC16904e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1187e) {
            case 0:
                C14715e c14715e = (C14715e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(c14715e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    float vip = c14715e.vip() / 2.0f;
                    float f = 8;
                    InterfaceC12864e license = AbstractC13328e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), AbstractC13328e.appmetrica());
                    C11726e c11726e = new C11726e(f);
                    C16196e c16196e = new C16196e(Alert.DURATION_SHOW_INDEFINITELY);
                    AbstractC16904e abstractC16904e = this.f1186e;
                    AbstractC16279e.vip(abstractC16904e, license, AbstractC12220e.appmetrica(vip, 0.0f, vip - f, 0.0f, 10), c11726e, 24, null, AbstractC12176e.license(abstractC16904e, c16196e, c13770e, 0, 28), false, null, null, null, AbstractC16653e.license(-1004122042, new C8035e(9, abstractC16904e), c13770e), c13770e, 196608, 24576, 16208);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C16646e c16646e = (C16646e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? c13770e2.purchase(c16646e) : c13770e2.yandex(c16646e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    AbstractC9476e.ad(c16646e, ((C16330e) this.f1186e.license.f17056e).purchase(), C3618e.vip(0.25f, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.ad), c13770e2, intValue2 & 14);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
