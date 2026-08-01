package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8927e extends AbstractC13795e {
    public static final C7056e[] license = {C7056e.startapp};

    @Override // defpackage.InterfaceC8572e
    public final C7056e[] ad() {
        return (C7056e[]) license.clone();
    }

    @Override // defpackage.AbstractC13795e
    public final AbstractC8578e metrica(long j, BigInteger bigInteger, C2527e c2527e) {
        AbstractC12394e.license(c2527e);
        c2527e.read();
        c2527e.read();
        AbstractC12394e.appmetrica(c2527e);
        return new AbstractC8578e(C7056e.startapp, j, bigInteger);
    }
}
