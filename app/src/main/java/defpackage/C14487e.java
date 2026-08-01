package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14487e extends AbstractC6484e {
    public static final Parcelable.Creator<C14487e> CREATOR;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f28638e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f28639e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f28640e;

    static {
        new C14487e(null, false, false);
        CREATOR = new C6153e(14);
    }

    public C14487e(ArrayList arrayList, boolean z, boolean z2) {
        this.f28640e = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
        this.f28639e = z;
        this.f28638e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14487e)) {
            return false;
        }
        C14487e c14487e = (C14487e) obj;
        return AbstractC5729e.vip(this.f28640e, c14487e.f28640e) && AbstractC5729e.vip(Boolean.valueOf(this.f28639e), Boolean.valueOf(c14487e.f28639e));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28640e, Boolean.valueOf(this.f28639e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isVip(parcel, 1, new ArrayList(this.f28640e));
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f28639e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f28638e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
