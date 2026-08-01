package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٞۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18267e extends AbstractC16709e implements InterfaceC6380e {
    public boolean adcel;
    public int advert;
    public final C17039e billing;
    public final /* synthetic */ ServiceConnectionC12367e loadAd;
    public final String purchase;
    public C17527e smaato;
    public String startapp;
    public String yandex;
    public int mopub = -1;
    public int amazon = -1;

    public C18267e(ServiceConnectionC12367e serviceConnectionC12367e, String str, C17039e c17039e) {
        this.loadAd = serviceConnectionC12367e;
        this.purchase = str;
        this.billing = c17039e;
    }

    @Override // defpackage.InterfaceC6380e
    public final int ad() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC16709e
    public final String adcel() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC16709e
    public final void amazon(String str) {
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            int i = this.amazon;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = c17527e.license;
            c17527e.license = i2 + 1;
            c17527e.vip(13, i2, i, null, bundle);
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void appmetrica() {
        this.adcel = true;
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            c17527e.ad(this.amazon);
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void billing() {
        yandex(0);
    }

    @Override // defpackage.AbstractC13922e
    public final void license() {
        ServiceConnectionC12367e serviceConnectionC12367e = this.loadAd;
        serviceConnectionC12367e.f24800e.remove(this);
        metrica();
        serviceConnectionC12367e.advert();
    }

    @Override // defpackage.AbstractC16709e
    public final void loadAd(ArrayList arrayList) {
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            int i = this.amazon;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(arrayList));
            int i2 = c17527e.license;
            c17527e.license = i2 + 1;
            c17527e.vip(14, i2, i, null, bundle);
        }
    }

    @Override // defpackage.InterfaceC6380e
    public final void metrica() {
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            int i = this.amazon;
            int i2 = c17527e.license;
            c17527e.license = i2 + 1;
            c17527e.vip(4, i2, i, null, null);
            this.smaato = null;
            this.amazon = 0;
        }
    }

    @Override // defpackage.AbstractC16709e
    public final String mopub() {
        return this.startapp;
    }

    @Override // defpackage.AbstractC13922e
    public final void purchase(int i) {
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            c17527e.metrica(this.amazon, i);
        } else {
            this.mopub = i;
            this.advert = 0;
        }
    }

    @Override // defpackage.AbstractC16709e
    public final void smaato(String str) {
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            int i = this.amazon;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = c17527e.license;
            c17527e.license = i2 + 1;
            c17527e.vip(12, i2, i, null, bundle);
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void startapp(int i) {
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            c17527e.license(this.amazon, i);
        } else {
            this.advert += i;
        }
    }

    @Override // defpackage.InterfaceC6380e
    public final void vip(C17527e c17527e) {
        C11995e c11995e = new C11995e(this);
        this.smaato = c17527e;
        int i = c17527e.appmetrica;
        c17527e.appmetrica = i + 1;
        int i2 = c17527e.license;
        c17527e.license = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.purchase);
        bundle.putParcelable("routeControllerOptions", this.billing.ad);
        c17527e.vip(11, i2, i, null, bundle);
        c17527e.yandex.put(i2, c11995e);
        this.amazon = i;
        if (this.adcel) {
            c17527e.ad(i);
            int i3 = this.mopub;
            if (i3 >= 0) {
                c17527e.metrica(this.amazon, i3);
                this.mopub = -1;
            }
            int i4 = this.advert;
            if (i4 != 0) {
                c17527e.license(this.amazon, i4);
                this.advert = 0;
            }
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void yandex(int i) {
        this.adcel = false;
        C17527e c17527e = this.smaato;
        if (c17527e != null) {
            int i2 = this.amazon;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = c17527e.license;
            c17527e.license = i3 + 1;
            c17527e.vip(6, i3, i2, null, bundle);
        }
    }
}
