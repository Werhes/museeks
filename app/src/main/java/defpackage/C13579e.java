package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۢٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13579e {
    public static final C0520e appmetrica = C0520e.billing("<root>");
    public final String ad;
    public transient C0520e license;
    public transient C13579e metrica;
    public transient C12816e vip;

    static {
        Pattern.compile("\\.");
    }

    public C13579e(C12816e c12816e, String str) {
        this.ad = str;
        this.vip = c12816e;
    }

    public C13579e(String str) {
        this.ad = str;
    }

    public C13579e(String str, C13579e c13579e, C0520e c0520e) {
        this.ad = str;
        this.metrica = c13579e;
        this.license = c0520e;
    }

    public static final List purchase(C13579e c13579e) {
        if (c13579e.metrica()) {
            return new ArrayList();
        }
        List purchase = purchase(c13579e.appmetrica());
        purchase.add(c13579e.billing());
        return purchase;
    }

    public final C13579e ad(C0520e c0520e) {
        String str;
        if (metrica()) {
            str = c0520e.vip();
        } else {
            str = this.ad + '.' + c0520e.vip();
        }
        return new C13579e(str, this, c0520e);
    }

    public final C13579e appmetrica() {
        C13579e c13579e = this.metrica;
        if (c13579e != null) {
            return c13579e;
        }
        if (metrica()) {
            throw new IllegalStateException("root");
        }
        vip();
        return this.metrica;
    }

    public final C0520e billing() {
        C0520e c0520e = this.license;
        if (c0520e != null) {
            return c0520e;
        }
        if (metrica()) {
            throw new IllegalStateException("root");
        }
        vip();
        return this.license;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13579e) {
            return AbstractC7890e.billing(this.ad, ((C13579e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final boolean license() {
        return this.vip != null || AbstractC5304e.m1865interface(this.ad, '<', 0, 6) < 0;
    }

    public final boolean metrica() {
        return this.ad.length() == 0;
    }

    public final C12816e startapp() {
        C12816e c12816e = this.vip;
        if (c12816e != null) {
            return c12816e;
        }
        C12816e c12816e2 = new C12816e(this);
        this.vip = c12816e2;
        return c12816e2;
    }

    public final String toString() {
        return metrica() ? appmetrica.vip() : this.ad;
    }

    public final void vip() {
        String str = this.ad;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char charAt = str.charAt(length);
            if (charAt == '.' && !z) {
                break;
            }
            if (charAt == '`') {
                z = !z;
            } else if (charAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.license = C0520e.license(str.substring(length + 1));
            this.metrica = new C13579e(str.substring(0, length));
        } else {
            this.license = C0520e.license(str);
            this.metrica = C12816e.metrica.ad;
        }
    }

    public final boolean yandex(C0520e c0520e) {
        if (!metrica()) {
            String str = this.ad;
            int m1865interface = AbstractC5304e.m1865interface(str, '.', 0, 6);
            if (m1865interface == -1) {
                m1865interface = str.length();
            }
            String vip = c0520e.vip();
            if (m1865interface == vip.length() && str.regionMatches(0, vip, 0, m1865interface)) {
                return true;
            }
        }
        return false;
    }
}
