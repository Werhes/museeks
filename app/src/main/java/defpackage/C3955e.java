package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3955e implements InterfaceC18169e {
    public static final C3955e vip = new C3955e(0);
    public final /* synthetic */ int ad;

    public /* synthetic */ C3955e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC18169e
    public final C8678e ad(Class cls) {
        switch (this.ad) {
            case 0:
                if (!AbstractC18270e.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C8678e) AbstractC18270e.metrica(cls.asSubclass(AbstractC18270e.class)).vip(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.InterfaceC18169e
    public final boolean vip(Class cls) {
        switch (this.ad) {
            case 0:
                return AbstractC18270e.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
