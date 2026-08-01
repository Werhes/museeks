package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1032e extends AbstractC6484e {
    public static final Parcelable.Creator<C1032e> CREATOR = new C10765e(2);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f3490e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f3491e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f3492e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f3493e;

    public C1032e(int i, long j, String str, boolean z) {
        this.f3493e = str;
        this.f3491e = i;
        this.f3490e = j;
        this.f3492e = z;
    }

    public C1032e(long j, String str) {
        this(-1, j, str, false);
    }

    public final long billing() {
        long j = this.f3490e;
        return j == -1 ? this.f3491e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1032e) {
            C1032e c1032e = (C1032e) obj;
            if (AbstractC5729e.vip(this.f3493e, c1032e.f3493e) && billing() == c1032e.billing() && this.f3492e == c1032e.f3492e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3493e, Long.valueOf(billing()), Boolean.valueOf(this.f3492e)});
    }

    public final String toString() {
        C11883e c11883e = new C11883e(5, this);
        c11883e.vip(this.f3493e, "name");
        c11883e.vip(Long.valueOf(billing()), "version");
        c11883e.vip(Boolean.valueOf(this.f3492e), "is_fully_rolled_out");
        return c11883e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f3493e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f3491e);
        long billing = billing();
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(billing);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f3492e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
