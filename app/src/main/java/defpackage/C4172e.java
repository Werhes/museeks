package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4172e extends AbstractC1487e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4172e(C15398e c15398e, int i) {
        super(c15398e);
        this.f9199e = i;
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    private final void m1476e() {
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    private final void m1477e() {
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public void m1478e(String str, C1766e c1766e, C3179e c3179e, InterfaceC5000e interfaceC5000e) {
        String str2;
        URL url;
        byte[] ad;
        C6915e c6915e;
        Map map;
        String str3 = c1766e.ad;
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        m613e();
        try {
            url = new URI(str3).toURL();
            this.f19060e.m3965synchronized();
            ad = c3179e.ad();
            c6915e = c6936e.f14226e;
            C6936e.yandex(c6915e);
            map = c1766e.vip;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            c6915e.m2256e(new RunnableC16348e(this, str2, url, ad, map, interfaceC5000e));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.metrica(C13879e.m3689e(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public boolean m1479e() {
        m613e();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C6936e) this.f36443e).f14225e.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override // defpackage.AbstractC1487e
    /* renamed from: eّٖٗ */
    public final void mo554e() {
        int i = this.f9199e;
    }
}
