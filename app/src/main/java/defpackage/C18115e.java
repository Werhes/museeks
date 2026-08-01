package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۤۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18115e extends AbstractC7326e {
    public final /* synthetic */ int ad;
    public AbstractC18109e vip;

    public /* synthetic */ C18115e() {
        this.ad = 1;
    }

    public /* synthetic */ C18115e(AbstractC18109e abstractC18109e, int i) {
        this.ad = i;
        this.vip = abstractC18109e;
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public void ad(AbstractC18109e abstractC18109e) {
        switch (this.ad) {
            case 1:
                C16694e c16694e = (C16694e) this.vip;
                int i = c16694e.f32753e - 1;
                c16694e.f32753e = i;
                if (i == 0) {
                    c16694e.f32750e = false;
                    c16694e.amazon();
                }
                abstractC18109e.ads(this);
                return;
            case 2:
                this.vip.subs();
                abstractC18109e.ads(this);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public void billing(AbstractC18109e abstractC18109e) {
        switch (this.ad) {
            case 0:
                C16694e c16694e = (C16694e) this.vip;
                c16694e.f32752e.remove(abstractC18109e);
                if (c16694e.pro()) {
                    return;
                }
                c16694e.inmobi(c16694e, C11180e.f22442e, false);
                c16694e.f35515e = true;
                c16694e.inmobi(c16694e, C11180e.f22440e, false);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public void metrica(AbstractC18109e abstractC18109e) {
        switch (this.ad) {
            case 1:
                C16694e c16694e = (C16694e) this.vip;
                if (c16694e.f32750e) {
                    return;
                }
                c16694e.m4473extends();
                c16694e.f32750e = true;
                return;
            default:
                return;
        }
    }
}
