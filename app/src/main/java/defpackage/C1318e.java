package defpackage;

import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1318e implements Parcelable.Creator {
    public final /* synthetic */ int ad;

    public /* synthetic */ C1318e(int i) {
        this.ad = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 799
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r40) {
        /*
            Method dump skipped, instructions count: 2936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1318e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C3078e[i];
            case 1:
                return new C4941e[i];
            case 2:
                return new C18320e[i];
            case 3:
                return new C14758e[i];
            case 4:
                return new C3173e[i];
            case 5:
                return new C10467e[i];
            case 6:
                return new C0256e[i];
            case 7:
                return new C10627e[i];
            case 8:
                return new C9902e[i];
            case 9:
                return new C13723e[i];
            case 10:
                return new C5917e[i];
            case 11:
                return new C17448e[i];
            case 12:
                return new C13731e[i];
            case 13:
                return new C12030e[i];
            case 14:
                return new C6360e[i];
            case 15:
                return new C2831e[i];
            case 16:
                return new C12168e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C17965e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C0622e[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C15148e[i];
            case 20:
                return new C18030e[i];
            case 21:
                return new C12712e[i];
            case 22:
                return new C7125e[i];
            case 23:
                return new C5141e[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C12221e[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C8023e[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C2006e[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C16405e[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C17508e[i];
            default:
                return new C4681e[i];
        }
    }
}
