package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9473e extends AbstractC6484e {
    public static final Parcelable.Creator<C9473e> CREATOR = new C18517e(2);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f18815e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9473e) {
            return AbstractC5729e.vip(Integer.valueOf(this.f18815e), Integer.valueOf(((C9473e) obj).f18815e));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18815e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f18815e;
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(i2);
        AbstractC16852e.ads(parcel, applovin);
    }
}
