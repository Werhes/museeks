package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6718e {
    public static final List vip = AbstractC6874e.startapp(EnumC2522e.f6370e, EnumC2522e.f6365e, EnumC2522e.f6368e, EnumC2522e.f6367e, EnumC2522e.f6366e);
    public final int ad;

    public C6718e(int i) {
        Object obj;
        this.ad = i;
        Iterator it = vip.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((((EnumC2522e) obj).f6371e & this.ad) != 0) {
                break;
            }
        }
        if (((EnumC2522e) obj) != null) {
            return;
        }
        String.valueOf(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6718e) && this.ad == ((C6718e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1634e.smaato("CategoryFlags(categoryFlags=", this.ad, ")");
    }
}
