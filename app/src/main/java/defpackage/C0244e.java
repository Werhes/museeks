package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244e extends AbstractC17358e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f1507e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f1508e;

    public C0244e(InterfaceC12424e interfaceC12424e) {
        super(interfaceC12424e);
        this.f1508e = "virtual-" + interfaceC12424e.billing() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.AbstractC17358e, defpackage.InterfaceC12424e
    public final String billing() {
        return this.f1508e;
    }

    @Override // defpackage.AbstractC17358e, defpackage.InterfaceC12424e
    public final int metrica() {
        return signatures(0);
    }

    @Override // defpackage.AbstractC17358e, defpackage.InterfaceC12424e
    public final int signatures(int i) {
        return AbstractC8261e.adcel(super.signatures(i) - this.f1507e);
    }
}
