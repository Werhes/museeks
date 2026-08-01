package defpackage;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8282e implements InterfaceC5372e {
    public static final C8282e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("kotlinx.datetime.LocalDateTime");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C11500e) obj).f23098e.toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C4829e c4829e = C11500e.Companion;
        String pro = interfaceC11754e.pro();
        int i = AbstractC9426e.ad;
        c4829e.getClass();
        try {
            return new C11500e(LocalDateTime.parse(AbstractC11613e.inmobi(12, pro.toString().toString())));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
