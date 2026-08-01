package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7096e extends WebChromeClient {
    public C8921e ad;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C8921e c8921e = this.ad;
        if (c8921e == null) {
            c8921e = null;
        }
        if (((AbstractC4284e) c8921e.metrica.getValue()) instanceof C1401e) {
            return;
        }
        C8921e c8921e2 = this.ad;
        (c8921e2 != null ? c8921e2 : null).metrica.setValue(new C6919e(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        C8921e c8921e = this.ad;
        if (c8921e == null) {
            c8921e = null;
        }
        c8921e.appmetrica.setValue(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        C8921e c8921e = this.ad;
        if (c8921e == null) {
            c8921e = null;
        }
        c8921e.license.setValue(str);
    }
}
