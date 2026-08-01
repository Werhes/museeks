package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692e implements InterfaceC3075e {
    public Function0 ad;
    public final C0576e metrica = AbstractC14533e.startapp(Boolean.FALSE);
    public C0576e vip;

    public final long ad() {
        C0931e c0931e;
        if (this.vip == null) {
            Function0 function0 = this.ad;
            if (function0 == null || (c0931e = (C0931e) function0.invoke()) == null) {
                c0931e = C0931e.metrica;
            }
            this.vip = AbstractC14533e.startapp(c0931e);
            this.ad = null;
        }
        return ((C0931e) this.vip.getValue()).ad;
    }

    public final boolean vip() {
        return ((Boolean) this.metrica.getValue()).booleanValue();
    }
}
