package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11849e extends AbstractC6484e {
    public static final Parcelable.Creator<C11849e> CREATOR = new C10765e(29);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f23762e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f23763e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f23764e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23765e;

    public C11849e(int i, int i2, int i3, boolean z) {
        this.f23765e = i;
        this.f23763e = i2;
        this.f23762e = i3;
        this.f23764e = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11849e)) {
            return false;
        }
        C11849e c11849e = (C11849e) obj;
        return this.f23765e == c11849e.f23765e && this.f23763e == c11849e.f23763e && this.f23762e == c11849e.f23762e && this.f23764e == c11849e.f23764e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23765e), Integer.valueOf(this.f23763e), Integer.valueOf(this.f23762e), Boolean.valueOf(this.f23764e)});
    }

    public final String toString() {
        int i = this.f23765e;
        int length = String.valueOf(i).length();
        int i2 = this.f23763e;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f23762e;
        int length3 = String.valueOf(i3).length();
        boolean z = this.f23764e;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f23765e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f23763e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f23762e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f23764e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
