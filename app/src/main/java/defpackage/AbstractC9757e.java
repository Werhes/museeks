package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۛۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9757e {
    public static final /* synthetic */ int ad = 0;

    static {
        AbstractC1660e.m664case(new String[]{"json", "ld+json", "xml", "xhtml+xml", "rss+xml", "atom+xml", "x-www-form-urlencoded", "svg+xml"});
    }

    public static final Charset ad(C1622e c1622e) {
        String m3036e = c1622e.m3036e("charset");
        if (m3036e == null) {
            return null;
        }
        try {
            Charset charset = AbstractC5508e.ad;
            return Charset.forName(m3036e);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
