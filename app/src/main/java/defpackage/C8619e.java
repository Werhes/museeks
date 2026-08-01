package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8619e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1925e f17431e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17432e;

    public /* synthetic */ C8619e(C1925e c1925e, int i) {
        this.f17432e = 1;
        this.f17431e = c1925e;
    }

    public /* synthetic */ C8619e(C1925e c1925e, int i, byte b) {
        this.f17432e = i;
        this.f17431e = c1925e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17432e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C1925e c1925e = this.f17431e;
                    boolean yandex = c13770e.yandex(c1925e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        Cvolatile cvolatile = new Cvolatile(0, c1925e, C1925e.class, "onDismissClicked", "onDismissClicked()V", 0, 0, 18);
                        c13770e.m3682throws(cvolatile);
                        m3681throw = cvolatile;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC5400e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0181e.ad(this.f17431e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C1925e c1925e2 = this.f17431e;
                    boolean yandex2 = c13770e2.yandex(c1925e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        C7755e c7755e = new C7755e(0, c1925e2, C1925e.class, "onDismissClicked", "onDismissClicked()V", 0, 0, 1);
                        c13770e2.m3682throws(c7755e);
                        m3681throw2 = c7755e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw2), null, false, null, null, null, AbstractC4628e.vip, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
