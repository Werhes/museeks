package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8088e implements OnBackAnimationCallback {
    public final /* synthetic */ AbstractC15931e ad;

    public C8088e(AbstractC15931e abstractC15931e) {
        this.ad = abstractC15931e;
    }

    public final void onBackCancelled() {
        AbstractC15931e abstractC15931e = this.ad;
        C11106e c11106e = abstractC15931e.ad;
        if (c11106e == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!abstractC15931e.vip) {
            c11106e.inmobi(abstractC15931e, null);
        }
        C15655e c15655e = (C15655e) c11106e.f22007e;
        if (abstractC15931e.equals(c15655e.yandex) && -1 == c15655e.billing) {
            AbstractC13388e abstractC13388e = c15655e.purchase;
            if (abstractC13388e == null) {
                abstractC13388e = c15655e.metrica(-1);
            }
            c15655e.purchase = null;
            c15655e.billing = 0;
            c15655e.yandex = null;
            if (abstractC13388e != null) {
                abstractC13388e.ad();
            }
            C1615e c1615e = c15655e.ad;
            c1615e.getClass();
            c1615e.smaato(null, C14477e.appmetrica);
        }
        abstractC15931e.vip = false;
    }

    public final void onBackInvoked() {
        this.ad.ad();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        C1558e ad = AbstractC18416e.ad(backEvent);
        AbstractC15931e abstractC15931e = this.ad;
        C11106e c11106e = abstractC15931e.ad;
        if (c11106e == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (abstractC15931e.vip) {
            C15655e c15655e = (C15655e) c11106e.f22007e;
            if (abstractC15931e.equals(c15655e.yandex) && -1 == c15655e.billing) {
                AbstractC13388e abstractC13388e = c15655e.purchase;
                if (abstractC13388e == null) {
                    abstractC13388e = c15655e.metrica(-1);
                }
                if (abstractC13388e != null) {
                    abstractC13388e.metrica(ad);
                }
                C1615e c1615e = c15655e.ad;
                C10296e c10296e = new C10296e(ad);
                c1615e.getClass();
                c1615e.smaato(null, c10296e);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        C1558e ad = AbstractC18416e.ad(backEvent);
        AbstractC15931e abstractC15931e = this.ad;
        C11106e c11106e = abstractC15931e.ad;
        if (c11106e == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (abstractC15931e.vip) {
            return;
        }
        c11106e.inmobi(abstractC15931e, ad);
        abstractC15931e.vip = true;
    }
}
