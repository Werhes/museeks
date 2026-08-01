package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12612e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13621e f25332e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25333e;

    public /* synthetic */ C12612e(C13621e c13621e, int i) {
        this.f25333e = i;
        this.f25332e = c13621e;
    }

    public /* synthetic */ C12612e(C13621e c13621e, int i, int i2) {
        this.f25333e = i2;
        this.f25332e = c13621e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25333e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    this.f25332e.startapp(c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f25332e.startapp((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                this.f25332e.ad((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C13621e c13621e = this.f25332e;
                    C2038e c2038e = c13621e.ad;
                    boolean yandex = c13770e2.yandex(c2038e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C0638e c0638e = new C0638e(1, c2038e, C2038e.class, "openEffectConfiguration", "openEffectConfiguration(Z)V", 0, 0, 1);
                        c13770e2.m3682throws(c0638e);
                        m3681throw = c0638e;
                    }
                    c13621e.advert(false, (Function1) ((InterfaceC5261e) m3681throw), AbstractC17864e.billing, c13770e2, 390);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
