package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6262e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f13074e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13075e;

    public /* synthetic */ C6262e(int i, List list) {
        this.f13075e = i;
        this.f13074e = list;
    }

    public C6262e(InterfaceC8346e interfaceC8346e, int i) {
        this.f13075e = i;
        switch (i) {
            case 13:
                int i2 = C1409e.f4221e;
                this.f13074e = interfaceC8346e;
                return;
            case 20:
                C12616e c12616e = C12616e.f25337e;
                this.f13074e = interfaceC8346e;
                return;
            case 21:
                C16024e c16024e = C16024e.f31556e;
                this.f13074e = interfaceC8346e;
                return;
            case 23:
                C17198e c17198e = C17198e.f33722e;
                this.f13074e = interfaceC8346e;
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C12676e c12676e = C12676e.f25410e;
                this.f13074e = interfaceC8346e;
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C12963e c12963e = C12963e.f25828e;
                this.f13074e = interfaceC8346e;
                return;
            default:
                int i3 = C6323e.f13154e;
                this.f13074e = interfaceC8346e;
                return;
        }
    }

    public C6262e(C12742e c12742e) {
        this.f13075e = 4;
        C14125e c14125e = C14125e.f27943e;
        this.f13074e = c12742e;
    }

    public C6262e(List list) {
        this.f13075e = 17;
        C14044e c14044e = C14044e.f27782e;
        this.f13074e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f13075e;
        List list = this.f13074e;
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
                return C14125e.f27943e.get(list.get(((Number) obj).intValue()));
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
                int intValue = ((Number) obj).intValue();
                int i2 = C6323e.f13154e;
                return AbstractC6914e.billing((AudioTrack) list.get(intValue));
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
                int intValue2 = ((Number) obj).intValue();
                int i3 = C1409e.f4221e;
                return ((CachedTrack) list.get(intValue2)).m4723for();
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
                return C14044e.f27782e.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                return C12616e.f25337e.get(list.get(((Number) obj).intValue()));
            case 21:
                return C16024e.f31556e.get(list.get(((Number) obj).intValue()));
            case 22:
                return Integer.valueOf(((InterfaceC4111e) list.get(((Number) obj).intValue())).ad());
            case 23:
                return C17198e.f33722e.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return C12676e.f25410e.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return C12963e.f25828e.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
