package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۦً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2993e extends AbstractC13616e implements InterfaceC17303e, InterfaceC5077e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C15725e f7033e = new Object();

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public EnumC17426e f7034e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC5823e f7035e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C6594e f7036e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final boolean m1224e(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = AbstractC5851e.mopub(this).f27610e.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            throw new C14803e(10);
        }
        if (i != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int ordinal2 = AbstractC5851e.mopub(this).f27610e.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        throw new C14803e(10);
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final boolean m1225e(C9504e c9504e, int i) {
        if (i == 5 || i == 6) {
            if (this.f7034e == EnumC17426e.f34145e) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.f7034e == EnumC17426e.f34146e) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (m1224e(i)) {
            if (c9504e.vip >= this.f7035e.ad() - 1) {
                return false;
            }
        } else if (c9504e.ad <= 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(j);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 8));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
