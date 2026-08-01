package defpackage;

import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۢؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7531e implements InterfaceC5372e {
    public static final C7531e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("kotlinx.datetime.LocalTime");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C0471e) obj).f2537e.toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C6281e c6281e = C0471e.Companion;
        String pro = interfaceC11754e.pro();
        C5363e c5363e = AbstractC8783e.ad;
        C9299e c9299e = (C9299e) c5363e.getValue();
        c6281e.getClass();
        if (c9299e != ((C9299e) c5363e.getValue())) {
            return (C0471e) c9299e.metrica(pro);
        }
        try {
            return new C0471e(LocalTime.parse(pro));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
