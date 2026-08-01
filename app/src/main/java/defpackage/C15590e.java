package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٜٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15590e extends AbstractC6484e {
    public static final Parcelable.Creator<C15590e> CREATOR = new C0928e(21);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C11630e[] f30753e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f30754e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f30755e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C2528e[] f30756e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5556e f30757e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C8525e[] f30758e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String[] f30759e;

    public C15590e(C5556e c5556e, String str, String str2, C2528e[] c2528eArr, C11630e[] c11630eArr, String[] strArr, C8525e[] c8525eArr) {
        this.f30757e = c5556e;
        this.f30755e = str;
        this.f30754e = str2;
        this.f30756e = c2528eArr;
        this.f30753e = c11630eArr;
        this.f30759e = strArr;
        this.f30758e = c8525eArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f30757e, i);
        AbstractC16852e.remoteconfig(parcel, 2, this.f30755e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f30754e);
        AbstractC16852e.tapsense(parcel, 4, this.f30756e, i);
        AbstractC16852e.tapsense(parcel, 5, this.f30753e, i);
        AbstractC16852e.pro(parcel, 6, this.f30759e);
        AbstractC16852e.tapsense(parcel, 7, this.f30758e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
