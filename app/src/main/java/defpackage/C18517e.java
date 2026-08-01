package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.internal.BinderWrapper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۧۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18517e implements Parcelable.Creator {
    public final /* synthetic */ int ad;

    public /* synthetic */ C18517e(int i) {
        this.ad = i;
    }

    public static void ad(C12288e c12288e, Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = c12288e.f24654e;
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = c12288e.f24649e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = c12288e.f24646e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(i4);
        AbstractC16852e.remoteconfig(parcel, 4, c12288e.f24652e);
        AbstractC16852e.smaato(parcel, 5, c12288e.f24643e);
        AbstractC16852e.tapsense(parcel, 6, c12288e.f24656e, i);
        AbstractC16852e.adcel(parcel, 7, c12288e.f24655e);
        AbstractC16852e.subscription(parcel, 8, c12288e.f24650e, i);
        AbstractC16852e.tapsense(parcel, 10, c12288e.f24653e, i);
        AbstractC16852e.tapsense(parcel, 11, c12288e.f24647e, i);
        boolean z = c12288e.f24651e;
        AbstractC16852e.isPro(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = c12288e.f24645e;
        AbstractC16852e.isPro(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = c12288e.f24644e;
        AbstractC16852e.isPro(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 15, c12288e.f24648e);
        AbstractC16852e.ads(parcel, applovin);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 825
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r35) {
        /*
            Method dump skipped, instructions count: 3046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18517e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new BinderWrapper[i];
            case 1:
                return new C0071e[i];
            case 2:
                return new C9473e[i];
            case 3:
                return new C9505e[i];
            case 4:
                return new C7210e[i];
            case 5:
                return new C16207e[i];
            case 6:
                return new C4888e[i];
            case 7:
                return new C17152e[i];
            case 8:
                return new C3990e[i];
            case 9:
                return new C10936e[i];
            case 10:
                return new C14094e[i];
            case 11:
                return new C3156e[i];
            case 12:
                return new C12289e[i];
            case 13:
                return new C3612e[i];
            case 14:
                return new C5731e[i];
            case 15:
                return new C15924e[i];
            case 16:
                return new C6734e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C14455e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18131e[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C11665e[i];
            case 20:
                return new C2217e[i];
            case 21:
                return new C12464e[i];
            case 22:
                return new C4445e[i];
            case 23:
                return new C4295e[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C10451e[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C14113e[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C12288e[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C0669e[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C15661e[i];
            default:
                return new C12487e[i];
        }
    }
}
