package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6540e {
    public final boolean ad;
    public C13578e license;
    public final C0351e metrica = new C0351e(Boolean.FALSE);
    public final C10684e vip;

    public C6540e(boolean z, C10684e c10684e) {
        this.ad = z;
        this.vip = c10684e;
    }

    public final void ad() {
        C13578e c13578e;
        this.metrica.metrica.setValue(Boolean.FALSE);
        if (!this.ad || (c13578e = this.license) == null) {
            return;
        }
        c13578e.ad(null);
    }

    public final Object metrica(EnumC6955e enumC6955e, AbstractC7185e abstractC7185e) {
        InterfaceC5083e interfaceC5083e = null;
        C12602e c12602e = new C12602e(this, enumC6955e, new C0593e(this, interfaceC5083e, 8), interfaceC5083e, 4);
        C10684e c10684e = this.vip;
        c10684e.getClass();
        Object appmetrica = AbstractC9743e.appmetrica(new C6365e(enumC6955e, c10684e, c12602e, null), abstractC7185e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    public final boolean vip() {
        C0351e c0351e = this.metrica;
        return ((Boolean) c0351e.vip.getValue()).booleanValue() || ((Boolean) c0351e.metrica.getValue()).booleanValue();
    }
}
