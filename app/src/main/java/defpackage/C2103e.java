package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2103e implements InterfaceC11259e {
    public final C12313e ad = C12313e.f24698e;
    public final Function1 vip = C12578e.billing;
    public final boolean metrica = true;
    public final boolean license = true;

    @Override // defpackage.InterfaceC11259e
    public final InterfaceC5355e ad(C16569e c16569e, C6302e c6302e) {
        if (!AbstractC7890e.billing(c16569e.vip, "image/svg+xml")) {
            InterfaceC4895e mo2321e = c16569e.ad.mo2321e();
            if (!mo2321e.mo1682e(0L, AbstractC2851e.vip) || mo2321e.mo1685for(1024L, AbstractC2851e.ad) == -1) {
                return null;
            }
        }
        return new C12578e(c16569e.ad, c6302e, this.ad, this.vip, this.metrica, this.license);
    }
}
