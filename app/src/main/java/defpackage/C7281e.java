package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7281e {
    public C1385e ad;
    public final int appmetrica;
    public final boolean billing;
    public final Size license;
    public final C1385e metrica = null;
    public final ArrayList purchase;
    public final C12631e startapp;
    public C1385e vip;
    public final C12631e yandex;

    public C7281e(Size size, int i, ArrayList arrayList, boolean z, C12631e c12631e, C12631e c12631e2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.license = size;
        this.appmetrica = i;
        this.purchase = arrayList;
        this.billing = z;
        this.yandex = c12631e;
        this.startapp = c12631e2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7281e)) {
            return false;
        }
        C7281e c7281e = (C7281e) obj;
        return this.license.equals(c7281e.license) && this.appmetrica == c7281e.appmetrica && this.purchase.equals(c7281e.purchase) && this.billing == c7281e.billing && this.yandex.equals(c7281e.yandex) && this.startapp.equals(c7281e.startapp);
    }

    public final int hashCode() {
        return ((((((((((this.license.hashCode() ^ 1000003) * 1000003) ^ this.appmetrica) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ (this.billing ? 1231 : 1237)) * 583896283) ^ this.yandex.hashCode()) * 1000003) ^ this.startapp.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.license + ", inputFormat=" + this.appmetrica + ", outputFormats=" + this.purchase + ", virtualCamera=" + this.billing + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.yandex + ", errorEdge=" + this.startapp + "}";
    }
}
