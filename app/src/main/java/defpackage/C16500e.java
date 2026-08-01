package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16500e extends AbstractC14782e {
    public static final C16500e vip = new C16500e(C4727e.ad);
    public final AtomicReference ad;

    public C16500e(AbstractC14782e abstractC14782e) {
        this.ad = new AtomicReference(abstractC14782e);
    }

    @Override // defpackage.AbstractC14782e
    public final void ad(String str, Level level, boolean z) {
        ((AbstractC14782e) this.ad.get()).ad(str, level, z);
    }

    @Override // defpackage.AbstractC14782e
    public final AbstractC9743e metrica() {
        return ((AbstractC14782e) this.ad.get()).metrica();
    }

    @Override // defpackage.AbstractC14782e
    public final C14787e vip() {
        return ((AbstractC14782e) this.ad.get()).vip();
    }
}
