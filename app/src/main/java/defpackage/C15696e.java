package defpackage;

import j$.time.YearMonth;
import j$.time.format.DateTimeParseException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15696e implements InterfaceC5372e {
    public static final C15696e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("kotlinx.datetime.YearMonth");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C11060e) obj).toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C6996e c6996e = C11060e.Companion;
        String pro = interfaceC11754e.pro();
        C5363e c5363e = AbstractC10763e.vip;
        AbstractC14780e abstractC14780e = (AbstractC14780e) c5363e.getValue();
        c6996e.getClass();
        if (abstractC14780e != ((AbstractC14780e) c5363e.getValue())) {
            return (C11060e) abstractC14780e.metrica(pro);
        }
        try {
            return new C11060e(YearMonth.parse(AbstractC11613e.inmobi(3, pro.toString().toString())));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
