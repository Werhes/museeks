package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٝؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2730e {
    public CharSequence ad;
    public boolean appmetrica;
    public String license;
    public String metrica;
    public boolean purchase;
    public IconCompat vip;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, eؔٝؖ] */
    public static C2730e ad(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat vip = bundle2 != null ? IconCompat.vip(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.ad = charSequence;
        obj.vip = vip;
        obj.metrica = string;
        obj.license = string2;
        obj.appmetrica = z;
        obj.purchase = z2;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2730e)) {
            return false;
        }
        C2730e c2730e = (C2730e) obj;
        String str = this.license;
        String str2 = c2730e.license;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.ad), Objects.toString(c2730e.ad)) && Objects.equals(this.metrica, c2730e.metrica) && Boolean.valueOf(this.appmetrica).equals(Boolean.valueOf(c2730e.appmetrica)) && Boolean.valueOf(this.purchase).equals(Boolean.valueOf(c2730e.purchase)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.license;
        return str != null ? str.hashCode() : Objects.hash(this.ad, this.metrica, Boolean.valueOf(this.appmetrica), Boolean.valueOf(this.purchase));
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.ad);
        IconCompat iconCompat = this.vip;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.startapp() : null);
        bundle.putString("uri", this.metrica);
        bundle.putString("key", this.license);
        bundle.putBoolean("isBot", this.appmetrica);
        bundle.putBoolean("isImportant", this.purchase);
        return bundle;
    }
}
