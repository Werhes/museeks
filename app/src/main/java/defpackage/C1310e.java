package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1310e {
    public final WebResourceRequest ad;
    public final WebResourceError vip;

    public C1310e(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.ad = webResourceRequest;
        this.vip = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1310e)) {
            return false;
        }
        C1310e c1310e = (C1310e) obj;
        return AbstractC7890e.billing(this.ad, c1310e.ad) && AbstractC7890e.billing(this.vip, c1310e.vip);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.ad;
        return this.vip.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "WebViewError(request=" + this.ad + ", error=" + this.vip + ')';
    }
}
