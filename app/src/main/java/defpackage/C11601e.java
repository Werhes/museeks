package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11601e extends AbstractC11007e {
    public static final Parcelable.Creator<C11601e> CREATOR = new C6220e(5);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public CharSequence f23314e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f23315e;

    public C11601e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f23314e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f23315e = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f23314e) + "}";
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f23314e, parcel, i);
        parcel.writeInt(this.f23315e ? 1 : 0);
    }
}
