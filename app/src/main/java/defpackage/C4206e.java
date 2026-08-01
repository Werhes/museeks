package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4206e implements Parcelable {
    public static final Parcelable.Creator<C4206e> CREATOR = new C1304e(7);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public PlaybackState.CustomAction f9266e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f9267e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CharSequence f9268e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Bundle f9269e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f9270e;

    public C4206e(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f9270e = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f9268e = charSequence;
        this.f9267e = parcel.readInt();
        this.f9269e = parcel.readBundle(C13391e.class.getClassLoader());
    }

    public C4206e(String str, CharSequence charSequence, int i, Bundle bundle) {
        this.f9270e = str;
        this.f9268e = charSequence;
        this.f9267e = i;
        this.f9269e = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f9268e) + ", mIcon=" + this.f9267e + ", mExtras=" + this.f9269e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9270e);
        TextUtils.writeToParcel(this.f9268e, parcel, i);
        parcel.writeInt(this.f9267e);
        parcel.writeBundle(this.f9269e);
    }
}
