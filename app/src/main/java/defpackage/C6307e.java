package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6307e implements Parcelable {
    public static final Parcelable.Creator<C6307e> CREATOR = new C1928e(15);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f13133e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Intent f13134e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f13135e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final IntentSender f13136e;

    public C6307e(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f13136e = intentSender;
        this.f13134e = intent;
        this.f13133e = i;
        this.f13135e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13136e, i);
        parcel.writeParcelable(this.f13134e, i);
        parcel.writeInt(this.f13133e);
        parcel.writeInt(this.f13135e);
    }
}
