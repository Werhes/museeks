package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16496e extends AbstractC15468e {
    public final /* synthetic */ int ad = 1;
    public final /* synthetic */ Object license;
    public final C1622e metrica;
    public final Long vip;

    public C16496e(C10263e c10263e, C1622e c1622e, Object obj) {
        this.license = obj;
        String m4623e = c10263e.metrica.m4623e("Content-Length");
        this.vip = m4623e != null ? Long.valueOf(Long.parseLong(m4623e)) : null;
        if (c1622e == null) {
            C1622e c1622e2 = AbstractC7312e.ad;
            c1622e = AbstractC7312e.vip;
        }
        this.metrica = c1622e;
    }

    public C16496e(AbstractC11424e abstractC11424e, C1622e c1622e, Object obj) {
        this.license = obj;
        String m4623e = ((C10263e) abstractC11424e.f22964e).metrica.m4623e("Content-Length");
        this.vip = m4623e != null ? Long.valueOf(Long.parseLong(m4623e)) : null;
        if (c1622e == null) {
            C1622e c1622e2 = AbstractC7312e.ad;
            c1622e = AbstractC7312e.vip;
        }
        this.metrica = c1622e;
    }

    @Override // defpackage.AbstractC14601e
    public final Long ad() {
        switch (this.ad) {
            case 0:
                return this.vip;
            default:
                return this.vip;
        }
    }

    @Override // defpackage.AbstractC15468e
    public final InterfaceC13033e appmetrica() {
        switch (this.ad) {
            case 0:
                return (InterfaceC13033e) this.license;
            default:
                return AbstractC17324e.billing((InputStream) this.license);
        }
    }

    @Override // defpackage.AbstractC14601e
    public final C1622e vip() {
        switch (this.ad) {
            case 0:
                return this.metrica;
            default:
                return this.metrica;
        }
    }
}
