package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4820e implements Parcelable {
    public static final Parcelable.Creator<C4820e> CREATOR = new C1304e(5);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f10266e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public PlaybackState f10267e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f10268e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final long f10269e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f10270e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final long f10271e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Bundle f10272e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f10273e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final AbstractCollection f10274e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f10275e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final CharSequence f10276e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f10277e;

    public C4820e(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        AbstractCollection arrayList2;
        this.f10275e = i;
        this.f10270e = j;
        this.f10268e = j2;
        this.f10273e = f;
        this.f10266e = j3;
        this.f10277e = i2;
        this.f10276e = charSequence;
        this.f10271e = j4;
        if (arrayList == null) {
            C2171e c2171e = AbstractC17475e.f34223e;
            arrayList2 = C1410e.f4222e;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.f10274e = arrayList2;
        this.f10269e = j5;
        this.f10272e = bundle;
    }

    public C4820e(Parcel parcel) {
        this.f10275e = parcel.readInt();
        this.f10270e = parcel.readLong();
        this.f10273e = parcel.readFloat();
        this.f10271e = parcel.readLong();
        this.f10268e = parcel.readLong();
        this.f10266e = parcel.readLong();
        this.f10276e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(C4206e.CREATOR);
        if (createTypedArrayList == null) {
            C2171e c2171e = AbstractC17475e.f34223e;
            createTypedArrayList = C1410e.f4222e;
        }
        this.f10274e = createTypedArrayList;
        this.f10269e = parcel.readLong();
        this.f10272e = parcel.readBundle(C13391e.class.getClassLoader());
        this.f10277e = parcel.readInt();
    }

    public static C4820e ad(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    C4206e c4206e = new C4206e(customAction.getAction(), customAction.getName(), customAction.getIcon(), AbstractC9413e.Signature(customAction.getExtras()));
                    c4206e.f9266e = customAction;
                    arrayList.add(c4206e);
                }
            }
        }
        C4820e c4820e = new C4820e(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), AbstractC9413e.Signature(playbackState.getExtras()));
        c4820e.f10267e = playbackState;
        return c4820e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f10275e);
        sb.append(", position=");
        sb.append(this.f10270e);
        sb.append(", buffered position=");
        sb.append(this.f10268e);
        sb.append(", speed=");
        sb.append(this.f10273e);
        sb.append(", updated=");
        sb.append(this.f10271e);
        sb.append(", actions=");
        sb.append(this.f10266e);
        sb.append(", error code=");
        sb.append(this.f10277e);
        sb.append(", error message=");
        sb.append(this.f10276e);
        sb.append(", custom actions=");
        sb.append(this.f10274e);
        sb.append(", active item id=");
        return AbstractC5087e.m1750native(this.f10269e, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10275e);
        parcel.writeLong(this.f10270e);
        parcel.writeFloat(this.f10273e);
        parcel.writeLong(this.f10271e);
        parcel.writeLong(this.f10268e);
        parcel.writeLong(this.f10266e);
        TextUtils.writeToParcel(this.f10276e, parcel, i);
        parcel.writeTypedList(this.f10274e);
        parcel.writeLong(this.f10269e);
        parcel.writeBundle(this.f10272e);
        parcel.writeInt(this.f10277e);
    }
}
