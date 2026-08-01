package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13155e {
    public final Object metrica;
    public final /* synthetic */ int ad = 0;
    public final C2673e vip = AbstractC14430e.metrica(false);

    public C13155e(InterfaceC4619e interfaceC4619e) {
        this.metrica = interfaceC4619e;
    }

    public C13155e(C18100e c18100e) {
        this.metrica = c18100e;
    }

    public final boolean ad() {
        switch (this.ad) {
            case 0:
                return this.vip.vip();
            default:
                return this.vip.vip();
        }
    }

    public final boolean vip() {
        switch (this.ad) {
            case 0:
                if (!this.vip.ad()) {
                    return false;
                }
                ((C17651e) ((InterfaceC4619e) this.metrica)).billing(null);
                return true;
            default:
                if (!this.vip.ad()) {
                    return false;
                }
                C18100e c18100e = (C18100e) this.metrica;
                synchronized (c18100e.f35492e) {
                    try {
                        int i = c18100e.f35491e - 1;
                        c18100e.f35491e = i;
                        if (i == 0 && !c18100e.f35490e) {
                            c18100e.f35494e = AbstractC5336e.purchase((InterfaceC18435e) c18100e.f35489e, null, 0, new C17071e(c18100e, null, 16), 3);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
        }
    }
}
