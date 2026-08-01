package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9736e implements InterfaceC8667e {
    public static final C2824e metrica = new C2824e(AbstractC3820e.ad.vip(C9736e.class));
    public boolean ad;
    public final ArrayList vip = new ArrayList();

    @Override // defpackage.InterfaceC15764e
    public final C2824e ad() {
        return metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9736e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9736e c9736e = (C9736e) obj;
        return this.ad == c9736e.ad && AbstractC7890e.billing(this.vip, c9736e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + ((this.ad ? 1231 : 1237) * 31);
    }
}
