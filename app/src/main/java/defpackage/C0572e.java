package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0572e extends View.BaseSavedState {
    public static final Parcelable.Creator<C0572e> CREATOR = new C1928e(17);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f2752e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f2752e;
        return AbstractC1786e.signatures(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f2752e));
    }
}
