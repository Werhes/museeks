package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1666e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17047e f4591e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4592e;

    public /* synthetic */ C1666e(C17047e c17047e, int i) {
        this.f4592e = 1;
        this.f4591e = c17047e;
    }

    public /* synthetic */ C1666e(C17047e c17047e, int i, byte b) {
        this.f4592e = i;
        this.f4591e = c17047e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4592e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC10560e.license(AbstractC9186e.ad, null, AbstractC16653e.license(-289584881, new C1666e(this.f4591e, 2, (byte) 0), c13770e), null, 0.0f, null, null, null, null, c13770e, 390, 506);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f4591e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C17047e c17047e = this.f4591e;
                    boolean yandex = c13770e2.yandex(c17047e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C5671e(5, c17047e);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw, null, false, null, null, null, AbstractC9186e.vip, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
