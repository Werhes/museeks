package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0793e {
    public static final C2691e adcel;
    public static final C7274e billing;
    public static final C9706e purchase;
    public static final C0793e startapp;
    public static final HashMap yandex;
    public final String ad;
    public int appmetrica;
    public String license;
    public final C9706e metrica;
    public final String vip;

    static {
        C9706e c9706e;
        String tapsense = AbstractC3628e.tapsense(StandardCharsets.UTF_8.name());
        AbstractC17595e.vip("charset", tapsense);
        C3638e ad = C3638e.ad();
        AbstractC13584e abstractC13584e = (AbstractC13584e) ad.get("charset");
        if (abstractC13584e == null) {
            abstractC13584e = AbstractC17475e.admob(4);
            ad.put("charset", abstractC13584e);
        }
        abstractC13584e.ad(tapsense);
        Collection entrySet = ad.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            c9706e = C5419e.f11603e;
        } else {
            C9618e c9618e = (C9618e) entrySet;
            Csuper csuper = new Csuper(c9618e.f19084e.size());
            Iterator it = c9618e.iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                C1410e billing2 = ((C13304e) entry.getValue()).billing();
                csuper.mo3904implements(key, billing2);
                i += billing2.f4224e;
            }
            c9706e = new C9706e(csuper.mopub(true), i);
        }
        purchase = c9706e;
        C8382e c8382e = C8382e.f17146e;
        C8382e c8382e2 = C8382e.f17144e;
        c8382e2.getClass();
        C12113e c12113e = new C12113e(c8382e2);
        c8382e.getClass();
        billing = new C7274e(new C7274e(new C7274e(c8382e, c12113e), new C18142e(' ', 1)), AbstractC7723e.vip("()<>@,;:\\\"/[]?=").license());
        AbstractC7723e.vip("\"\\\r").license().getClass();
        AbstractC7723e.vip(" \t\r\n");
        yandex = new HashMap();
        ad("*", "*");
        ad("text", "*");
        ad("image", "*");
        ad("audio", "*");
        ad("video", "*");
        ad("application", "*");
        ad("font", "*");
        vip("text", "cache-manifest");
        vip("text", "css");
        vip("text", "csv");
        vip("text", "html");
        vip("text", "calendar");
        vip("text", "markdown");
        vip("text", "plain");
        vip("text", "javascript");
        vip("text", "tab-separated-values");
        vip("text", "vcard");
        vip("text", "vnd.wap.wml");
        vip("text", "xml");
        vip("text", "vtt");
        ad("image", "bmp");
        ad("image", "x-canon-crw");
        ad("image", "gif");
        ad("image", "vnd.microsoft.icon");
        ad("image", "jpeg");
        ad("image", "png");
        ad("image", "vnd.adobe.photoshop");
        vip("image", "svg+xml");
        ad("image", "tiff");
        ad("image", "webp");
        ad("image", "heif");
        ad("image", "jp2");
        ad("audio", "mp4");
        ad("audio", "mpeg");
        ad("audio", "ogg");
        ad("audio", "webm");
        ad("audio", "l16");
        ad("audio", "l24");
        ad("audio", "basic");
        ad("audio", "aac");
        ad("audio", "vorbis");
        ad("audio", "x-ms-wma");
        ad("audio", "x-ms-wax");
        ad("audio", "vnd.rn-realaudio");
        ad("audio", "vnd.wave");
        ad("video", "mp4");
        ad("video", "mpeg");
        ad("video", "ogg");
        ad("video", "quicktime");
        ad("video", "webm");
        ad("video", "x-ms-wmv");
        ad("video", "x-flv");
        ad("video", "3gpp");
        ad("video", "3gpp2");
        vip("application", "xml");
        vip("application", "atom+xml");
        ad("application", "x-bzip2");
        vip("application", "dart");
        ad("application", "vnd.apple.pkpass");
        ad("application", "vnd.ms-fontobject");
        ad("application", "epub+zip");
        ad("application", "x-www-form-urlencoded");
        ad("application", "pkcs12");
        ad("application", "binary");
        ad("application", "geo+json");
        ad("application", "x-gzip");
        ad("application", "hal+json");
        vip("application", "javascript");
        ad("application", "jose");
        ad("application", "jose+json");
        startapp = vip("application", "json");
        ad("application", "jwt");
        vip("application", "manifest+json");
        ad("application", "vnd.google-earth.kml+xml");
        ad("application", "vnd.google-earth.kmz");
        ad("application", "mbox");
        ad("application", "x-apple-aspen-config");
        ad("application", "vnd.ms-excel");
        ad("application", "vnd.ms-outlook");
        ad("application", "vnd.ms-powerpoint");
        ad("application", "msword");
        ad("application", "dash+xml");
        ad("application", "wasm");
        ad("application", "x-nacl");
        ad("application", "x-pnacl");
        ad("application", "octet-stream");
        ad("application", "ogg");
        ad("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        ad("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        ad("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        ad("application", "vnd.oasis.opendocument.graphics");
        ad("application", "vnd.oasis.opendocument.presentation");
        ad("application", "vnd.oasis.opendocument.spreadsheet");
        ad("application", "vnd.oasis.opendocument.text");
        vip("application", "opensearchdescription+xml");
        ad("application", "pdf");
        ad("application", "postscript");
        ad("application", "protobuf");
        vip("application", "rdf+xml");
        vip("application", "rtf");
        ad("application", "font-sfnt");
        ad("application", "x-shockwave-flash");
        ad("application", "vnd.sketchup.skp");
        vip("application", "soap+xml");
        ad("application", "x-tar");
        ad("application", "font-woff");
        ad("application", "font-woff2");
        vip("application", "xhtml+xml");
        vip("application", "xrd+xml");
        ad("application", "zip");
        ad("font", "collection");
        ad("font", "otf");
        ad("font", "sfnt");
        ad("font", "ttf");
        ad("font", "woff");
        ad("font", "woff2");
        adcel = new C2691e(10, new C7364e("; "));
    }

    public C0793e(String str, String str2, C9706e c9706e) {
        this.ad = str;
        this.vip = str2;
        this.metrica = c9706e;
    }

    public static void ad(String str, String str2) {
        C0793e c0793e = new C0793e(str, str2, C5419e.f11603e);
        yandex.put(c0793e, c0793e);
    }

    public static C0793e vip(String str, String str2) {
        C0793e c0793e = new C0793e(str, str2, purchase);
        yandex.put(c0793e, c0793e);
        AbstractC9621e.license(StandardCharsets.UTF_8);
        return c0793e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0793e)) {
            return false;
        }
        C0793e c0793e = (C0793e) obj;
        return this.ad.equals(c0793e.ad) && this.vip.equals(c0793e.vip) && metrica().equals(c0793e.metrica());
    }

    public final int hashCode() {
        int i = this.appmetrica;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(new Object[]{this.ad, this.vip, metrica()});
        this.appmetrica = hashCode;
        return hashCode;
    }

    public final C14519e metrica() {
        return new C14519e(this.metrica.advert(), new C6594e(18, new C10612e(11)));
    }

    public final String toString() {
        String str = this.license;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append('/');
        sb.append(this.vip);
        C9706e c9706e = this.metrica;
        if (c9706e.f19208e != 0) {
            sb.append("; ");
            Collection mopub = new C13490e(c9706e, new C6594e(18, new C10612e(10))).mopub();
            C2691e c2691e = adcel;
            c2691e.getClass();
            try {
                c2691e.applovin(sb, mopub.iterator());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        String sb2 = sb.toString();
        this.license = sb2;
        return sb2;
    }
}
