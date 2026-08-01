package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17066e {
    public final C12948e ad;
    public final Rect[][] license;
    public final Rect[][] metrica;
    public C7088e[] vip;

    public AbstractC17066e() {
        this(new C12948e((C12948e) null));
    }

    public AbstractC17066e(C12948e c12948e) {
        this.metrica = new Rect[10];
        this.license = new Rect[10];
        this.ad = c12948e;
        metrica(c12948e);
    }

    public final void ad() {
        C7088e[] c7088eArr = this.vip;
        if (c7088eArr != null) {
            C7088e c7088e = c7088eArr[0];
            C7088e c7088e2 = c7088eArr[1];
            C12948e c12948e = this.ad;
            if (c7088e2 == null) {
                c7088e2 = c12948e.ad.startapp(2);
            }
            if (c7088e == null) {
                c7088e = c12948e.ad.startapp(1);
            }
            yandex(C7088e.ad(c7088e, c7088e2));
            C7088e c7088e3 = this.vip[AbstractC2426e.ad(16)];
            if (c7088e3 != null) {
                billing(c7088e3);
            }
            C7088e c7088e4 = this.vip[AbstractC2426e.ad(32)];
            if (c7088e4 != null) {
                appmetrica(c7088e4);
            }
            C7088e c7088e5 = this.vip[AbstractC2426e.ad(64)];
            if (c7088e5 != null) {
                startapp(c7088e5);
            }
        }
    }

    public void appmetrica(C7088e c7088e) {
    }

    public void billing(C7088e c7088e) {
    }

    public void license(int i, C7088e c7088e) {
        if (this.vip == null) {
            this.vip = new C7088e[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.vip[AbstractC2426e.ad(i2)] = c7088e;
            }
        }
    }

    public void metrica(C12948e c12948e) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> purchase = c12948e.ad.purchase(i);
            int ad = AbstractC2426e.ad(i);
            this.metrica[ad] = (Rect[]) purchase.toArray(new Rect[purchase.size()]);
            if (i != 8) {
                List<Rect> billing = c12948e.ad.billing(i);
                this.license[ad] = (Rect[]) billing.toArray(new Rect[billing.size()]);
            }
        }
    }

    public abstract void purchase(C7088e c7088e);

    public void startapp(C7088e c7088e) {
    }

    public abstract C12948e vip();

    public abstract void yandex(C7088e c7088e);
}
