package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2893e {
    public static final C12948e vip;
    public final C12948e ad;

    static {
        int i = Build.VERSION.SDK_INT;
        vip = (i >= 36 ? new C16087e() : i >= 35 ? new C8443e() : i >= 34 ? new C11610e() : i >= 31 ? new C16684e() : i >= 30 ? new C15829e() : i >= 29 ? new C5815e() : new C12525e()).vip().ad.ad().ad.vip().ad.metrica();
    }

    public C2893e(C12948e c12948e) {
        this.ad = c12948e;
    }

    public void Signature(View view) {
    }

    public C12948e ad() {
        return this.ad;
    }

    public C7088e adcel(int i) {
        if ((i & 8) == 0) {
            return C7088e.appmetrica;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public void admob() {
    }

    public void ads(int i) {
    }

    public C7088e advert() {
        return C7088e.appmetrica;
    }

    public C7088e amazon() {
        return C7088e.appmetrica;
    }

    public void applovin(C7088e c7088e) {
    }

    public void appmetrica(C12948e c12948e) {
    }

    public List<Rect> billing(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2893e)) {
            return false;
        }
        C2893e c2893e = (C2893e) obj;
        return pro() == c2893e.pro() && remoteconfig() == c2893e.remoteconfig() && Objects.equals(amazon(), c2893e.amazon()) && Objects.equals(advert(), c2893e.advert()) && Objects.equals(yandex(), c2893e.yandex());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(pro()), Boolean.valueOf(remoteconfig()), amazon(), advert(), yandex());
    }

    public void inmobi(C7088e c7088e) {
    }

    public void isPro(C12948e c12948e) {
    }

    public void isVip(C7088e[] c7088eArr) {
    }

    public void license(View view) {
    }

    public C7088e loadAd() {
        return amazon();
    }

    public C12948e metrica() {
        return this.ad;
    }

    public C7088e mopub() {
        return amazon();
    }

    public void premium(Rect[][] rectArr) {
    }

    public boolean pro() {
        return false;
    }

    public List<Rect> purchase(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean remoteconfig() {
        return false;
    }

    public boolean signatures(int i) {
        return true;
    }

    public C7088e smaato() {
        return amazon();
    }

    public C7088e startapp(int i) {
        return C7088e.appmetrica;
    }

    public void subs(Rect[][] rectArr) {
    }

    public C12948e subscription(int i, int i2, int i3, int i4) {
        return vip;
    }

    public void tapsense(C5494e c5494e) {
    }

    public C12948e vip() {
        return this.ad;
    }

    public C10119e yandex() {
        return null;
    }
}
