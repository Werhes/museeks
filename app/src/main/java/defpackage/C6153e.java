package defpackage;

import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6153e implements Parcelable.Creator {
    public final /* synthetic */ int ad;

    public /* synthetic */ C6153e(int i) {
        this.ad = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 725
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6153e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C17450e[i];
            case 1:
                return new C0285e[i];
            case 2:
                return new MediaTrack[i];
            case 3:
                return new C1982e[i];
            case 4:
                return new C4931e[i];
            case 5:
                return new Scope[i];
            case 6:
                return new C17005e[i];
            case 7:
                return new C8660e[i];
            case 8:
                return new C4360e[i];
            case 9:
                return new C17147e[i];
            case 10:
                return new C2595e[i];
            case 11:
                return new C15760e[i];
            case 12:
                return new Status[i];
            case 13:
                return new C15356e[i];
            case 14:
                return new C14487e[i];
            case 15:
                return new C3241e[i];
            case 16:
                return new C5278e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C5090e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C6719e[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C13975e[i];
            case 20:
                return new C2186e[i];
            case 21:
                return new C17470e[i];
            case 22:
                return new C16942e[i];
            case 23:
                return new C15822e[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C4552e[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C7668e[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C4318e[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C3777e[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C7206e[i];
            default:
                return new C11894e[i];
        }
    }
}
