package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7734e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1718e f15704e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15705e;

    public /* synthetic */ C7734e(C1718e c1718e, int i) {
        this.f15705e = 1;
        this.f15704e = c1718e;
    }

    public /* synthetic */ C7734e(C1718e c1718e, int i, byte b) {
        this.f15705e = i;
        this.f15704e = c1718e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15705e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC10560e.license(AbstractC8913e.metrica, null, AbstractC16653e.license(217201498, new C7734e(this.f15704e, 2, (byte) 0), c13770e), null, 0.0f, null, null, null, null, c13770e, 390, 506);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f15704e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C1718e c1718e = this.f15704e;
                    boolean yandex = c13770e2.yandex(c1718e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        Cvolatile cvolatile = new Cvolatile(0, c1718e, C1718e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 28);
                        c13770e2.m3682throws(cvolatile);
                        m3681throw = cvolatile;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC8913e.license, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
