package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13876e extends AbstractC14049e {
    public C0404e ad;
    public final C0576e vip;

    public C13876e(C0404e c0404e, C0763e c0763e) {
        this.ad = c0404e;
        this.vip = AbstractC14533e.startapp(c0763e);
    }

    @Override // defpackage.AbstractC14049e
    public final AbstractC14049e ad(C7589e c7589e, C0404e c0404e, long j, long j2, long j3) {
        long j4;
        Object obj;
        C11106e c11106e = new C11106e(j, C2152e.yandex(j2, j3), j3);
        C0763e metrica = metrica();
        if (metrica == null) {
            C0404e c0404e2 = this.ad;
            if (c0404e2 == null) {
                List vip = c7589e.vip();
                int size = vip.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = vip.get(i);
                    if (c7589e.metrica().contains((C16223e) obj)) {
                        break;
                    }
                    i++;
                }
                C16223e c16223e = (C16223e) obj;
                c0404e2 = c16223e != null ? c16223e.f31875e : null;
            }
            metrica = AbstractC6494e.ad(c7589e, c0404e2);
            if (metrica == null) {
                j4 = j2;
                metrica = AbstractC18489e.billing(j2, j);
                C0763e c0763e = metrica;
                AbstractC6494e.vip(c11106e, j, j4, j3, true);
                return new C4039e(c11106e, c0404e, c0763e);
            }
        }
        j4 = j2;
        C0763e c0763e2 = metrica;
        AbstractC6494e.vip(c11106e, j, j4, j3, true);
        return new C4039e(c11106e, c0404e, c0763e2);
    }

    @Override // defpackage.AbstractC14049e
    public final C11106e appmetrica() {
        return null;
    }

    @Override // defpackage.AbstractC14049e
    public final AbstractC14049e billing(C0404e c0404e) {
        if (this.ad == null) {
            this.ad = c0404e;
        }
        return this;
    }

    @Override // defpackage.AbstractC14049e
    public final C0763e metrica() {
        return (C0763e) this.vip.getValue();
    }

    @Override // defpackage.AbstractC14049e
    public final C0763e purchase(C7589e c7589e) {
        Object obj;
        C0763e metrica = metrica();
        if (metrica != null) {
            return metrica;
        }
        if (metrica() == null) {
            C0404e c0404e = this.ad;
            if (c0404e == null) {
                List vip = c7589e.vip();
                int size = vip.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = vip.get(i);
                    if (c7589e.metrica().contains((C16223e) obj)) {
                        break;
                    }
                    i++;
                }
                C16223e c16223e = (C16223e) obj;
                c0404e = c16223e != null ? c16223e.f31875e : null;
            }
            C0763e ad = AbstractC6494e.ad(c7589e, c0404e);
            if (ad != null) {
                this.vip.setValue(ad);
            }
        }
        return metrica();
    }

    @Override // defpackage.AbstractC14049e
    public final void startapp(C0763e c0763e) {
        this.vip.setValue(c0763e);
    }

    @Override // defpackage.AbstractC14049e
    public final boolean vip() {
        return true;
    }

    @Override // defpackage.AbstractC14049e
    public final AbstractC14049e yandex() {
        return C4471e.ad;
    }
}
