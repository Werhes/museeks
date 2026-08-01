package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٜٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8068e {
    public final Uri ad;
    public final AbstractC17475e license;
    public final C4842e metrica;
    public final C4089e vip;

    public C8068e(Uri uri, C4089e c4089e, C4842e c4842e, AbstractC17475e abstractC17475e) {
        this.ad = uri;
        this.vip = c4089e;
        this.metrica = c4842e;
        this.license = abstractC17475e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8068e)) {
            return false;
        }
        C8068e c8068e = (C8068e) obj;
        if (!this.ad.equals(c8068e.ad) || !this.vip.equals(c8068e.vip) || !this.metrica.equals(c8068e.metrica) || !this.license.equals(c8068e.license)) {
            return false;
        }
        Object obj2 = C17647e.f34584e;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ C17647e.f34584e.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.ad.toString();
        int length = obj.length();
        String abstractC15319e = this.vip.toString();
        int length2 = abstractC15319e.length();
        C17647e c17647e = C17647e.f34584e;
        String valueOf = String.valueOf(this.metrica);
        String valueOf2 = String.valueOf(this.license);
        String obj2 = c17647e.toString();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + obj2.length() + 32 + String.valueOf(true).length() + 22);
        AbstractC13501e.Signature(sb, "ProtoDataStoreConfig{uri=", obj, ", schema=", abstractC15319e);
        AbstractC13501e.Signature(sb, ", handler=", valueOf, ", migrations=", valueOf2);
        return AbstractC8647e.ads(sb, ", variantConfig=", obj2, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
