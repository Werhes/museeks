package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4670e extends AbstractC6484e {
    public static final Parcelable.Creator<C4670e> CREATOR = new C1304e(29);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f10010e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Account f10011e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final GoogleSignInAccount f10012e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f10013e;

    public C4670e(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f10013e = i;
        this.f10011e = account;
        this.f10010e = i2;
        this.f10012e = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f10013e);
        AbstractC16852e.subscription(parcel, 2, this.f10011e, i);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f10010e);
        AbstractC16852e.subscription(parcel, 4, this.f10012e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
