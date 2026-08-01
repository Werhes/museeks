package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10765e implements Parcelable.Creator {
    public final /* synthetic */ int ad;

    public /* synthetic */ C10765e(int i) {
        this.ad = i;
    }

    public static void ad(C15541e c15541e, Parcel parcel, int i) {
        String str = c15541e.f30689e;
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, str);
        AbstractC16852e.subscription(parcel, 3, c15541e.f30687e, i);
        AbstractC16852e.remoteconfig(parcel, 4, c15541e.f30686e);
        long j = c15541e.f30688e;
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = c15541e.f30685e;
        AbstractC16852e.isPro(parcel, 6, 8);
        parcel.writeLong(j2);
        AbstractC16852e.ads(parcel, applovin);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 765
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10765e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C18383e[i];
            case 1:
                return new C3773e[i];
            case 2:
                return new C1032e[i];
            case 3:
                return new C15573e[i];
            case 4:
                return new C4326e[i];
            case 5:
                return new C6187e[i];
            case 6:
                return new C12194e[i];
            case 7:
                return new C3276e[i];
            case 8:
                return new C16587e[i];
            case 9:
                return new C15607e[i];
            case 10:
                return new C15541e[i];
            case 11:
                return new C2296e[i];
            case 12:
                return new C9075e[i];
            case 13:
                return new C17961e[i];
            case 14:
                return new C9753e[i];
            case 15:
                return new MediaError[i];
            case 16:
                return new MediaInfo[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C13762e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C15940e[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C15759e[i];
            case 20:
                return new C0342e[i];
            case 21:
                return new C18374e[i];
            case 22:
                return new C15591e[i];
            case 23:
                return new C14019e[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C10806e[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C2349e[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C12481e[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C7766e[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C0849e[i];
            default:
                return new C11849e[i];
        }
    }
}
