package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14692e {
    public static final int metrica;
    public static final C12870e ad = AbstractC12696e.yandex(0, 7, null);
    public static final C14099e vip = new C14099e(6);

    static {
        new C15217e(new C18211e(4));
        metrica = 8;
    }

    public static C9708e ad(C14995e c14995e, Function1 function1, InterfaceC6512e interfaceC6512e, C13770e c13770e, int i, int i2) {
        if ((i2 & 4) != 0) {
            interfaceC6512e = ad;
        }
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        boolean purchase = ((((i & 14) ^ 6) > 4 && c13770e.purchase(c14995e)) || (i & 6) == 4) | c13770e.purchase(interfaceC14388e) | ((((i & 112) ^ 48) > 32 && c13770e.purchase(function1)) || (i & 48) == 32) | c13770e.purchase(interfaceC6512e);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            C15217e c15217e = AbstractC11750e.vip;
            C18478e c18478e = new C18478e(5, c14995e, function1, new C14515e(3, interfaceC14388e));
            float f = AbstractC2650e.ad;
            m3681throw = new C9708e(c18478e, c15217e, interfaceC6512e);
            c13770e.m3682throws(m3681throw);
        }
        return (C9708e) m3681throw;
    }
}
