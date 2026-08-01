package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924e extends AbstractC13922e implements InterfaceC6380e {
    public final String ad;
    public int appmetrica = -1;
    public C17527e billing;
    public boolean license;
    public final C17039e metrica;
    public int purchase;
    public final /* synthetic */ ServiceConnectionC12367e startapp;
    public final String vip;
    public int yandex;

    public C0924e(ServiceConnectionC12367e serviceConnectionC12367e, String str, String str2, C17039e c17039e) {
        this.startapp = serviceConnectionC12367e;
        this.ad = str;
        this.vip = str2;
        this.metrica = c17039e;
    }

    @Override // defpackage.InterfaceC6380e
    public final int ad() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC13922e
    public final void appmetrica() {
        this.license = true;
        C17527e c17527e = this.billing;
        if (c17527e != null) {
            c17527e.ad(this.yandex);
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void billing() {
        yandex(0);
    }

    @Override // defpackage.AbstractC13922e
    public final void license() {
        ServiceConnectionC12367e serviceConnectionC12367e = this.startapp;
        serviceConnectionC12367e.f24800e.remove(this);
        metrica();
        serviceConnectionC12367e.advert();
    }

    @Override // defpackage.InterfaceC6380e
    public final void metrica() {
        C17527e c17527e = this.billing;
        if (c17527e != null) {
            int i = this.yandex;
            int i2 = c17527e.license;
            c17527e.license = i2 + 1;
            c17527e.vip(4, i2, i, null, null);
            this.billing = null;
            this.yandex = 0;
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void purchase(int i) {
        C17527e c17527e = this.billing;
        if (c17527e != null) {
            c17527e.metrica(this.yandex, i);
        } else {
            this.appmetrica = i;
            this.purchase = 0;
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void startapp(int i) {
        C17527e c17527e = this.billing;
        if (c17527e != null) {
            c17527e.license(this.yandex, i);
        } else {
            this.purchase += i;
        }
    }

    @Override // defpackage.InterfaceC6380e
    public final void vip(C17527e c17527e) {
        this.billing = c17527e;
        int i = c17527e.appmetrica;
        c17527e.appmetrica = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.ad);
        bundle.putString("routeGroupId", this.vip);
        bundle.putParcelable("routeControllerOptions", this.metrica.ad);
        int i2 = c17527e.license;
        c17527e.license = i2 + 1;
        c17527e.vip(3, i2, i, null, bundle);
        this.yandex = i;
        if (this.license) {
            c17527e.ad(i);
            int i3 = this.appmetrica;
            if (i3 >= 0) {
                c17527e.metrica(this.yandex, i3);
                this.appmetrica = -1;
            }
            int i4 = this.purchase;
            if (i4 != 0) {
                c17527e.license(this.yandex, i4);
                this.purchase = 0;
            }
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void yandex(int i) {
        this.license = false;
        C17527e c17527e = this.billing;
        if (c17527e != null) {
            int i2 = this.yandex;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = c17527e.license;
            c17527e.license = i3 + 1;
            c17527e.vip(6, i3, i2, null, bundle);
        }
    }
}
