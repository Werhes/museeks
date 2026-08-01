package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: for, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cfor implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f36395e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36396e;

    public Cfor(int i, List list) {
        this.f36396e = i;
        switch (i) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13181e c13181e = C13181e.f26170e;
                this.f36395e = list;
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10465e c10465e = C10465e.f20652e;
                this.f36395e = list;
                return;
            default:
                int i2 = C15688e.f30900e;
                this.f36395e = list;
                return;
        }
    }

    public Cfor(C2163e c2163e, List list) {
        this.f36396e = 28;
        this.f36395e = list;
    }

    public Cfor(InterfaceC8346e interfaceC8346e, int i) {
        this.f36396e = i;
        switch (i) {
            case 13:
                int i2 = C14485e.f28637e;
                this.f36395e = interfaceC8346e;
                return;
            default:
                C6113e c6113e = C6113e.f12841e;
                this.f36395e = interfaceC8346e;
                return;
        }
    }

    public /* synthetic */ Cfor(List list, int i, boolean z) {
        this.f36396e = i;
        this.f36395e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f36396e;
        List list = this.f36395e;
        switch (i) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                list.get(((Number) obj).intValue());
                return null;
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return C6113e.f12841e.get(list.get(((Number) obj).intValue()));
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                list.get(((Number) obj).intValue());
                return null;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                list.get(((Number) obj).intValue());
                return null;
            case 10:
                list.get(((Number) obj).intValue());
                return null;
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                list.get(((Number) obj).intValue());
                return null;
            case 13:
                int intValue = ((Number) obj).intValue();
                int i2 = C14485e.f28637e;
                return ((CachedTrack) list.get(intValue)).m4723for();
            case 14:
                list.get(((Number) obj).intValue());
                return null;
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                list.get(((Number) obj).intValue());
                return null;
            case 21:
                int intValue2 = ((Number) obj).intValue();
                int i3 = C15688e.f30900e;
                return ((InterfaceC15377e) list.get(intValue2)).getAd();
            case 22:
                list.get(((Number) obj).intValue());
                return null;
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return C13181e.f26170e.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return C10465e.f20652e.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C5926e) list.get(((Number) obj).intValue())).metrica;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
