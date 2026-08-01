package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: switch, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class Cswitch implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Cpublic f36473e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36474e = 1;

    public /* synthetic */ Cswitch(Cpublic cpublic) {
        this.f36473e = cpublic;
    }

    public /* synthetic */ Cswitch(Cpublic cpublic, int i) {
        this.f36473e = cpublic;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36474e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f36473e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    Cpublic cpublic = this.f36473e;
                    boolean yandex = c13770e.yandex(cpublic);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        Cvolatile cvolatile = new Cvolatile(0, cpublic, Cpublic.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 0);
                        c13770e.m3682throws(cvolatile);
                        m3681throw = cvolatile;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC15842e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
