package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۧۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18525e {
    public static final C18525e adcel;
    public static final HashSet advert;
    public static final C18525e appmetrica;
    public static final C18525e billing;
    public static final C18525e mopub;
    public static final C18525e purchase;
    public static final List smaato;
    public static final C18525e startapp;
    public static final C18525e yandex;
    public final int ad;
    public final List license;
    public final String metrica;
    public final int vip;

    static {
        C18525e c18525e = new C18525e(4, 2002, "SD", DesugarCollections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        appmetrica = c18525e;
        C18525e c18525e2 = new C18525e(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        purchase = c18525e2;
        C18525e c18525e3 = new C18525e(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        billing = c18525e3;
        C18525e c18525e4 = new C18525e(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        yandex = c18525e4;
        List list = Collections.EMPTY_LIST;
        C18525e c18525e5 = new C18525e(0, 2000, "LOWEST", list);
        startapp = c18525e5;
        C18525e c18525e6 = new C18525e(1, 2001, "HIGHEST", list);
        adcel = c18525e6;
        mopub = new C18525e(-1, -1, "NONE", list);
        advert = new HashSet(Arrays.asList(c18525e5, c18525e6, c18525e, c18525e2, c18525e3, c18525e4));
        smaato = Arrays.asList(c18525e4, c18525e3, c18525e2, c18525e);
    }

    public C18525e(int i, int i2, String str, List list) {
        this.ad = i;
        this.vip = i2;
        this.metrica = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.license = list;
    }

    public final int ad(int i) {
        if (i == 1) {
            return this.ad;
        }
        if (i == 2) {
            return this.vip;
        }
        throw new AssertionError(AbstractC1786e.admob(i, "Unknown quality source: "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18525e)) {
            return false;
        }
        C18525e c18525e = (C18525e) obj;
        return this.ad == c18525e.ad && this.vip == c18525e.vip && this.metrica.equals(c18525e.metrica) && this.license.equals(c18525e.license);
    }

    public final int hashCode() {
        return ((((((this.ad ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode();
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.ad + ", highSpeedValue=" + this.vip + ", name=" + this.metrica + ", typicalSizes=" + this.license + "}";
    }
}
