package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1928e implements Parcelable.Creator {
    public static final C1928e vip = new C1928e(1);
    public final /* synthetic */ int ad;

    public /* synthetic */ C1928e(int i) {
        this.ad = i;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [eُْؐ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [eؔٙؖ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, eؓ٘ۥ] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.View$BaseSavedState, eؑۜٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View$BaseSavedState, eؓؗۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View$BaseSavedState, eٜؒ۟, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [eَؔ۟, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.ad) {
            case 0:
                Bundle readBundle = parcel.readBundle(C1928e.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new C10147e(readBundle);
            case 1:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return C10988e.f21745e;
                }
                int m2199throw = AbstractC6532e.m2199throw(parcel);
                boolean z = false;
                C11849e c11849e = null;
                while (parcel.dataPosition() < m2199throw) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        c11849e = (C11849e) AbstractC6532e.amazon(parcel, readInt, C11849e.CREATOR);
                    } else if (c != 2) {
                        AbstractC6532e.m2196native(parcel, readInt);
                    } else {
                        z = AbstractC6532e.premium(parcel, readInt);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw);
                return new C10988e(c11849e, z);
            case 2:
                return new C13381e(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 3:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f3822e = parcel.readByte() != 0;
                return baseSavedState;
            case 4:
                return new C4741e(parcel);
            case 5:
                return new C16931e(parcel);
            case 6:
                ?? obj = new Object();
                obj.f19821e = 255;
                obj.f19814e = -2;
                obj.f19799e = -2;
                obj.f19798e = -2;
                obj.f19826e = Boolean.TRUE;
                obj.f19823e = parcel.readInt();
                obj.f19806e = (Integer) parcel.readSerializable();
                obj.f19800e = (Integer) parcel.readSerializable();
                obj.f19819e = (Integer) parcel.readSerializable();
                obj.f19797e = (Integer) parcel.readSerializable();
                obj.f19825e = (Integer) parcel.readSerializable();
                obj.f19824e = (Integer) parcel.readSerializable();
                obj.f19811e = (Integer) parcel.readSerializable();
                obj.f19821e = parcel.readInt();
                obj.f19801e = parcel.readString();
                obj.f19814e = parcel.readInt();
                obj.f19799e = parcel.readInt();
                obj.f19798e = parcel.readInt();
                obj.f19808e = parcel.readString();
                obj.f19809e = parcel.readString();
                obj.f19807e = parcel.readInt();
                obj.f19818e = (Integer) parcel.readSerializable();
                obj.f19802e = (Integer) parcel.readSerializable();
                obj.f19816e = (Integer) parcel.readSerializable();
                obj.f19820e = (Integer) parcel.readSerializable();
                obj.f19822e = (Integer) parcel.readSerializable();
                obj.f19815e = (Integer) parcel.readSerializable();
                obj.f19812e = (Integer) parcel.readSerializable();
                obj.f19810e = (Integer) parcel.readSerializable();
                obj.f19813e = (Integer) parcel.readSerializable();
                obj.f19817e = (Integer) parcel.readSerializable();
                obj.f19826e = (Boolean) parcel.readSerializable();
                obj.f19803e = (Locale) parcel.readSerializable();
                obj.f19805e = (Boolean) parcel.readSerializable();
                return obj;
            case 7:
                return new C8649e((C16831e) parcel.readParcelable(C16831e.class.getClassLoader()), (C16831e) parcel.readParcelable(C16831e.class.getClassLoader()), (C7365e) parcel.readParcelable(C7365e.class.getClassLoader()), (C16831e) parcel.readParcelable(C16831e.class.getClassLoader()), parcel.readInt());
            case 8:
                return new C7365e(parcel.readLong());
            case 9:
                return new C10251e(parcel.readInt());
            case 10:
                return new C9284e(parcel);
            case 11:
                return new C14290e(parcel);
            case 12:
                ?? obj2 = new Object();
                obj2.f26193e = parcel.readString();
                obj2.f26192e = parcel.readInt();
                return obj2;
            case 13:
                ?? obj3 = new Object();
                obj3.f6533e = null;
                obj3.f6540e = new ArrayList();
                obj3.f6539e = new ArrayList();
                obj3.f6538e = parcel.createStringArrayList();
                obj3.f6535e = parcel.createStringArrayList();
                obj3.f6534e = (C4741e[]) parcel.createTypedArray(C4741e.CREATOR);
                obj3.f6537e = parcel.readInt();
                obj3.f6533e = parcel.readString();
                obj3.f6540e = parcel.createStringArrayList();
                obj3.f6539e = parcel.createTypedArrayList(C16931e.CREATOR);
                obj3.f6536e = parcel.createTypedArrayList(C13188e.CREATOR);
                return obj3;
            case 14:
                return new C7509e(parcel);
            case 15:
                return new C6307e((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 16:
                ?? obj4 = new Object();
                obj4.f5031e = parcel.readInt();
                obj4.f5030e = parcel.readInt();
                obj4.f5029e = parcel.readInt() == 1;
                return obj4;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f2752e = ((Integer) parcel.readValue(C0572e.class.getClassLoader())).intValue();
                return baseSavedState2;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C11531e(parcel);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 20:
                return C17571e.ad((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
            case 21:
                return MediaDescriptionCompat.ad(MediaDescription.CREATOR.createFromParcel(parcel));
            case 22:
                return new C3737e(parcel);
            case 23:
                return new MediaMetadataCompat(parcel);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C17638e(parcel);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new MediaSessionCompat$QueueItem(parcel);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new C13765e(token, null);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return C16831e.ad(parcel.readInt(), parcel.readInt());
            default:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f4548e = parcel.readInt();
                return baseSavedState3;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C10147e[i];
            case 1:
                return new C10988e[i];
            case 2:
                return new C13381e[i];
            case 3:
                return new C1197e[i];
            case 4:
                return new C4741e[i];
            case 5:
                return new C16931e[i];
            case 6:
                return new C10026e[i];
            case 7:
                return new C8649e[i];
            case 8:
                return new C7365e[i];
            case 9:
                return new C10251e[i];
            case 10:
                return new C9284e[i];
            case 11:
                return new C14290e[i];
            case 12:
                return new C13188e[i];
            case 13:
                return new C2665e[i];
            case 14:
                return new C7509e[i];
            case 15:
                return new C6307e[i];
            case 16:
                return new C1888e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C0572e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C11531e[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new MediaBrowserCompat$MediaItem[i];
            case 20:
                return new C17571e[i];
            case 21:
                return new MediaDescriptionCompat[i];
            case 22:
                return new C3737e[i];
            case 23:
                return new MediaMetadataCompat[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C17638e[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new MediaSessionCompat$QueueItem[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C13765e[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new MediaSessionCompat$Token[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C16831e[i];
            default:
                return new C1627e[i];
        }
    }
}
