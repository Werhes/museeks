package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9571e {
    public static final float ad = ViewConfiguration.getScrollFriction();

    public static final C15217e ad(C13770e c13770e) {
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        boolean metrica = c13770e.metrica(interfaceC14388e.vip());
        Object m3681throw = c13770e.m3681throw();
        if (metrica || m3681throw == C2987e.ad) {
            m3681throw = new C15217e(new C7850e(interfaceC14388e));
            c13770e.m3682throws(m3681throw);
        }
        return (C15217e) m3681throw;
    }
}
