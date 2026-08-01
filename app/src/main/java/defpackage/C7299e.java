package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7299e implements InterfaceC5372e {
    public static final C7299e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("kotlinx.datetime.LocalDate");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C13084e) obj).f26019e.toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C10086e c10086e = C13084e.Companion;
        String pro = interfaceC11754e.pro();
        int i = AbstractC11878e.ad;
        C5363e c5363e = AbstractC7514e.ad;
        AbstractC14780e abstractC14780e = (AbstractC14780e) c5363e.getValue();
        c10086e.getClass();
        if (abstractC14780e != ((AbstractC14780e) c5363e.getValue())) {
            return (C13084e) abstractC14780e.metrica(pro);
        }
        try {
            return new C13084e(LocalDate.parse(AbstractC11613e.inmobi(6, pro.toString().toString())));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
