package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6367e {
    public static final C15256e ad = new C15256e(3, 0, null);
    public static final C15256e vip = new C15256e(3, 1, null);

    public static InterfaceC12864e ad(InterfaceC3239e interfaceC3239e, boolean z, C15274e c15274e, boolean z2, Function3 function3, boolean z3) {
        return new C7980e(interfaceC3239e, EnumC17426e.f34145e, z, c15274e, z2, ad, function3, z3);
    }

    public static final long metrica(long j) {
        return AbstractC5458e.ad(Float.isNaN(C11422e.vip(j)) ? 0.0f : C11422e.vip(j), Float.isNaN(C11422e.metrica(j)) ? 0.0f : C11422e.metrica(j));
    }

    public static final InterfaceC3239e vip(C13770e c13770e, Function1 function1) {
        InterfaceC3314e mopub = AbstractC14533e.mopub(function1, c13770e);
        Object m3681throw = c13770e.m3681throw();
        if (m3681throw == C2987e.ad) {
            C17292e c17292e = new C17292e(new C9214e(mopub, 12));
            c13770e.m3682throws(c17292e);
            m3681throw = c17292e;
        }
        return (InterfaceC3239e) m3681throw;
    }
}
