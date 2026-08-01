package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17872e extends WebViewClient {
    public C8921e ad;
    public final /* synthetic */ C5980e license;
    public boolean metrica;
    public C13849e vip;

    public C17872e(C5980e c5980e) {
        this.license = c5980e;
    }

    public final boolean ad(String str) {
        if (str != null) {
            Uri parse = Uri.parse(AbstractC6507e.subscription(str, "#", "?", false));
            String queryParameter = parse.getQueryParameter("success");
            C5980e c5980e = this.license;
            if (queryParameter != null) {
                c5980e.f12580e = true;
                c5980e.f12583e.invoke(null);
                c5980e.purchase();
                return true;
            }
            if (parse.getQueryParameter("cancel") != null) {
                c5980e.f12580e = true;
                c5980e.f12581e.invoke();
                c5980e.purchase();
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        C13849e c13849e = this.vip;
        if (c13849e == null) {
            c13849e = null;
        }
        c13849e.vip.setValue(Boolean.valueOf(webView.canGoBack()));
        C13849e c13849e2 = this.vip;
        (c13849e2 != null ? c13849e2 : null).metrica.setValue(Boolean.valueOf(webView.canGoForward()));
    }

    public final void license(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            C8921e c8921e = this.ad;
            if (c8921e == null) {
                c8921e = null;
            }
            c8921e.purchase.add(new C1310e(webResourceRequest, webResourceError));
        }
    }

    public final void metrica(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C8921e c8921e = this.ad;
        if (c8921e == null) {
            c8921e = null;
        }
        c8921e.metrica.setValue(new C6919e(0.0f));
        C8921e c8921e2 = this.ad;
        if (c8921e2 == null) {
            c8921e2 = null;
        }
        c8921e2.purchase.clear();
        C8921e c8921e3 = this.ad;
        if (c8921e3 == null) {
            c8921e3 = null;
        }
        c8921e3.license.setValue(null);
        C8921e c8921e4 = this.ad;
        if (c8921e4 == null) {
            c8921e4 = null;
        }
        c8921e4.appmetrica.setValue(null);
        C8921e c8921e5 = this.ad;
        (c8921e5 != null ? c8921e5 : null).ad.setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        vip(webView, str);
        if (this.metrica) {
            return;
        }
        this.license.f12582e.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        metrica(webView, str, bitmap);
        ad(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC14966e.ad("Captcha3", 5, i + ':' + str + ':' + str2, null);
        if (AbstractC7890e.billing(webView != null ? webView.getUrl() : null, str2)) {
            this.metrica = true;
            C5980e c5980e = this.license;
            c5980e.f12580e = true;
            c5980e.f12581e.invoke();
            c5980e.purchase();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        int i;
        license(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (webResourceError != null) {
            str = webResourceError.getDescription().toString();
            i = webResourceError.getErrorCode();
        } else {
            str = "no_description";
            i = -1;
        }
        AbstractC14966e.ad("Captcha3", 5, i + ':' + str + ':' + valueOf, null);
        if (AbstractC7890e.billing(webView.getUrl(), valueOf)) {
            this.metrica = true;
            C5980e c5980e = this.license;
            c5980e.f12580e = true;
            c5980e.f12581e.invoke();
            c5980e.purchase();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        String url = sslError != null ? sslError.getUrl() : null;
        if (url == null) {
            url = BuildConfig.FLAVOR;
        }
        AbstractC14966e.ad("Captcha3", 5, "-11:ssl_exception:".concat(url), null);
        if (AbstractC7890e.billing(webView != null ? webView.getUrl() : null, url)) {
            this.metrica = true;
            C5980e c5980e = this.license;
            c5980e.f12580e = true;
            c5980e.f12581e.invoke();
            c5980e.purchase();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return ad(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return ad(str);
    }

    public final void vip(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C8921e c8921e = this.ad;
        if (c8921e == null) {
            c8921e = null;
        }
        c8921e.metrica.setValue(C1401e.ad);
    }
}
