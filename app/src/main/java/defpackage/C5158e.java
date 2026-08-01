package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۛٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5158e extends AbstractC1006e {
    public final double metrica;
    public final InterfaceC11129e vip;

    public C5158e(C11997e c11997e, InterfaceC11129e interfaceC11129e, double d) {
        super(c11997e);
        this.vip = interfaceC11129e;
        this.metrica = d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SUCCESS");
        InterfaceC11129e interfaceC11129e = this.vip;
        if (interfaceC11129e.isEmpty()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "; " + interfaceC11129e;
        }
        sb.append(str);
        sb.append(" @ ");
        sb.append(AbstractC3149e.billing(this.ad));
        return sb.toString();
    }
}
