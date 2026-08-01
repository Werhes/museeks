package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627e extends View.BaseSavedState {
    public static final Parcelable.Creator<C1627e> CREATOR = new C1928e(29);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f4548e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC17861e.smaato(this.f4548e, "}", sb);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4548e);
    }
}
