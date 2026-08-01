package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۥٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14371e implements InterfaceC5007e {
    public static final C14371e vip = new C14371e(0);
    public final /* synthetic */ int ad;

    public /* synthetic */ C14371e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC5007e
    public final C15610e ad(Class cls) {
        switch (this.ad) {
            case 0:
                if (!AbstractC3405e.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C15610e) AbstractC3405e.adcel(cls.asSubclass(AbstractC3405e.class)).startapp(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.InterfaceC5007e
    public final boolean vip(Class cls) {
        switch (this.ad) {
            case 0:
                return AbstractC3405e.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
