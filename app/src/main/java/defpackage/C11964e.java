package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11964e {
    public final int ad;
    public static final C11964e vip = new C11964e(0);
    public static final C11964e metrica = new C11964e(1);
    public static final C11964e license = new C11964e(2);

    public C11964e(int i) {
        this.ad = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11964e) {
            return this.ad == ((C11964e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        int i = this.ad;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC4653e.applovin(new StringBuilder("TextDecoration["), AbstractC17404e.ad(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
