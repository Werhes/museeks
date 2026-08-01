package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17470e extends AbstractC6484e {
    public static final Parcelable.Creator<C17470e> CREATOR = new C6153e(21);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15924e f34216e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f34217e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13561e f34218e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f34219e;

    public C17470e(String str, int i, C15924e c15924e, C13561e c13561e) {
        this.f34219e = str;
        this.f34217e = i;
        this.f34216e = c15924e;
        this.f34218e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17470e) {
            C17470e c17470e = (C17470e) obj;
            if (AbstractC5729e.vip(this.f34219e, c17470e.f34219e) && AbstractC5729e.vip(Integer.valueOf(this.f34217e), Integer.valueOf(c17470e.f34217e)) && AbstractC5729e.vip(this.f34216e, c17470e.f34216e) && AbstractC5729e.vip(this.f34218e, c17470e.f34218e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34219e, Integer.valueOf(this.f34217e), this.f34216e, this.f34218e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f34219e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f34217e);
        AbstractC16852e.subscription(parcel, 3, this.f34216e, i);
        AbstractC16852e.subscription(parcel, 4, this.f34218e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
