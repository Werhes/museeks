package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7184e {
    public final C11106e ad;
    public final C6194e vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C7184e(C11106e c11106e, C6194e c6194e) {
        this.ad = c11106e;
        this.vip = c6194e;
        if ((c11106e == null ? c6194e : c11106e) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }

    public final void ad(AbstractC11130e abstractC11130e) {
        C11106e c11106e = this.ad;
        if (c11106e != null) {
            C11106e.adcel(c11106e, (C5601e) abstractC11130e.f22046e);
            return;
        }
        C6194e c6194e = this.vip;
        if (c6194e == null) {
            throw new IllegalStateException("Unreachable");
        }
        C11109e c11109e = (C11109e) abstractC11130e.f22047e;
        C8198e c8198e = new C8198e(c11109e, new C8595e(c11109e, null));
        c11109e.ad.add(c8198e);
        C11106e.adcel(c6194e.vip().metrica, c8198e);
    }

    public final void vip(AbstractC11130e abstractC11130e) {
        if (this.ad != null) {
            ((C5601e) abstractC11130e.f22046e).appmetrica();
        } else {
            if (this.vip == null) {
                throw new IllegalStateException("Unreachable");
            }
            ((C11109e) abstractC11130e.f22047e).license();
        }
    }
}
