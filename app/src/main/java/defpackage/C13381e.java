package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13381e implements Parcelable {
    public static final Parcelable.Creator<C13381e> CREATOR = new C1928e(2);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Intent f26638e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f26639e;

    public C13381e(Intent intent, int i) {
        this.f26639e = i;
        this.f26638e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f26639e;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f26638e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26639e);
        Intent intent = this.f26638e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
