package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13192e implements InterfaceC11846e {
    public final Set ad;
    public final C6553e metrica;
    public final C7869e vip;

    public C13192e(Set set, C7869e c7869e, C6553e c6553e) {
        this.ad = set;
        this.vip = c7869e;
        this.metrica = c6553e;
    }

    public final C11547e ad(String str, C12007e c12007e, InterfaceC4871e interfaceC4871e) {
        Set set = this.ad;
        if (set.contains(c12007e)) {
            return new C11547e(this.vip, str, c12007e, interfaceC4871e, this.metrica);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c12007e, set));
    }
}
