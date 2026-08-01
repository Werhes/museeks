package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17963e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4320e f35209e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35210e;

    public /* synthetic */ C17963e(C4320e c4320e, int i) {
        this.f35210e = i;
        this.f35209e = c4320e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f35210e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC8636e.ad((Bitmap) this.f35209e.f9433e.getValue(), 0, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature, 0L, 0, 0.0f, false, null, null, null, c13770e, 0, 1018);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    C4320e c4320e = this.f35209e;
                    AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(1594827519, new C3580e(c4320e, 1), c13770e2), AbstractC16653e.license(1327777728, new C3580e(c4320e, 2), c13770e2), c13770e2, (intValue2 & 14) | 432);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    C4320e c4320e2 = this.f35209e;
                    boolean yandex = c13770e3.yandex(c4320e2);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C9949e(c4320e2, 1);
                        c13770e3.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw, null, c4320e2.inmobi() != null, null, null, null, AbstractC9528e.startapp, c13770e3, 1572864, 58);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    C4320e c4320e3 = this.f35209e;
                    if (c4320e3.inmobi() != null) {
                        c13770e4.m3676strictfp(-1882511124);
                        boolean yandex2 = c13770e4.yandex(c4320e3);
                        Object m3681throw2 = c13770e4.m3681throw();
                        if (yandex2 || m3681throw2 == C2987e.ad) {
                            C11212e c11212e = new C11212e(0, c4320e3, C4320e.class, "dispatchApply", "dispatchApply()V", 0, 0, 18);
                            c13770e4.m3682throws(c11212e);
                            m3681throw2 = c11212e;
                        }
                        AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw2), null, false, null, null, null, AbstractC9528e.yandex, c13770e4, 1572864, 62);
                    } else {
                        c13770e4.m3676strictfp(-1895507099);
                    }
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    InterfaceC12864e mopub = AbstractC12220e.mopub(C0115e.f1276e, 16);
                    C4320e c4320e4 = this.f35209e;
                    AbstractC6401e.vip(AbstractC16653e.license(719031456, new C17963e(c4320e4, 0), c13770e5), AbstractC16653e.license(-1910062145, new C17963e(c4320e4, 1), c13770e5), mopub, AbstractC16653e.license(1421685245, new C17963e(c4320e4, 2), c13770e5), c13770e5, 3510, 0);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
