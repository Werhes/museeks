package defpackage;

import j$.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۨٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3035e implements InterfaceC5372e {
    public static final C3035e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("kotlinx.datetime.UtcOffset");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C8885e) obj).f17842e.toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C2142e c2142e = C8885e.Companion;
        String pro = interfaceC11754e.pro();
        C5363e c5363e = AbstractC13223e.ad;
        C7013e c7013e = (C7013e) c5363e.getValue();
        c2142e.getClass();
        return c7013e == ((C7013e) c5363e.getValue()) ? AbstractC15810e.ad(pro, (DateTimeFormatter) AbstractC15810e.ad.getValue()) : c7013e == ((C7013e) AbstractC13223e.vip.getValue()) ? AbstractC15810e.ad(pro, (DateTimeFormatter) AbstractC15810e.vip.getValue()) : c7013e == ((C7013e) AbstractC13223e.metrica.getValue()) ? AbstractC15810e.ad(pro, (DateTimeFormatter) AbstractC15810e.metrica.getValue()) : (C8885e) c7013e.metrica(pro);
    }
}
