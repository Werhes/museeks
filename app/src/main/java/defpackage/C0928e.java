package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0928e implements Parcelable.Creator {
    public final /* synthetic */ int ad;

    public /* synthetic */ C0928e(int i) {
        this.ad = i;
    }

    public static void ad(C9097e c9097e, Parcel parcel) {
        int i = c9097e.f18223e;
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(i);
        AbstractC16852e.remoteconfig(parcel, 2, c9097e.f18221e);
        long j = c9097e.f18220e;
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = c9097e.f18222e;
        if (l != null) {
            AbstractC16852e.isPro(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        AbstractC16852e.remoteconfig(parcel, 6, c9097e.f18219e);
        AbstractC16852e.remoteconfig(parcel, 7, c9097e.f18225e);
        Double d = c9097e.f18224e;
        if (d != null) {
            AbstractC16852e.isPro(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        AbstractC16852e.ads(parcel, applovin);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1014
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r54) {
        /*
            Method dump skipped, instructions count: 3860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0928e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C6471e[i];
            case 1:
                return new C9554e[i];
            case 2:
                return new C1157e[i];
            case 3:
                return new C10939e[i];
            case 4:
                return new C13561e[i];
            case 5:
                return new C9097e[i];
            case 6:
                return new C6372e[i];
            case 7:
                return new CastDevice[i];
            case 8:
                return new C8019e[i];
            case 9:
                return new C1727e[i];
            case 10:
                return new C7875e[i];
            case 11:
                return new C5053e[i];
            case 12:
                return new C18473e[i];
            case 13:
                return new C9416e[i];
            case 14:
                return new C7753e[i];
            case 15:
                return new C8525e[i];
            case 16:
                return new C16062e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C8121e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C16353e[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C12455e[i];
            case 20:
                return new C1134e[i];
            case 21:
                return new C15590e[i];
            case 22:
                return new C0114e[i];
            case 23:
                return new C11630e[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C4460e[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C5556e[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C2528e[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C7957e[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C14459e[i];
            default:
                return new C1821e[i];
        }
    }
}
