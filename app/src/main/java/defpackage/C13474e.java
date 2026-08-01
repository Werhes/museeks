package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٟۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13474e implements InterfaceC12111e {
    public static final C13474e vip = new C13474e(0);
    public final /* synthetic */ int ad;

    public /* synthetic */ C13474e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC12111e
    public final C14702e ad(Class cls) {
        switch (this.ad) {
            case 0:
                if (!AbstractC4994e.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C14702e) AbstractC4994e.appmetrica(cls.asSubclass(AbstractC4994e.class)).license(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.InterfaceC12111e
    public final boolean vip(Class cls) {
        switch (this.ad) {
            case 0:
                return AbstractC4994e.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
