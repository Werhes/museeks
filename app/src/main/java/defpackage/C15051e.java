package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15051e {
    public final /* synthetic */ int ad;
    public final C9340e appmetrica;
    public final C9340e license;
    public final C9340e metrica;
    public final Serializable purchase;
    public final C9340e vip;

    public C15051e(String str) {
        this.ad = 1;
        this.purchase = str;
        this.vip = new C9340e(1, null);
        this.metrica = new C9340e(0, null);
        this.license = new C9340e(1, null);
        this.appmetrica = new C9340e(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15051e(C15051e[] c15051eArr) {
        this.ad = 0;
        this.purchase = c15051eArr;
        int length = c15051eArr.length;
        C9340e[] c9340eArr = new C9340e[length];
        for (int i = 0; i < length; i++) {
            c9340eArr[i] = ((C15051e[]) this.purchase)[i].vip();
        }
        this.vip = new C9340e(1, new C10883e(c9340eArr, 0));
        int length2 = ((C15051e[]) this.purchase).length;
        C9340e[] c9340eArr2 = new C9340e[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            c9340eArr2[i2] = ((C15051e[]) this.purchase)[i2].license();
        }
        this.metrica = new C9340e(0, new C13779e(c9340eArr2, 0));
        int length3 = ((C15051e[]) this.purchase).length;
        C9340e[] c9340eArr3 = new C9340e[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c9340eArr3[i3] = ((C15051e[]) this.purchase)[i3].metrica();
        }
        this.license = new C9340e(1, new C10883e(c9340eArr3, 1));
        int length4 = ((C15051e[]) this.purchase).length;
        C9340e[] c9340eArr4 = new C9340e[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            c9340eArr4[i4] = ((C15051e[]) this.purchase)[i4].ad();
        }
        this.appmetrica = new C9340e(0, new C13779e(c9340eArr4, 1));
    }

    public final C9340e ad() {
        switch (this.ad) {
            case 0:
                return this.appmetrica;
            default:
                return this.appmetrica;
        }
    }

    public final C9340e license() {
        switch (this.ad) {
            case 0:
                return this.metrica;
            default:
                return this.metrica;
        }
    }

    public final C9340e metrica() {
        switch (this.ad) {
            case 0:
                return this.license;
            default:
                return this.license;
        }
    }

    public final String toString() {
        switch (this.ad) {
            case 0:
                return AbstractC1660e.m669goto((C15051e[]) this.purchase, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) this.purchase;
                return str != null ? AbstractC17861e.advert(')', "RectRulers(", str) : super.toString();
        }
    }

    public final C9340e vip() {
        switch (this.ad) {
            case 0:
                return this.vip;
            default:
                return this.vip;
        }
    }
}
