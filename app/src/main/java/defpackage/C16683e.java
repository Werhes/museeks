package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16683e {
    public final InterfaceC6823e ad;
    public C3335e license;
    public C11246e metrica;
    public int purchase;
    public final Handler vip;
    public C11442e yandex;
    public float billing = 1.0f;
    public int appmetrica = 0;

    public C16683e(Context context, Looper looper, C11246e c11246e) {
        this.ad = AbstractC5209e.billing(new C13633e(context, 0));
        this.metrica = c11246e;
        this.vip = new Handler(looper);
    }

    public final void ad() {
        int i = this.appmetrica;
        if (i == 1 || i == 0 || this.yandex == null) {
            return;
        }
        AbstractC17305e.vip((AudioManager) this.ad.get(), this.yandex);
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [eِٔۙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [eِٔۙ, java.lang.Object] */
    public final int license(int i, boolean z) {
        int i2;
        C14937e c14937e;
        boolean z2 = false;
        if (i == 1 || (i2 = this.purchase) != 1) {
            ad();
            metrica(0);
            return 1;
        }
        if (!z) {
            int i3 = this.appmetrica;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.appmetrica != 2) {
            C11442e c11442e = this.yandex;
            if (c11442e == null) {
                if (c11442e == null) {
                    ?? obj = new Object();
                    obj.license = C3335e.startapp;
                    obj.ad = i2;
                    c14937e = obj;
                } else {
                    ?? obj2 = new Object();
                    obj2.ad = c11442e.ad;
                    obj2.license = c11442e.license;
                    obj2.vip = c11442e.appmetrica;
                    c14937e = obj2;
                }
                C3335e c3335e = this.license;
                if (c3335e != null && c3335e.ad == 1) {
                    z2 = true;
                }
                c3335e.getClass();
                c14937e.license = c3335e;
                c14937e.vip = z2;
                c14937e.metrica = true;
                C12350e c12350e = new C12350e(0, this);
                Handler handler = this.vip;
                handler.getClass();
                this.yandex = new C11442e(c14937e.ad, c12350e, handler, (C3335e) c14937e.license, c14937e.vip, c14937e.metrica);
            }
            int m4301try = AbstractC17305e.m4301try((AudioManager) this.ad.get(), this.yandex);
            if (m4301try == 1 || m4301try == 2) {
                metrica(2);
                return 1;
            }
            metrica(1);
            return -1;
        }
        return 1;
    }

    public final void metrica(int i) {
        if (this.appmetrica == i) {
            return;
        }
        this.appmetrica = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.billing == f) {
            return;
        }
        this.billing = f;
        C11246e c11246e = this.metrica;
        if (c11246e != null) {
            c11246e.f22562e.billing(34);
        }
    }

    public final void vip(int i) {
        C11246e c11246e = this.metrica;
        if (c11246e != null) {
            C2399e c2399e = c11246e.f22562e;
            c2399e.getClass();
            C12414e metrica = C2399e.metrica();
            metrica.ad = c2399e.ad.obtainMessage(33, i, 0);
            metrica.vip();
        }
    }
}
