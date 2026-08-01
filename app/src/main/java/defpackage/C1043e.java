package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1043e extends AbstractC3747e {
    public static final /* synthetic */ int license = 0;
    public final AtomicLong metrica = new AtomicLong(-1);

    static {
        new C8445e(1);
    }

    @Override // defpackage.AbstractC3747e
    public final void ad() {
        AtomicLong atomicLong = this.metrica;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
