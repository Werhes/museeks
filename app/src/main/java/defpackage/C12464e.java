package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12464e extends AbstractC6484e {
    public static final Parcelable.Creator<C12464e> CREATOR = new C18517e(21);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f24950e;

    public C12464e(ArrayList arrayList) {
        this.f24950e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12464e) {
            return this.f24950e.equals(((C12464e) obj).f24950e);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (C2217e c2217e : this.f24950e) {
            if (!z) {
                sb.append(", ");
            }
            c2217e.billing(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isVip(parcel, 2, this.f24950e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
